/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcQryInstrumentField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQryInstrumentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryInstrumentField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQryInstrumentField(), true);
  }

}
