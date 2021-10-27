/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.login;

/**
 *
 * @author Jacek
 */
public class Login {
    private String username;
    private char [] password;

    public Login(String username, char [] password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public char [] getPassword() {
        return password;
    }
    
    
}
