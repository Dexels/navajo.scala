package com.dexels.navajo.scala

import com.dexels.navajo.scala.document._

trait SportlinkAdapters extends com.dexels.navajo.scala.BaseAdapters with com.dexels.navajo.scala.Base { self: com.dexels.navajo.scala.ScalaCompiledScript => 
  def clubsql(message: NavajoMessage, f: CLUBSQL => Unit): Unit = {
    val instance = new CLUBSQL
    setupMap(message, instance, f)
  }
  def codedropdown(message: NavajoMessage, f: CODEDROPDOWN => Unit): Unit = {
    val instance = new CODEDROPDOWN
    setupMap(message, instance, f)
  }
  def dropdown(message: NavajoMessage, f: DROPDOWN => Unit): Unit = {
    val instance = new DROPDOWN
    setupMap(message, instance, f)
  }
  def genericproperty(message: NavajoMessage, f: GENERICPROPERTY => Unit): Unit = {
    val instance = new GENERICPROPERTY
    setupMap(message, instance, f)
  }
  def authenticate(message: NavajoMessage, f: AUTHENTICATE => Unit): Unit = {
    val instance = new AUTHENTICATE
    setupMap(message, instance, f)
  }
  def regionmap(message: NavajoMessage, f: REGIONMAP => Unit): Unit = {
    val instance = new REGIONMAP
    setupMap(message, instance, f)
  }
  def currentfiscalyearmap(message: NavajoMessage, f: CURRENTFISCALYEARMAP => Unit): Unit = {
    val instance = new CURRENTFISCALYEARMAP
    setupMap(message, instance, f)
  }
  def currentfiscalyeardropdown(message: NavajoMessage, f: CURRENTFISCALYEARDROPDOWN => Unit): Unit = {
    val instance = new CURRENTFISCALYEARDROPDOWN
    setupMap(message, instance, f)
  }
  def fiscalmonthdropdown(message: NavajoMessage, f: FISCALMONTHDROPDOWN => Unit): Unit = {
    val instance = new FISCALMONTHDROPDOWN
    setupMap(message, instance, f)
  }
  def clubfiscalmonthdropdown(message: NavajoMessage, f: CLUBFISCALMONTHDROPDOWN => Unit): Unit = {
    val instance = new CLUBFISCALMONTHDROPDOWN
    setupMap(message, instance, f)
  }
  def financialdistrictdropdown(message: NavajoMessage, f: FINANCIALDISTRICTDROPDOWN => Unit): Unit = {
    val instance = new FINANCIALDISTRICTDROPDOWN
    setupMap(message, instance, f)
  }
  def clieopmap(message: NavajoMessage, f: CLIEOPMAP => Unit): Unit = {
    val instance = new CLIEOPMAP
    setupMap(message, instance, f)
  }
  def clieop2map(message: NavajoMessage, f: CLIEOP2MAP => Unit): Unit = {
    val instance = new CLIEOP2MAP
    setupMap(message, instance, f)
  }
  def clieop2postmap(message: NavajoMessage, f: CLIEOP2POSTMAP => Unit): Unit = {
    val instance = new CLIEOP2POSTMAP
    setupMap(message, instance, f)
  }
  def stringmatchmap(message: NavajoMessage, f: STRINGMATCHMAP => Unit): Unit = {
    val instance = new STRINGMATCHMAP
    setupMap(message, instance, f)
  }
  def versioneddatabasemap(message: NavajoMessage, f: VERSIONEDDATABASEMAP => Unit): Unit = {
    val instance = new VERSIONEDDATABASEMAP
    setupMap(message, instance, f)
  }
  def tensing(message: NavajoMessage, f: TENSING => Unit): Unit = {
    val instance = new TENSING
    setupMap(message, instance, f)
  }
  def mt940(message: NavajoMessage, f: MT940 => Unit): Unit = {
    val instance = new MT940
    setupMap(message, instance, f)
  }
  def massmailing(message: NavajoMessage, f: MASSMAILING => Unit): Unit = {
    val instance = new MASSMAILING
    setupMap(message, instance, f)
  }
  def formconstruction(message: NavajoMessage, f: FORMCONSTRUCTION => Unit): Unit = {
    val instance = new FORMCONSTRUCTION
    setupMap(message, instance, f)
  }
  def template(message: NavajoMessage, f: TEMPLATE => Unit): Unit = {
    val instance = new TEMPLATE
    setupMap(message, instance, f)
  }
  def dbadmin(message: NavajoMessage, f: DBADMIN => Unit): Unit = {
    val instance = new DBADMIN
    setupMap(message, instance, f)
  }
  def ppupload(message: NavajoMessage, f: PPUPLOAD => Unit): Unit = {
    val instance = new PPUPLOAD
    setupMap(message, instance, f)
  }
  def ppdownload(message: NavajoMessage, f: PPDOWNLOAD => Unit): Unit = {
    val instance = new PPDOWNLOAD
    setupMap(message, instance, f)
  }
  def clubaccountjournalexport(message: NavajoMessage, f: CLUBACCOUNTJOURNALEXPORT => Unit): Unit = {
    val instance = new CLUBACCOUNTJOURNALEXPORT
    setupMap(message, instance, f)
  }
  def useractivity(message: NavajoMessage, f: USERACTIVITY => Unit): Unit = {
    val instance = new USERACTIVITY
    setupMap(message, instance, f)
  }
  def directdebitjournalexport(message: NavajoMessage, f: DIRECTDEBITJOURNALEXPORT => Unit): Unit = {
    val instance = new DIRECTDEBITJOURNALEXPORT
    setupMap(message, instance, f)
  }
  def directmemberjournalexport(message: NavajoMessage, f: DIRECTMEMBERJOURNALEXPORT => Unit): Unit = {
    val instance = new DIRECTMEMBERJOURNALEXPORT
    setupMap(message, instance, f)
  }
  def vcard(message: NavajoMessage, f: VCARD => Unit): Unit = {
    val instance = new VCARD
    setupMap(message, instance, f)
  }
  def vtel(message: NavajoMessage, f: VTEL => Unit): Unit = {
    val instance = new VTEL
    setupMap(message, instance, f)
  }
  def vemail(message: NavajoMessage, f: VEMAIL => Unit): Unit = {
    val instance = new VEMAIL
    setupMap(message, instance, f)
  }
  def vaddr(message: NavajoMessage, f: VADDR => Unit): Unit = {
    val instance = new VADDR
    setupMap(message, instance, f)
  }
  def smsmap(message: NavajoMessage, f: SMSMAP => Unit): Unit = {
    val instance = new SMSMAP
    setupMap(message, instance, f)
  }
  def pppsubmission(message: NavajoMessage, f: PPPSUBMISSION => Unit): Unit = {
    val instance = new PPPSUBMISSION
    setupMap(message, instance, f)
  }
  def googlemsg(message: NavajoMessage, f: GOOGLEMSG => Unit): Unit = {
    val instance = new GOOGLEMSG
    setupMap(message, instance, f)
  }
  def applbpush(message: NavajoMessage, f: APPLBPUSH => Unit): Unit = {
    val instance = new APPLBPUSH
    setupMap(message, instance, f)
  }
  def applepush(message: NavajoMessage, f: APPLEPUSH => Unit): Unit = {
    val instance = new APPLEPUSH
    setupMap(message, instance, f)
  }
  def clieoppost(message: NavajoMessage, f: CLIEOPPOST => Unit): Unit = {
    val instance = new CLIEOPPOST
    setupMap(message, instance, f)
  }
  def clubdebitjournalexport
		(message: NavajoMessage, f: CLUBDEBITJOURNALEXPORT
		 => Unit): Unit = {
    val instance = new CLUBDEBITJOURNALEXPORT
		
    setupMap(message, instance, f)
  }
  def ppproductionattemp(message: NavajoMessage, f: PPPRODUCTIONATTEMP => Unit): Unit = {
    val instance = new PPPRODUCTIONATTEMP
    setupMap(message, instance, f)
  }
  def sporttaalmap(message: NavajoMessage, f: SPORTTAALMAP => Unit): Unit = {
    val instance = new SPORTTAALMAP
    setupMap(message, instance, f)
  }
  def genericaranking(message: NavajoMessage, f: GENERICARANKING => Unit): Unit = {
    val instance = new GENERICARANKING
    setupMap(message, instance, f)
  }
  def googlecloudmessaging(message: NavajoMessage, f: GOOGLECLOUDMESSAGING => Unit): Unit = {
    val instance = new GOOGLECLOUDMESSAGING
    setupMap(message, instance, f)
  }
}

