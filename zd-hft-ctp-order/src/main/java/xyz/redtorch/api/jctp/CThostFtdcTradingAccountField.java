/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcTradingAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setReserveBalance(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_ReserveBalance_set(swigCPtr, this, value);
  }

  public double getReserveBalance() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_ReserveBalance_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setPreFundMortgageIn(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreFundMortgageIn_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageIn() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreFundMortgageIn_get(swigCPtr, this);
  }

  public void setPreFundMortgageOut(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreFundMortgageOut_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageOut() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_PreFundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageIn(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FundMortgageIn_set(swigCPtr, this, value);
  }

  public double getFundMortgageIn() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FundMortgageIn_get(swigCPtr, this);
  }

  public void setFundMortgageOut(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FundMortgageOut_set(swigCPtr, this, value);
  }

  public double getFundMortgageOut() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageAvailable(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FundMortgageAvailable_set(swigCPtr, this, value);
  }

  public double getFundMortgageAvailable() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FundMortgageAvailable_get(swigCPtr, this);
  }

  public void setMortgageableFund(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_MortgageableFund_set(swigCPtr, this, value);
  }

  public double getMortgageableFund() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_MortgageableFund_get(swigCPtr, this);
  }

  public void setSpecProductMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductMargin_get(swigCPtr, this);
  }

  public void setSpecProductFrozenMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductFrozenMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductFrozenMargin_get(swigCPtr, this);
  }

  public void setSpecProductCommission(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductCommission() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductCommission_get(swigCPtr, this);
  }

  public void setSpecProductFrozenCommission(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductFrozenCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenCommission() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductFrozenCommission_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductPositionProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductPositionProfit_get(swigCPtr, this);
  }

  public void setSpecProductCloseProfit(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductCloseProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductCloseProfit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductCloseProfit_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfitByAlg(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductPositionProfitByAlg_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfitByAlg() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductPositionProfitByAlg_get(swigCPtr, this);
  }

  public void setSpecProductExchangeMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductExchangeMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductExchangeMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_SpecProductExchangeMargin_get(swigCPtr, this);
  }

  public void setBizType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_BizType_set(swigCPtr, this, value);
  }

  public char getBizType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_BizType_get(swigCPtr, this);
  }

  public void setFrozenSwap(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenSwap_set(swigCPtr, this, value);
  }

  public double getFrozenSwap() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_FrozenSwap_get(swigCPtr, this);
  }

  public void setRemainSwap(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_RemainSwap_set(swigCPtr, this, value);
  }

  public double getRemainSwap() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingAccountField_RemainSwap_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcTradingAccountField(), true);
  }

}
