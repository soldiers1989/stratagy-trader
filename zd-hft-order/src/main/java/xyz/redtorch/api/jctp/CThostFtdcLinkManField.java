/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcLinkManField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcLinkManField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcLinkManField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcLinkManField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_InvestorID_get(swigCPtr, this);
  }

  public void setPersonType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_PersonType_set(swigCPtr, this, value);
  }

  public char getPersonType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_PersonType_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setPersonName(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_PersonName_set(swigCPtr, this, value);
  }

  public String getPersonName() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_PersonName_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_ZipCode_get(swigCPtr, this);
  }

  public void setPriority(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_Priority_set(swigCPtr, this, value);
  }

  public int getPriority() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_Priority_get(swigCPtr, this);
  }

  public void setUOAZipCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_UOAZipCode_set(swigCPtr, this, value);
  }

  public String getUOAZipCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_UOAZipCode_get(swigCPtr, this);
  }

  public void setPersonFullName(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_PersonFullName_set(swigCPtr, this, value);
  }

  public String getPersonFullName() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcLinkManField_PersonFullName_get(swigCPtr, this);
  }

  public CThostFtdcLinkManField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcLinkManField(), true);
  }

}