/**
 */
class CLUBSQL(instance: com.dexels.sportlink.adapters.ClubDatasource = new com.dexels.sportlink.adapters.ClubDatasource) extends Adapter {
  def query: java.lang.String = {
    return instance.getQuery
  }
  def query(query: java.lang.String): Unit = {
    instance.setQuery(query)
  }
  def update: java.lang.String = {
    return instance.getUpdate
  }
  def update(update: java.lang.String): Unit = {
    instance.setUpdate(update)
  }
  def debug: java.lang.Boolean = {
    return instance.getDebug
  }
  def debug(debug: java.lang.Boolean): Unit = {
    instance.setDebug(debug)
  }
  def transactionContext: java.lang.Integer = {
    return instance.getTransactionContext
  }
  def transactionContext(transactionContext: java.lang.Integer): Unit = {
    instance.setTransactionContext(transactionContext)
  }
  def datasource: java.lang.String = {
    return instance.getDatasource
  }
  def datasource(datasource: java.lang.String): Unit = {
    instance.setDatasource(datasource)
  }
  def username: java.lang.String = {
    return instance.getUsername
  }
  def username(username: java.lang.String): Unit = {
    instance.setUsername(username)
  }
  def withResultSet(f: RESULTROW => Unit): Unit = {
    f(new RESULTROW)
  }
  def addParameter(value: java.lang.Object): Unit = {
    instance.setParameter(value)
  }
  def doUpdate: Unit = {
    instance.setDoUpdate(true)
  }
  def rollback: Unit = {
    instance.setKill(true)
  }
}

