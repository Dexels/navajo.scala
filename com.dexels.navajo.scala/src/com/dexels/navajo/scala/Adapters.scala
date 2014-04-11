package com.dexels.navajo.scala

import com.dexels.navajo.scala.document._

trait Adapters extends com.dexels.navajo.scala.BaseAdapters { self: com.dexels.navajo.scala.ScalaCompiledScript => 
  def testadapter(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new TESTADAPTER
    setupMap(message, instance, f)
  }
  def asynctest(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ASYNCTEST
    setupMap(message, instance, f)
  }
  def asyncproxy(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ASYNCPROXY
    setupMap(message, instance, f)
  }
  def sqldatasourcemap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new SQLDATASOURCEMAP
    setupMap(message, instance, f)
  }
  def querymap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new QUERYMAP
    setupMap(message, instance, f)
  }
  def runtime(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new RUNTIME
    setupMap(message, instance, f)
  }
  def filemap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new FILEMAP
    setupMap(message, instance, f)
  }
  def filelinemap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new FILELINEMAP
    setupMap(message, instance, f)
  }
  def filerecordmap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new FILERECORDMAP
    setupMap(message, instance, f)
  }
  def asyncproxymap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ASYNCPROXYMAP
    setupMap(message, instance, f)
  }
  def tokenizer(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new TOKENIZER
    setupMap(message, instance, f)
  }
  def databaseinfo(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new DATABASEINFO
    setupMap(message, instance, f)
  }
  def oracleadministrator(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ORACLEADMINISTRATOR
    setupMap(message, instance, f)
  }
  def zipmap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ZIPMAP
    setupMap(message, instance, f)
  }
  def description(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new DESCRIPTION
    setupMap(message, instance, f)
  }
  def save(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new SAVE
    setupMap(message, instance, f)
  }
  def load(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new LOAD
    setupMap(message, instance, f)
  }
  def filelist(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new FILELIST
    setupMap(message, instance, f)
  }
  def option(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new OPTION
    setupMap(message, instance, f)
  }
  def fileentry(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new FILEENTRY
    setupMap(message, instance, f)
  }
  def dirmap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new DIRMAP
    setupMap(message, instance, f)
  }
  def arraymessage(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ARRAYMESSAGE
    setupMap(message, instance, f)
  }
  def arrayelement(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ARRAYELEMENT
    setupMap(message, instance, f)
  }
  def joinmessage(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new JOINMESSAGE
    setupMap(message, instance, f)
  }
  def copymessage(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new COPYMESSAGE
    setupMap(message, instance, f)
  }
  def csv(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new CSV
    setupMap(message, instance, f)
  }
  def csvline(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new CSVLINE
    setupMap(message, instance, f)
  }
  def http(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new HTTP
    setupMap(message, instance, f)
  }
  def mail(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new MAIL
    setupMap(message, instance, f)
  }
  def mailalternative(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new MAILALTERNATIVE
    setupMap(message, instance, f)
  }
  def commonsmailmap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new COMMONSMAILMAP
    setupMap(message, instance, f)
  }
  def attachment(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ATTACHMENT
    setupMap(message, instance, f)
  }
  def message(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new MESSAGE
    setupMap(message, instance, f)
  }
  def navajogroup(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new NAVAJOGROUP
    setupMap(message, instance, f)
  }
  def navajomap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new NAVAJOMAP
    setupMap(message, instance, f)
  }
  def messagemap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new MESSAGEMAP
    setupMap(message, instance, f)
  }
  def rest(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new REST
    setupMap(message, instance, f)
  }
  def navajolistener(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new NAVAJOLISTENER
    setupMap(message, instance, f)
  }
  def sqlquery(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new SQLQUERY
    setupMap(message, instance, f)
  }
  def storedproc(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new STOREDPROC
    setupMap(message, instance, f)
  }
  def resultrow(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new RESULTROW
    setupMap(message, instance, f)
  }
  def auditlog(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new AUDITLOG
    setupMap(message, instance, f)
  }
  def access(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ACCESS
    setupMap(message, instance, f)
  }
  def xml(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new XML
    setupMap(message, instance, f)
  }
  def xmlmap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new XMLMAP
    setupMap(message, instance, f)
  }
  def tagmap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new TAGMAP
    setupMap(message, instance, f)
  }
  def soap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new SOAP
    setupMap(message, instance, f)
  }
  def tml2xml(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new TML2XML
    setupMap(message, instance, f)
  }
  def adminMap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ADMINMAP
    setupMap(message, instance, f)
  }
  def accessMap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new ACCESSMAP
    setupMap(message, instance, f)
  }
  def multipleSQLMap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new MULTIPLESQLMAP
    setupMap(message, instance, f)
  }
  def selectionMap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new SELECTIONMAP
    setupMap(message, instance, f)
  }
  def sequencedInsertMap(message: NavajoMessage, f: Int => Unit): Unit = {
    val instance = new SEQUENCEDINSERTMAP
    setupMap(message, instance, f)
  }
}

