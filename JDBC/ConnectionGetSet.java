package com.f1soft.Task.JDBC;

public class ConnectionGetSet {

    public String getJdbcUrl(){
        // Database URL
        return "jdbc:mysql://localhost:3306/mydatabase";
  }

    public String getUsername() {
        // Database username
        return "root";
    }

    public String getPassword() {
        // Database password
        return "";
    }
}
