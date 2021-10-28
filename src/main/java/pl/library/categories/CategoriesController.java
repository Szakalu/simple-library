/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.library.categories;

import pl.library.login.LoginView;

/**
 *
 * @author Jacek
 */
public class CategoriesController {
    
    private CategoriesView view;

    public CategoriesController(CategoriesView view) {
        this.view = view;
    }
    
    public void logout(){
        new LoginView().setVisible(true);
        view.dispose();
    }
    
}
