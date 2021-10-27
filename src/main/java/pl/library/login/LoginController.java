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
                wrongLoginData();
                break;
            case -2:
                databaseError();
                break;
            default:
                successfulLogin();
                break;
        }
    }
    
    private void wrongLoginData(){
        MessageHandler.showWarningMessage(view ,"Wrong username or password", "Login failed");
    }
    
    private void databaseError(){
        MessageHandler.showWarningMessage(null, "Database connection problem", "Database Error");
    }
    
    private void successfulLogin(){
        MessageHandler.showInfoMessage(view , "Login Success", "Login Success");
    }
}
