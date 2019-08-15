package com.app.tests;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCConnection {

    String oracleDbUrl = "jdbc:oracle:thin:@ec2-18-225-35-151.us-east-2.compute.amazonaws.com:1521:xe";
    String oracleDbUserName = "hr";
    String oracleDbPassword = "hr";


    @Test()
    public void oracleJDBC() throws SQLException{


        Connection connection = DriverManager.getConnection(oracleDbUrl, oracleDbUserName, oracleDbPassword);
//        Statement statement = connection.createStatement();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from countries");



//        while(resultSet.next()) {
//            System.out.println(resultSet.getString(1) + "-" + resultSet.getString("country_name") + '-' +
//                    resultSet.getInt("region_id"));
//        }
//        resultSet.next();
//        System.out.println(resultSet.getRow());
//
//        resultSet.previous();
//        resultSet.first();
//        resultSet.last(); // goes to last row
//        resultSet.first(); // goes to first row
//        resultSet.beforeFirst(); // goes to row 0
//        resultSet.afterLast(); // goes to after last row
//        System.out.println(resultSet.getRow());

        // find out how many records in the resultset


        resultSet.last();
        int rowsCount = resultSet.getRow();
        System.out.println("Number of rows: " + rowsCount);

        resultSet.beforeFirst(); // it's pointing to before first row
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1) + "-" + resultSet.getString("country_name") + '-' +
                    resultSet.getInt("region_id"));
        }

        resultSet.close();
        statement.close();
        connection.close();

    }

    @Test
    public void jdbcMetadata() throws Exception{ // more information about data. Data about data
        Connection connection = DriverManager.getConnection(oracleDbUrl, oracleDbUserName, oracleDbPassword);
//        Statement statement = connection.createStatement();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        String sql = "SELECT employee_id, last_name, job_id, salary FROM employees";
//        String sql = "SELECT * FROM employees";

        ResultSet resultSet = statement.executeQuery(sql);

        // Database metadata
        DatabaseMetaData dbMetada = connection.getMetaData();
        System.out.println("User: " + dbMetada.getUserName());
        System.out.println("Database type: " + dbMetada.getDatabaseProductName());

        // resultSet metadata

        ResultSetMetaData rsMetadata = resultSet.getMetaData();
        System.out.println("Columns count: " + rsMetadata.getColumnCount());

        // print all column names using a loop

        for(int i = 1; i <= rsMetadata.getColumnCount(); i++) {
            System.out.println(i + " -> " + rsMetadata.getColumnName(i));
        }

        // Throw resultset into a List of Map
        // Create a List of Maps
        List<Map<String, Object> > list = new ArrayList<>();
        ResultSetMetaData rsMdata = resultSet.getMetaData();

        int colCount = rsMdata.getColumnCount();

        while(resultSet.next()){
            Map<String, Object> rowMap = new HashMap<>();

            for(int col = 1; col <= colCount; col++) {
                rowMap.put(rsMdata.getColumnName(col), resultSet.getObject(col));

            }
                list.add(rowMap);
        }
        // print all employee_ids from a List of Maps

        for(Map<String,Object> emp :list){
            System.out.println(emp.get("EMPLOYEE_ID"));
        }









        resultSet.close();
        statement.close();
        connection.close();
    }

}
