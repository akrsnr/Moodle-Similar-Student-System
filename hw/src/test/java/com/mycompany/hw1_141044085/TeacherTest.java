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
public class TeacherTest {

    /**
     * Test of addUser method, of class Teacher.
     */
    @Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        Object o = new Tutor();
        Teacher instance = new Teacher("Hacı Ali", "Mantar");
        Course course = new Course(instance,  "Introduction to Computer Science", 101);
        try {
            instance.addUser(o, course);
        } catch (WrongObject e) {
            System.out.println(e);
        } catch (NotFoundElement e) {
            System.out.println(e);
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeUser method, of class Teacher.
     */
    @Test
    public void testRemoveUser() throws Exception {
        System.out.println("removeUser");
        Object o = new Student();
        Teacher instance = new Teacher("Hacı Ali", "Mantar");
        Course course = new Course(instance,  "Introduction to Computer Science", 101);
        try {
            instance.addUser(o, course);
        } catch (WrongObject e) {
            System.out.println(e);
        } catch (NotFoundElement e) {
            System.out.println(e);
        }
        
        try {
            instance.removeUser((Student)o, course);
        } catch (WrongObject e) {
            System.out.println(e);
        } catch (NotFoundElement e) {
            System.out.println(e);
        }
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addAssignment method, of class Teacher.
     */
    @Test
    public void testAddAssignment_4args() {
        System.out.println("addAssignment");
        Assignment aObject = new Assignment("Research Languages");
        Teacher instance = new Teacher("Hacı Ali", "Mantar");
        Course course = new Course(instance,  "Introduction to Computer Science", 101);
        instance.addAssignment(aObject, course, "30-11-2016", "01-12-2016");
        String dueDate = "30-11-2016";
        String lateDueDate = "01-12-2016";
        instance.addAssignment(aObject, course, dueDate, lateDueDate);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addAssignment method, of class Teacher.
     */
    @Test
    public void testAddAssignment_3args() {
        System.out.println("addAssignment");
        Assignment aObject = new Assignment("Research Languages");
        Teacher instance = new Teacher("Hacı Ali", "Mantar");
        Course course = new Course(instance,  "Introduction to Computer Science", 101);
        instance.addAssignment(aObject, course, "30-11-2016");
        String dueDate = "30-11-2016";
        instance.addAssignment(aObject, course, dueDate);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addDoc method, of class Teacher.
     */
    @Test
    public void testAddDoc() {
        System.out.println("addDoc");
        Document dObject = new Document("ppt");
        Teacher instance = new Teacher("Hacı Ali", "Mantar");
        Course course = new Course(instance,  "Introduction to Computer Science", 101);
        instance.addDoc(dObject, course);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
