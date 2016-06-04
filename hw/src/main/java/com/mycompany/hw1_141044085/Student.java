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
public class Student extends Qualities {

    protected ArrayList<Course> studentCourses = new ArrayList<>();

    /**
     * No parameter ctor
     */
    public Student() {
        super.setName("Free Name for Student or Tutor");
        super.setSurname("Free Surname for Student or Tutor");
        super.setId(0);
    }

    /** Three parameter ctor */
    public Student(String name, String surname, int id) {

        super.setName(name);
        super.setSurname(surname);
        super.setId(id);
    }

    /**
     * A student can register into a course
     * @param o is a course object
     */
    public void enrollToCourse(Course o) {

        studentCourses.add(o);  // student's course

        studentCourses.get(studentCourses.size() - 1).addCourseToStudent(this);
    }

    /**
     * Print all courses taken by a student
     */
    public void listMyCourses() {

        for (int i = 0; i < studentCourses.size(); ++i) {

            System.out.println(studentCourses.get(i).getName());
        }

    }

    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;

        if (object != null && object instanceof Student)
        {
            isEqual = (this.getId() == ((Student) object).getId() && this.getName().equals(((Student) object).getName())
                    && this.getSurname().equals(((Student) object).getSurname()));

        }

        return isEqual;
    }

    @Override
    public String toString() {

        return this.getName() + "   " + this.getSurname() + "   " + this.getId();
    }

}