/**
 */
class TESTADAPTER extends Adapter {
  val instance = new com.dexels.navajo.adapter.TestAdapter
}

/**
 */
class ASYNCTEST extends Adapter {
  val instance = new com.dexels.navajo.mapping.AsyncTest
}

/**
 */
class ASYNCPROXY extends Adapter {
  val instance = new com.dexels.navajo.adapter.AsyncProxy
}

/**
 */
class SQLDATASOURCEMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.sqlmap.SQLMapDatasourceMap
}

/**
 */
class QUERYMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.QueryMap
}

/**
 */
class RUNTIME extends Adapter {
  val instance = new com.dexels.navajo.adapter.RuntimeAdapter
}

/**
 */
class FILEMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.FileMap
}

/**
 */
class FILELINEMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.filemap.FileLineMap
}

/**
 */
class FILERECORDMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.filemap.FileRecordMap
}

/**
 */
class ASYNCPROXYMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.AsyncProxyMap
}

/**
 */
class TOKENIZER extends Adapter {
  val instance = new com.dexels.navajo.adapter.TokenizerMap
}

/**
 */
class DATABASEINFO extends Adapter {
  val instance = new com.dexels.navajo.adapter.sqlmap.DatabaseInfo
}

/**
 */
class ORACLEADMINISTRATOR extends Adapter {
  val instance = new com.dexels.navajo.adapter.OracleAdministratorMap
}

/**
 */
class ZIPMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.ZipMap
}

/**
 */
class DESCRIPTION extends Adapter {
  val instance = new com.dexels.navajo.adapter.DescriptionMap
}

/**
 */
class SAVE extends Adapter {
  val instance = new com.dexels.navajo.adapter.NavajoSaveAdapter
}

/**
 */
class LOAD extends Adapter {
  val instance = new com.dexels.navajo.adapter.NavajoLoadAdapter
}

/**
 */
class FILELIST extends Adapter {
  val instance = new com.dexels.navajo.adapter.NavajoFileListAdapter
}

/**
 */
class OPTION extends Adapter {
  val instance = new com.dexels.navajo.adapter.OptionMap
}

/**
 */
class FILEENTRY extends Adapter {
  val instance = new com.dexels.navajo.adapter.dirmap.FileEntryMap
  def absolutePath(absolutePath: java.lang.String): Unit = {
    instance.setAbsolutePath(absolutePath)
  }
}

/**
 */
class DIRMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.DirMap
  def path(path: java.lang.String): Unit = {
    instance.setPath(path)
  }
}

/**
 */
class ARRAYMESSAGE extends Adapter {
  val instance = new com.dexels.navajo.adapter.MultipleEmptyMap
}

/**
 */
class ARRAYELEMENT extends Adapter {
  val instance = new com.dexels.navajo.adapter.EmptyMap
}

/**
 */
class JOINMESSAGE extends Adapter {
  val instance = new com.dexels.navajo.adapter.MessageMap
  def join(message1: java.lang.String, message2: java.lang.String, joinCondition: java.lang.String, `type`: java.lang.String, ignoreSource: java.lang.Boolean, suppressProperties: java.lang.String, removeDuplicates: java.lang.Boolean, groupBy: java.lang.String): Unit = {
    ()
  }
}

/**
 */
