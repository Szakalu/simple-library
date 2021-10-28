/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.library.categories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pl.library.user.User;

/**
 *
 * @author Jacek
 */
public class CategoriesViewTest {
    
    private CategoriesView view;
    private User user;
    
    public CategoriesViewTest() {
        user = new User(0, "admin");
        view = new CategoriesView(user);
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetjButtonBooks() {
        assertEquals("Books", view.getjButtonBooks().getText());
    }

    @Test
    public void testGetjButtonBorrows() {
        assertEquals("Borrows", view.getjButtonBorrows().getText());
    }

    @Test
    public void testGetjButtonLogout() {
        assertEquals("Logout", view.getjButtonLogout().getText());
    }

    @Test
    public void testGetjButtonStudents() {
        assertEquals("Students", view.getjButtonStudents().getText());
    }

    @Test
    public void testGetjLabelUser() {
        String labelUserText = view.getjLabelUser().getText();
        assertTrue(labelUserText.contains("User: "));
        assertTrue(labelUserText.contains("Id: "));
        assertTrue(labelUserText.contains(String.valueOf(user.getId())));
        assertTrue(labelUserText.contains(user.getUsername()));
    }
    
}
