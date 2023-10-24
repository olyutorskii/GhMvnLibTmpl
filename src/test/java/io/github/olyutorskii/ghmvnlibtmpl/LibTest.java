/*
 * License : The MIT License
 * Copyright(c) 2020 Olyutorskii
 */

package io.github.olyutorskii.ghmvnlibtmpl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibTest {

    public LibTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of func method, of class Lib.
     */
    @Test
    public void testFunc() {
        System.out.println("func");

        Lib instance;
        int expResult;
        int result;

        instance = new Lib();

        expResult = -99;
        int iVal = 99;
        result = instance.func(iVal);

        assertEquals(expResult, result);

        return;
    }

}
