/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw1_141044085;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author soner
 */
public class AssignmentTest {

    /**
     * Test of setDateLine method, of class Assignment.
     */
    @Test
    public void testSetDateLine() {
        System.out.println("setDateLine");
        String dateLine = "01-01-1970";
        Assignment instance = new Assignment("Research Languages");
        instance.setDateLine(dateLine);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLateDateLine method, of class Assignment.
     */
    @Test
    public void testSetLateDateLine() {
        System.out.println("setLateDateLine");
        String lateDateLine = "01-01-1970";
        Assignment instance = new Assignment("Research Languages");
        instance.setLateDateLine(lateDateLine);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDateLine method, of class Assignment.
     */
    @Test
    public void testGetDateLine() {
        System.out.println("getDateLine");
        String dateLine = "01-01-1970";
        Assignment instance = new Assignment("Research Languages");
        instance.setDateLine(dateLine);
        String expResult = "01-01-1970";
        String result = instance.getDateLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLateDateLine method, of class Assignment.
     */
    @Test
    public void testGetLateDateLine() {
        System.out.println("getLateDateLine");
        String lateDateLine = "01-01-1970";
        Assignment instance = new Assignment("Research Languages");
        instance.setLateDateLine(lateDateLine);
        String expResult = "01-01-1970";
        String result = instance.getLateDateLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
