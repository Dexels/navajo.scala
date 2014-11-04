package testscala

import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.adapter.functions.SingleValueQuery
import com.dexels.navajo.adapters.scala.api.AdaptersComponent
import com.sportlink.adapters.scala.api.SportlinkAdaptersComponent
import com.dexels.navajo.function.scala.api.FunctionComponent
import com.dexels.navajo.adapters.scala.api.AdaptersComponent
import scala.xml

class ScalaQueryClub extends ScalaCompiledScript with AdaptersComponent with SportlinkAdaptersComponent with FunctionComponent {

    override def run() {
        System.err.println("Access: " + runtime.parent.getInstance())
        val clubData = output.addMessage("ClubData");

        sqlquery(clubData, sql => {
            val transactionContext = sql.transactionContext
            sql.debug(false)
            var clubId = input.propertyValue("/QueryUpdateClub/ClubIdentifier").asInstanceOf[String]
            if (clubId == null) {
                clubId = input.propertyValue("/Club/ClubIdentifier").asInstanceOf[String]
            }

            
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
                val parentOrganizationId = result.value("parentorganizationid").asInstanceOf[String]
                val SelectedRegionIndoor = result.value("zaalregio").asInstanceOf[String]
                val selectedRegion = result.value("veldregio").asInstanceOf[String]
                val playingRegionTable = if (parentOrganizationId.indexOf("-") > -1) {
                    parentOrganizationId.split("-")(2) + "_PLAYING_REGION" 
                } else {
                    "BOND_PLAYING_REGION"
                }
                
   
                val typeOfClub: String = Trim(result.value("typeofclub").asInstanceOf[String])
                val disDate = result.value("dissolveddt").asInstanceOf[java.util.Date]
                val selectedLegalForm = result.value("legalform").asInstanceOf[String]

                clubData.addProperty("TypeOfOrganization").description("Clubtype").value(result.value("typeoforganization"))
                clubData.addProperty("ClubIdentifier").description("Clubcode").value(clubId)
                clubData.addProperty("UnionName").description("Bond").value(Trim(result.value("unionname").asInstanceOf[String]))
                clubData.addProperty("UnionShortName").description("Bond (kort)").value(Trim(result.value("unionshortname").asInstanceOf[String]))
                clubData.addProperty("RegionOwner").description("District").value(Trim(parentOrganizationId))
                clubData.addProperty("RegionOwnerName").description("District").value(Trim(result.value("parentorganizationname").asInstanceOf[String]))
                clubData.addProperty("ClubName").description("Clubnaam").value(Trim(result.value("name").asInstanceOf[String]))
                clubData.addProperty("ClubShortName").description("Verkorte naam").value(Trim(result.value("shortname").asInstanceOf[String]))

                codedropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("ClubType")
                    d.name("TypeOfClub")
                    d.direction("in")
                    d.typeOfCode("CLUB_TYPE")
                    d.language(codeDropdownLanguage)
                    d.selectedValue(typeOfClub)
                    d.emptyOption(true)
                    d.orderByDescription(true)
                })
                clubData.addProperty("CategoryOfClub").length(32).direction("in").propertyType("string").value(Trim(result.value("categoryofclub").asInstanceOf[String]))
                clubData.addProperty("Zoeknaam").direction("in").length(15).subtype("capitalization=upper").value(Trim(result.value("searchname").asInstanceOf[String]))
                clubData.addProperty("LegalName").direction("in").description("Juridische naam").value(Trim(result.value("legalname").asInstanceOf[String]))
                clubData.addProperty("CurrentCanonicalLegalName").direction("out").description("Huidige kanonieke juridische naam").value(Trim(result.value("legalname").asInstanceOf[String]))

                codedropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("Rechtsvorm")
                    d.name("LegalForm")
                    d.direction("in")
                    d.typeOfCode("LEGAL_FORMS")
                    d.language(codeDropdownLanguage)
                    d.selectedValue(selectedLegalForm)
                    d.emptyOption(true)
                    d.orderByDescription(true)
                })

                clubData.addProperty("TypeOfCharge").direction("out").description("Kostentype bij naamsverandering").value("NAME_CHANGE")
                clubData.addProperty("EstablishedDate").direction("in").description("Oprichtingsdatum").propertyType("date").value(result.value("foundeddt"))
                clubData.addProperty("ClubLiquidationDate").direction("in").description("Opheffingsdatum").value(disDate match {
                    case _ if (FormatDate(disDate, "yyyy-MM-dd") == "9999-12-31") => null
                    case _ => disDate
                })
      
                codedropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("Type adres")
                    d.name("TypeOfAddress")
                    d.direction("in")
                    d.typeOfCode("ADDRESS_TYPE")
                    d.language(codeDropdownLanguage)
                    d.selectedValue(result.value("typeofaddress").asInstanceOf[String])
                    d.emptyOption(true)
                    d.orderByDescription(true)
                })
                clubData.addProperty("StreetName").direction("in").description("Straat").value(Trim(result.value("streetname").asInstanceOf[String]))

                val AddressChangeByClub = SingleValueQuery(transactionContext, "SELECT addresschangebyclub FROM vw_organization WHERE organizationid = ?", input.property("/__globals__/UnionIdentifier").value).asInstanceOf[String]

                clubData.addProperty("AddressChangeByClub").direction("out").propertyType("boolean").value(AddressChangeByClub == "1")
                clubData.addProperty("AnnotationAttribId").direction("out").description("Annotation attribute id").value(result.value("annotationattribid"))
                clubData.addProperty("Annotation").direction("in").description("Annotation").value(result.value("annotation"))
                clubData.addProperty("Info").direction("in").description("Info").value(result.value("info"))
                clubData.addProperty("TelephoneId").direction("out").description("Telefoon Identifier").value(result.value("telephoneid"))

                
                codedropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("ClubType")
                    d.name("TypeOfClub")
                    d.direction("in")
                    d.typeOfCode("CLUB_TYPE")
                    d.language(codeDropdownLanguage)
                    d.selectedValue(typeOfClub)
                    d.emptyOption(true)
                    d.orderByDescription(true)
                })
                

                val selectedTypeOfTelephone = result.value("typeoftelephone").asInstanceOf[String]
                val DefaultFacilityNumber = SingleValueQuery(transactionContext, "SELECT communicationdata FROM orgfacilitycommunication WHERE organizationid = ? AND facilityid = ( SELECT facilityid FROM organizationfacilityattribute WHERE organizationid = orgfacilitycommunication.organizationid AND attribname = ? AND attribvalue = ? AND rownum = 1 ) AND typeofcommunication = ? AND rownum = 1 ORDER BY preferred ASC", clubId, "DEFAULT_FACILITY", "1", "TELEPHONE").asInstanceOf[String]
                val selectedTypeOfFax = result.value("typeoffax")
                val selectedTypeOfEmail = result.value("typeofemail")
                val DropDownDirectionParam = if ((selectedTypeOfEmail == "MDESK_EMAIL" ||selectedTypeOfEmail == "FORWARD_EMAIL"  ) && ! UserInRole("ADMINISTRATOR") ) {"out"} else {""}
                val selectedTypeOfWebsite = result.value("typeofurl")
                val SelectedPaymentMethod = Trim(result.value("svcpaymethod").asInstanceOf[String])

                // Generated

                clubData.addProperty("TelephoneData").value(result.value("telephonedata")).direction("in").description("Telefoon")
                dropdown(clubData, d => {
                     d.transactionContext(transactionContext)
                    d.description("Telephone Type")
                    d.name("TypeOfTelephone")
                    d.direction("in")
                    d.selectedValue(selectedTypeOfTelephone)
                    d.emptyOption(true)
                    d.query(""" SELECT DISTINCT codeid, codedesc
                    		FROM            codetable
                    		WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    		AND             language   = get_default_language()
                    		AND             codeid     LIKE '%PHONE%'
                    		ORDER BY        codedesc""")
                })
                
                val defaultFacilityTelephoneDataValue = 
                    if (DefaultFacilityNumber != null) { 
                        DefaultFacilityNumber 
                    } else {
                        SingleValueQuery(transactionContext, "SELECT telephonedata FROM vw_facility WHERE facilityid = ( SELECT facilityid FROM organizationfacilityattribute WHERE organizationid = ? AND attribname = ? AND attribvalue = ? AND rownum = 1 )", clubId, "DEFAULT_FACILITY", '1').asInstanceOf[String]
                    }
                clubData.addProperty("DefaultFacilityTelephoneData").value(defaultFacilityTelephoneDataValue).direction("out").description("Telefoon standaard accommodatie")
                clubData.addProperty("FaxId").value(result.value("faxid")).direction("out").description("Fax Identifier")
                
                dropdown(clubData, d => {
                     d.transactionContext(transactionContext)
                    d.description("Fax Type")
                    d.name("TypeOfFax")
                    d.direction("in")
                    d.selectedValue(result.value("typeoffax").asInstanceOf[String])
                    d.emptyOption(true)
                    d.query("""  SELECT DISTINCT codeid, codedesc
                    FROM            codetable
                    WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    AND             language   = get_default_language()
                    AND             codeid     LIKE '%FAX%'
                    ORDER BY        codedesc """)
                })
                
           
                
                clubData.addProperty("FaxData").value(result.value("faxdata")).direction("in").description("Fax")
                clubData.addProperty("EmailId").value(result.value("emailid")).direction("out").description("E-mail Identifier")
                
                val emailType = result.value("typeofemail").asInstanceOf[String]
                val emailDirection = if ((emailType == "MDESK_EMAIL" || emailType == "FORWARD_EMAIL") && ! UserInRole( "ADMINISTRATOR" ))  "out" else "in"
                dropdown(clubData, d => {
                     d.transactionContext(transactionContext)
                    d.description("E-mail Type")
                    d.name("TypeOfEmail")
                    d.direction(emailDirection)
                    d.selectedValue(emailType)
                    d.emptyOption(true)
                    d.query("""   SELECT DISTINCT codeid, codedesc
                    FROM            codetable
                    WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    AND             language   = get_default_language()
                    AND             codeid     LIKE '%MAIL%'
                    ORDER BY        codedesc """)
                })
                
                
               
                
                if ((emailType != "MDESK_EMAIL" && emailType != "FORWARD_EMAIL") ||  UserInRole( "ADMINISTRATOR" )) {
                	clubData.addProperty("EmailData").value(result.value("emaildata")).direction("in").description("E-mail").subtype("uri=true")
                }
                if ((emailType == "MDESK_EMAIL" || emailType == "FORWARD_EMAIL") && ! UserInRole( "ADMINISTRATOR" )) {
                	clubData.addProperty("EmailData").value(result.value("emaildata")).direction("in").description("E-mail").subtype("uri=true")
                }
                
                        
                clubData.addProperty("WebsiteId").value(result.value("urlid")).direction("out").description("Website Identifier")
                dropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("Website Type")
                    d.name("TypeOfWebsite")
                    d.direction("in")
                    d.selectedValue(result.value("typeofurl").asInstanceOf[String])
                    d.emptyOption(true)
                    d.query("""     SELECT DISTINCT codeid, codedesc
                    FROM            codetable
                    WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    AND             language   = get_default_language()
                    AND             codeid     LIKE '%URL%'
                    ORDER BY        codedesc """)
                })
            
                val urlData = result.value("urldata").asInstanceOf[String]
                val website = urlData match { 
                    case _ if urlData.startsWith("http://") => urlData
                    case _ if !urlData.isEmpty() => "http://" + urlData
                    case _ => urlData
                }

                clubData.addProperty("WebsiteData").value(website).direction("in").description("Website")
                clubData.addProperty("AddressNumber").value(Trim(result.value("housenumber").asInstanceOf[String])).direction("in").description("Huisnummer")
                clubData.addProperty("AddressNumberAppendix").value(Trim(result.value("numberappendix").asInstanceOf[String])).direction("in").description("Toevoeging")
                clubData.addProperty("ZipCode").value(Trim(result.value("zipcode").asInstanceOf[String])).direction("in").description("Postcode")
                clubData.addProperty("City").value(Trim(result.value("city").asInstanceOf[String])).direction("in").description("Plaats")
                clubData.addProperty("Community").value(Trim(result.value("communityname").asInstanceOf[String])).direction("in").description("Gemeente")
                clubData.addProperty("AddressCountryCode").value(Trim(result.value("countryid").asInstanceOf[String])).direction("in").description("Landcode")

                val addressCountry = SingleValueQuery(transactionContext, "SELECT codedesc FROM codetable WHERE typeofcode = ? AND codeid = ? AND language = get_default_language()", "COUNTRY", Trim(result.value("countryid").asInstanceOf[String])) 
                clubData.addProperty("AddressCountry").value(addressCountry).direction("in").description("Land")
                clubData.addProperty("AccountId").value(result.value("accountid")).direction("out").description("Bankrekening id").propertyType("integer")
                clubData.addProperty("BankAccountNumber").value(Trim(result.value("accountnumber").asInstanceOf[String])).direction("in").description("Banknummer")
                clubData.addProperty("BICCode").value(result.value("biccode")).direction("in").description("BIC-code")
                clubData.addProperty("Ascription").value(Trim(result.value("ascription").asInstanceOf[String])).direction("in").description("Tenaamstelling")
                clubData.addProperty("AscriptionPlace").value(Trim(result.value("ascriptionplace").asInstanceOf[String])).direction("in").description("Plaats tenaamstelling")
                clubData.addProperty("SecretaryMemberIdentifier").value(Trim(result.value("secretaryid").asInstanceOf[String])).direction("out").description("Secretaris")
                clubData.addProperty("SecretaryName").value(Trim(result.value("secretaryname").asInstanceOf[String])).direction("out").description("Naam")
               
                val secName = if (result.value("secretarytitle") != null) {
                    (result.value("secretarytitle").asInstanceOf[String]) + " " + Trim( result.value( "secretaryname" ).asInstanceOf[String] )
                } else {
                    Trim( result.value( "secretaryname" ).asInstanceOf[String])
                }
                clubData.addProperty("TitledSecretaryName").value(secName).direction("out").description("Naam secretaris")
                
                codedropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("Contributieservice betaalwijze")
                    d.name("CollectionServicePaymentMethod")
                    d.direction("out")
                    d.typeOfCode("PAYMENT_METHOD_TYPE")
                    d.language(codeDropdownLanguage)
                    d.selectedValue(SelectedPaymentMethod)
                    d.emptyOption(true)
                    d.orderByDescription(true)
                })
                 codedropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("Regio veld")
                    d.name("RegionField")
                    d.direction("out")
                    d.typeOfCode(playingRegionTable)
                    d.language(codeDropdownLanguage)
                    d.selectedValue(selectedRegion)
                    d.emptyOption(true)
                    d.orderByDescription(true)
                })
                
                 codedropdown(clubData, d => {
                    d.transactionContext(transactionContext)
                    d.description("Regio zaal")
                    d.name("RegionIndoor")
                    d.direction("in")
                    d.typeOfCode(playingRegionTable)
                    d.language(codeDropdownLanguage)
                    d.selectedValue(SelectedRegionIndoor)
                    d.emptyOption(true)
                    d.orderByDescription(true)
                })
                
                
           
          
                clubData.addProperty("BusinessRegistrationNumber").value(Trim(result.value("registernr").asInstanceOf[String])).direction("in").description("Kamer van Koophandelnummer")
                clubData.addProperty("HomeShirtColors").value(Trim(result.value("shirtcol").asInstanceOf[String])).direction("in").description("Shirtkleuren (thuis)")
                clubData.addProperty("HomeShortsColors").value(Trim(result.value("trousercol").asInstanceOf[String])).direction("in").description("Broekkleuren (thuis)")
                clubData.addProperty("HomeStockingColors").value(Trim(result.value("sockcol").asInstanceOf[String])).direction("in").description("Kousenkleuren (thuis)")
                clubData.addProperty("AwayShirtColors").value(Trim(result.value("awayshirtcol").asInstanceOf[String])).direction("in").description("Shirtkleuren (uit)")
                clubData.addProperty("AwayShortsColors").value(Trim(result.value("awaytrousercol").asInstanceOf[String])).direction("in").description("Broekkleuren (uit)")
                clubData.addProperty("AwayStockingColors").value(Trim(result.value("awaysockcol").asInstanceOf[String])).direction("in").description("Kousenkleuren (uit)")
                clubData.addProperty("ReserveShirtColors").value(Trim(result.value("reserveshirtcol").asInstanceOf[String])).direction("in").description("Shirtkleuren (reserve)")
                clubData.addProperty("ReserveShortsColors").value(Trim(result.value("reservetrousercol").asInstanceOf[String])).direction("in").description("Broekkleuren (reserve)")
                clubData.addProperty("ReserveStockingColors").value(Trim(result.value("reservesockcol").asInstanceOf[String])).direction("in").description("Kousenkleuren (reserve)")
                clubData.addProperty("MainSponsor").value(result.value("mainsponsor")).direction("in").description("Hoofdsponsor")
                clubData.addProperty("ShirtSponsor").value(result.value("shirtsponsor")).direction("in").description("Shirtsponsor")
                
                val youthTrainingLevel = if (result.value("youthtraininglevel") != null) {
                    result.value("youthtraininglevel")
                } else 0
                clubData.addProperty("YouthTrainingLevel").value(youthTrainingLevel).direction("in").description("Niveau jeugdopleiding")
                clubData.addProperty("isCollectionServiced").value((result.value("verservice").asInstanceOf[String]) == "1").direction("in").description("Deelnemend in Contributieservice")
                clubData.addProperty("CollectionServiceBankAccountNumber").value(Trim(result.value("svcaccountnumber").asInstanceOf[String])).direction("in").description("Contributieservice banknummer")
                clubData.addProperty("CollectionServiceAscription").value(Trim(result.value("svcascription").asInstanceOf[String])).direction("in").description("Contributieservice tenaamstelling")
                clubData.addProperty("CollectionServiceAscriptionPlace").value(Trim(result.value("svcascriptionplace").asInstanceOf[String])).direction("in").description("Contributieservice plaats tenaamstelling")
                clubData.addProperty("CollectionServiceAlternateBankAccountNumber").value(Trim(result.value("svcaltaccountnumber").asInstanceOf[String])).direction("in").description("Contributieservice alternatief banknummer")
                clubData.addProperty("CollectionServiceAlternateAscription").value(Trim(result.value("svcaltascription").asInstanceOf[String])).direction("in").description("Contributieservice alternatieve tenaamstelling")
                clubData.addProperty("CollectionServiceAlternateAscriptionPlace").value(Trim(result.value("svcascriptionplace").asInstanceOf[String])).direction("in").description("Contributieservice alternatieve plaats tenaamstelling")
                clubData.addProperty("MergedIntoClubId").value(result.value("mergedintoclubid")).direction("out").description("Club id of club into which this club was merged").propertyType("string")
                clubData.addProperty("MergedIntoClub").value(result.value("mergedintoclub")).direction("out").description("Club name of club into which this club was merged").propertyType("string")
                clubData.addProperty("PlaceOfBusiness").value(result.value("placeofbusiness")).direction("in").description("Place of business").propertyType("string")
                clubData.addProperty("Logo").value(result.value("logo")).direction("in").description("Clublogo").propertyType("binary")
                clubData.addProperty("SmallLogo").value(ScaleImageMax((result.value("logo").asInstanceOf[com.dexels.navajo.document.types.Binary]), 240, 240 )).direction("out").description("Small Club logo").propertyType("binary")
                clubData.addProperty("HasDocuments").value((result.value( "documentcount" ).asInstanceOf[Integer]) >  0).direction("out").description("Has Couple of Documents").propertyType("string")
               
                val regioOwner = if (result.value("SportlinkClubRegionOwner") != null) {result.value("SportlinkClubRegionOwner")} else {result.value("parentorganizationid")}
                clubData.addProperty("SportlinkClubRegionOwner").value(regioOwner).direction("out").description("Sportlink Club Region Owner (special format..)").propertyType("string")
                clubData.addProperty("TelephoneNumber").value("").direction("in").description("").propertyType("string")
                clubData.addProperty("isCOS").value(result.value("verservice")).direction("out").description("").propertyType("boolean")
                
                val statutorySport = SingleValueQuery(transactionContext, "SELECT sportdesc FROM vw_club_sport WHERE isstatutory = 1 AND organizationid = ? AND rownum = 1", clubId).asInstanceOf[String]
                clubData.addProperty("StatutorySport").value(statutorySport).direction("out").description("Statutaire speeldag").propertyType("string")
                clubData.addProperty("HasFinancialRole").value(true).direction("out").description("").propertyType("boolean")
                clubData.addProperty("AllowPaymentsAfterLiquidation").value(UserInRole( "FINANCE" )).direction("out").description("").propertyType("boolean")
                
                val lastUpdate = SingleValueQuery(transactionContext, "SELECT MAX( lastupdate ) FROM organizationperson WHERE organizationid = ?", clubId).asInstanceOf[java.util.Date]

                clubData.addProperty("MemberLastUpdate").value(lastUpdate).direction("out").description("Laatste mutatie lid").propertyType("date")
                
            })

        })

    }
}