/**
 */
class CODEDROPDOWN(instance: com.dexels.sportlink.adapters.CodeDropdownList = new com.dexels.sportlink.adapters.CodeDropdownList) extends Adapter {
  def datasource: java.lang.String = {
    return instance.getDatasource
  }
  def datasource(datasource: java.lang.String): Unit = {
    instance.setDatasource(datasource)
  }
  def transactionContext: java.lang.Integer = {
    return instance.getTransactionContext
  }
  def transactionContext(transactionContext: java.lang.Integer): Unit = {
    instance.setTransactionContext(transactionContext)
  }
  def language: java.lang.String = {
    return instance.getLanguage
  }
  def language(language: java.lang.String): Unit = {
    instance.setLanguage(language)
  }
  def typeOfCode: java.lang.String = {
    return instance.getTypeOfCode
  }
  def typeOfCode(typeOfCode: java.lang.String): Unit = {
    instance.setTypeOfCode(typeOfCode)
  }
  def name: java.lang.String = {
    return instance.getName
  }
  def name(name: java.lang.String): Unit = {
    instance.setName(name)
  }
  def debug: java.lang.Boolean = {
    return instance.getDebug
  }
  def debug(debug: java.lang.Boolean): Unit = {
    instance.setDebug(debug)
  }
  def description: java.lang.String = {
    return instance.getDescription
  }
  def description(description: java.lang.String): Unit = {
    instance.setDescription(description)
  }
  def orderByDescription: java.lang.Boolean = {
    return instance.getOrderByDescription
  }
  def orderByDescription(orderByDescription: java.lang.Boolean): Unit = {
    instance.setOrderByDescription(orderByDescription)
  }
  def direction: java.lang.String = {
    return instance.getDirection
  }
  def direction(direction: java.lang.String): Unit = {
    instance.setDirection(direction)
  }
  def emptyOption: java.lang.Boolean = {
    return instance.getEmptyOption
  }
  def emptyOption(emptyOption: java.lang.Boolean): Unit = {
    instance.setEmptyOption(emptyOption)
  }
  def selectedValue: java.lang.String = {
    return instance.getSelectedValue
  }
  def selectedValue(selectedValue: java.lang.String): Unit = {
    instance.setSelectedValue(selectedValue)
  }
}

/**
 */
