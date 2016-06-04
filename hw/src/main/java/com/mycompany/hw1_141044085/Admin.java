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
public class Admin extends Users {

    protected static ArrayList<Course> adminAddedCourses = new ArrayList<>();

    /** One parameter ctor */
    public Admin() {

        super.setName("Free Name for Admin");
        super.setSurname("Free Surname for Admin");
        super.setId(2);
    }

    /** Three parameter ctor */
    public Admin(String name, String surname, int id) {

        super.setName(name);
        super.setSurname(surname);
        super.setId(id);
    }

    /** Two parameter ctor */
    public Admin(String name, String surname) {

        super.setName(name);
        super.setSurname(surname);
    }

    /**
     * Add user into the system
     * @param o changeable according to class type
     * @throws WrongObject if object discrepants from the four
     */
    @Override
    public void addUser(Object o) throws WrongObject {

        if (o instanceof Tutor) {

            tutors.add((Tutor) o);

        }

        else if (o instanceof Student) {

            students.add((Student) o);

        }

        else if (o instanceof Teacher) {

            teachers.add((Teacher) o);

        }

        else if (o instanceof Admin) {

            admins.add((Admin) o);

        }

        else {
            throw new WrongObject("Wrong type object - " + o.getClass() + " - is tried to add by Admin");
        }
    }

    /**
     * Remove user from the system
     * @param o changeable according to class type
     * @throws WrongObject if object discrepants from the four
     */
    @Override
    public void removeUser(Object o) throws WrongObject, NotFoundElement {

        if (o instanceof Tutor) {

            if (tutors.contains((Tutor) o))
                tutors.remove((Tutor) o);
            else
                throw new NotFoundElement("Unfindable object is being tried to delete by Admin");
        }

        else if (o instanceof Student) {

            if (students.contains((Student) o))
                students.remove((Student) o);
            else
                throw new NotFoundElement("Unfindable object is being tried to delete by Admin");

        }

        else if (o instanceof Teacher) {

            if (teachers.contains((Teacher) o))
                teachers.remove((Teacher) o);
            else
                throw new NotFoundElement("Unfindable object is being tried to delete by Admin");

        }

        else if (o instanceof Admin) {

            if (admins.contains((Admin) o))
                admins.remove((Admin) o);
            else
                throw new NotFoundElement("Unfindable object is being tried to delete by Admin");

        }

        else {
            throw new WrongObject("Wrong type object - " + o.getClass() + " - is tried to remove by Admin");
        }
    }

    /**
     * Add course to the system
     * @param o course object
     */
    public void addCourse(Course o) {

        if (!adminAddedCourses.contains(o))
            adminAddedCourses.add(o);
    }

    /**
     * Remove course from the system
     * @param o
     * @throws NotFoundElement
     */
    public void removeCourse(Course o) throws NotFoundElement {

        if (adminAddedCourses.contains((Course) o))
            adminAddedCourses.remove((Course) o);
        else
            throw new NotFoundElement("Unfindable course is being tried to delete by Admin");

    }

    /**
     * Print added courses, its lecturer name and surname
     */
    public void showAddedCourses() {

        for (int i = 0; i < adminAddedCourses.size(); ++i) {

            String hold =
                    adminAddedCourses.get(i).getId() + "   "
                            + adminAddedCourses.get(i).getName() + "   "
                            + adminAddedCourses.get(i).getCourseLecturer().getName()
                            + "   " + adminAddedCourses.get(i).getCourseLecturer().getSurname();

            System.out.println(hold);
        }
    }


    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;

        if (object != null && object instanceof Admin)
        {
            isEqual = (this.getId() == ((Admin) object).getId() && this.getName().equals(((Admin) object).getName())
                    && this.getSurname().equals(((Admin) object).getSurname()));

        }

        return isEqual;
    }

}
