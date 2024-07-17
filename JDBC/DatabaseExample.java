package com.f1soft.Task.JDBC;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

//Multiple class in one file is suitable for smaller related project.
//Making java file for each class is suitable for larger project which helps in easier readability and reusability.
class TableCreation{
    String jdbcUrl;
    String username;
    String password;

    TableCreation(){
    }

    TableCreation(String jdbcUrl, String username,String password  ){
        this.jdbcUrl=jdbcUrl;
        this.username=username;
        this.password=password;
    }

    //CREATE TABLE METHOD
    void createTable(){

        String dbName = "mydatabase";
        String tableName = "employee";

        // SQL query to check if the table exists
        String sql = "SELECT EXISTS (" +
                "  SELECT *" +
                "  FROM information_schema.tables" +
                "  WHERE table_schema = ?" +
                "    AND table_name = ?" +
                ") AS table_exists";

        try (Connection con = DriverManager.getConnection(jdbcUrl,username,password);){
            System.out.println("Connection established");

            PreparedStatement preparedStatement= con.prepareStatement(sql);
            preparedStatement.setString(1,dbName);
            preparedStatement.setString(2,tableName);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Process the result
                if (resultSet.next()) {
                    boolean tableExists = resultSet.getBoolean("table_exists");// "table_exists" is
                    // the label in ResultSet that contains the boolean value is a table exists or not
                    if (tableExists) {
                        System.out.println("The table exists.");
                    } else {
                        System.out.println("The table does not exist....Creating table");

                        Statement statement = con.createStatement();
                        //table creation
                        String tableCreation = "CREATE TABLE EMPLOYEE " +
                                "(id INTEGER not NULL , " +
                                " emp_name VARCHAR(255), " +
                                " address VARCHAR(255), " +
                                " phone_number VARCHAR(10)," +
                                " position VARCHAR(255)," +
                                " PRIMARY KEY ( id ))";

                        statement.executeUpdate(tableCreation);
                        System.out.println("Table created");
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    //INSERT INTO TABLE METHOD
    void insertTable(int id, String empName,String address,String phoneNumber, String position){

        try (Connection con = DriverManager.getConnection(jdbcUrl,username,password);){
        String insertQuery="INSERT INTO employee VALUES(?,?,?,?,?)";

        PreparedStatement preparedStatementInsert = con.prepareStatement(insertQuery);

        preparedStatementInsert.setInt(1,id);
        preparedStatementInsert.setString(2,empName);
        preparedStatementInsert.setString(3,address);
        preparedStatementInsert.setString(4,phoneNumber);
        preparedStatementInsert.setString(5,position);

        int i = preparedStatementInsert.executeUpdate();

        System.out.println("Value Inserted"+i);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


public class DatabaseExample {
    public static void main(String[] args) {
//        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase"; // Database URL
//        String username = "root"; // Database username
//        String password = ""; // Database password

        ConnectionGetSet connectionGetSet = new ConnectionGetSet();
//Creating Table
        TableCreation tableCreation = new TableCreation(connectionGetSet.getJdbcUrl(), connectionGetSet.getUsername(), connectionGetSet.getPassword());
        tableCreation.createTable();

        //Inserting into table
//        tableCreation.insertTable(1,"Rez","hello","9860478390","Developer");
    }
}
