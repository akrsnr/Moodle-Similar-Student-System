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
public class DocumentTest {
    
    /**
     * Test of getDocumentFormat method, of class Document.
     */
    @Test
    public void testGetDocumentFormat() {
        System.out.println("getDocumentFormat");
        Document instance = new Document("ppt");
        String expResult = "ppt";
        String result = instance.getDocumentFormat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDocumentFormat method, of class Document.
     */
    @Test
    public void testSetDocumentFormat() {
        System.out.println("setDocumentFormat");
        String documentFormat = "";
        Document instance = new Document("ppt");
        instance.setDocumentFormat(documentFormat);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
