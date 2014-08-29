package testscala

import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.adapter.functions.SingleValueQuery
import com.dexels.navajo.adapters.scala.api.AdaptersComponent
import com.sportlink.adapters.scala.api.SportlinkAdaptersComponent
import com.dexels.navajo.function.scala.api.FunctionComponent
import com.dexels.navajo.adapters.scala.api.AdaptersComponent

class ScalaQueryClub extends ScalaCompiledScript with AdaptersComponent with SportlinkAdaptersComponent with FunctionComponent {

  override def run() {
   System.err.println ("Access: "+runtime.parent.getInstance())
   val clubData = output.addMessage("ClubData");

    sqlquery(clubData,sql => {
      val transactionContext = sql.transactionContext 
      sql.debug(true)
      var clubId = input.property("/QueryUpdateClub/ClubIdentifier")
      if (clubId == null) {
        clubId = input.property("/Club/ClubIdentifier")
      }
      sql.debug(true)
      sql.datasource("sportlinkkernel")
      val codeDropdownLanguage = SingleValueQuery(transactionContext, "SELECT get_default_language() FROM dual").asInstanceOf[String]
      sql.query("""SELECT vw_club.name
                 , vw_club.shortname
                 , vw_club.activeentity
                 , vw_club.lastupdate
                 , vw_club.updateby
                 , vw_club.addressid
                 , vw_club.streetname
                 , vw_club.housenumber
                 , vw_club.numberappendix
                 , vw_club.city
                 , vw_club.communityname
                 , vw_club.zipcode
                 , vw_club.countryid
                 , vw_club.remarks
                 , vw_club.referencetype
                 , vw_club.typeofaddress
                 , vw_club.secretaryid
                 , vw_club.secretaryname
                 , vw_club.secretarytitle
                 , vw_club.accountid
                 , vw_club.accountnumber
                 , vw_club.biccode
                 , vw_club.accounttype
                 , vw_club.ascription
                 , vw_club.ascriptionplace
                 , vw_club.parentorganizationid
                 , get_districtstring( vw_club.organizationid ) AS parentorganizationname
                 , vw_club.annotationattribid
                 , vw_club.annotation
                 , vw_club.info
                 , vw_club.telephoneid
                 , vw_club.typeoftelephone
                 , vw_club.telephonedata
                 , vw_club.faxid
                 , vw_club.typeoffax
                 , vw_club.faxdata
                 , vw_club.emailid
                 , vw_club.typeofemail
                 , vw_club.emaildata
                 , vw_club.urlid
                 , vw_club.typeofurl
                 , vw_club.urldata
                 , vw_club.typeofclub
                 , vw_club.categoryofclub
                 , vw_club.searchname
                 , vw_club.legalname
                 , vw_club.legalform
                 , vw_club.foundeddt
                 , vw_club.dissolveddt
                 , vw_club.registernr
                 , vw_club.shirtcol
                 , vw_club.trousercol
                 , vw_club.sockcol
                 , vw_club.awayshirtcol
                 , vw_club.awaytrousercol
                 , vw_club.awaysockcol
                 , vw_club.reserveshirtcol
                 , vw_club.reservetrousercol
                 , vw_club.reservesockcol
                 , vw_club.mainsponsor
                 , vw_club.shirtsponsor
                 , vw_club.youthtraininglevel
                 , vw_club.zaalregio
                 , vw_club.zaalregiodesc
                 , vw_club.veldregio
                 , vw_club.veldregiodesc
                 , vw_club.verservice
                 , vw_club.svcpaymethod
                 , vw_club.svcaccountid
                 , vw_club.svcaccountnumber
                 , vw_club.svcaccounttype
                 , vw_club.svcascription
                 , vw_club.svcascriptionplace
                 , vw_club.svcaltaccountid
                 , vw_club.svcaltaccountnumber
                 , vw_club.svcaltaccounttype
                 , vw_club.svcaltascription
                 , vw_club.svcaltascriptionplace
                 , vw_club.mergedintoclubid
                 , vw_club.mergedintoclub
                 , vw_club.placeofbusiness
                 , vw_club.logo
                 , vw_club.typeoforganization
                 , ( SELECT COUNT(*)
                     FROM   document
                     WHERE  objectid = vw_club.organizationid
                   ) AS documentcount
                 , get_syb_districtcode( vw_club.parentorganizationid ) AS SportlinkClubRegionOwner
                 , ( SELECT  o.name
                     FROM   organization o
                     WHERE  o.organizationid = get_union_identifier()
                   ) AS unionname
                 , ( SELECT o.shortname
                     FROM   organization o
                     WHERE  o.organizationid = get_union_identifier()
                   ) AS unionshortname
            FROM   vw_club
            WHERE  typeoforganization IN ('CLUB', 'FOREIGN')
            AND    vw_club.organizationid = ?""")
      sql.addParameter(clubId)

      sql.withEachResultSet(result => {
        System.err.println("Result set found!");
        val parentOrganizationId = result.value("parentorganizationid").asInstanceOf[String]
        val SelectedRegionIndoor = result.value("zaalregio")
        val selectedRegion = result.value("veldregio")
        var playingRegionTable = "BOND_PLAYING_REGION";
        if (parentOrganizationId.indexOf("-") != -1) {
          val elements = parentOrganizationId.split("-")
          playingRegionTable = elements(2) + "_PLAYING_REGION"
        }
        val dissolutionDate = result.value("dissolveddt")
        clubData.addProperty("TypeOfOrganization").description("Clubtype").value(result.value("typeoforganization"))
        clubData.addProperty("ClubIdentifier").description("Clubcode").value(clubId)
        clubData.addProperty("UnionName").description("Bond").value(Trim(result.value("unionname").asInstanceOf[String]))
        clubData.addProperty("UnionShortName").description("Bond (kort)").value(Trim(result.value("unionshortname").asInstanceOf[String]))
        clubData.addProperty("RegionOwner").description("District").value(Trim(parentOrganizationId))
        clubData.addProperty("RegionOwnerName").description("District").value(Trim(result.value("parentorganizationname").asInstanceOf[String]))
        clubData.addProperty("ClubName").description("Clubnaam").value(Trim(result.value("name").asInstanceOf[String]))
        clubData.addProperty("ClubShortName").description("Verkorte naam").value(Trim(result.value("shortname").asInstanceOf[String]))
        val typeOfClub: String = Trim(result.value("typeofclub").asInstanceOf[String])
        codedropdown(clubData, d => {
          d.transactionContext(transactionContext).description("ClubType").name("TypeOfClub").direction("in").typeOfCode("CLUB_TYPE").language(codeDropdownLanguage)
            .selectedValue(typeOfClub).emptyOption(true).orderByDescription(true)
           
        })
        clubData.addProperty("CategoryOfClub").length(32).direction("in").propertyType("string").value(Trim(result.value("categoryofclub").asInstanceOf[String]))
        clubData.addProperty("Zoeknaam").direction("in").length(15).subtype("capitalization=upper").value(Trim(result.value("searchname").asInstanceOf[String]))
      })

    })

  }
}