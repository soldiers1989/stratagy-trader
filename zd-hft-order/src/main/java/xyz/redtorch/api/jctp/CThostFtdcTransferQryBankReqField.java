/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcTransferQryBankReqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryBankReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryBankReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcTransferQryBankReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryBankReqField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcTransferQryBankReqField(), true);
  }

}
