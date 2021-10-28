/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.main;

import pl.library.categories.CategoriesView;
import pl.library.login.LoginView;
import pl.library.user.User;

/**
 *
 * @author Jacek
 */
public class Main {
    public static void main(String[] args) {
        //new LoginView().setVisible(true);
        User u = new User();
        u.setId(0);
        u.setUsername("Jac");
        new CategoriesView(u).setVisible(true);
    }
}
