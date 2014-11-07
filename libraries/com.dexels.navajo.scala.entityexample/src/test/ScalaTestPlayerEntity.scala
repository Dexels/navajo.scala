package test

import com.sportlink.adapters.scala.api.SportlinkAdaptersComponent
import com.dexels.navajo.entity.scala.api._


class ScalaTestPlayerEntity extends ScalaCompiledScript
     with AdaptersComponent with SportlinkAdaptersComponent with FunctionComponent {
    
    override def run() {
        val clubData  = output.addMessage("ClubData");
    	val in  = inputEntity[Player]
    	val out  = outputEntity[Player];

        sqlquery(clubData, sql => {
            //sql.debug(true)
            sql.datasource("sportlinkkernel")
            sql.query(""" SELECT vp.personid
            ,      vp.firstname
            ,      CASE WHEN vp.infix IS NOT NULL
                        THEN vp.infix || ' '
                        ELSE ''
                   END || vp.lastname AS lastname
            ,      vp.nickname
            ,      vp.sex
            ,      vp.dateofbirth
            ,      vp.nationality
            ,      vp.secondnationality
            ,      ( SELECT vo.internationalid
                     FROM   vw_organization vo
                     WHERE  vo.organizationid = vpl.organizationid
                     AND    rownum            = 1
                   ) AS tmsclubid
            ,      ( SELECT vo.internationalid
                     FROM   vw_organization vo
                     WHERE  vo.organizationid = 'KNVB-UNION'
                     AND    rownum            = 1
                   ) AS tmsunionid
            FROM   vw_player vpl
            ,      vw_person vp
            WHERE  vpl.organizationid = ?
            AND    vpl.personid       = ?
            AND    vpl.sportid        = ?
            AND    vpl.personid       = vp.personid""")
            
           // val n :PlayerEntity = NavajoFactory.create 	

            sql.addParameter(input.property("/PlayerData/ClubIdentifier").value)
            sql.addParameter(input.property("/PlayerData/PersonId").value)
            sql.addParameter(input.property("/PlayerData/SportId").value)
            
            sql.instance(sqlMap => {
                out.FirstName(sqlMap.getColumnValue("firstname"));
                out.LastName(sqlMap.getColumnValue("lastname"))
                out.PopularName(sqlMap.getColumnValue("nickname"))
                out.TmsClubId(sqlMap.getColumnValue("tmsclubid"))
                out.TmsAssociationId(sqlMap.getColumnValue("tmsunionid"))
                out.Gender(sqlMap.getColumnValue("sex") match { case "0" => "female" case "1" => "female" })
                out.Birthdate(sqlMap.getColumnValue("dateofbirth"))
                out.Nationality1(sqlMap.getColumnValue("nationality"))
                out.Nationality2(sqlMap.getColumnValue("secondnationality"))
            })
            callScript(script = "ABC",  input = out, withResult =  resultDoc => {
                resultDoc.message("test")
            })
        })
    }
}