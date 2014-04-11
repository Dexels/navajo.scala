package com.dexels.navajo.scala

import com.dexels.navajo.scala.document._

trait Adapters extends com.dexels.navajo.scala.BaseAdapters { self: com.dexels.navajo.scala.ScalaCompiledScript => 
  def testadapter(message: NavajoMessage, f: TESTADAPTER => Unit): Unit = {
    val instance = new TESTADAPTER
    setupMap(message, instance, f)
  }
  def asynctest(message: NavajoMessage, f: ASYNCTEST => Unit): Unit = {
    val instance = new ASYNCTEST
    setupMap(message, instance, f)
  }
  def asyncproxy(message: NavajoMessage, f: ASYNCPROXY => Unit): Unit = {
    val instance = new ASYNCPROXY
    setupMap(message, instance, f)
  }
  def sqldatasourcemap(message: NavajoMessage, f: SQLDATASOURCEMAP => Unit): Unit = {
    val instance = new SQLDATASOURCEMAP
    setupMap(message, instance, f)
  }
  def querymap(message: NavajoMessage, f: QUERYMAP => Unit): Unit = {
    val instance = new QUERYMAP
    setupMap(message, instance, f)
  }
  def runtime(message: NavajoMessage, f: RUNTIME => Unit): Unit = {
    val instance = new RUNTIME
    setupMap(message, instance, f)
  }
  def filemap(message: NavajoMessage, f: FILEMAP => Unit): Unit = {
    val instance = new FILEMAP
    setupMap(message, instance, f)
  }
  def filelinemap(message: NavajoMessage, f: FILELINEMAP => Unit): Unit = {
    val instance = new FILELINEMAP
    setupMap(message, instance, f)
  }
  def filerecordmap(message: NavajoMessage, f: FILERECORDMAP => Unit): Unit = {
    val instance = new FILERECORDMAP
    setupMap(message, instance, f)
  }
  def asyncproxymap(message: NavajoMessage, f: ASYNCPROXYMAP => Unit): Unit = {
    val instance = new ASYNCPROXYMAP
    setupMap(message, instance, f)
  }
  def tokenizer(message: NavajoMessage, f: TOKENIZER => Unit): Unit = {
    val instance = new TOKENIZER
    setupMap(message, instance, f)
  }
  def databaseinfo(message: NavajoMessage, f: DATABASEINFO => Unit): Unit = {
    val instance = new DATABASEINFO
    setupMap(message, instance, f)
  }
  def oracleadministrator(message: NavajoMessage, f: ORACLEADMINISTRATOR => Unit): Unit = {
    val instance = new ORACLEADMINISTRATOR
    setupMap(message, instance, f)
  }
  def zipmap(message: NavajoMessage, f: ZIPMAP => Unit): Unit = {
    val instance = new ZIPMAP
    setupMap(message, instance, f)
  }
  def description(message: NavajoMessage, f: DESCRIPTION => Unit): Unit = {
    val instance = new DESCRIPTION
    setupMap(message, instance, f)
  }
  def save(message: NavajoMessage, f: SAVE => Unit): Unit = {
    val instance = new SAVE
    setupMap(message, instance, f)
  }
  def load(message: NavajoMessage, f: LOAD => Unit): Unit = {
    val instance = new LOAD
    setupMap(message, instance, f)
  }
  def filelist(message: NavajoMessage, f: FILELIST => Unit): Unit = {
    val instance = new FILELIST
    setupMap(message, instance, f)
  }
  def option(message: NavajoMessage, f: OPTION => Unit): Unit = {
    val instance = new OPTION
    setupMap(message, instance, f)
  }
  def fileentry(message: NavajoMessage, f: FILEENTRY => Unit): Unit = {
    val instance = new FILEENTRY
    setupMap(message, instance, f)
  }
  def dirmap(message: NavajoMessage, f: DIRMAP => Unit): Unit = {
    val instance = new DIRMAP
    setupMap(message, instance, f)
  }
  def arraymessage(message: NavajoMessage, f: ARRAYMESSAGE => Unit): Unit = {
    val instance = new ARRAYMESSAGE
    setupMap(message, instance, f)
  }
  def arrayelement(message: NavajoMessage, f: ARRAYELEMENT => Unit): Unit = {
    val instance = new ARRAYELEMENT
    setupMap(message, instance, f)
  }
  def joinmessage(message: NavajoMessage, f: JOINMESSAGE => Unit): Unit = {
    val instance = new JOINMESSAGE
    setupMap(message, instance, f)
  }
  def copymessage(message: NavajoMessage, f: COPYMESSAGE => Unit): Unit = {
    val instance = new COPYMESSAGE
    setupMap(message, instance, f)
  }
  def csv(message: NavajoMessage, f: CSV => Unit): Unit = {
    val instance = new CSV
    setupMap(message, instance, f)
  }
  def csvline(message: NavajoMessage, f: CSVLINE => Unit): Unit = {
    val instance = new CSVLINE
    setupMap(message, instance, f)
  }
  def http(message: NavajoMessage, f: HTTP => Unit): Unit = {
    val instance = new HTTP
    setupMap(message, instance, f)
  }
  def mail(message: NavajoMessage, f: MAIL => Unit): Unit = {
    val instance = new MAIL
    setupMap(message, instance, f)
  }
  def mailalternative(message: NavajoMessage, f: MAILALTERNATIVE => Unit): Unit = {
    val instance = new MAILALTERNATIVE
    setupMap(message, instance, f)
  }
  def commonsmailmap(message: NavajoMessage, f: COMMONSMAILMAP => Unit): Unit = {
    val instance = new COMMONSMAILMAP
    setupMap(message, instance, f)
  }
  def attachment(message: NavajoMessage, f: ATTACHMENT => Unit): Unit = {
    val instance = new ATTACHMENT
    setupMap(message, instance, f)
  }
  def message(message: NavajoMessage, f: MESSAGE => Unit): Unit = {
    val instance = new MESSAGE
    setupMap(message, instance, f)
  }
  def navajogroup(message: NavajoMessage, f: NAVAJOGROUP => Unit): Unit = {
    val instance = new NAVAJOGROUP
    setupMap(message, instance, f)
  }
  def navajomap(message: NavajoMessage, f: NAVAJOMAP => Unit): Unit = {
    val instance = new NAVAJOMAP
    setupMap(message, instance, f)
  }
  def messagemap(message: NavajoMessage, f: MESSAGEMAP => Unit): Unit = {
    val instance = new MESSAGEMAP
    setupMap(message, instance, f)
  }
  def rest(message: NavajoMessage, f: REST => Unit): Unit = {
    val instance = new REST
    setupMap(message, instance, f)
  }
  def navajolistener(message: NavajoMessage, f: NAVAJOLISTENER => Unit): Unit = {
    val instance = new NAVAJOLISTENER
    setupMap(message, instance, f)
  }
  def sqlquery(message: NavajoMessage, f: SQLQUERY => Unit): Unit = {
    val instance = new SQLQUERY
    setupMap(message, instance, f)
  }
  def storedproc(message: NavajoMessage, f: STOREDPROC => Unit): Unit = {
    val instance = new STOREDPROC
    setupMap(message, instance, f)
  }
  def resultrow(message: NavajoMessage, f: RESULTROW => Unit): Unit = {
    val instance = new RESULTROW
    setupMap(message, instance, f)
  }
  def auditlog(message: NavajoMessage, f: AUDITLOG => Unit): Unit = {
    val instance = new AUDITLOG
    setupMap(message, instance, f)
  }
  def access(message: NavajoMessage, f: ACCESS => Unit): Unit = {
    val instance = new ACCESS
    setupMap(message, instance, f)
  }
  def xml(message: NavajoMessage, f: XML => Unit): Unit = {
    val instance = new XML
    setupMap(message, instance, f)
  }
  def xmlmap(message: NavajoMessage, f: XMLMAP => Unit): Unit = {
    val instance = new XMLMAP
    setupMap(message, instance, f)
  }
  def tagmap(message: NavajoMessage, f: TAGMAP => Unit): Unit = {
    val instance = new TAGMAP
    setupMap(message, instance, f)
  }
  def soap(message: NavajoMessage, f: SOAP => Unit): Unit = {
    val instance = new SOAP
    setupMap(message, instance, f)
  }
  def tml2xml(message: NavajoMessage, f: TML2XML => Unit): Unit = {
    val instance = new TML2XML
    setupMap(message, instance, f)
  }
  def adminMap(message: NavajoMessage, f: ADMINMAP => Unit): Unit = {
    val instance = new ADMINMAP
    setupMap(message, instance, f)
  }
  def accessMap(message: NavajoMessage, f: ACCESSMAP => Unit): Unit = {
    val instance = new ACCESSMAP
    setupMap(message, instance, f)
  }
  def multipleSQLMap(message: NavajoMessage, f: MULTIPLESQLMAP => Unit): Unit = {
    val instance = new MULTIPLESQLMAP
    setupMap(message, instance, f)
  }
  def selectionMap(message: NavajoMessage, f: SELECTIONMAP => Unit): Unit = {
    val instance = new SELECTIONMAP
    setupMap(message, instance, f)
  }
  def sequencedInsertMap(message: NavajoMessage, f: SEQUENCEDINSERTMAP => Unit): Unit = {
    val instance = new SEQUENCEDINSERTMAP
    setupMap(message, instance, f)
  }
}