class COPYMESSAGE extends Adapter {
  val instance = new com.dexels.navajo.adapter.CopyMessage
  def useOutputDoc(useOutputDoc: java.lang.Boolean): Unit = {
    instance.setUseOutputDoc(useOutputDoc)
  }
  def useDefinitionMessage(useDefinitionMessage: java.lang.Boolean): Unit = {
    instance.setUseDefinitionMessage(useDefinitionMessage)
  }
  def copyMessageFrom(copyMessageFrom: java.lang.String): Unit = {
    instance.setCopyMessageFrom(copyMessageFrom)
  }
  def copyMessageTo(copyMessageTo: java.lang.String): Unit = {
    instance.setCopyMessageTo(copyMessageTo)
  }
}

/**
 */
class CSV extends Adapter {
  val instance = new com.dexels.navajo.adapter.CSVMap
  def maximumImportCount(maximumImportCount: java.lang.Integer): Unit = {
    instance.setMaximumImportCount(maximumImportCount)
  }
  def skipFirstRow(skipFirstRow: java.lang.Boolean): Unit = {
    instance.setSkipFirstRow(skipFirstRow)
  }
  def fileName(fileName: java.lang.String): Unit = {
    instance.setFileName(fileName)
  }
  def fileContent(fileContent: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setFileContent(fileContent)
  }
  def separator(separator: java.lang.String): Unit = {
    instance.setSeparator(separator)
  }
  def update(update: java.lang.Boolean): Unit = {
    instance.setUpdate(update)
  }
  def includeEmpty(includeEmpty: java.lang.Boolean): Unit = {
    instance.setIncludeEmpty(includeEmpty)
  }
}

/**
 */
class CSVLINE extends Adapter {
  val instance = new com.dexels.navajo.adapter.csvmap.CSVEntryMap
}

/**
 */
