/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.library.login;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jacek
 */
public class LoginViewTest {
    
    private final LoginView view;
    
    public LoginViewTest(){
        view = new LoginView();
    }
    
    @BeforeAll
    public void setUpClass() {
        
    }
    
    @AfterAll
    public void tearDownClass() {
        
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testLoginLabel() {
        assertEquals(view.getJLabelLogin().getText(), "Login");
    }
    
    @Test
    public void testUserNameLabel() {
        assertEquals(view.getJLabelUserName().getText(), "Username:");
    }
    
    @Test
    public void testPasswordLabel() {
        assertEquals(view.getJLabelPassword().getText(), "Password:");
    }
    
    @Test
    public void testUserNameTextField() {
        assertEquals(view.getJTextFieldUserName().getText(), "");
    }
    
    @Test
    public void testPasswordField() {
        assertArrayEquals(view.getJPasswordFieldPassword().getPassword(), new char [] {});
    }
    
    @Test
    public void testLoginButton() throws Exception {
        assertEquals(view.getJButtonLogin().getText(), "Login");
    }
}