/**
 */
class TESTADAPTER(instance: com.dexels.navajo.adapter.TestAdapter = new com.dexels.navajo.adapter.TestAdapter) extends Adapter {
  ()
}

/**
 */
class ASYNCTEST(instance: com.dexels.navajo.mapping.AsyncTest = new com.dexels.navajo.mapping.AsyncTest) extends Adapter {
  ()
}

/**
 */
class ASYNCPROXY(instance: com.dexels.navajo.adapter.AsyncProxy = new com.dexels.navajo.adapter.AsyncProxy) extends Adapter {
  ()
}

/**
 */
class SQLDATASOURCEMAP(instance: com.dexels.navajo.adapter.sqlmap.SQLMapDatasourceMap = new com.dexels.navajo.adapter.sqlmap.SQLMapDatasourceMap) extends Adapter {
  ()
}

/**
 */
class QUERYMAP(instance: com.dexels.navajo.adapter.QueryMap = new com.dexels.navajo.adapter.QueryMap) extends Adapter {
  ()
}

/**
 */
class RUNTIME(instance: com.dexels.navajo.adapter.RuntimeAdapter = new com.dexels.navajo.adapter.RuntimeAdapter) extends Adapter {
  ()
}

/**
 */
class FILEMAP(instance: com.dexels.navajo.adapter.FileMap = new com.dexels.navajo.adapter.FileMap) extends Adapter {
  ()
}

/**
 */