class HTTP extends Adapter {
  val instance = new com.dexels.navajo.adapter.HTTPMap
  def url(url: java.lang.String): Unit = {
    instance.setUrl(url)
  }
  def method(method: java.lang.String): Unit = {
    instance.setMethod(method)
  }
  def textContent(textContent: java.lang.String): Unit = {
    instance.setTextContent(textContent)
  }
  def contentType(contentType: java.lang.String): Unit = {
    instance.setContentType(contentType)
  }
  def content(content: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setContent(content)
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def doSend: Unit = {
    ()
  }
}

/**
 */
class MAIL extends Adapter {
  val instance = new com.dexels.navajo.adapter.MailMap
  def mailServer(mailServer: java.lang.String): Unit = {
    instance.setMailServer(mailServer)
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def ignoreFailures(ignoreFailures: java.lang.Boolean): Unit = {
    instance.setIgnoreFailures(ignoreFailures)
  }
  def sender(sender: java.lang.String): Unit = {
    instance.setSender(sender)
  }
  def subject(subject: java.lang.String): Unit = {
    instance.setSubject(subject)
  }
  def text(text: java.lang.String): Unit = {
    instance.setText(text)
  }
  def recipients(recipients: java.lang.String): Unit = {
    instance.setRecipients(recipients)
  }
  def smtpUser(smtpUser: java.lang.String): Unit = {
    instance.setSmtpUser(smtpUser)
  }
  def smtpPass(smtpPass: java.lang.String): Unit = {
    instance.setSmtpPass(smtpPass)
  }
  def useEncryption(useEncryption: java.lang.Boolean): Unit = {
    instance.setUseEncryption(useEncryption)
  }
}

/**
 */
class MAILALTERNATIVE extends Adapter {
  val instance = new com.dexels.navajo.adapter.MailMapAlternative
  def mailServer(mailServer: java.lang.String): Unit = {
    instance.setMailServer(mailServer)
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def ignoreFailures(ignoreFailures: java.lang.Boolean): Unit = {
    instance.setIgnoreFailures(ignoreFailures)
  }
  def sender(sender: java.lang.String): Unit = {
    instance.setSender(sender)
  }
  def subject(subject: java.lang.String): Unit = {
    instance.setSubject(subject)
  }
  def text(text: java.lang.String): Unit = {
    instance.setText(text)
  }
  def recipients(recipients: java.lang.String): Unit = {
    instance.setRecipients(recipients)
  }
}

/**
 */
class COMMONSMAILMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.CommonsMailMap
  def mailServer(mailServer: java.lang.String): Unit = {
    instance.setMailServer(mailServer)
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def from(from: java.lang.String): Unit = {
    instance.setFrom(from)
  }
  def subject(subject: java.lang.String): Unit = {
    instance.setSubject(subject)
  }
  def bodyText(bodyText: java.lang.String): Unit = {
    instance.setBodyText(bodyText)
  }
  def to(to: java.lang.String): Unit = {
    instance.setTo(to)
  }
  def smtpUser(smtpUser: java.lang.String): Unit = {
    instance.setSmtpUser(smtpUser)
  }
  def smtpPass(smtpPass: java.lang.String): Unit = {
    instance.setSmtpPass(smtpPass)
  }
  def useEncryption(useEncryption: java.lang.Boolean): Unit = {
    instance.setUseEncryption(useEncryption)
  }
}

/**
 */
class ATTACHMENT extends Adapter {
  val instance = new com.dexels.navajo.adapter.mailmap.AttachementMap
  def attachFileName(attachFileName: java.lang.String): Unit = {
    instance.setAttachFileName(attachFileName)
  }
  def attachFileContent(attachFileContent: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setAttachFileContent(attachFileContent)
  }
}

/** Creates a message */
class MESSAGE extends Adapter {
  val instance = new com.dexels.navajo.adapter.CreateMessage
  def create(name: java.lang.String): Unit = {
    ()
  }
}

/**
 * This adapter can be used to group other Navajo maps typically as a barrier for
 * 			asynchronous service calls
 * 		
 */
class NAVAJOGROUP extends Adapter {
  val instance = new com.dexels.navajo.adapter.NavajoMapGroupAdapter
  def appendResponse(id: java.lang.String, appendTo: java.lang.Object, append: java.lang.String): Unit = {
    ()
  }
  def setMessagePointer(id: java.lang.String, messagePointer: java.lang.String): Unit = {
    ()
  }
}

/**
 * This adapter can be used to call other Navajo services,
 * 			either synchronously,
 * 			asynchronously or scheduled
 * 		
 */
class NAVAJOMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.NavajoMap
  def trigger(trigger: java.lang.String): Unit = {
    instance.setTrigger(trigger)
  }
  def sendThrough(sendThrough: java.lang.Boolean): Unit = {
    instance.setSendThrough(sendThrough)
  }
  def server(server: java.lang.String): Unit = {
    instance.setServer(server)
  }
  def id(id: java.lang.String): Unit = {
    instance.setId(id)
  }
  def block(block: java.lang.Boolean): Unit = {
    instance.setBlock(block)
  }
  def username(username: java.lang.String): Unit = {
    instance.setUsername(username)
  }
  def password(password: java.lang.String): Unit = {
    instance.setPassword(password)
  }
  def resource(resource: java.lang.String): Unit = {
    instance.setResource(resource)
  }
  def useCurrentOutDoc(useCurrentOutDoc: java.lang.Boolean): Unit = {
    instance.setUseCurrentOutDoc(useCurrentOutDoc)
  }
  def useCurrentMessages(useCurrentMessages: java.lang.String): Unit = {
    instance.setUseCurrentMessages(useCurrentMessages)
  }
  def messagePointer(messagePointer: java.lang.String): Unit = {
    instance.setMessagePointer(messagePointer)
  }
  def selectionPointer(selectionPointer: java.lang.String): Unit = {
    instance.setSelectionPointer(selectionPointer)
  }
  def createproperty(name: java.lang.String, `type`: java.lang.String, value: java.lang.Object): Unit = {
    ()
  }
  def deleteproperty(name: java.lang.String): Unit = {
    ()
  }
  def deletemessage(name: java.lang.String): Unit = {
    ()
  }
  def suppressproperty(name: java.lang.String): Unit = {
    ()
  }
  def showproperty(name: java.lang.String, direction: java.lang.String): Unit = {
    ()
  }
  def setdirection(name: java.lang.String, direction: java.lang.String): Unit = {
    ()
  }
  def callwebservice(breakOnConditionError: java.lang.Boolean, breakOnException: java.lang.Boolean, server: java.lang.String, username: java.lang.String, password: java.lang.String, showProperties: java.lang.String, suppressProperties: java.lang.String, inputProperties: java.lang.String, outputProperties: java.lang.String, block: java.lang.Boolean, name: java.lang.Boolean, appendTo: java.lang.String, append: java.lang.String): Unit = {
    ()
  }
}

/**
 */
class MESSAGEMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.navajomap.MessageMap
}

/**
 * This adapter can be used to call REST services
 * 		
 */
class REST extends Adapter {
  val instance = new com.dexels.navajo.adapter.RESTAdapter
  def sendThrough(sendThrough: java.lang.Boolean): Unit = {
    instance.setSendThrough(sendThrough)
  }
  def url(url: java.lang.String): Unit = {
    instance.setUrl(url)
  }
  def method(method: java.lang.String): Unit = {
    instance.setMethod(method)
  }
  def useCurrentOutDoc(useCurrentOutDoc: java.lang.Boolean): Unit = {
    instance.setUseCurrentOutDoc(useCurrentOutDoc)
  }
  def useCurrentMessages(useCurrentMessages: java.lang.String): Unit = {
    instance.setUseCurrentMessages(useCurrentMessages)
  }
  def messagePointer(messagePointer: java.lang.String): Unit = {
    instance.setMessagePointer(messagePointer)
  }
  def selectionPointer(selectionPointer: java.lang.String): Unit = {
    instance.setSelectionPointer(selectionPointer)
  }
  def createproperty(name: java.lang.String, `type`: java.lang.String, value: java.lang.Object): Unit = {
    ()
  }
  def deleteproperty(name: java.lang.String): Unit = {
    ()
  }
  def deletemessage(name: java.lang.String): Unit = {
    ()
  }
  def callservice(url: java.lang.String, method: java.lang.String, topMessage: java.lang.String, removeTopMessage: java.lang.Boolean, appendTo: java.lang.String, append: java.lang.String): Unit = {
    ()
  }
}

/**
 */
class NAVAJOLISTENER extends Adapter {
  val instance = new com.dexels.navajo.adapter.NavajoMap
  def taskId(taskId: java.lang.String): Unit = {
    instance.setTaskId(taskId)
  }
}

/**
 */
class SQLQUERY extends Adapter {
  val instance = new com.dexels.navajo.adapter.SQLMap
  def query(query: java.lang.String): Unit = {
    instance.setQuery(query)
  }
  def update(update: java.lang.String): Unit = {
    instance.setUpdate(update)
  }
  def binaryQuery(binaryQuery: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setBinaryQuery(binaryQuery)
  }
  def binaryUpdate(binaryUpdate: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setBinaryUpdate(binaryUpdate)
  }
  def debug(debug: java.lang.Boolean): Unit = {
    instance.setDebug(debug)
  }
  def transactionContext(transactionContext: java.lang.Integer): Unit = {
    instance.setTransactionContext(transactionContext)
  }
  def datasource(datasource: java.lang.String): Unit = {
    instance.setDatasource(datasource)
  }
  def username(username: java.lang.String): Unit = {
    instance.setUsername(username)
  }
  def parameter(parameter: java.lang.Object): Unit = {
    instance.setParameter(parameter)
  }
  def addParameter(value: java.lang.Object): Unit = {
    ()
  }
  def doUpdate: Unit = {
    ()
  }
  def rollback: Unit = {
    ()
  }
}

/**
 */
class STOREDPROC extends Adapter {
  val instance = new com.dexels.navajo.adapter.SPMap
  def query(query: java.lang.String): Unit = {
    instance.setQuery(query)
  }
  def update(update: java.lang.String): Unit = {
    instance.setUpdate(update)
  }
  def debug(debug: java.lang.Boolean): Unit = {
    instance.setDebug(debug)
  }
  def transactionContext(transactionContext: java.lang.Integer): Unit = {
    instance.setTransactionContext(transactionContext)
  }
  def datasource(datasource: java.lang.String): Unit = {
    instance.setDatasource(datasource)
  }
  def username(username: java.lang.String): Unit = {
    instance.setUsername(username)
  }
  def addParameter(value: java.lang.Object): Unit = {
    ()
  }
  def addOutputParameter(`type`: java.lang.Object): Unit = {
    ()
  }
  def doUpdate: Unit = {
    ()
  }
  def rollback: Unit = {
    ()
  }
}

/**
 */
class RESULTROW extends Adapter {
  val instance = new com.dexels.navajo.adapter.sqlmap.ResultSetMap
}

/**
 */
class AUDITLOG extends Adapter {
  val instance = new com.dexels.navajo.util.AuditLog
}

/**
 */
class ACCESS extends Adapter {
  val instance = new com.dexels.navajo.adapter.NavajoAccess
}

/**
 * This adapter can be used to create large XML documents
 * 			(well over 1GB )
 * 		
 */
class XML extends Adapter {
  val instance = new com.dexels.navajo.adapter.XMLStreamMap
  def indent(indent: java.lang.Integer): Unit = {
    instance.setIndent(indent)
  }
  def startElement(name: java.lang.String): Unit = {
    ()
  }
  def endElement: Unit = {
    ()
  }
  def newline: Unit = {
    ()
  }
  def setAttribute(name: java.lang.String, value: java.lang.String): Unit = {
    ()
  }
  def setValue(value: java.lang.String): Unit = {
    ()
  }
}

/**
 * This adapter can be used to create XML documents.
 * 		
 */
class XMLMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.XMLMap
  def stringContent(stringContent: java.lang.String): Unit = {
    instance.setStringContent(stringContent)
  }
  def indent(indent: java.lang.Integer): Unit = {
    instance.setIndent(indent)
  }
  def start(start: java.lang.String): Unit = {
    instance.setStart(start)
  }
  def setContent(tag: java.lang.String, content: com.dexels.navajo.document.types.Binary): Unit = {
    ()
  }
  def setText(tag: java.lang.String, value: java.lang.String): Unit = {
    ()
  }
  def setAttribute(tag: java.lang.String, attribute: java.lang.String, value: java.lang.String): Unit = {
    ()
  }
}

