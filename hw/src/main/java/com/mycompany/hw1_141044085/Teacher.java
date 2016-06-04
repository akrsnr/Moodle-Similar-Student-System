/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw1_141044085;

/**
 *
 * @author soner
 */
public class Teacher extends Qualities {

    /** No parameter ctor */
    public Teacher() {

        super.setName("Free Name for Teacher");
        super.setSurname("Free Surname for for Teacher");
        super.setId(1);
    }

    /** Two parameter ctor */
    public Teacher(String name, String surname) {

        super.setName(name);
        super.setSurname(surname);
    }

    /**
     * Add user tutor or student to specified course
     * @param o student or tutor object
     * @param course course object
     * @throws WrongObject if object is not tutor or student
     * @throws NotFoundElement if course is not found
     */
    public void addUser(Object o, Course course) throws WrongObject, NotFoundElement {

        Admin tempAdmin = new Admin();
        boolean found = false;

        for (int i = 0; i < tempAdmin.adminAddedCourses.size() - 1 && !found ; ++i) {

            found = tempAdmin.adminAddedCourses.get(i).getCourseLecturer()
                    == tempAdmin.adminAddedCourses.get(i+1).getCourseLecturer()
                    && tempAdmin.adminAddedCourses.get(i).getId() == tempAdmin.adminAddedCourses.get(i).getId();
            //System.out.println(found);
            //adminAddedCourses.get(i).getCourseLecturer();
        }

        if (o instanceof Tutor && found) {

            if (course.getCourseLecturer().getName().equals(this.getName()) &&
                    course.getCourseLecturer().getSurname().equals(this.getSurname())) {

                course.addCourseToStudent((Student) o);
            }

        }

        else if (o instanceof Student && found) {

            if (course.getCourseLecturer().getName().equals(this.getName()) &&
                    course.getCourseLecturer().getSurname().equals(this.getSurname())) {

                course.addCourseToStudent((Student) o);
            }

        }

        else {

            throw new WrongObject("Wrong type object - " + o.getClass() + " - is tried to add by Teacher");
        }

        if (found == false) throw new NotFoundElement("Course not found");
    }

    /**
     * Remove user tutor or student to specified course
     * @param o student or tutor object
     * @param course course object
     * @throws WrongObject if object is not tutor or student
     * @throws NotFoundElement if course is not found
     */
    public void removeUser(Object o, Course course) throws WrongObject, NotFoundElement {

        Admin tempAdmin = new Admin();
        boolean found = false;

        for (int i = 0; i < tempAdmin.adminAddedCourses.size() - 1 && !found ; ++i) {

            found = tempAdmin.adminAddedCourses.get(i).getCourseLecturer()
                    == tempAdmin.adminAddedCourses.get(i+1).getCourseLecturer()
                    && tempAdmin.adminAddedCourses.get(i).getId() == tempAdmin.adminAddedCourses.get(i).getId();
            //System.out.println(found);
            //adminAddedCourses.get(i).getCourseLecturer();
        }

        if (o instanceof Tutor && found) {

            if (course.getCourseLecturer().getName().equals(this.getName()) &&
                    course.getCourseLecturer().getSurname().equals(this.getSurname())) {

                course.removeStudentFromCourse((Student) o);
            }
        }

        else if (o instanceof Student && found) {


            if (course.getCourseLecturer().getName().equals(this.getName()) &&
                    course.getCourseLecturer().getSurname().equals(this.getSurname())) {

                course.removeStudentFromCourse((Student) o);
            }

        }

        else {

            throw new WrongObject("Wrong type object - " + o.getClass() + " - is tried to delete by Teacher");
        }

        if (found == false) throw new NotFoundElement("Course not found");


    }

    /**
     * Add an assignment to the course
     * @param aObject assignment object
     * @param course  course objec
     * @param dueDate due date for the assignment
     * @param lateDueDate late submission date for the assignment
     */
    public void addAssignment(Assignment aObject, Course course, String dueDate,
                              String lateDueDate) {

        course.addAssignment(aObject);
        aObject.setDateLine(dueDate);
        aObject.setLateDateLine(lateDueDate);
    }

    /**
     * Add an assignment to the course
     * @param aObject assignment object
     * @param course  course objec
     * @param dueDate due date for the assignment
     */
    public void addAssignment(Assignment aObject, Course course, String dueDate) {

        course.addAssignment(aObject);
        aObject.setDateLine(dueDate);
    }

    /**
     * Add document to the course
     * @param dObject document type
     * @param course course object
     */
    public void addDoc(Document dObject, Course course) {

        course.addDoc(dObject);
    }

    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;

        if (object != null && object instanceof Teacher)
        {
            isEqual = (this.getId() == ((Teacher) object).getId() && this.getName().equals(((Teacher) object).getName())
                    && this.getSurname().equals(((Teacher) object).getSurname()));

        }

        return isEqual;
    }

}