class FILELINEMAP(instance: com.dexels.navajo.adapter.filemap.FileLineMap = new com.dexels.navajo.adapter.filemap.FileLineMap) extends Adapter {
  ()
}

/**
 */
class FILERECORDMAP(instance: com.dexels.navajo.adapter.filemap.FileRecordMap = new com.dexels.navajo.adapter.filemap.FileRecordMap) extends Adapter {
  ()
}

/**
 */
class ASYNCPROXYMAP(instance: com.dexels.navajo.adapter.AsyncProxyMap = new com.dexels.navajo.adapter.AsyncProxyMap) extends Adapter {
  ()
}

/**
 */
class TOKENIZER(instance: com.dexels.navajo.adapter.TokenizerMap = new com.dexels.navajo.adapter.TokenizerMap) extends Adapter {
  ()
}

/**
 */
class DATABASEINFO(instance: com.dexels.navajo.adapter.sqlmap.DatabaseInfo = new com.dexels.navajo.adapter.sqlmap.DatabaseInfo) extends Adapter {
  ()
}

/**
 */
class ORACLEADMINISTRATOR(instance: com.dexels.navajo.adapter.OracleAdministratorMap = new com.dexels.navajo.adapter.OracleAdministratorMap) extends Adapter {
  ()
}

/**
 */
class ZIPMAP(instance: com.dexels.navajo.adapter.ZipMap = new com.dexels.navajo.adapter.ZipMap) extends Adapter {
  ()
}

/**
 */
class DESCRIPTION(instance: com.dexels.navajo.adapter.DescriptionMap = new com.dexels.navajo.adapter.DescriptionMap) extends Adapter {
  ()
}

/**
 */
class SAVE(instance: com.dexels.navajo.adapter.NavajoSaveAdapter = new com.dexels.navajo.adapter.NavajoSaveAdapter) extends Adapter {
  ()
}

/**
 */
class LOAD(instance: com.dexels.navajo.adapter.NavajoLoadAdapter = new com.dexels.navajo.adapter.NavajoLoadAdapter) extends Adapter {
  ()
}

/**
 */
class FILELIST(instance: com.dexels.navajo.adapter.NavajoFileListAdapter = new com.dexels.navajo.adapter.NavajoFileListAdapter) extends Adapter {
  ()
}

/**
 */
class OPTION(instance: com.dexels.navajo.adapter.OptionMap = new com.dexels.navajo.adapter.OptionMap) extends Adapter {
  ()
}

/**
 */
class FILEENTRY(instance: com.dexels.navajo.adapter.dirmap.FileEntryMap = new com.dexels.navajo.adapter.dirmap.FileEntryMap) extends Adapter {
  def name: java.lang.String = {
    return instance.getName
  }
  def absolutePath: java.lang.String = {
    return instance.getAbsolutePath
  }
  def absolutePath(absolutePath: java.lang.String): Unit = {
    instance.setAbsolutePath(absolutePath)
  }
  def contents: com.dexels.navajo.document.types.Binary = {
    return instance.getContents
  }
  def mimeType: java.lang.String = {
    return instance.getMimeType
  }
  def size: java.lang.Integer = {
    return instance.getSize
  }
  def fileAge: java.lang.Integer = {
    return instance.getFileAge
  }
  def delete: Unit = {
    instance.setDelete(true)
  }
}

/**
 */
class DIRMAP(instance: com.dexels.navajo.adapter.DirMap = new com.dexels.navajo.adapter.DirMap) extends Adapter {
  def path: java.lang.String = {
    return instance.getPath
  }
  def path(path: java.lang.String): Unit = {
    instance.setPath(path)
  }
  def withFileEntries(f: FILEENTRY => Unit): Unit = {
    f(new FILEENTRY)
  }
}

/**
 */
class ARRAYMESSAGE(instance: com.dexels.navajo.adapter.MultipleEmptyMap = new com.dexels.navajo.adapter.MultipleEmptyMap) extends Adapter {
  def withLoop(f: ARRAYELEMENT => Unit): Unit = {
    f(new ARRAYELEMENT)
  }
}

/**
 */
class ARRAYELEMENT(instance: com.dexels.navajo.adapter.EmptyMap = new com.dexels.navajo.adapter.EmptyMap) extends Adapter {
  ()
}

/**
 */
class JOINMESSAGE(instance: com.dexels.navajo.adapter.MessageMap = new com.dexels.navajo.adapter.MessageMap) extends Adapter {
  def join(message1: java.lang.String, message2: java.lang.String, joinCondition: java.lang.String, `type`: java.lang.String, ignoreSource: java.lang.Boolean, suppressProperties: java.lang.String, removeDuplicates: java.lang.Boolean, groupBy: java.lang.String): Unit = {
    instance.setJoinMessage1(message1)
    instance.setJoinMessage2(message2)
    instance.setJoinCondition(joinCondition)
    instance.setJoinType(`type`)
    instance.setRemoveSource(ignoreSource)
    instance.setSuppressProperties(suppressProperties)
    instance.setRemoveDuplicates(removeDuplicates)
    instance.setGroupBy(groupBy)
  }
}

/**
 */
