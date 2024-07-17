package com.f1soft.Task.JDBC;


import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

class ResultSetRead {

    /*ResultSet is not scrollable(move in forward as well as backward direction)and updatable()
           So, .first() and .last() can be used only if result set is made scrollable by using
                   Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
               and updatable by using
                   Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
     */
    String url;
    String username;
    String password;

   ResultSetRead(String url, String username, String password){
        this.url = url;
        this.username = username;
        this.password = password;
   }
   void readDbTables(){
        try (Connection con = DriverManager.getConnection(url,username,password);){
            System.out.println("Connection established");
        String sql="SELECT id, emp_name FROM employee";

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()) {
            System.out.println("ID " + resultSet.getString(1));
            System.out.println("Name " + resultSet.getString(2));

        }

        }catch (SQLException se){
            se.printStackTrace();
        }
    }
}

class RowSetRead{

    /*ResultSet is not scrollable(move in forward as well as backward direction)and updatable()
           So, .first() and .last() can be used only if result set is made scrollable by using
                   Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
               and updatable by using
                   Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
     */

    String url;
    String username;
    String password;

    RowSetRead(String url, String username, String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }
    void readDbTable() {
        String sql = "SELECT id, emp_name FROM employee";

        try {//Statement statement = con.createStatement();
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl(url);
            rowSet.setUsername(username);
            rowSet.setPassword(password);

            rowSet.setCommand(sql);
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Id " + rowSet.getString(1));
                System.out.println("Name " + rowSet.getString(2));
                //System.out.println("Salary: " + rowSet.getString(3));
            }
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
}

public class ReadTable{
    public static void main(String[] args){
        TableCreation tableCreation = new TableCreation();
        tableCreation.createTable();

        ConnectionGetSet connectionGetSet = new ConnectionGetSet();


        ResultSetRead resultSetRead= new ResultSetRead(connectionGetSet.getJdbcUrl(), connectionGetSet.getUsername(), connectionGetSet.getPassword());

        resultSetRead.readDbTables();

        RowSetRead rowSetRead =new RowSetRead(connectionGetSet.getJdbcUrl(), connectionGetSet.getUsername(), connectionGetSet.getPassword());
        rowSetRead.readDbTable();

    }

}
