package com.infinite.bank.dao;

import com.infinite.bank.model.Accounts;
import com.infinite.bank.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountsDaoImpl implements AccountsDao {

  Connection connection;
  PreparedStatement pst;

  public int generateAccountNo() throws SQLException, ClassNotFoundException {
    connection = ConnectionHelper.getConnection();
    String cmd = "select case when max(accountNo) IS NULL THEN 1 " +
      "else Max(AccountNo)+1 end accno from Accounts";
    pst = connection.prepareStatement(cmd);
    ResultSet rs = pst.executeQuery();
    rs.next();
    int accno = rs.getInt("accno");
    return accno;
  }
  @Override
  public String createAccount(Accounts accounts) throws SQLException, ClassNotFoundException {
    int accno = generateAccountNo();
    accounts.setAccountNo(accno);
    connection = ConnectionHelper.getConnection();
    String cmd = "Insert into Accounts(AccountNo,FirstName,LastName," +
      "City,State,Amount,CheqFacil,AccountType) values(?,?,?,?,?,?,?,?)";
    pst = connection.prepareStatement(cmd);
    pst.setInt(1,accno);
    pst.setString(2, accounts.getFirstName());
    pst.setString(3, accounts.getLastName());
    pst.setString(4, accounts.getCity());
    pst.setString(5, accounts.getState());
    pst.setDouble(6, accounts.getAmount());
    pst.setString(7, accounts.getCheqFacil());
    pst.setString(8, accounts.getAccountType());
    pst.executeUpdate();
    return "Account Created with Account No  " +accno;
  }

  @Override
  public Accounts searchAccount(int accountno) throws SQLException, ClassNotFoundException {
    connection = ConnectionHelper.getConnection();
    String cmd = "select * from Accounts where  AccountNo=?";
    pst = connection.prepareStatement(cmd);
    pst.setInt(1,accountno);
    ResultSet rs = pst.executeQuery();
    Accounts accounts = null;
    if (rs.next()) {
      accounts = new Accounts();
      accounts.setAccountNo(accountno);
      accounts.setFirstName(rs.getString("firstName"));
      accounts.setLastName(rs.getString("lastName"));
      accounts.setCity(rs.getString("city"));
      accounts.setState(rs.getString("state"));
      accounts.setAmount(rs.getDouble("amount"));
      accounts.setCheqFacil(rs.getString("cheqFacil"));
      accounts.setAccountType(rs.getString("accountType"));
      accounts.setStatus(rs.getString("status"));
      accounts.setDateOfOpen(rs.getDate("dateofopen"));
    }
    return accounts;
  }

  @Override
  public String updateAccount(int accountNo, String city, String state) {
    try {
      Accounts accounts= searchAccount(accountNo);
      if (accounts==null) {
        return "Account No Not Found...";
      }
      String cmd = "Update Accounts Set City=?, State=? Where AccountNo = ?";
      connection = ConnectionHelper.getConnection();
      pst = connection.prepareStatement(cmd);
      pst.setString(1,city);
      pst.setString(2,state);
      pst.setInt(3,accountNo);
      pst.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    return "*** Account Updated ***";
  }

  @Override
  public String depositAccount(int accountNo, double depositAmount) throws SQLException, ClassNotFoundException {
    Accounts accountFound = searchAccount(accountNo);
    if (accountFound==null) {
      return "Account No Does Not Exist...";
    }
    String cmd = "Update Accounts Set Amount = Amount + ? " +
      " WHERE AccountNo = ?";
    connection = ConnectionHelper.getConnection();
    pst = connection.prepareStatement(cmd);
    pst.setDouble(1, depositAmount);
    pst.setInt(2,  accountNo);
    pst.executeUpdate();
    cmd = "Insert into Trans(AccountNo, TransAmount, TransType) " +
      " Values(?,?,?)";
    pst = connection.prepareStatement(cmd);
    pst.setInt(1,accountNo);
    pst.setDouble(2,depositAmount);
    pst.setString(3,"C");
    pst.executeUpdate();
    return "Amount Credited Successfully...";
  }

  @Override
  public String withdrawAccount(int accountNo, double withdrawAmount) throws SQLException, ClassNotFoundException {
    Accounts accountFound = searchAccount(accountNo);
    if (accountFound==null) {
      return "Account No Does Not Exist...";
    }
    double balance = accountFound.getAmount();
    if (balance - withdrawAmount < 0) {
      return "Insufficient Funds...";
    }
    String cmd = "Update Accounts Set Amount = Amount - ? " +
      " WHERE AccountNo = ?";
    connection = ConnectionHelper.getConnection();
    pst = connection.prepareStatement(cmd);
    pst.setDouble(1, withdrawAmount);
    pst.setInt(2,  accountNo);
    pst.executeUpdate();
    cmd = "Insert into Trans(AccountNo, TransAmount, TransType) " +
      " Values(?,?,?)";
    pst = connection.prepareStatement(cmd);
    pst.setInt(1,accountNo);
    pst.setDouble(2,withdrawAmount);
    pst.setString(3,"D");
    pst.executeUpdate();
    return "Amount Debited Successfully...";
  }
}
