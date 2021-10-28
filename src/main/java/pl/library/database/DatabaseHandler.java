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
import java.util.ArrayList;
import pl.library.message.MessageHandler;
import pl.library.students.Student;

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
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                userId = rs.getInt(1);
            }
        } catch (SQLException e) {
            userId = -2;
        }
        return userId;
    }
    
    public static ArrayList<Student> getStudents(int id, String firstName, String lastName) throws SQLException{
        ArrayList<Student> students = new ArrayList<>();
            Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE firstname LIKE (?)");
            ps.setString(1, "%"+firstName+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                students.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4).toString()));
            }
        return students;
    }
}
