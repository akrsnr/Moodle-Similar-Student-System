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
public class StudentTest {
   

    /**
     * Test of enrollToCourse method, of class Student.
     */
    @Test
    public void testEnrollToCourse() {
        System.out.println("enrollToCourse");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course o = new Course(tTeacher,  "Introduction to Computer Science", 101);
        Student instance = new Student();
        instance.enrollToCourse(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of listMyCourses method, of class Student.
     */
    @Test
    public void testListMyCourses() {
        System.out.println("listMyCourses");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course o = new Course(tTeacher,  "Introduction to Computer Science", 101);
        Student instance = new Student();
        instance.enrollToCourse(o);
        instance.listMyCourses();
        // TODO review the generated test code and remove the default call to fail.
    }
}
