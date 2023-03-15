/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenfreestyle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author olivert
 */
public class MavenFreeStyleTest {
    
    public MavenFreeStyleTest() {
    }

    /**
     * Test of main method, of class MavenFreeStyle.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MavenFreeStyle.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test 
    public void testFibonacci(){
        MavenFreeStyleTest fib = new MavenFreeStyleTest();

        // Prueba con los primeros 10 términos de la secuencia
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual = {0,1,1,2,3,5,8,13,21,34};

        assertArrayEquals(expected, actual);
    }
    }
   /* @Test
    public void testFibonacci2(){
	//App test = new App();
        MavenFreeStyle instance = new MavenFreeStyle();
        assertTrue(instance.fibonacci(10) == 10);
    }
    */
}
