/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pl.library.message.MessageHandler;

/**
 *
 * @author Jacek
 */
public class DatabaseHandler {

    private static final String LOGIN = "LibraryUser";
    private static final String PASSWORD = "!@Abc34";
    private static final String URL = "jdbc:mysql://localhost:3306/library";

    public static int login(String username, String password) {
        int userId = -1;
        try(Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);) {
            PreparedStatement ps = con.prepareStatement("SELECT id FROM users WHERE username = ? AND password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            System.out.println("PS");
            ResultSet rs = ps.executeQuery();
            System.out.println("RS");
            if(rs.next()) {
                System.out.println("id");
                userId = rs.getInt(1);
            }
            con.close();
        } catch (SQLException e) {
            userId = -2;
            MessageHandler.showWarningMessage(null, "Database connection problem", "Database Error");
        }
        return userId;
    }
}
