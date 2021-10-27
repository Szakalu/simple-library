/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.login;

import pl.library.database.DatabaseHandler;
import pl.library.hash.Hasher;
import pl.library.message.MessageHandler;

/**
 *
 * @author Jacek
 */
public class LoginController {
    
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
    
    public void login(Login login){
        int id = DatabaseHandler.login(login.getUsername(), Hasher.hash(login.getPassword()));
        switch (id) {
            case -1:
                MessageHandler.showWarningMessage(view ,"Wrong username or password", "Login failed");
                break;
            case -2:
                MessageHandler.showWarningMessage(null, "Database connection problem", "Database Error");
                break;
            default:
                MessageHandler.showInfoMessage(view , "Login Success", "Login Success");
                break;
        }
    }
}
