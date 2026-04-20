package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    GreatestNumber g=new GreatestNumber();

    /**
     * Rigorous Test :-)
     */
    @Test
    void testWhenFirstIsGreatest(){
        assertEquals(10,g.greatest(10,2,5));
    }
    @Test
    void testWhenSecondIsGreatest(){
        assertEquals(20, g.greatest(2,20,10));
    }
    @Test
    void testWhenThirdIsGreatest(){
        assertEquals(50, g.greatest(3,30,50));
    }
    }

