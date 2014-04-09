package com.dexels.navajo.scala

trait Functions extends com.dexels.navajo.scala.Base { self: com.dexels.navajo.scala.ScalaCompiledScript => 
  def StoreBinary(arg0: java.lang.String, arg1: com.dexels.navajo.document.types.Binary) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StoreBinary)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetBinary(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetBinary)
    function.insertOperand(arg0)
  }
  def EncryptString(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.EncryptString)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def DecryptString(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.DecryptString)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetRequest {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetRequest)
  }
  def GetHeader(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetHeader)
    function.insertOperand(arg0)
  }
  def Abs(arg0: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Abs)
    function.insertOperand(arg0)
  }
  def Abs(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Abs)
    function.insertOperand(arg0)
  }
  def Age(arg0: java.util.Date, arg1: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Age)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Age(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Age)
    function.insertOperand(arg0)
  }
  def AppendArray {
    val function = this.setupFunction(new com.dexels.navajo.functions.AppendArray)
  }
  def ArraySelection {
    val function = this.setupFunction(new com.dexels.navajo.functions.ArraySelection)
  }
  def Base64Encode {
    val function = this.setupFunction(new com.dexels.navajo.functions.Base64Encode)
  }
  def CallService(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.CallService)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def CheckDate(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.CheckDate)
    function.insertOperand(arg0)
  }
  def CheckEmail(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.CheckEmail)
    function.insertOperand(arg0)
  }
  def CheckFloat(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.CheckFloat)
    function.insertOperand(arg0)
  }
  def CheckInteger(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.CheckInteger)
    function.insertOperand(arg0)
  }
  def CheckRange {
    val function = this.setupFunction(new com.dexels.navajo.functions.CheckRange)
  }
  def CheckUniqueness {
    val function = this.setupFunction(new com.dexels.navajo.functions.CheckUniqueness)
  }
  def CheckUrl {
    val function = this.setupFunction(new com.dexels.navajo.functions.CheckUrl)
  }
  def Contains(arg0: Any, arg1: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Contains)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def CreateExpression {
    val function = this.setupFunction(new com.dexels.navajo.functions.CreateExpression)
  }
  def CurrentTimeMillis {
    val function = this.setupFunction(new com.dexels.navajo.functions.CurrentTimeMillis)
  }
  def Date {
    val function = this.setupFunction(new com.dexels.navajo.functions.Date)
  }
  def DateAdd {
    val function = this.setupFunction(new com.dexels.navajo.functions.DateAdd)
  }
  def DateField {
    val function = this.setupFunction(new com.dexels.navajo.functions.DateField)
  }
  def DateSubstract {
    val function = this.setupFunction(new com.dexels.navajo.functions.DateSubstract)
  }
  def DayOfWeek(arg0: java.lang.Integer, arg1: java.lang.Boolean) {
    val function = this.setupFunction(new com.dexels.navajo.functions.DayOfWeek)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def DecimalChar {
    val function = this.setupFunction(new com.dexels.navajo.functions.DecimalChar)
  }
  def EmptyBinary {
    val function = this.setupFunction(new com.dexels.navajo.functions.EmptyBinary)
  }
  def EqualsIgnoreCase {
    val function = this.setupFunction(new com.dexels.navajo.functions.EqualsIgnoreCase)
  }
  def EqualsPattern {
    val function = this.setupFunction(new com.dexels.navajo.functions.EqualsPattern)
  }
  def Euro {
    val function = this.setupFunction(new com.dexels.navajo.functions.Euro)
  }
  def EvaluateExpression {
    val function = this.setupFunction(new com.dexels.navajo.functions.EvaluateExpression)
  }
  def EvaluateParameters(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.EvaluateParameters)
    function.insertOperand(arg0)
  }
  def ExecuteScript {
    val function = this.setupFunction(new com.dexels.navajo.functions.ExecuteScript)
  }
  def Exists {
    val function = this.setupFunction(new com.dexels.navajo.functions.Exists)
  }
  def ExistsProperty {
    val function = this.setupFunction(new com.dexels.navajo.functions.ExistsProperty)
  }
  def ExistsSelectionValue(arg0: com.dexels.navajo.document.Property, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ExistsSelectionValue)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def File(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.File)
    function.insertOperand(arg0)
  }
  def FileExists {
    val function = this.setupFunction(new com.dexels.navajo.functions.FileExists)
  }
  def FileSize(arg0: com.dexels.navajo.document.types.Binary) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FileSize)
    function.insertOperand(arg0)
  }
  def FileString(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FileString)
    function.insertOperand(arg0)
  }
  def ForAll {
    val function = this.setupFunction(new com.dexels.navajo.functions.ForAll)
  }
  def FormatDate(arg0: java.util.Date, arg1: java.lang.String, arg2: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def FormatDate(arg0: java.util.Date, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def FormatDate(arg0: com.dexels.navajo.document.types.ClockTime, arg1: java.lang.String, arg2: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def FormatDate(arg0: com.dexels.navajo.document.types.ClockTime, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def FormatDecimal(arg0: java.lang.Object, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatDecimal)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def FormatStringList(arg0: Any, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatStringList)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def FormatStringList(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatStringList)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def FormatZipCode(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.FormatZipCode)
    function.insertOperand(arg0)
  }
  def GetBinaryPath(arg0: com.dexels.navajo.document.types.Binary) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetBinaryPath)
    function.insertOperand(arg0)
  }
  def GetCents {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetCents)
  }
  def GetContextResource {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetContextResource)
  }
  def GetCurrentMessage {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetCurrentMessage)
  }
  def GetDescription {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetDescription)
  }
  def GetFileExtension {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetFileExtension)
  }
  def GetInitials {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetInitials)
  }
  def GetLogoImage {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetLogoImage)
  }
  def GetMessage {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetMessage)
  }
  def GetMimeType {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetMimeType)
  }
  def GetProperty {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetProperty)
  }
  def GetPropertyAttribute(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetPropertyAttribute)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetPropertyDirection {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetPropertyDirection)
  }
  def GetPropertySubType(arg0: com.dexels.navajo.document.Property, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetPropertySubType)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetPropertySubType(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetPropertySubType)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetPropertyType {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetPropertyType)
  }
  def GetPropertyValue {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetPropertyValue)
  }
  def GetReportFile(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetReportFile)
    function.insertOperand(arg0)
  }
  def GetSelectedName {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetSelectedName)
  }
  def GetSelectedValue {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetSelectedValue)
  }
  def GetUrlMimeType {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetUrlMimeType)
  }
  def GetUrlModificationTime {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetUrlModificationTime)
  }
  def GetUrlSize {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetUrlSize)
  }
  def GetUrlTime {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetUrlTime)
  }
  def GetValue {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetValue)
  }
  def GetVersionInfo(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetVersionInfo)
    function.insertOperand(arg0)
  }
  def GetWeekDayDate(arg0: java.lang.Integer, arg1: java.lang.Boolean, arg2: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def GetWeekDayDate(arg0: java.lang.Integer, arg1: java.lang.Boolean) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetWeekDayDate(arg0: java.lang.Integer, arg1: java.lang.String, arg2: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def GetWeekDayDate(arg0: java.lang.Integer, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetWeekDayDate(arg0: java.lang.String, arg1: java.lang.Boolean, arg2: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def GetWeekDayDate(arg0: java.lang.String, arg1: java.lang.Boolean) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def GetWeekDayDate(arg0: java.lang.String, arg1: java.lang.String, arg2: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def GetWeekDayDate(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.GetWeekDayDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def IfElse(arg0: java.lang.Boolean, arg1: java.lang.Object, arg2: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IfElse)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def InMonthTurnInterval(arg0: java.util.Date, arg1: java.lang.Integer, arg2: java.lang.Boolean) {
    val function = this.setupFunction(new com.dexels.navajo.functions.InMonthTurnInterval)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def IsArrayMessage(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsArrayMessage)
    function.insertOperand(arg0)
  }
  def IsDate(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsDate)
    function.insertOperand(arg0)
  }
  def IsDate(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsDate)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.types.Binary) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: Any) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.Message) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: java.lang.Boolean) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.types.ClockTime) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.types.Memo) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.types.Money) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.types.Percentage) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.types.StopwatchTime) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsEmpty(arg0: com.dexels.navajo.document.Selection) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsEmpty)
    function.insertOperand(arg0)
  }
  def IsFutureDate(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsFutureDate)
    function.insertOperand(arg0)
  }
  def IsFutureDate(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsFutureDate)
    function.insertOperand(arg0)
  }
  def IsNull(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsNull)
    function.insertOperand(arg0)
  }
  def IsNumeric(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsNumeric)
    function.insertOperand(arg0)
  }
  def IsNumeric(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsNumeric)
    function.insertOperand(arg0)
  }
  def IsNumeric(arg0: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsNumeric)
    function.insertOperand(arg0)
  }
  def IsServiceCached(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.IsServiceCached)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def KeyValueMap(arg0: java.lang.String, arg1: java.lang.String, arg2: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.KeyValueMap)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def Max(arg0: java.lang.Integer, arg1: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Max)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Max(arg0: java.lang.Integer, arg1: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Max)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Max(arg0: java.lang.Double, arg1: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Max)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Max(arg0: java.lang.Double, arg1: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Max)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def MD5Sum(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.MD5Sum)
    function.insertOperand(arg0)
  }
  def MergeNavajo(arg0: com.dexels.navajo.document.Navajo, arg1: com.dexels.navajo.document.Navajo) {
    val function = this.setupFunction(new com.dexels.navajo.functions.MergeNavajo)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Min(arg0: java.lang.Integer, arg1: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Min)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Min(arg0: java.lang.Integer, arg1: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Min)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Min(arg0: java.lang.Double, arg1: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Min)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Min(arg0: java.lang.Double, arg1: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Min)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def NavajoRequestToString {
    val function = this.setupFunction(new com.dexels.navajo.functions.NavajoRequestToString)
  }
  def NextMonth(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.NextMonth)
    function.insertOperand(arg0)
  }
  def Now {
    val function = this.setupFunction(new com.dexels.navajo.functions.Now)
  }
  def OffsetDate(arg0: java.util.Date, arg1: java.lang.Integer, arg2: java.lang.Integer, arg3: java.lang.Integer, arg4: java.lang.Integer, arg5: java.lang.Integer, arg6: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.OffsetDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
    function.insertOperand(arg3)
    function.insertOperand(arg4)
    function.insertOperand(arg5)
    function.insertOperand(arg6)
  }
  def ParameterList(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ParameterList)
    function.insertOperand(arg0)
  }
  def ParseDate(arg0: java.util.Date, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ParseDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def ParseDate(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ParseDate)
    function.insertOperand(arg0)
  }
  def ParseDate(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ParseDate)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def ParseDate(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ParseDate)
    function.insertOperand(arg0)
  }
  def ParseSelection(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ParseSelection)
    function.insertOperand(arg0)
  }
  def ParseStringList(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ParseStringList)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Random {
    val function = this.setupFunction(new com.dexels.navajo.functions.Random)
  }
  def RandomColor(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.RandomColor)
    function.insertOperand(arg0)
  }
  def RandomColor {
    val function = this.setupFunction(new com.dexels.navajo.functions.RandomColor)
  }
  def RandomInt(arg0: java.lang.Integer, arg1: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.RandomInt)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def RandomString(arg0: java.lang.Integer, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.RandomString)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def RandomString(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.RandomString)
    function.insertOperand(arg0)
  }
  def Round(arg0: java.lang.Double, arg1: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Round)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def ScaleImageCentered(arg0: com.dexels.navajo.document.types.Binary, arg1: java.lang.Integer, arg2: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ScaleImageCentered)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def ScaleImageCropped(arg0: com.dexels.navajo.document.types.Binary, arg1: java.lang.Integer, arg2: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ScaleImageCropped)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def ScaleImageFree(arg0: com.dexels.navajo.document.types.Binary, arg1: java.lang.Integer, arg2: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ScaleImageFree)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def ScaleImageMax(arg0: com.dexels.navajo.document.types.Binary, arg1: java.lang.Integer, arg2: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ScaleImageMax)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def ScaleImageMin(arg0: com.dexels.navajo.document.types.Binary, arg1: java.lang.Integer, arg2: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ScaleImageMin)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def SetAllProperties(arg0: com.dexels.navajo.document.Message, arg1: java.lang.String, arg2: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SetAllProperties)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def SetMimeType(arg0: com.dexels.navajo.document.types.Binary, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SetMimeType)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Size(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Size)
    function.insertOperand(arg0)
  }
  def Size(arg0: com.dexels.navajo.document.types.Binary) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Size)
    function.insertOperand(arg0)
  }
  def Size(arg0: Any) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Size)
    function.insertOperand(arg0)
  }
  def Size(arg0: com.dexels.navajo.document.Message) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Size)
    function.insertOperand(arg0)
  }
  def StringDistance(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StringDistance)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def StringField(arg0: java.lang.String, arg1: java.lang.String, arg2: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StringField)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def StringPadding(arg0: java.lang.String, arg1: java.lang.Integer, arg2: java.lang.String, arg3: java.lang.Boolean) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StringPadding)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
    function.insertOperand(arg3)
  }
  def StringPadding(arg0: java.lang.String, arg1: java.lang.Integer, arg2: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StringPadding)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def StringPadding(arg0: java.lang.String, arg1: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StringPadding)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def StripTime(arg0: java.util.Date, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StripTime)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def StripTime(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StripTime)
    function.insertOperand(arg0)
  }
  def StripTime(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StripTime)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def StripTime(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.StripTime)
    function.insertOperand(arg0)
  }
  def Sum(arg0: Any) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Sum)
    function.insertOperand(arg0)
  }
  def SumExpressions(arg0: java.lang.String, arg1: java.lang.String, arg2: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SumExpressions)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def SumExpressions(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SumExpressions)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def SumMessage(arg0: com.dexels.navajo.document.Message) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SumMessage)
    function.insertOperand(arg0)
  }
  def SumMessage(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SumMessage)
    function.insertOperand(arg0)
  }
  def SumProperties(arg0: java.lang.String, arg1: java.lang.String, arg2: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SumProperties)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
    function.insertOperand(arg2)
  }
  def SumProperties(arg0: java.lang.String, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.SumProperties)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def Sysdate {
    val function = this.setupFunction(new com.dexels.navajo.functions.Sysdate)
  }
  def ToBinary(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToBinary)
    function.insertOperand(arg0)
  }
  def ToBinary(arg0: com.dexels.navajo.document.types.Binary) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToBinary)
    function.insertOperand(arg0)
  }
  def ToBinaryFromPath(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToBinaryFromPath)
    function.insertOperand(arg0)
  }
  def ToBinaryFromUrl(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToBinaryFromUrl)
    function.insertOperand(arg0)
  }
  def ToClockTime(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToClockTime)
    function.insertOperand(arg0)
  }
  def ToClockTime(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToClockTime)
    function.insertOperand(arg0)
  }
  def ToClockTime(arg0: com.dexels.navajo.document.types.ClockTime) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToClockTime)
    function.insertOperand(arg0)
  }
  def Today {
    val function = this.setupFunction(new com.dexels.navajo.functions.Today)
  }
  def ToDouble(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToDouble)
    function.insertOperand(arg0)
  }
  def ToInteger(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToInteger)
    function.insertOperand(arg0)
  }
  def ToLong(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToLong)
    function.insertOperand(arg0)
  }
  def ToLower(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToLower)
    function.insertOperand(arg0)
  }
  def ToMemo(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMemo)
    function.insertOperand(arg0)
  }
  def ToMilliseconds(arg0: com.dexels.navajo.document.types.StopwatchTime) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMilliseconds)
    function.insertOperand(arg0)
  }
  def ToMilliseconds(arg0: com.dexels.navajo.document.types.ClockTime) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMilliseconds)
    function.insertOperand(arg0)
  }
  def ToMoney(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMoney)
    function.insertOperand(arg0)
  }
  def ToMoney(arg0: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMoney)
    function.insertOperand(arg0)
  }
  def ToMoney(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMoney)
    function.insertOperand(arg0)
  }
  def ToMoney(arg0: com.dexels.navajo.document.types.Money) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMoney)
    function.insertOperand(arg0)
  }
  def ToMoneyInternal(arg0: com.dexels.navajo.document.types.Money) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToMoneyInternal)
    function.insertOperand(arg0)
  }
  def ToPercentage(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToPercentage)
    function.insertOperand(arg0)
  }
  def ToPercentage(arg0: java.lang.Double) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToPercentage)
    function.insertOperand(arg0)
  }
  def ToPercentage(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToPercentage)
    function.insertOperand(arg0)
  }
  def ToSecureImage(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToSecureImage)
    function.insertOperand(arg0)
  }
  def ToStopwatchTime(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToStopwatchTime)
    function.insertOperand(arg0)
  }
  def ToStopwatchTime(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToStopwatchTime)
    function.insertOperand(arg0)
  }
  def ToString(arg0: java.lang.Object) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToString)
    function.insertOperand(arg0)
  }
  def ToUpper(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ToUpper)
    function.insertOperand(arg0)
  }
  def Trim(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Trim)
    function.insertOperand(arg0)
  }
  def Trunc(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Trunc)
    function.insertOperand(arg0)
  }
  def Unicode(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Unicode)
    function.insertOperand(arg0)
  }
  def URLEncode(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.URLEncode)
    function.insertOperand(arg0)
  }
  def Wait(arg0: java.lang.Integer) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Wait)
    function.insertOperand(arg0)
  }
  def WeekDay(arg0: java.util.Date) {
    val function = this.setupFunction(new com.dexels.navajo.functions.WeekDay)
    function.insertOperand(arg0)
  }
  def WeekDay {
    val function = this.setupFunction(new com.dexels.navajo.functions.WeekDay)
  }
  def XmlEscape(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.XmlEscape)
    function.insertOperand(arg0)
  }
  def XmlUnescape(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.XmlUnescape)
    function.insertOperand(arg0)
  }
  def Zip(arg0: com.dexels.navajo.document.types.Binary, arg1: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.Zip)
    function.insertOperand(arg0)
    function.insertOperand(arg1)
  }
  def ZipArchive(arg0: java.lang.String) {
    val function = this.setupFunction(new com.dexels.navajo.functions.ZipArchive)
    function.insertOperand(arg0)
  }
}