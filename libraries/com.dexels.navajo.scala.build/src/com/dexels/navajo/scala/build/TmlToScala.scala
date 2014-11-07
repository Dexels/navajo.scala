package com.dexels.navajo.scala.build


import scala.xml
import treehugger.forest._
import treehugger.forest.definitions._
import treehugger.forest.treehuggerDSL._

object TmlToScala {
     def main(args: Array[String]) {
        val xml = <message name="ClubData">
                      <param name="selectedTypeOfTelephone">
                          <expression value="$columnValue( 'typeoftelephone' )"/>
                      </param>
                      <map.dropdown transactionContext="[/@TransactionContext]" description="'Telephone Type'" name="'TypeOfTelephone'" direction="'in'" emptyOption="true" selectedValue="[/@selectedTypeOfTelephone]">
                          <dropdown.query>
                              SELECT DISTINCT codeid, codedesc
                    FROM            codetable
                    WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    AND             language   = get_default_language()
                    AND             codeid     LIKE '%PHONE%'
                    ORDER BY        codedesc
                          </dropdown.query>
                      </map.dropdown>
                      <property description="Telefoon" direction="in" length="32" name="TelephoneData" type="string">
                          <expression value="$columnValue( 'telephonedata' )"/>
                      </property>
                      <param name="DefaultFacilityNumber">
                          <expression value="SingleValueQuery( [/@TransactionContext], 'SELECT communicationdata FROM orgfacilitycommunication WHERE organizationid = ? AND facilityid = ( SELECT facilityid FROM organizationfacilityattribute WHERE organizationid = orgfacilitycommunication.organizationid AND attribname = ? AND attribvalue = ? AND rownum = 1 ) AND typeofcommunication = ? AND rownum = 1 ORDER BY preferred ASC', [/@ClubIdentifier], 'DEFAULT_FACILITY', '1', 'TELEPHONE' )"/>
                      </param>
                      <property description="Telefoon standaard accommodatie" direction="out" length="32" name="DefaultFacilityTelephoneData" type="string">
                          <expression condition="[/@DefaultFacilityNumber] != null" value="[/@DefaultFacilityNumber]"/>
                          <expression value="SingleValueQuery( [/@TransactionContext], 'SELECT telephonedata FROM vw_facility WHERE facilityid = ( SELECT facilityid FROM organizationfacilityattribute WHERE organizationid = ? AND attribname = ? AND attribvalue = ? AND rownum = 1 )', [/@ClubIdentifier], 'DEFAULT_FACILITY', '1' )"/>
                      </property>
                      <property description="Fax Identifier" direction="out" length="16" name="FaxId" type="string">
                          <expression value="$columnValue( 'faxid' )"/>
                      </property>
                      <param name="selectedTypeOfFax">
                          <expression value="$columnValue( 'typeoffax' )"/>
                      </param>
                      <map.dropdown transactionContext="[/@TransactionContext]" description="'Fax Type'" name="'TypeOfFax'" direction="'in'" emptyOption="true" selectedValue="[/@selectedTypeOfFax]">
                          <dropdown.query>
                              SELECT DISTINCT codeid, codedesc
                    FROM            codetable
                    WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    AND             language   = get_default_language()
                    AND             codeid     LIKE '%FAX%'
                    ORDER BY        codedesc
                          </dropdown.query>
                      </map.dropdown>
                      <property description="Fax" direction="in" length="32" name="FaxData" type="string">
                          <expression value="$columnValue( 'faxdata' )"/>
                      </property>
                      <property description="E-mail Identifier" direction="out" length="16" name="EmailId" type="string">
                          <expression value="$columnValue( 'emailid' )"/>
                      </property>
                      <param name="selectedTypeOfEmail">
                          <expression value="$columnValue( 'typeofemail' )"/>
                      </param>
                      <param name="DropDownDirectionParam">
                          <expression condition="( [/@selectedTypeOfEmail] == 'MDESK_EMAIL' OR [/@selectedTypeOfEmail] == 'FORWARD_EMAIL' ) AND ! UserInRole( 'ADMINISTRATOR' )" value="'out'"/>
                          <expression condition="" value="'in'"/>
                      </param>
                      <map.dropdown transactionContext="[/@TransactionContext]" description="'E-mail Type'" name="'TypeOfEmail'" direction="[/@DropDownDirectionParam]" emptyOption="true" selectedValue="[/@selectedTypeOfEmail]">
                          <dropdown.query>
                              SELECT DISTINCT codeid, codedesc
                    FROM            codetable
                    WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    AND             language   = get_default_language()
                    AND             codeid     LIKE '%MAIL%'
                    ORDER BY        codedesc
                          </dropdown.query>
                      </map.dropdown>
                      <property condition="( [/@selectedTypeOfEmail] != 'MDESK_EMAIL' AND [/@selectedTypeOfEmail] != 'FORWARD_EMAIL' ) OR UserInRole( 'ADMINISTRATOR' )" description="E-mail" direction="in" length="64" name="EmailData" type="string" subtype="uri=true">
                          <expression value="$columnValue( 'emaildata' )"/>
                      </property>
                      <property condition="( [/@selectedTypeOfEmail] == 'MDESK_EMAIL' OR  [/@selectedTypeOfEmail] == 'FORWARD_EMAIL' ) AND ! UserInRole( 'ADMINISTRATOR' )" description="E-mail" direction="out" length="64" name="EmailData" type="string" subtype="uri=true">
                          <expression value="$columnValue( 'emaildata' )"/>
                      </property>
                      <property description="Website Identifier" direction="out" length="16" name="WebsiteId" type="string">
                          <expression value="$columnValue( 'urlid' )"/>
                      </property>
                      <param name="selectedTypeOfWebsite">
                          <expression value="$columnValue( 'typeofurl' )"/>
                      </param>
                      <map.dropdown transactionContext="[/@TransactionContext]" description="'Website Type'" name="'TypeOfWebsite'" direction="'in'" emptyOption="true" selectedValue="[/@selectedTypeOfWebsite]">
                          <dropdown.query>
                              SELECT DISTINCT codeid, codedesc
                    FROM            codetable
                    WHERE           typeofcode = 'COMMUNICATION_TYPE'
                    AND             language   = get_default_language()
                    AND             codeid     LIKE '%URL%'
                    ORDER BY        codedesc
                          </dropdown.query>
                      </map.dropdown>
                      <property description="Website" direction="in" length="64" name="WebsiteData" type="string" subtype="uri=true">
                          <expression condition="$columnValue( 'urldata' ) != null AND $columnValue( 'urldata' ) != '' AND StringFunction( 'indexOf', $columnValue( 'urldata' ), 'http://' ) &gt; -1" value="$columnValue( 'urldata' )"/>
                          <expression condition="$columnValue( 'urldata' ) != null AND $columnValue( 'urldata' ) != ''" value="'http://' + $columnValue( 'urldata' )"/>
                          <expression condition="" value="$columnValue( 'urldata' )"/>
                      </property>
                      <property description="Huisnummer" direction="in" length="15" name="AddressNumber" type="string">
                          <expression value="Trim( $columnValue( 'housenumber' ) )"/>
                      </property>
                      <property description="Toevoeging" direction="in" length="15" name="AddressNumberAppendix" type="string">
                          <expression value="Trim( $columnValue( 'numberappendix' ) )"/>
                      </property>
                      <property description="Postcode" direction="in" length="15" name="ZipCode" type="string">
                          <expression value="Trim( $columnValue( 'zipcode' ) )"/>
                      </property>
                      <property description="Plaats" direction="in" length="32" name="City" type="string">
                          <expression value="Trim( $columnValue( 'city' ) )"/>
                      </property>
                      <property description="Gemeente" direction="in" length="32" name="Community" type="string">
                          <expression value="Trim( $columnValue( 'communityname' ) )"/>
                      </property>
                      <property description="Landcode" direction="in" name="AddressCountryCode">
                          <expression value="Trim( $columnValue( 'countryid' ) )"/>
                      </property>
                      <property description="Land" direction="in" length="64" name="AddressCountry" type="string">
                          <expression condition="" value="SingleValueQuery([/@TransactionContext], 'SELECT codedesc FROM codetable WHERE typeofcode = ? AND codeid = ? AND language = get_default_language()', 'COUNTRY', Trim($columnValue('countryid')) )"/>
                      </property>
                      <property description="Bankrekening id" direction="out" length="32" name="AccountId" type="integer">
                          <expression value="$columnValue( 'accountid' )"/>
                      </property>
                      <property description="Banknummer" direction="in" length="32" name="BankAccountNumber" type="string">
                          <expression value="Trim( $columnValue( 'accountnumber' ) )"/>
                      </property>
                      <property description="BIC-code" direction="in" length="16" name="BICCode" type="string" subtype="capitalization=upper">
                          <expression value="$columnValue( 'biccode' )"/>
                      </property>
                      <property description="Tenaamstelling" direction="in" length="51" name="Ascription" type="string">
                          <expression value="Trim( $columnValue( 'ascription' ) )"/>
                      </property>
                      <property description="Plaats tenaamstelling" direction="in" length="51" name="AscriptionPlace" type="string">
                          <expression value="Trim( $columnValue( 'ascriptionplace' ) )"/>
                      </property>
                      <param name="SelectedPaymentMethod">
                          <expression value="Trim( $columnValue( 'svcpaymethod' ) )"/>
                      </param>
                      <property description="Secretaris" direction="out" length="7" name="SecretaryMemberIdentifier" type="string">
                          <expression value="Trim( $columnValue( 'secretaryid' ) )"/>
                      </property>
                      <property description="Naam" direction="out" length="36" name="SecretaryName" type="string">
                          <expression value="Trim( $columnValue( 'secretaryname' ) )"/>
                      </property>
                      <property description="Naam secretaris" direction="out" length="36" name="TitledSecretaryName" type="string">
                          <expression condition="$columnValue( 'secretarytitle' ) != null" value="$columnValue( 'secretarytitle' ) + ' ' + Trim( $columnValue( 'secretaryname' ) )"/>
                          <expression value="Trim( $columnValue( 'secretaryname' ) )"/>
                      </property>
                      <map.codedropdown transactionContext="[/@TransactionContext]" description="'Contributieservice betaalwijze'" name="'CollectionServicePaymentMethod'" direction="'out'" typeOfCode="'PAYMENT_METHOD_TYPE'" language="[/@CodeDropDownLanguage]" selectedValue="[/@SelectedPaymentMethod]" emptyOption="true" orderByDescription="true"/>
                      <map.codedropdown transactionContext="[/@TransactionContext]" description="'Regio veld'" name="'RegionField'" direction="'in'" typeOfCode="[/@PlayingRegionTable]" language="[/@CodeDropDownLanguage]" selectedValue="[/@SelectedRegion]" emptyOption="true" orderByDescription="true"/>
                      <map.codedropdown transactionContext="[/@TransactionContext]" description="'Regio zaal'" name="'RegionIndoor'" direction="'in'" typeOfCode="[/@PlayingRegionTable]" language="[/@CodeDropDownLanguage]" selectedValue="[/@SelectedRegionIndoor]" emptyOption="true" orderByDescription="true"/>
                      <property description="Kamer van Koophandelnummer" direction="in" length="15" name="BusinessRegistrationNumber" type="string">
                          <expression value="Trim( $columnValue( 'registernr' ) )"/>
                      </property>
                      <property description="Shirtkleuren (thuis)" direction="in" length="128" name="HomeShirtColors" type="string">
                          <expression value="Trim( $columnValue( 'shirtcol' ) )"/>
                      </property>
                      <property description="Broekkleuren (thuis)" direction="in" length="128" name="HomeShortsColors" type="string">
                          <expression value="Trim( $columnValue( 'trousercol' ) )"/>
                      </property>
                      <property description="Kousenkleuren (thuis)" direction="in" length="128" name="HomeStockingColors" type="string">
                          <expression value="Trim( $columnValue( 'sockcol' ) ) "/>
                      </property>
                      <property description="Shirtkleuren (uit)" direction="in" length="128" name="AwayShirtColors" type="string">
                          <expression value="Trim( $columnValue( 'awayshirtcol' ) )"/>
                      </property>
                      <property description="Broekkleuren (uit)" direction="in" length="128" name="AwayShortsColors" type="string">
                          <expression value="Trim( $columnValue( 'awaytrousercol' ) )"/>
                      </property>
                      <property description="Kousenkleuren (uit)" direction="in" length="128" name="AwayStockingColors" type="string">
                          <expression value="Trim( $columnValue( 'awaysockcol' ) ) "/>
                      </property>
                      <property description="Shirtkleuren (reserve)" direction="in" length="128" name="ReserveShirtColors" type="string">
                          <expression value="Trim( $columnValue( 'reserveshirtcol' ) )"/>
                      </property>
                      <property description="Broekkleuren (reserve)" direction="in" length="128" name="ReserveShortsColors" type="string">
                          <expression value="Trim( $columnValue( 'reservetrousercol' ) )"/>
                      </property>
                      <property description="Kousenkleuren (reserve)" direction="in" length="128" name="ReserveStockingColors" type="string">
                          <expression value="Trim( $columnValue( 'reservesockcol' ) ) "/>
                      </property>
                      <property description="Hoofdsponsor" direction="in" length="64" name="MainSponsor" type="string">
                          <expression value="$columnValue( 'mainsponsor' )"/>
                      </property>
                      <property description="Shirtsponsor" direction="in" length="64" name="ShirtSponsor" type="string">
                          <expression value="$columnValue( 'shirtsponsor' )"/>
                      </property>
                      <property description="Niveau jeugdopleiding" direction="in" length="32" name="YouthTrainingLevel" type="string">
                          <expression condition="$columnValue( 'youthtraininglevel' ) != null" value="$columnValue( 'youthtraininglevel' ) "/>
                          <expression condition="" value="'0'"/>
                      </property>
                      <property description="Deelnemend in Contributieservice" direction="in" length="15" name="isCollectionServiced">
                          <expression value="$columnValue( 'verservice' ) == '1'"/>
                      </property>
                      <property description="Contributieservice banknummer" direction="in" length="11" name="CollectionServiceBankAccountNumber" type="string">
                          <expression value="Trim( $columnValue( 'svcaccountnumber' ) )"/>
                      </property>
                      <property description="Contributieservice tenaamstelling" direction="in" length="51" name="CollectionServiceAscription" type="string">
                          <expression value="Trim( $columnValue( 'svcascription' ) )"/>
                      </property>
                      <property description="Contributieservice plaats tenaamstelling" direction="in" length="51" name="CollectionServiceAscriptionPlace" type="string">
                          <expression value="Trim( $columnValue( 'svcascriptionplace' ) )"/>
                      </property>
                      <property description="Contributieservice alternatief banknummer" direction="in" length="11" name="CollectionServiceAlternateBankAccountNumber" type="string">
                          <expression value="Trim( $columnValue( 'svcaltaccountnumber' ) )"/>
                      </property>
                      <property description="Contributieservice alternatieve tenaamstelling" direction="in" length="51" name="CollectionServiceAlternateAscription" type="string">
                          <expression value="Trim( $columnValue( 'svcaltascription' ) )"/>
                      </property>
                      <property description="Contributieservice alternatieve plaats tenaamstelling" direction="in" length="51" name="CollectionServiceAlternateAscriptionPlace" type="string">
                          <expression value="Trim( $columnValue( 'svcascriptionplace' ) )"/>
                      </property>
                      <property description="Club id of club into which this club was merged" direction="out" name="MergedIntoClubId" type="string" length="32">
                          <expression value="$columnValue( 'mergedintoclubid' )"/>
                      </property>
                      <property description="Club name of club into which this club was merged" direction="out" name="MergedIntoClub" type="string" length="64">
                          <expression value="$columnValue( 'mergedintoclub' )"/>
                      </property>
                      <property description="Place of business" direction="in" name="PlaceOfBusiness" type="string" length="64">
                          <expression value="$columnValue( 'placeofbusiness' ) "/>
                      </property>
                      <property description="Clublogo" direction="in" name="Logo" type="binary">
                          <expression value=" $columnValue( 'logo' )"/>
                      </property>
                      <property description="Small Club logo" direction="out" name="SmallLogo" type="binary">
                          <expression value="ScaleImageMax( $columnValue( 'logo' ), 240, 240 )"/>
                      </property>
                      <property description="Has Couple of Documents" direction="out" length="16" name="HasDocuments" type="string">
                          <expression value="$columnValue( 'documentcount' ) &gt; 0"/>
                      </property>
                      <comment value="' the SLC application wants some extra properties.. '"/>
                      <property description="Sportlink Club Region Owner (special format..)" direction="out" name="SportlinkClubRegionOwner" type="string">
                          <expression condition="$columnValue( 'SportlinkClubRegionOwner' ) != null" value="$columnValue( 'SportlinkClubRegionOwner' )"/>
                          <expression condition="" value="$columnValue( 'parentorganizationid' )"/>
                      </property>
                      <property direction="in" length="15" name="TelephoneNumber" type="string">
                          <expression value="''"/>
                      </property>
                      <property direction="out" name="isCOS" type="boolean">
                          <expression value="$columnValue( 'verservice' )"/>
                      </property>
                      <property direction="out" name="StatutorySport" description="Statutaire speeldag" type="string">
                          <expression value="SingleValueQuery( [/@TransactionContext], 'SELECT sportdesc FROM vw_club_sport WHERE isstatutory = 1 AND organizationid = ? AND rownum = 1', [/@ClubIdentifier] )"/>
                      </property>
                      <property direction="out" name="HasFinancialRole" type="boolean" length="4">
                          <expression value="true"/>
                      </property>
                      <property direction="out" name="AllowPaymentsAfterLiquidation" type="boolean" length="4">
                          <expression value="UserInRole( 'FINANCE' )"/>
                      </property>
                      <property name="MemberLastUpdate" direction="out" description="Laatste mutatie lid" type="string">
                          <expression value="SingleValueQuery( [/@TransactionContext], 'SELECT MAX( lastupdate ) FROM organizationperson WHERE organizationid = ?', [/@ClubIdentifier] )"/>
                      </property>
                  </message>
//$columnValue( 'typeoftelephone' )
            
       // val messageName = (xml \\ "message" \ "@name").text.toLowerCase()
            val messageName = "clubData"
        val pattern1 = "(\\s*\\$columnValue\\()\\s*'(.*)'\\s*\\)\\s*".r  // $columnValue( 'column' )
        val pattern2 = "(\\s*Trim\\(\\s*\\$columnValue\\()\\s*'(.*)'\\s*\\)\\s*\\)\\s*".r // Trim ( columnValue( 'column' ) )
        // $columnValue( 'mergedintoclubid' ) )
        

        val params = xml \\ "param" map (param => {
            val body =  (param \\ "@value").text match {
                	case pattern1(c, columnName) => REF("result")  DOT "value" APPLY (LIT(columnName))
                	case pattern2(c, columnName) => REF("Trim") APPLY (REF("result")  DOT "value" APPLY (LIT(columnName)) AS StringClass)

                	case default => LIT("UNKNOWN")
            }
            
            ((VAL((param \\ "@name").text)) :=  body
            )

        })
        
         val properties = xml \\ "property" map (property => {
             val expressions = property \\ "expression"
             var body : Tree = LIT("UNKNOWN")
             if (expressions.size < 2) {
                 body =  (property \\ "@value").text match {
                	case pattern1(c, columnName) => REF("result")  DOT "value" APPLY (LIT(columnName))
                	case pattern2(c, columnName) => REF("Trim") APPLY (REF("result")  DOT "value" APPLY (LIT(columnName))  AS StringClass)
                	case default => LIT("UNKNOWN")
                 }
             }
             val direction = (property \\ "@direction").text
             val description = (property \\ "@description").text
             val propType = if ((property \\ "@type").text == "") "string" else (property \\ "@type").text
                 
            
            val propertyName = (property \\ "@name").text
            (REF(messageName) DOT "addProperty" APPLY (LIT(propertyName)) DOT "value" APPLY (body) DOT "direction" APPLY (LIT(direction)) DOT "description" APPLY (LIT(description)) DOT "propertyType" APPLY (LIT(propType)))
            

           
            

        })
        
        val classDef = CLASSDEF("result") := BLOCK(
        		List[Tree]() ++ params ++   properties
        		)
        
        println(treeToString(classDef))

    }
}