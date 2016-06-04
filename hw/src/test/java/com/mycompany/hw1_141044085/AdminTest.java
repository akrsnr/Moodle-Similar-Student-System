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
public class AdminTest {
    
    /**
     * Test of addUser method, of class Admin.
     */
    @org.junit.Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        Object o = new Teacher();
        Admin instance = new Admin();
        instance.addUser(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeUser method, of class Admin.
     */
    @org.junit.Test
    public void testRemoveUser() throws Exception {
        System.out.println("removeUser");
        Admin instance = new Admin();
        Object o = new Student();
        instance.addUser(o);
        instance.removeUser(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addCourse method, of class Admin.
     */
    @org.junit.Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course o = new Course(tTeacher,  "Introduction to Computer Science", 101);
        Admin instance = new Admin();
        instance.addCourse(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeCourse method, of class Admin.
     */
    @org.junit.Test
    public void testRemoveCourse() throws Exception {
        System.out.println("removeCourse");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course o = new Course(tTeacher,  "Introduction to Computer Science", 101);
        Admin instance = new Admin();
        instance.addCourse(o);
        instance.removeCourse(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of showAddedCourses method, of class Admin.
     */
    @org.junit.Test
    public void testShowAddedCourses() {
        System.out.println("showAddedCourses");
        Admin instance = new Admin();
        instance.showAddedCourses();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