/**
 */
class TAGMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.xmlmap.TagMap
  def name(name: java.lang.String): Unit = {
    instance.setName(name)
  }
  def text(text: java.lang.String): Unit = {
    instance.setText(text)
  }
  def setText(tag: java.lang.String, value: java.lang.String): Unit = {
    ()
  }
  def setAttribute(tag: java.lang.String, attribute: java.lang.String, value: java.lang.String): Unit = {
    ()
  }
}

/**
 */
class SOAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.SOAPMap
  def soapAction(soapAction: java.lang.String): Unit = {
    instance.setSoapAction(soapAction)
  }
  def url(url: java.lang.String): Unit = {
    instance.setUrl(url)
  }
  def addNamespace(value: java.lang.String): Unit = {
    ()
  }
  def requestBody(value: com.dexels.navajo.document.types.Binary): Unit = {
    ()
  }
  def request(header: com.dexels.navajo.document.types.Binary, value: com.dexels.navajo.document.types.Binary): Unit = {
    ()
  }
  def doSend: Unit = {
    ()
  }
}

/**
 */
class TML2XML extends Adapter {
  val instance = new com.dexels.navajo.adapter.TmlToXmlMap
  def rootPath(rootPath: java.lang.String): Unit = {
    instance.setRootPath(rootPath)
  }
  def addAttribute(path: java.lang.String, name: java.lang.String, value: java.lang.String): Unit = {
    ()
  }
  def dumpObject: Unit = {
    ()
  }
  def buildContent: Unit = {
    ()
  }
}

/**
 */
class ADMINMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.AdminMap
}

/**
 */
class ACCESSMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.AccessMap
}

/**
 */
class MULTIPLESQLMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.MultipleSQLMap
}

/**
 */
class SELECTIONMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.SelectionMap
}

/**
 */
class SEQUENCEDINSERTMAP extends Adapter {
  val instance = new com.dexels.navajo.adapter.SequencedInsertMap
}