class DROPDOWN(instance: com.dexels.sportlink.adapters.DropdownList = new com.dexels.sportlink.adapters.DropdownList) extends Adapter {
  def datasource: java.lang.String = {
    return instance.getDatasource
  }
  def datasource(datasource: java.lang.String): Unit = {
    instance.setDatasource(datasource)
  }
  def transactionContext: java.lang.Integer = {
    return instance.getTransactionContext
  }
  def transactionContext(transactionContext: java.lang.Integer): Unit = {
    instance.setTransactionContext(transactionContext)
  }
  def name: java.lang.String = {
    return instance.getName
  }
  def name(name: java.lang.String): Unit = {
    instance.setName(name)
  }
  def debug: java.lang.Boolean = {
    return instance.getDebug
  }
  def debug(debug: java.lang.Boolean): Unit = {
    instance.setDebug(debug)
  }
  def query: java.lang.String = {
    return instance.getQuery
  }
  def query(query: java.lang.String): Unit = {
    instance.setQuery(query)
  }
  def description: java.lang.String = {
    return instance.getDescription
  }
  def description(description: java.lang.String): Unit = {
    instance.setDescription(description)
  }
  def direction: java.lang.String = {
    return instance.getDirection
  }
  def direction(direction: java.lang.String): Unit = {
    instance.setDirection(direction)
  }
  def emptyOption: java.lang.Boolean = {
    return instance.getEmptyOption
  }
  def emptyOption(emptyOption: java.lang.Boolean): Unit = {
    instance.setEmptyOption(emptyOption)
  }
  def selectedValue: java.lang.String = {
    return instance.getSelectedValue
  }
  def selectedValue(selectedValue: java.lang.String): Unit = {
    instance.setSelectedValue(selectedValue)
  }
  def removeExisting: java.lang.Boolean = {
    return instance.getRemoveExisting
  }
  def removeExisting(removeExisting: java.lang.Boolean): Unit = {
    instance.setRemoveExisting(removeExisting)
  }
  def addParameter(value: java.lang.Object): Unit = {
    instance.setParameter(value)
  }
}

/**
 */
class GENERICPROPERTY(instance: com.dexels.sportlink.adapters.GenericFieldMap = new com.dexels.sportlink.adapters.GenericFieldMap) extends Adapter {
  def datasource: java.lang.String = {
    return instance.getDatasource
  }
  def datasource(datasource: java.lang.String): Unit = {
    instance.setDatasource(datasource)
  }
  def transactionContext: java.lang.Integer = {
    return instance.getTransactionContext
  }
  def transactionContext(transactionContext: java.lang.Integer): Unit = {
    instance.setTransactionContext(transactionContext)
  }
  def query: java.lang.String = {
    return instance.getQuery
  }
  def query(query: java.lang.String): Unit = {
    instance.setQuery(query)
  }
  def update: java.lang.String = {
    return instance.getUpdate
  }
  def update(update: java.lang.String): Unit = {
    instance.setUpdate(update)
  }
  def singleValue: java.lang.Object = {
    return instance.getSingleValue
  }
  def addParameter(value: java.lang.Object): Unit = {
    instance.setParameter(value)
  }
  def setPropertyPrefix(value: java.lang.String): Unit = {
    instance.setPropertyPrefix(value)
  }
  def setTablePrefix(value: java.lang.String): Unit = {
    instance.setTablePrefix(value)
  }
  def setTableElementPrefix(value: java.lang.String): Unit = {
    instance.setTableElementPrefix(value)
  }
  def setPrimaryKey(value: java.lang.String): Unit = {
    instance.setPrimaryKey(value)
  }
  def setValueColumn(value: java.lang.String): Unit = {
    instance.setValueColumn(value)
  }
  def setTable(value: java.lang.String): Unit = {
    instance.setTable(value)
  }
  def setCodeTable(value: java.lang.String): Unit = {
    instance.setCodeTable(value)
  }
  def setCurrentInputMessage(value: java.lang.String): Unit = {
    instance.setCurrentInputMessage(value)
  }
  def addNamedParameter(name: java.lang.String, value: java.lang.Object): Unit = {
    instance.setParameterName(name)
    instance.setParameterValue(value)
  }
  def doUpdate: Unit = {
    instance.setDoUpdate(true)
  }
  def doQuery: Unit = {
    instance.setDoQuery(true)
  }
}

/**
 */
class AUTHENTICATE(instance: com.dexels.sportlink.adapters.Authenticate = new com.dexels.sportlink.adapters.Authenticate) extends Adapter {
  def daysBeforeExpiration: java.lang.Integer = {
    return instance.getDaysBeforeExpiration
  }
  def valid: java.lang.String = {
    return instance.getValid
  }
  def firstTimeUse: java.lang.Boolean = {
    return instance.getFirstTimeUse
  }
  def expiryTime: java.lang.Integer = {
    return instance.getExpiryTime
  }
  def expiryTime(expiryTime: java.lang.Integer): Unit = {
    instance.setExpiryTime(expiryTime)
  }
  def username: java.lang.String = {
    return instance.getUsername
  }
  def username(username: java.lang.String): Unit = {
    instance.setUsername(username)
  }
  def password: java.lang.String = {
    return instance.getPassword
  }
  def password(password: java.lang.String): Unit = {
    instance.setPassword(password)
  }
  def region: java.lang.String = {
    return instance.getRegion
  }
  def region(region: java.lang.String): Unit = {
    instance.setRegion(region)
  }
  def token: java.lang.String = {
    return instance.getToken
  }
}

