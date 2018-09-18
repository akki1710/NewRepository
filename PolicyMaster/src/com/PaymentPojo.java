package com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="objPolicyApprovalETT")
public class PaymentPojo {
	private String ProposalNo;
	private String TransactionNumber;
	private String CardNumber;
	private String CardholderName;
	private String CardType;
	private String CardValidUpTo;
	private String BankName;
	private String BranchName;
	private String PaymentType;
	private String TransactionDate;
	private String ChequeType;
	private String ChequeClearType;
	private String CashType;
	public PaymentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentPojo(String proposalNo, String transactionNumber, String cardNumber, String cardholderName,
			String cardType, String cardValidUpTo, String bankName, String branchName, String paymentType,
			String transactionDate, String chequeType, String chequeClearType, String cashType) {
		super();
		ProposalNo = proposalNo;
		TransactionNumber = transactionNumber;
		CardNumber = cardNumber;
		CardholderName = cardholderName;
		CardType = cardType;
		CardValidUpTo = cardValidUpTo;
		BankName = bankName;
		BranchName = branchName;
		PaymentType = paymentType;
		TransactionDate = transactionDate;
		ChequeType = chequeType;
		ChequeClearType = chequeClearType;
		CashType = cashType;
	}
	public String getProposalNo() {
		return ProposalNo;
	}
	@XmlElement(name="ProposalNo")
	public void setProposalNo(String proposalNo) {
		ProposalNo = proposalNo;
	}
	public String getTransactionNumber() {
		return TransactionNumber;
	}
	@XmlElement(name="TransactionNumber")
	public void setTransactionNumber(String transactionNumber) {
		TransactionNumber = transactionNumber;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	@XmlElement(name="CardNumber")
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getCardholderName() {
		return CardholderName;
	}
	@XmlElement(name="CardholderName")
	public void setCardholderName(String cardholderName) {
		CardholderName = cardholderName;
	}
	public String getCardType() {
		return CardType;
	}
	@XmlElement(name="CardType")
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getCardValidUpTo() {
		return CardValidUpTo;
	}
	@XmlElement(name="CardValidUpTo")
	public void setCardValidUpTo(String cardValidUpTo) {
		CardValidUpTo = cardValidUpTo;
	}
	public String getBankName() {
		return BankName;
	}
	@XmlElement(name="BankName")
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBranchName() {
		return BranchName;
	}
	@XmlElement(name="BranchName")
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	@XmlElement(name="PaymentType")
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	@XmlElement(name="TransactionDate")
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getChequeType() {
		return ChequeType;
	}
	@XmlElement(name="ChequeType")
	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
	}
	public String getChequeClearType() {
		return ChequeClearType;
	}
	@XmlElement(name="ChequeClearType")
	public void setChequeClearType(String chequeClearType) {
		ChequeClearType = chequeClearType;
	}
	public String getCashType() {
		return CashType;
	}
	@XmlElement(name="CashType")
	public void setCashType(String cashType) {
		CashType = cashType;
	}
	@Override
	public String toString() {
		return "PaymentPojo [ProposalNo=" + ProposalNo + ", TransactionNumber=" + TransactionNumber + ", CardNumber="
				+ CardNumber + ", CardholderName=" + CardholderName + ", CardType=" + CardType + ", CardValidUpTo="
				+ CardValidUpTo + ", BankName=" + BankName + ", BranchName=" + BranchName + ", PaymentType="
				+ PaymentType + ", TransactionDate=" + TransactionDate + ", ChequeType=" + ChequeType
				+ ", ChequeClearType=" + ChequeClearType + ", CashType=" + CashType + "]";
	}
	
	
}
