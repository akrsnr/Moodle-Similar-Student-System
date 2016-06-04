/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw1_141044085;

import java.util.ArrayList;

/**
 *
 * @author soner
 */
public class Course implements GetSet {

    private String courseName;
    private int courseId;
    private Teacher courseLecturer;
    private ArrayList<Student> courseStudents = new ArrayList<>();
    private ArrayList<Assignment> courseAssignments = new ArrayList<>();
    private ArrayList<Document> docs = new ArrayList<>();

    /**
     * Prints assignments related to the course
     */
    public void showAssignments() {

        for (int i = 0; i < courseAssignments.size(); ++i) {

            System.out.println(courseAssignments.get(i));
        }
    }

    /**
     * Add a document to the course
     * @param o document object
     */
    public void addDoc(Document o) {

        docs.add(o);
    }

    /**
     * Add an assignment to the course
     * @param o assignment object
     */
    public void addAssignment(Assignment o) {

        courseAssignments.add(o);
    }

    /**
     * Add the course into student taken courses
     * @param o student object
     */
    public void addCourseToStudent(Student o) {

        if (!courseStudents.contains(o))
            courseStudents.add(o);
    }

    /**
     * Remove the course from student taken courses
     * @param o student object
     */
    public void removeStudentFromCourse(Student o) {

        if (courseStudents.contains(o))
            courseStudents.remove(o);
    }

    /** Three parameter ctor */
    public Course(Teacher courseLecturer, String courseName, int courseId) {

        this.courseName = courseName;
        this.courseId = courseId;
        this.courseLecturer = courseLecturer;
    }

    // Getter - Setter Name

    /**
     * Setter for the course name
     * @param s specified string for name
     */
    public void setName(String s) {

        this.courseName = s;
    }

    /**
     * Getter for the course name
     * @return course name as string
     */
    public String getName() {

        return this.courseName;
    }

    // Getter - Setter Id

    /**
     * Setter for id
     * @param val integer value
     */
    public void setId(int val) {

        this.courseId = val;
    }

    /**
     * Getter for id
     * @return id value as integer
     */
    public int getId() {

        return courseId;
    }

    /**
     * Setter for the course lecturer
     * @param o teacher object
     */
    public void setCourseLecturer(Teacher o) {

        this.courseLecturer = o;
    }

    /**
     * Getter for the course lecturer
     * @return teacher object
     */
    public Teacher getCourseLecturer() {

        return courseLecturer;
    }

    /**
     * Print students taking the course
     */
    public void showStudentsOfTheCourse() {

        for (int i = 0; i < courseStudents.size(); ++i) {

            System.out.println(courseStudents.get(i));
        }
    }

    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;

        if (object != null && object instanceof Course)
        {
            isEqual = (this.getId() == ((Course) object).getId() && this.getName().equals(((Course) object).getName())
                    && this.courseLecturer.equals(((Course) object).courseLecturer));

        }

        return isEqual;
    }

}