/**
 */
class REGIONMAP(instance: com.dexels.sportlink.adapters.RegionMap = new com.dexels.sportlink.adapters.RegionMap) extends Adapter {
  def regionName: java.lang.String = {
    return instance.getRegionName
  }
}

/**
 */
class CURRENTFISCALYEARMAP(instance: com.dexels.sportlink.finance.adapters.CurrentFiscalYearMap
		 = new com.dexels.sportlink.finance.adapters.CurrentFiscalYearMap
		) extends Adapter {
  ()
}

/**
 */
class CURRENTFISCALYEARDROPDOWN(instance: com.dexels.sportlink.finance.adapters.FiscalYearDropdown
		 = new com.dexels.sportlink.finance.adapters.FiscalYearDropdown
		) extends Adapter {
  ()
}

/**
 */
class FISCALMONTHDROPDOWN(instance: com.dexels.sportlink.finance.adapters.FiscalMonthDropdown
		 = new com.dexels.sportlink.finance.adapters.FiscalMonthDropdown
		) extends Adapter {
  ()
}

/**
 */
class CLUBFISCALMONTHDROPDOWN(instance: com.dexels.sportlink.finance.adapters.ClubFiscalMonthDropdown
		 = new com.dexels.sportlink.finance.adapters.ClubFiscalMonthDropdown
		) extends Adapter {
  ()
}

/**
 */
class FINANCIALDISTRICTDROPDOWN(instance: com.dexels.sportlink.finance.adapters.FinancialDistrictDropdown
		 = new com.dexels.sportlink.finance.adapters.FinancialDistrictDropdown
		) extends Adapter {
  ()
}

/**
 */
class CLIEOPMAP(instance: com.dexels.sportlink.adapters.ClieOpMap = new com.dexels.sportlink.adapters.ClieOpMap) extends Adapter {
  ()
}

/**
 */
class CLIEOP2MAP(instance: com.dexels.sportlink.adapters.ClieOp2Map = new com.dexels.sportlink.adapters.ClieOp2Map) extends Adapter {
  ()
}

/**
 */
class CLIEOP2POSTMAP(instance: com.dexels.sportlink.adapters.clieop.ClieOp2Post = new com.dexels.sportlink.adapters.clieop.ClieOp2Post) extends Adapter {
  ()
}

/**
 */
class STRINGMATCHMAP(instance: com.dexels.sportlink.adapters.StringMatchMap = new com.dexels.sportlink.adapters.StringMatchMap) extends Adapter {
  ()
}

/**
 */
class VERSIONEDDATABASEMAP(instance: com.dexels.sportlink.adapters.VersionedDatabaseMap = new com.dexels.sportlink.adapters.VersionedDatabaseMap) extends Adapter {
  ()
}

/**
 */
class TENSING(instance: com.dexels.sportlink.adapters.Tensing = new com.dexels.sportlink.adapters.Tensing) extends Adapter {
  ()
}

/**
 */
class MT940(instance: com.dexels.sportlink.adapters.MT940Map = new com.dexels.sportlink.adapters.MT940Map) extends Adapter {
  ()
}

/**
 */
class MASSMAILING(instance: com.dexels.sportlink.subscription.adapters.MassMailingMap
		 = new com.dexels.sportlink.subscription.adapters.MassMailingMap
		) extends Adapter {
  ()
}

/**
 */
class FORMCONSTRUCTION(instance: com.dexels.sportlink.adapters.FormConstructionMap = new com.dexels.sportlink.adapters.FormConstructionMap) extends Adapter {
  ()
}

/**
 */
class TEMPLATE(instance: com.dexels.sportlink.adapters.TemplateMap = new com.dexels.sportlink.adapters.TemplateMap) extends Adapter {
  ()
}

/**
 */
class DBADMIN(instance: com.dexels.sportlink.adapters.DBAdministratorMap = new com.dexels.sportlink.adapters.DBAdministratorMap) extends Adapter {
  ()
}

/**
 */
class PPUPLOAD(instance: com.dexels.sportlink.adapters.PlayersPassUploadMap = new com.dexels.sportlink.adapters.PlayersPassUploadMap) extends Adapter {
  ()
}

/**
 */
class PPDOWNLOAD(instance: com.dexels.sportlink.adapters.PlayersPassDownloadMap = new com.dexels.sportlink.adapters.PlayersPassDownloadMap) extends Adapter {
  ()
}

