/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcBrokerUserRightAssignField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserRightAssignField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserRightAssignField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcBrokerUserRightAssignField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerUserRightAssignField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerUserRightAssignField_BrokerID_get(swigCPtr, this);
  }

  public void setDRIdentityID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerUserRightAssignField_DRIdentityID_set(swigCPtr, this, value);
  }

  public int getDRIdentityID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerUserRightAssignField_DRIdentityID_get(swigCPtr, this);
  }

  public void setTradeable(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerUserRightAssignField_Tradeable_set(swigCPtr, this, value);
  }

  public int getTradeable() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerUserRightAssignField_Tradeable_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserRightAssignField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcBrokerUserRightAssignField(), true);
  }

}
