/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProvesUni;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Classe de proves unitàries per a la classe CalcUnit.
 * 
 * Les proves verifiquen el comportament dels mètodes de la classe CalcUnit.
 * @author sofia
 */
public class CalcUnitTest {
    CalcUnit mycalc;
    public CalcUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        mycalc = new CalcUnit();//Instància de la classe a testejar
    }
    
    @AfterEach
    public void tearDown() {
        mycalc.restablecer();// Restabliment de la instància després de cada test
    }

    /**
     * Test del métode suma, de la classe CalcUnit.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        float op1 = 2.0F;
        float op2 = 3.0F;
        float expResult = 5.0F;
        float result = mycalc.suma(op1, op2); // 2.0F + 3.0F = 5.0F
        assertEquals(expResult, result);
        fail("The test case is a prototype.");//El test donarà error pq cridem a fail
    }

    /**
     * Test del métode resta, de la classe CalcUnit.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        float op1 = 5.0F;
        float op2 = 3.0F;
        float expResult = 2.0F;
        float result = mycalc.resta(op1, op2);// 5.0F - 3.0F = 2.0F
        assertEquals(expResult, result);
        
    }

    /**
     * Test del métode multiplicació, de la classe CalcUnit.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        float op1 = 3.0F;
        float op2 = 2.0F;
        float expResult = 6.0F;
        float result = mycalc.multiplica(op1, op2);// 3.0F*2.0F = 6.0F
        assertEquals(expResult, result, 0);
    }

    /**
     * Test del métode divideix, de la classe CalcUnit.
     */
    @Test
    public void testDivideix() {
        System.out.println("divideix");
        float op1 = 6.0F;
        float op2 = 2.0F;
        float expResult = 3.0F;
        float result = mycalc.divideix(op1, op2); // 6.0F / 2.0F = 3.0F
        assertEquals(expResult, result);
    }

    /**
     * Test del métode majorQue, de la classe CalcUnit.
     */
    @Test
    public void testMajorQue() {
        System.out.println("majorQue");
        float op1 = 3.0F;
        float op2 = 4.0F;
        boolean expResult = false;
        boolean result = mycalc.majorQue(op1, op2); // 3.0F > 4.0F = false;
        assertEquals(expResult, result);
    }
}
