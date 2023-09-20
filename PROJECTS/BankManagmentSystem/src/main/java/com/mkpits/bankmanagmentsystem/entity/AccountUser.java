package com.mkpits.bankmanagmentsystem.entity;

import java.sql.*;

public class AccountUser {

    private String userId;
    private String accountNumber;
    private String password;
    private String name;
    private String address;
    private Double balance;


    Connection connection;
    PreparedStatement preparedStatement;

    public AccountUser() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jspbankproject";
            connection = DriverManager.getConnection(url, "root", "1311");

        } catch (Exception e) {
        }
    }

    public AccountUser(String userId, String accountNumber, String password, String name, String address, Double balance) {
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.password = password;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountUser{" +
                "userId=" + userId +
                ", accountNumber=" + accountNumber +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                '}';
    }

    int result = 0;

    public int registerUser() throws SQLException {

        String query = "insert into jspbankproject.account_user(user_id, account_number, password, name, address, balance) values(?,?,?,?,?,?) ";

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, userId);
        preparedStatement.setString(2, accountNumber);
        preparedStatement.setString(3, password);
        preparedStatement.setString(4, name);
        preparedStatement.setString(5, address);
        preparedStatement.setDouble(6, balance);

        result = preparedStatement.executeUpdate();
        return result;
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    String uname;

    public ResultSet checkLoginUser() {

//        int result = 0;
        ResultSet resultSet;

        String query = "select user_id, password, name from account_user where user_id=? and password=?";
        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

//            if (resultSet.next()) {
//                result = 0;
//                setUname(resultSet.getString(3).toString());
//                System.out.println(getUname());
//            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultSet;
    }
}
