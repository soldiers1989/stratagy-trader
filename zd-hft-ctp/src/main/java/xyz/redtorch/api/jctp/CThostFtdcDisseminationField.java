/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcDisseminationField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDisseminationField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDisseminationField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcDisseminationField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSequenceSeries(short value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcDisseminationField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcDisseminationField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcDisseminationField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcDisseminationField_SequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcDisseminationField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcDisseminationField(), true);
  }

}
