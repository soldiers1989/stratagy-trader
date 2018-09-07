/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcReqUserLoginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqUserLoginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqUserLoginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcReqUserLoginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_Password_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_MacAddress_get(swigCPtr, this);
  }

  public void setOneTimePassword(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_OneTimePassword_set(swigCPtr, this, value);
  }

  public String getOneTimePassword() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_OneTimePassword_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_ClientIPAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqUserLoginField_LoginRemark_get(swigCPtr, this);
  }

  public CThostFtdcReqUserLoginField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcReqUserLoginField(), true);
  }

}