class COPYMESSAGE(instance: com.dexels.navajo.adapter.CopyMessage = new com.dexels.navajo.adapter.CopyMessage) extends Adapter {
  def useOutputDoc: java.lang.Boolean = {
    return instance.getUseOutputDoc
  }
  def useOutputDoc(useOutputDoc: java.lang.Boolean): Unit = {
    instance.setUseOutputDoc(useOutputDoc)
  }
  def useDefinitionMessage: java.lang.Boolean = {
    return instance.getUseDefinitionMessage
  }
  def useDefinitionMessage(useDefinitionMessage: java.lang.Boolean): Unit = {
    instance.setUseDefinitionMessage(useDefinitionMessage)
  }
  def copyMessageFrom: java.lang.String = {
    return instance.getCopyMessageFrom
  }
  def copyMessageFrom(copyMessageFrom: java.lang.String): Unit = {
    instance.setCopyMessageFrom(copyMessageFrom)
  }
  def copyMessageTo: java.lang.String = {
    return instance.getCopyMessageTo
  }
  def copyMessageTo(copyMessageTo: java.lang.String): Unit = {
    instance.setCopyMessageTo(copyMessageTo)
  }
}

/**
 */
class CSV(instance: com.dexels.navajo.adapter.CSVMap = new com.dexels.navajo.adapter.CSVMap) extends Adapter {
  def maximumImportCount: java.lang.Integer = {
    return instance.getMaximumImportCount
  }
  def maximumImportCount(maximumImportCount: java.lang.Integer): Unit = {
    instance.setMaximumImportCount(maximumImportCount)
  }
  def skipFirstRow: java.lang.Boolean = {
    return instance.getSkipFirstRow
  }
  def skipFirstRow(skipFirstRow: java.lang.Boolean): Unit = {
    instance.setSkipFirstRow(skipFirstRow)
  }
  def fileName: java.lang.String = {
    return instance.getFileName
  }
  def fileName(fileName: java.lang.String): Unit = {
    instance.setFileName(fileName)
  }
  def fileContent: com.dexels.navajo.document.types.Binary = {
    return instance.getFileContent
  }
  def fileContent(fileContent: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setFileContent(fileContent)
  }
  def separator: java.lang.String = {
    return instance.getSeparator
  }
  def separator(separator: java.lang.String): Unit = {
    instance.setSeparator(separator)
  }
  def update: java.lang.Boolean = {
    return instance.getUpdate
  }
  def update(update: java.lang.Boolean): Unit = {
    instance.setUpdate(update)
  }
  def includeEmpty: java.lang.Boolean = {
    return instance.getIncludeEmpty
  }
  def includeEmpty(includeEmpty: java.lang.Boolean): Unit = {
    instance.setIncludeEmpty(includeEmpty)
  }
  def withEntries(f: CSVLINE => Unit): Unit = {
    f(new CSVLINE)
  }
}

/**
 */
class CSVLINE(instance: com.dexels.navajo.adapter.csvmap.CSVEntryMap = new com.dexels.navajo.adapter.csvmap.CSVEntryMap) extends Adapter {
  ()
}

/**
 */
