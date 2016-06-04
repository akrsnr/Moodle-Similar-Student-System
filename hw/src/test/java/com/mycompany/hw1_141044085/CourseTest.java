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
public class CourseTest {
    
    /**
     * Test of showAssignments method, of class Course.
     */
    @Test
    public void testShowAssignments() {
        System.out.println("showAssignments");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course c1 = new Course(tTeacher,  "Introduction to Computer Science", 101);
        Assignment testAssignment = new Assignment("Research Languages");
        tTeacher.addAssignment(testAssignment, c1, "25-02-2016");
        c1.showAssignments();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addDoc method, of class Course.
     */
    @Test
    public void testAddDoc() {
        System.out.println("addDoc");
        Document o = new Document("ppt");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        instance.addDoc(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addAssignment method, of class Course.
     */
    @Test
    public void testAddAssignment() {
        System.out.println("addAssignment");
        Assignment o = new Assignment("Research Languages");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        instance.addAssignment(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addCourseToStudent method, of class Course.
     */
    @Test
    public void testAddCourseToStudent() {
        System.out.println("addCourseToStudent");
        Student o = new Student();
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        instance.addCourseToStudent(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeStudentFromCourse method, of class Course.
     */
    @Test
    public void testRemoveStudentFromCourse() {
        System.out.println("removeStudentFromCourse");
        Student o = new Student();
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        instance.addCourseToStudent(o);
        instance.removeStudentFromCourse(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class Course.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String s = "";
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        instance.setName(s);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getName method, of class Course.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        String expResult = "Introduction to Computer Science";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId method, of class Course.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int val = 0;
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        instance.setId(val);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getId method, of class Course.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(tTeacher,  "Introduction to Computer Science", 101);
        int expResult = 101;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCourseLecturer method, of class Course.
     */
    @Test
    public void testSetCourseLecturer() {
        System.out.println("setCourseLecturer");
        Teacher o = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(o,  "Introduction to Computer Science", 101);
        instance.setCourseLecturer(o);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCourseLecturer method, of class Course.
     */
    @Test
    public void testGetCourseLecturer() {
        System.out.println("getCourseLecturer");
        Teacher expResult = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(expResult,  "Introduction to Computer Science", 101);
        Teacher result = instance.getCourseLecturer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of showStudentsOfTheCourse method, of class Course.
     */
    @Test
    public void testShowStudentsOfTheCourse() {
        System.out.println("showStudentsOfTheCourse");
        Teacher o = new Teacher("Hacı Ali", "Mantar");
        Course instance = new Course(o,  "Introduction to Computer Science", 101);
        instance.showStudentsOfTheCourse();
        // TODO review the generated test code and remove the default call to fail.
    }


    
}
