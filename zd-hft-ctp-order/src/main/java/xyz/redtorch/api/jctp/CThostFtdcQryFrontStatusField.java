/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcQryFrontStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryFrontStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryFrontStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQryFrontStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryFrontStatusField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryFrontStatusField_FrontID_get(swigCPtr, this);
  }

  public CThostFtdcQryFrontStatusField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQryFrontStatusField(), true);
  }

}