class HTTP(instance: com.dexels.navajo.adapter.HTTPMap = new com.dexels.navajo.adapter.HTTPMap) extends Adapter {
  def url: java.lang.String = {
    return instance.getUrl
  }
  def url(url: java.lang.String): Unit = {
    instance.setUrl(url)
  }
  def method: java.lang.String = {
    return instance.getMethod
  }
  def method(method: java.lang.String): Unit = {
    instance.setMethod(method)
  }
  def textContent: java.lang.String = {
    return instance.getTextContent
  }
  def textContent(textContent: java.lang.String): Unit = {
    instance.setTextContent(textContent)
  }
  def contentType: java.lang.String = {
    return instance.getContentType
  }
  def contentType(contentType: java.lang.String): Unit = {
    instance.setContentType(contentType)
  }
  def content: com.dexels.navajo.document.types.Binary = {
    return instance.getContent
  }
  def content(content: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setContent(content)
  }
  def queuedSend: java.lang.Boolean = {
    return instance.getQueuedSend
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def doSend: Unit = {
    instance.setDoSend(true)
  }
}

/**
 */
class MAIL(instance: com.dexels.navajo.adapter.MailMap = new com.dexels.navajo.adapter.MailMap) extends Adapter {
  def mailServer: java.lang.String = {
    return instance.getMailServer
  }
  def mailServer(mailServer: java.lang.String): Unit = {
    instance.setMailServer(mailServer)
  }
  def queuedSend: java.lang.Boolean = {
    return instance.getQueuedSend
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def ignoreFailures: java.lang.Boolean = {
    return instance.getIgnoreFailures
  }
  def ignoreFailures(ignoreFailures: java.lang.Boolean): Unit = {
    instance.setIgnoreFailures(ignoreFailures)
  }
  def sender: java.lang.String = {
    return instance.getSender
  }
  def sender(sender: java.lang.String): Unit = {
    instance.setSender(sender)
  }
  def subject: java.lang.String = {
    return instance.getSubject
  }
  def subject(subject: java.lang.String): Unit = {
    instance.setSubject(subject)
  }
  def text: java.lang.String = {
    return instance.getText
  }
  def text(text: java.lang.String): Unit = {
    instance.setText(text)
  }
  def recipients: java.lang.String = {
    return instance.getRecipients
  }
  def recipients(recipients: java.lang.String): Unit = {
    instance.setRecipients(recipients)
  }
  def withAttachment(f: ATTACHMENT => Unit): Unit = {
    f(new ATTACHMENT)
  }
  def withMultipleAttachments(f: ATTACHMENT => Unit): Unit = {
    f(new ATTACHMENT)
  }
  def smtpUser: java.lang.String = {
    return instance.getSmtpUser
  }
  def smtpUser(smtpUser: java.lang.String): Unit = {
    instance.setSmtpUser(smtpUser)
  }
  def smtpPass: java.lang.String = {
    return instance.getSmtpPass
  }
  def smtpPass(smtpPass: java.lang.String): Unit = {
    instance.setSmtpPass(smtpPass)
  }
  def useEncryption: java.lang.Boolean = {
    return instance.getUseEncryption
  }
  def useEncryption(useEncryption: java.lang.Boolean): Unit = {
    instance.setUseEncryption(useEncryption)
  }
}

/**
 */
class MAILALTERNATIVE(instance: com.dexels.navajo.adapter.MailMapAlternative = new com.dexels.navajo.adapter.MailMapAlternative) extends Adapter {
  def mailServer: java.lang.String = {
    return instance.getMailServer
  }
  def mailServer(mailServer: java.lang.String): Unit = {
    instance.setMailServer(mailServer)
  }
  def queuedSend: java.lang.Boolean = {
    return instance.getQueuedSend
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def ignoreFailures: java.lang.Boolean = {
    return instance.getIgnoreFailures
  }
  def ignoreFailures(ignoreFailures: java.lang.Boolean): Unit = {
    instance.setIgnoreFailures(ignoreFailures)
  }
  def sender: java.lang.String = {
    return instance.getSender
  }
  def sender(sender: java.lang.String): Unit = {
    instance.setSender(sender)
  }
  def subject: java.lang.String = {
    return instance.getSubject
  }
  def subject(subject: java.lang.String): Unit = {
    instance.setSubject(subject)
  }
  def text: java.lang.String = {
    return instance.getText
  }
  def text(text: java.lang.String): Unit = {
    instance.setText(text)
  }
  def recipients: java.lang.String = {
    return instance.getRecipients
  }
  def recipients(recipients: java.lang.String): Unit = {
    instance.setRecipients(recipients)
  }
  def withAttachment(f: ATTACHMENT => Unit): Unit = {
    f(new ATTACHMENT)
  }
  def withRelatedBodyPart(f: ATTACHMENT => Unit): Unit = {
    f(new ATTACHMENT)
  }
  def withMultipleAttachments(f: ATTACHMENT => Unit): Unit = {
    f(new ATTACHMENT)
  }
}

/**
 */
class COMMONSMAILMAP(instance: com.dexels.navajo.adapter.CommonsMailMap = new com.dexels.navajo.adapter.CommonsMailMap) extends Adapter {
  def mailServer: java.lang.String = {
    return instance.getMailServer
  }
  def mailServer(mailServer: java.lang.String): Unit = {
    instance.setMailServer(mailServer)
  }
  def queuedSend: java.lang.Boolean = {
    return instance.getQueuedSend
  }
  def queuedSend(queuedSend: java.lang.Boolean): Unit = {
    instance.setQueuedSend(queuedSend)
  }
  def from: java.lang.String = {
    return instance.getFrom
  }
  def from(from: java.lang.String): Unit = {
    instance.setFrom(from)
  }
  def subject: java.lang.String = {
    return instance.getSubject
  }
  def subject(subject: java.lang.String): Unit = {
    instance.setSubject(subject)
  }
  def bodyText: java.lang.String = {
    return instance.getBodyText
  }
  def bodyText(bodyText: java.lang.String): Unit = {
    instance.setBodyText(bodyText)
  }
  def to: java.lang.String = {
    return instance.getTo
  }
  def to(to: java.lang.String): Unit = {
    instance.setTo(to)
  }
  def withAttachment(f: ATTACHMENT => Unit): Unit = {
    f(new ATTACHMENT)
  }
  def withMultipleAttachments(f: ATTACHMENT => Unit): Unit = {
    f(new ATTACHMENT)
  }
  def smtpUser: java.lang.String = {
    return instance.getSmtpUser
  }
  def smtpUser(smtpUser: java.lang.String): Unit = {
    instance.setSmtpUser(smtpUser)
  }
  def smtpPass: java.lang.String = {
    return instance.getSmtpPass
  }
  def smtpPass(smtpPass: java.lang.String): Unit = {
    instance.setSmtpPass(smtpPass)
  }
  def useEncryption: java.lang.Boolean = {
    return instance.getUseEncryption
  }
  def useEncryption(useEncryption: java.lang.Boolean): Unit = {
    instance.setUseEncryption(useEncryption)
  }
}

/**
 */
class ATTACHMENT(instance: com.dexels.navajo.adapter.mailmap.AttachementMap = new com.dexels.navajo.adapter.mailmap.AttachementMap) extends Adapter {
  def attachFileName: java.lang.String = {
    return instance.getAttachFileName
  }
  def attachFileName(attachFileName: java.lang.String): Unit = {
    instance.setAttachFileName(attachFileName)
  }
  def attachFileContent: com.dexels.navajo.document.types.Binary = {
    return instance.getAttachFileContent
  }
  def attachFileContent(attachFileContent: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setAttachFileContent(attachFileContent)
  }
}

/** Creates a message */
class MESSAGE(instance: com.dexels.navajo.adapter.CreateMessage = new com.dexels.navajo.adapter.CreateMessage) extends Adapter {
  def create(name: java.lang.String): Unit = {
    instance.setName(name)
  }
}

/**
 * This adapter can be used to group other Navajo maps typically as a barrier for
 * 			asynchronous service calls
 * 		
 */
class NAVAJOGROUP(instance: com.dexels.navajo.adapter.NavajoMapGroupAdapter = new com.dexels.navajo.adapter.NavajoMapGroupAdapter) extends Adapter {
  def appendResponse(id: java.lang.String, appendTo: java.lang.String, append: java.lang.String): Unit = {
    instance.setId(id)
    instance.setAppendTo(appendTo)
    instance.setAppend(append)
  }
  def setMessagePointer(id: java.lang.String, messagePointer: java.lang.String): Unit = {
    instance.setId(id)
    instance.setMessagePointer(messagePointer)
  }
}

/**
 * This adapter can be used to call other Navajo services,
 * 			either synchronously,
 * 			asynchronously or scheduled
 * 		
 */
class NAVAJOMAP(instance: com.dexels.navajo.adapter.NavajoMap = new com.dexels.navajo.adapter.NavajoMap) extends Adapter {
  def trigger: java.lang.String = {
    return instance.getTrigger
  }
  def trigger(trigger: java.lang.String): Unit = {
    instance.setTrigger(trigger)
  }
  def sendThrough: java.lang.Boolean = {
    return instance.getSendThrough
  }
  def sendThrough(sendThrough: java.lang.Boolean): Unit = {
    instance.setSendThrough(sendThrough)
  }
  def server: java.lang.String = {
    return instance.getServer
  }
  def server(server: java.lang.String): Unit = {
    instance.setServer(server)
  }
  def id: java.lang.String = {
    return instance.getId
  }
  def id(id: java.lang.String): Unit = {
    instance.setId(id)
  }
  def block: java.lang.Boolean = {
    return instance.getBlock
  }
  def block(block: java.lang.Boolean): Unit = {
    instance.setBlock(block)
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
  def resource: java.lang.String = {
    return instance.getResource
  }
  def resource(resource: java.lang.String): Unit = {
    instance.setResource(resource)
  }
  def useCurrentOutDoc: java.lang.Boolean = {
    return instance.getUseCurrentOutDoc
  }
  def useCurrentOutDoc(useCurrentOutDoc: java.lang.Boolean): Unit = {
    instance.setUseCurrentOutDoc(useCurrentOutDoc)
  }
  def useCurrentMessages: java.lang.String = {
    return instance.getUseCurrentMessages
  }
  def useCurrentMessages(useCurrentMessages: java.lang.String): Unit = {
    instance.setUseCurrentMessages(useCurrentMessages)
  }
  def messagePointer: java.lang.String = {
    return instance.getMessagePointer
  }
  def messagePointer(messagePointer: java.lang.String): Unit = {
    instance.setMessagePointer(messagePointer)
  }
  def selectionPointer: java.lang.String = {
    return instance.getSelectionPointer
  }
  def selectionPointer(selectionPointer: java.lang.String): Unit = {
    instance.setSelectionPointer(selectionPointer)
  }
  def withMessage(f: MESSAGEMAP => Unit): Unit = {
    f(new MESSAGEMAP)
  }
  def withMessages(f: MESSAGEMAP => Unit): Unit = {
    f(new MESSAGEMAP)
  }
  def createproperty(name: java.lang.String, `type`: java.lang.String, value: java.lang.Object): Unit = {
    instance.setPropertyName(name)
    instance.setPropertyType(`type`)
    instance.setProperty(value)
  }
  def deleteproperty(name: java.lang.String): Unit = {
    instance.setDeleteProperty(name)
  }
  def deletemessage(name: java.lang.String): Unit = {
    instance.setDeleteMessage(name)
  }
  def suppressproperty(name: java.lang.String): Unit = {
    instance.setPropertyId(name)
    instance.setPropertyDirective("monkey")
  }
  def showproperty(name: java.lang.String, direction: java.lang.String): Unit = {
    instance.setPropertyId(name)
    instance.setPropertyDirective(direction)
    instance.setPropertyDirective("monkey")
  }
  def setdirection(name: java.lang.String, direction: java.lang.String): Unit = {
    instance.setPropertyId(name)
    instance.setPropertyDirective(direction)
  }
  def callwebservice(breakOnConditionError: java.lang.Boolean, breakOnException: java.lang.Boolean, server: java.lang.String, username: java.lang.String, password: java.lang.String, showProperties: java.lang.String, suppressProperties: java.lang.String, inputProperties: java.lang.String, outputProperties: java.lang.String, block: java.lang.Boolean, doSend: java.lang.String, appendTo: java.lang.String, append: java.lang.String): Unit = {
    instance.setBreakOnConditionError(breakOnConditionError)
    instance.setBreakOnException(breakOnException)
    instance.setServer(server)
    instance.setUsername(username)
    instance.setPassword(password)
    instance.setSuppressProperties(showProperties)
    instance.setSuppressProperties(suppressProperties)
    instance.setInputProperties(inputProperties)
    instance.setOutputProperties(outputProperties)
    instance.setBlock(block)
    instance.setDoSend(doSend)
    instance.setAppendTo(appendTo)
    instance.setAppend(append)
  }
}

/**
 */
class MESSAGEMAP(instance: com.dexels.navajo.adapter.navajomap.MessageMap = new com.dexels.navajo.adapter.navajomap.MessageMap) extends Adapter {
  ()
}

/**
 * This adapter can be used to call REST services
 * 		
 */
class REST(instance: com.dexels.navajo.adapter.RESTAdapter = new com.dexels.navajo.adapter.RESTAdapter) extends Adapter {
  def sendThrough: java.lang.Boolean = {
    return instance.getSendThrough
  }
  def sendThrough(sendThrough: java.lang.Boolean): Unit = {
    instance.setSendThrough(sendThrough)
  }
  def url: java.lang.String = {
    return instance.getUrl
  }
  def url(url: java.lang.String): Unit = {
    instance.setUrl(url)
  }
  def method: java.lang.String = {
    return instance.getMethod
  }
  def method(method: java.lang.String): Unit = {
    instance.setMethod(method)
  }
  def useCurrentOutDoc: java.lang.Boolean = {
    return instance.getUseCurrentOutDoc
  }
  def useCurrentOutDoc(useCurrentOutDoc: java.lang.Boolean): Unit = {
    instance.setUseCurrentOutDoc(useCurrentOutDoc)
  }
  def useCurrentMessages: java.lang.String = {
    return instance.getUseCurrentMessages
  }
  def useCurrentMessages(useCurrentMessages: java.lang.String): Unit = {
    instance.setUseCurrentMessages(useCurrentMessages)
  }
  def messagePointer: java.lang.String = {
    return instance.getMessagePointer
  }
  def messagePointer(messagePointer: java.lang.String): Unit = {
    instance.setMessagePointer(messagePointer)
  }
  def selectionPointer: java.lang.String = {
    return instance.getSelectionPointer
  }
  def selectionPointer(selectionPointer: java.lang.String): Unit = {
    instance.setSelectionPointer(selectionPointer)
  }
  def withMessage(f: MESSAGEMAP => Unit): Unit = {
    f(new MESSAGEMAP)
  }
  def withMessages(f: MESSAGEMAP => Unit): Unit = {
    f(new MESSAGEMAP)
  }
  def createproperty(name: java.lang.String, `type`: java.lang.String, value: java.lang.Object): Unit = {
    instance.setPropertyName(name)
    instance.setPropertyType(`type`)
    instance.setProperty(value)
  }
  def deleteproperty(name: java.lang.String): Unit = {
    instance.setDeleteProperty(name)
  }
  def deletemessage(name: java.lang.String): Unit = {
    instance.setDeleteMessage(name)
  }
  def callservice(url: java.lang.String, method: java.lang.String, topMessage: java.lang.String, removeTopMessage: java.lang.Boolean, appendTo: java.lang.String, append: java.lang.String): Unit = {
    instance.setUrl(url)
    instance.setMethod(method)
    instance.setTopMessage(topMessage)
    instance.setRemoveTopMessage(removeTopMessage)
    instance.setDoSend("monkey")
    instance.setAppendTo(appendTo)
    instance.setAppend(append)
  }
}

/**
 */
class NAVAJOLISTENER(instance: com.dexels.navajo.adapter.NavajoMap = new com.dexels.navajo.adapter.NavajoMap) extends Adapter {
  def taskId: java.lang.String = {
    return instance.getTaskId
  }
  def taskId(taskId: java.lang.String): Unit = {
    instance.setTaskId(taskId)
  }
}

/**
 */
class SQLQUERY(instance: com.dexels.navajo.adapter.SQLMap = new com.dexels.navajo.adapter.SQLMap) extends Adapter {
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
  def binaryQuery: com.dexels.navajo.document.types.Binary = {
    return instance.getBinaryQuery
  }
  def binaryQuery(binaryQuery: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setBinaryQuery(binaryQuery)
  }
  def binaryUpdate: com.dexels.navajo.document.types.Binary = {
    return instance.getBinaryUpdate
  }
  def binaryUpdate(binaryUpdate: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setBinaryUpdate(binaryUpdate)
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
  def parameter: java.lang.Object = {
    return instance.getParameter
  }
  def parameter(parameter: java.lang.Object): Unit = {
    instance.setParameter(parameter)
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
class STOREDPROC(instance: com.dexels.navajo.adapter.SPMap = new com.dexels.navajo.adapter.SPMap) extends Adapter {
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
  def addOutputParameter(`type`: java.lang.String): Unit = {
    instance.setOutputParameterType(`type`)
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
class RESULTROW(instance: com.dexels.navajo.adapter.sqlmap.ResultSetMap = new com.dexels.navajo.adapter.sqlmap.ResultSetMap) extends Adapter {
  def columnName: java.lang.String = {
    return instance.getColumnName
  }
  def columnName(columnName: java.lang.String): Unit = {
    instance.setColumnName(columnName)
  }
  def columnValue: java.lang.Object = {
    return instance.getColumnValue
  }
  def value(name: java.lang.String): java.lang.Object = {
    instance.setColumnName(name)
    return instance.columnValue
  }
}

/**
 */
class AUDITLOG(instance: com.dexels.navajo.util.AuditLog = new com.dexels.navajo.util.AuditLog) extends Adapter {
  ()
}

/**
 */
class ACCESS(instance: com.dexels.navajo.adapter.NavajoAccess = new com.dexels.navajo.adapter.NavajoAccess) extends Adapter {
  ()
}

/**
 * This adapter can be used to create large XML documents
 * 			(well over 1GB )
 * 		
 */
class XML(instance: com.dexels.navajo.adapter.XMLStreamMap = new com.dexels.navajo.adapter.XMLStreamMap) extends Adapter {
  def content: com.dexels.navajo.document.types.Binary = {
    return instance.getContent
  }
  def indent: java.lang.Integer = {
    return instance.getIndent
  }
  def indent(indent: java.lang.Integer): Unit = {
    instance.setIndent(indent)
  }
  def startElement(name: java.lang.String): Unit = {
    instance.setStartElement(name)
  }
  def endElement: Unit = {
    instance.setEndElement(true)
  }
  def newline: Unit = {
    instance.setNewline(true)
  }
  def setAttribute(name: java.lang.String, value: java.lang.String): Unit = {
    instance.setAttributeName(name)
    instance.setAttributeValue(value)
  }
  def setValue(value: java.lang.String): Unit = {
    instance.setValue(value)
  }
}

/**
 * This adapter can be used to create XML documents.
 * 		
 */
class XMLMAP(instance: com.dexels.navajo.adapter.XMLMap = new com.dexels.navajo.adapter.XMLMap) extends Adapter {
  def stringContent: java.lang.String = {
    return instance.getStringContent
  }
  def stringContent(stringContent: java.lang.String): Unit = {
    instance.setStringContent(stringContent)
  }
  def indent: java.lang.Integer = {
    return instance.getIndent
  }
  def indent(indent: java.lang.Integer): Unit = {
    instance.setIndent(indent)
  }
  def withChild(f: TAGMAP => Unit): Unit = {
    f(new TAGMAP)
  }
  def start: java.lang.String = {
    return instance.getStart
  }
  def start(start: java.lang.String): Unit = {
    instance.setStart(start)
  }
  def setContent(tag: java.lang.String, content: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setChildName(tag)
    instance.setInsert(content)
  }
  def setText(tag: java.lang.String, value: java.lang.String): Unit = {
    instance.setChildName(tag)
    instance.setChildText(value)
  }
  def setAttribute(tag: java.lang.String, attribute: java.lang.String, value: java.lang.String): Unit = {
    instance.setChildName(tag)
    instance.setAttributeName(attribute)
    instance.setAttributeText(value)
  }
}

/**
 */
class TAGMAP(instance: com.dexels.navajo.adapter.xmlmap.TagMap = new com.dexels.navajo.adapter.xmlmap.TagMap) extends Adapter {
  def withChild(f: TAGMAP => Unit): Unit = {
    f(new TAGMAP)
  }
  def name: java.lang.String = {
    return instance.getName
  }
  def name(name: java.lang.String): Unit = {
    instance.setName(name)
  }
  def text: java.lang.String = {
    return instance.getText
  }
  def text(text: java.lang.String): Unit = {
    instance.setText(text)
  }
  def setText(tag: java.lang.String, value: java.lang.String): Unit = {
    instance.setChildName(tag)
    instance.setChildText(value)
  }
  def setAttribute(tag: java.lang.String, attribute: java.lang.String, value: java.lang.String): Unit = {
    instance.setChildName(tag)
    instance.setAttributeName(attribute)
    instance.setAttributeText(value)
  }
}

/**
 */
class SOAP(instance: com.dexels.navajo.adapter.SOAPMap = new com.dexels.navajo.adapter.SOAPMap) extends Adapter {
  def soapAction: java.lang.String = {
    return instance.getSoapAction
  }
  def soapAction(soapAction: java.lang.String): Unit = {
    instance.setSoapAction(soapAction)
  }
  def url: java.lang.String = {
    return instance.getUrl
  }
  def url(url: java.lang.String): Unit = {
    instance.setUrl(url)
  }
  def addNamespace(value: java.lang.String): Unit = {
    instance.setNamespace(value)
  }
  def requestBody(value: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setRequestBody(value)
  }
  def request(header: com.dexels.navajo.document.types.Binary, value: com.dexels.navajo.document.types.Binary): Unit = {
    instance.setRequestHeader(header)
    instance.setRequestBody(value)
  }
  def doSend: Unit = {
    instance.setDoSend(true)
  }
}

/**
 */
class TML2XML(instance: com.dexels.navajo.adapter.TmlToXmlMap = new com.dexels.navajo.adapter.TmlToXmlMap) extends Adapter {
  def rootPath: java.lang.String = {
    return instance.getRootPath
  }
  def rootPath(rootPath: java.lang.String): Unit = {
    instance.setRootPath(rootPath)
  }
  def content: com.dexels.navajo.document.types.Binary = {
    return instance.getContent
  }
  def addAttribute(path: java.lang.String, name: java.lang.String, value: java.lang.String): Unit = {
    instance.setAttributePath(path)
    instance.setAttributeName(name)
    instance.setAttributeValue(value)
  }
  def dumpObject: Unit = {
    instance.setDumpObject(true)
  }
  def buildContent: Unit = {
    instance.setBuildContent(true)
  }
}

/**
 */
class ADMINMAP(instance: com.dexels.navajo.adapter.AdminMap = new com.dexels.navajo.adapter.AdminMap) extends Adapter {
  ()
}

/**
 */
class ACCESSMAP(instance: com.dexels.navajo.adapter.AccessMap = new com.dexels.navajo.adapter.AccessMap) extends Adapter {
  ()
}

/**
 */
class MULTIPLESQLMAP(instance: com.dexels.navajo.adapter.MultipleSQLMap = new com.dexels.navajo.adapter.MultipleSQLMap) extends Adapter {
  ()
}

/**
 */
class SELECTIONMAP(instance: com.dexels.navajo.adapter.SelectionMap = new com.dexels.navajo.adapter.SelectionMap) extends Adapter {
  ()
}

/**
 */
class SEQUENCEDINSERTMAP(instance: com.dexels.navajo.adapter.SequencedInsertMap = new com.dexels.navajo.adapter.SequencedInsertMap) extends Adapter {
  ()
}