/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import com.sun.rmi.rmid.ExecOptionPermission;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vanessa França
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int x = 2;
        int y = 0;
        Calculadora calc = new Calculadora();
        double expResult = 2;
        double result = calc.somar(x, y);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int x = 3;
        int y = 0;
        Calculadora calc = new Calculadora();
        double expResult = 3;
        double result = calc.subtrair(x, y);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int x = 6;
        int y = 3;
        Calculadora calc = new Calculadora();
        double expResult = 18;
        double result = calc.multiplicar(x, y);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test(expected = Exception.class )
    public void testDividir() throws Exception {
        System.out.println("dividir");
        int x = 6;
        int y = 0;
        Calculadora calc = new Calculadora();

        double result = calc.dividir(x, y);

        double expResult = 3;

        assertEquals(expResult, result, 0.0);

    }
    

}
