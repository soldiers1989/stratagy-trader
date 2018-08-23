/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcAccountPropertyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAccountPropertyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAccountPropertyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcAccountPropertyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_AccountID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_BankID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_BankAccount_get(swigCPtr, this);
  }

  public void setOpenName(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OpenName_set(swigCPtr, this, value);
  }

  public String getOpenName() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OpenName_get(swigCPtr, this);
  }

  public void setOpenBank(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OpenBank_set(swigCPtr, this, value);
  }

  public String getOpenBank() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OpenBank_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_IsActive_get(swigCPtr, this);
  }

  public void setAccountSourceType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_AccountSourceType_set(swigCPtr, this, value);
  }

  public char getAccountSourceType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_AccountSourceType_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OpenDate_get(swigCPtr, this);
  }

  public void setCancelDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_CancelDate_set(swigCPtr, this, value);
  }

  public String getCancelDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_CancelDate_get(swigCPtr, this);
  }

  public void setOperatorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OperatorID_set(swigCPtr, this, value);
  }

  public String getOperatorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OperatorID_get(swigCPtr, this);
  }

  public void setOperateDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OperateDate_set(swigCPtr, this, value);
  }

  public String getOperateDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OperateDate_get(swigCPtr, this);
  }

  public void setOperateTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OperateTime_set(swigCPtr, this, value);
  }

  public String getOperateTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_OperateTime_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAccountPropertyField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcAccountPropertyField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcAccountPropertyField(), true);
  }

}
