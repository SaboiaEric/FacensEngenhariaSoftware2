/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.value.projects.builder;

import br.com.value.projects.dominio.Jogo;
import br.com.value.projects.dominio.Participante;
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
public class CriadorDeJogoTest {
    
    public CriadorDeJogoTest() {
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
     * Test of para method, of class CriadorDeJogo.
     */
    @Test
    public void testParaDescricaoVazia() {
        System.out.println("para");
        String descricao = "";
        CriadorDeJogo instance = new CriadorDeJogo();
        CriadorDeJogo expResult = null;
        CriadorDeJogo result = instance.para(descricao);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testParaDescricaoComValor() {
        System.out.println("para 2 ");
        String descricao = "Primeiro Jogo";
        CriadorDeJogo instance = new CriadorDeJogo();
        Jogo expResult = new Jogo(descricao);
        CriadorDeJogo result = instance.para(descricao);
        assertEquals(expResult, result);
    }

    /**
     * Test of resultado method, of class CriadorDeJogo.
     */
    @Test
    public void testResultado() {
        System.out.println("resultado");
        Participante participante = null;
        double metrica = 0.0;
        CriadorDeJogo instance = new CriadorDeJogo();
        CriadorDeJogo expResult = null;
        CriadorDeJogo result = instance.resultado(participante, metrica);
        assertEquals(expResult, result);
    }

    /**
     * Test of constroi method, of class CriadorDeJogo.
     */
    @Test
    public void testConstroi() {
        System.out.println("constroi");
        CriadorDeJogo instance = new CriadorDeJogo();
        Jogo expResult = null;
        Jogo result = instance.constroi();
        assertEquals(expResult, result);
    }
    
}
