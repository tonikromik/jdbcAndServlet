package asd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private Connection connection;

    // Building connection with database
    public DBConnection() {
        String url = "jdbc:mysql://localhost:3306/bank";
        String user = "root";
        String password = "root";
        try {
            // Щоб не морочити собі голови з підтягуванням драйвера, можна використати
            // клас Class і його метод forName, який приймає в себе адресу до драйвера
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Bank> findAll() {
        List<Bank> bankList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM department;");
            ResultSet resultSet = statement.executeQuery();
            // Like Iterator
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Bank bank = new Bank(id, name);
                bankList.add(bank);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bankList;
    }

    public void save(String name, String surname, String selection, String sumOfCredit) {
        String sql = "INSERT INTO klient(name, surname, selection, sumOfCredit) values(?, ?, ?, ?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, selection);
            statement.setString(4, sumOfCredit);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/*
//
// public void save(String name) {
//        String sql = "INSERT INTO user (name) value(?)";
//        PreparedStatement statement = null;
//        try {
//            statement = connection.prepareStatement(sql);
//            statement.setString(1, name);
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
*/

}
