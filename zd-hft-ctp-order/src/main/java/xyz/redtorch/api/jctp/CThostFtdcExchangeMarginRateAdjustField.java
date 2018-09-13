/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcExchangeMarginRateAdjustField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeMarginRateAdjustField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExchangeMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByMoney(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByMoney() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByVolume(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcExchangeMarginRateAdjustField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExchangeMarginRateAdjustField(), true);
  }

}