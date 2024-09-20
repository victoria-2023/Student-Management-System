package com.studentmanagement;

import java.sql.*;

public class MyJDBC {

    public static void main(String[] args) {
        try{
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentsystem",
                "root",
                "StrongPassword2024!"

        );

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENTS"); {

                while (resultSet.next()) {
                    System.out.println(resultSet.getString("name"));
                    System.out.println(resultSet.getString("email"));
                    System.out.println(resultSet.getString("course"));
                }
            }
        }catch(SQLException e){
        e.printStackTrace();
        }
    }
}
