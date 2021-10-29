/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.login;

import pl.library.categories.CategoriesView;
import pl.library.database.DatabaseHandler;
import pl.library.hash.Hasher;
import pl.library.message.MessageHandler;
import pl.library.user.User;

/**
 *
 * @author Jacek
 */
public class LoginController {
    
    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
    
    public void login(Login login){
        if(login.getUsername().length() < 3){
            tooShortLoginData("Username");
            return;
        }
        else if(login.getUsername().length() > 30){
            tooLongLoginData("Username");
            return;
        }
        if(login.getPassword().length < 3){
            tooShortLoginData("Password");
            return;
        }
        else if(login.getPassword().length > 30){
            tooLongLoginData("Password");
            return;
        }
        
        int id = DatabaseHandler.login(login.getUsername(), Hasher.hash(login.getPassword()));
        switch (id) {
            case -1 -> wrongLoginData();
            case -2 -> databaseError();
            default -> successfulLogin(id, login.getUsername());
        }
    }
    
    private void tooShortLoginData(String dataType){
        MessageHandler.showWarningMessage(view ,dataType + " is to short", dataType + " error");
    }
    
    private void tooLongLoginData(String dataType){
        MessageHandler.showWarningMessage(view ,dataType + " is to long",dataType + " error");
    }
    
    private void wrongLoginData(){
        MessageHandler.showWarningMessage(view ,"Wrong username or password", "Login failed");
    }
    
    private void databaseError(){
        MessageHandler.showStandardDatabaseErrorMessage(view);
    }
    
    private void successfulLogin(int id, String username){
        User user = new User(id, username);
        new CategoriesView(user).setVisible(true);
        view.dispose();
    }
}
