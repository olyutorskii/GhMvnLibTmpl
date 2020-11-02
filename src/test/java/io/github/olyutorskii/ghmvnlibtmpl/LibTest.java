/*
 * License : The MIT License
 * Copyright(c) 2020 Olyutorskii
 */

package io.github.olyutorskii.ghmvnlibtmpl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibTest {

    public LibTest() {
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
