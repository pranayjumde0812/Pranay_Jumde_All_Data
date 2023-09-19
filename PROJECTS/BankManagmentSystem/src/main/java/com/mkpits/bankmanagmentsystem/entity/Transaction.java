package com.mkpits.bankmanagmentsystem.entity;

public class Transaction {
    private Long transactionId;
    private Long userId;
    private Double amount;
    private String transactionDate;
    private String transactionType;

    public Transaction() {
    }

    public Transaction(Long transactionId, Long userId, Double amount, String transactionDate, String transactionType) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", userId=" + userId +
                ", amount=" + amount +
                ", transactionDate='" + transactionDate + '\'' +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
