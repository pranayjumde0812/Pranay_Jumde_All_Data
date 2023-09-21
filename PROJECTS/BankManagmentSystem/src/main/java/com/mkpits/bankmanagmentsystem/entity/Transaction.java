package com.mkpits.bankmanagmentsystem.entity;

import java.sql.*;

public class Transaction {
    private Long transactionId;
    private String userId;
    private Double amount;
    private String transactionDate;
    private String transactionType;

    public Transaction() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jspbankproject";
            connection = DriverManager.getConnection(url, "root", "1311");

        } catch (Exception e) {
        }
    }

    public Transaction(Long transactionId, String userId, Double amount, String transactionDate, String transactionType) {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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

    //////////////////////////////////////////////////////////////////////////////////////////////
    PreparedStatement preparedStatement;
    Connection connection;

    public int depositMoney() throws SQLException {

        String depositQuery = "insert into transaction (user_id,amount,transaction_date,transaction_type) values(?,?,?,?)";

        preparedStatement = connection.prepareStatement(depositQuery);

        preparedStatement.setString(1, userId);
        preparedStatement.setDouble(2, amount);
        preparedStatement.setString(3, transactionDate);
        preparedStatement.setString(4, transactionType);

        int result = preparedStatement.executeUpdate();

        return result;
    }

    public int withdrawMoney() throws SQLException {
        String withdrawQuery = "insert into transaction(user_id,amount,transaction_date,transaction_type) values(?,?,?,?)";

        preparedStatement = connection.prepareStatement(withdrawQuery);

        preparedStatement.setString(1, userId);
        preparedStatement.setDouble(2, amount);
        preparedStatement.setString(3, transactionDate);
        preparedStatement.setString(4, transactionType);

        int result = preparedStatement.executeUpdate();
        return result;
    }
}
