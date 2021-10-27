/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.library.hash;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jacek
 */
public class HasherTest {
    
    public HasherTest() {
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

    /**
     * Test of hash method, of class Hasher.
     */
    @Test
    public void testHash() {
        char[] password = {'a', 'b', 'c', 'd'};
        String result = Hasher.hash(password);
        assertEquals("979899100", result);
        assertEquals(true, isArrayOverrided(password));
        
        char [] password2 = {'5', 'h', '1', 'a'};
        result = Hasher.hash(password);
        assertEquals("97979797", result);
        assertEquals(true, isArrayOverrided(password));
    }
    
    private boolean isArrayOverrided(char [] password){
        for(Character c: password){
            if(c != 'a') return false;
        }
        return true;
    }
    
}
