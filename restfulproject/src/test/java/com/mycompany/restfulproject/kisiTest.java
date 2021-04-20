/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author huseyin
 */
public class kisiTest {
    
    public kisiTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Category.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Category instance = new Category();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Category.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Category instance = new Category();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Category.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int id = 0;
        Category instance = new Category();
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Category.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Category instance = new Category();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Category.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Category instance = new Category();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Category.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        int created = 0;
        Category instance = new Category();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeleted method, of class Category.
     */
    @Test
    public void testSetDeleted() {
        System.out.println("setDeleted");
        int deleted = 0;
        Category instance = new Category();
        instance.setDeleted(deleted);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Category.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Category instance = new Category();
        int expResult = 0;
        int result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeleted method, of class Category.
     */
    @Test
    public void testGetDeleted() {
        System.out.println("getDeleted");
        Category instance = new Category();
        int expResult = 0;
        int result = instance.getDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Category.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Category instance = new Category();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
