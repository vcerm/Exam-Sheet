package demoex;

import demoex.ui.AgentTableForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        new AgentTableForm();
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://116.202.236.174:3306/DemoExam","DemoExam","DemoExam");
    }
}
