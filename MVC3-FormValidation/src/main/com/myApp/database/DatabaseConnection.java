package main.com.myApp.database;

import  java.sql.Connection;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DatabaseConnection {

    public Connection connectDB(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseUrl="jdbc:mysql://localhost:3307/UserData";
            String databaseName="root";
            String databasePassword="123456";
            Connection connection= (Connection) DriverManager.getConnection(databaseUrl,databaseName,databasePassword);
            return connection;
        }catch(ClassNotFoundException | SQLException exception){
            exception.printStackTrace();
            throw new RuntimeException(exception);
        }

    }


}
