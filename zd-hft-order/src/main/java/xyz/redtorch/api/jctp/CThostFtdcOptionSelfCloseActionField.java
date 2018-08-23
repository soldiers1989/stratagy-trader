/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcOptionSelfCloseActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionSelfCloseActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionSelfCloseActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcOptionSelfCloseActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseActionRef(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseActionRef_set(swigCPtr, this, value);
  }

  public int getOptionSelfCloseActionRef() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseActionRef_get(swigCPtr, this);
  }

  public void setOptionSelfCloseRef(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseRef_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseRef() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InstallID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcOptionSelfCloseActionField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcOptionSelfCloseActionField(), true);
  }

}
