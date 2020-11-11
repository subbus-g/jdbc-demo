package jdbcdemo;

import java.sql.*;

class Driver {
    public static void main(String[] args) throws Exception 
    {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "1234");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT  ID,Name,Population FROM world.city LIMIT 10;");
        while (resultSet.next()) 
        {

            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
        }

    }

}
