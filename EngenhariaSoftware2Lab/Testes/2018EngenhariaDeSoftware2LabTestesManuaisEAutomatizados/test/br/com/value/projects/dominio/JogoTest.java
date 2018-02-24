/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.value.projects.dominio;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Saboia
 */
public class JogoTest {
    
    public JogoTest() {
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
     * Test of anota method, of class Jogo.
     */
    @Test
    public void testAnota() {
        System.out.println("anota");
        Resultado resultado = null;
        Jogo instance = null;
        instance.anota(resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Jogo.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Jogo instance = null;
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getResultados method, of class Jogo.
     */
    @Test
    public void testGetResultados() {
        System.out.println("getResultados");
        Jogo instance = null;
        List<Resultado> expResult = null;
        List<Resultado> result = instance.getResultados();
        assertEquals(expResult, result);
    }
    
}