/**
 */
class CLUBACCOUNTJOURNALEXPORT(instance: com.dexels.sportlink.finance.adapters.ClubAccountJournalExportMap
		 = new com.dexels.sportlink.finance.adapters.ClubAccountJournalExportMap
		) extends Adapter {
  ()
}

/**
 */
class USERACTIVITY(instance: com.dexels.sportlink.adapters.UserActivityMap = new com.dexels.sportlink.adapters.UserActivityMap) extends Adapter {
  ()
}

/**
 */
class DIRECTDEBITJOURNALEXPORT(instance: com.dexels.sportlink.finance.adapters.DirectDebitJournalExportMap
		 = new com.dexels.sportlink.finance.adapters.DirectDebitJournalExportMap
		) extends Adapter {
  ()
}

/**
 */
class DIRECTMEMBERJOURNALEXPORT(instance: com.dexels.sportlink.finance.adapters.DirectMemberJournalExportMap
		 = new com.dexels.sportlink.finance.adapters.DirectMemberJournalExportMap
		) extends Adapter {
  ()
}

/**
 */
class VCARD(instance: com.dexels.sportlink.adapters.VCardMap = new com.dexels.sportlink.adapters.VCardMap) extends Adapter {
  ()
}

/**
 */
class VTEL(instance: com.dexels.sportlink.adapters.vcard.VTel = new com.dexels.sportlink.adapters.vcard.VTel) extends Adapter {
  ()
}

/**
 */
class VEMAIL(instance: com.dexels.sportlink.adapters.vcard.VEmail = new com.dexels.sportlink.adapters.vcard.VEmail) extends Adapter {
  ()
}

/**
 */
class VADDR(instance: com.dexels.sportlink.adapters.vcard.VAddr = new com.dexels.sportlink.adapters.vcard.VAddr) extends Adapter {
  ()
}

/**
 */
class SMSMAP(instance: com.dexels.sportlink.adapters.SMSMap = new com.dexels.sportlink.adapters.SMSMap) extends Adapter {
  ()
}

/**
 */
class PPPSUBMISSION(instance: com.dexels.sportlink.adapters.PlayersPassProductionSubmissionMap = new com.dexels.sportlink.adapters.PlayersPassProductionSubmissionMap) extends Adapter {
  ()
}

/**
 */
class GOOGLEMSG(instance: com.dexels.sportlink.adapters.GoogleCloudMessagingJsonAdapter = new com.dexels.sportlink.adapters.GoogleCloudMessagingJsonAdapter) extends Adapter {
  ()
}

/**
 */
class APPLBPUSH(instance: com.dexels.sportlink.adapters.AppleCloudBulkMessagingAdapter = new com.dexels.sportlink.adapters.AppleCloudBulkMessagingAdapter) extends Adapter {
  ()
}

/**
 */
class APPLEPUSH(instance: com.dexels.sportlink.adapters.AppleCloudMessagingAdapter = new com.dexels.sportlink.adapters.AppleCloudMessagingAdapter) extends Adapter {
  ()
}

/**
 */
class CLIEOPPOST(instance: com.dexels.sportlink.adapters.clieop.ClieOpPost = new com.dexels.sportlink.adapters.clieop.ClieOpPost) extends Adapter {
  ()
}

/**
 */
class CLUBDEBITJOURNALEXPORT
		(instance: com.dexels.sportlink.finance.adapters.ClubDebitJournalExportMap = new com.dexels.sportlink.finance.adapters.ClubDebitJournalExportMap) extends Adapter {
  ()
}

/**
 */
class PPPRODUCTIONATTEMP(instance: com.dexels.sportlink.adapters.PlayersPassProductionAttemptMap = new com.dexels.sportlink.adapters.PlayersPassProductionAttemptMap) extends Adapter {
  ()
}

/**
 */
class SPORTTAALMAP(instance: com.dexels.sportlink.adapters.SporttaalMap = new com.dexels.sportlink.adapters.SporttaalMap) extends Adapter {
  ()
}

/**
 */
class GENERICARANKING(instance: com.dexels.sportlink.comparison.GenericRanking = new com.dexels.sportlink.comparison.GenericRanking) extends Adapter {
  ()
}

/**
 */
class GOOGLECLOUDMESSAGING(instance: com.dexels.sportlink.adapters.GoogleCloudMessagingJsonAdapter = new com.dexels.sportlink.adapters.GoogleCloudMessagingJsonAdapter) extends Adapter {
  ()
}