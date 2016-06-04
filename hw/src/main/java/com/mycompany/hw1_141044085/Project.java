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
public class Project {
    public static void main(String[] args) {

        /*
        *******
        *       Toplam 3 senaryo var
        *******
        */

        /*
            Document classı var ama document görme vs. yok
            Tutorun assignmentları görmesi yok
            Öğretmenin verdiği assignmenti silmesi yok
            Öğrencinin uploadı yok
        */

        // Scenario - 1
        /*
            Yeni bir hoca ve admin var. Hoca ekleniyor ve admin iki course ekliyor
            iki tane öğrenci var ve iki tane ders var bir aynı ders alınıyor
            ve bir farklı yani öğretmen öğrencileri sisteme kaydediyor
            ve öğrenci ekleme çıkarma işlemleri
        */

        Teacher tTeacher = new Teacher("Hacı Ali", "Mantar");

        Admin aAdmin = new Admin();

        Student sStudent = new Student("Ali", "Dayı", 99);
        Student sStudent2 = new Student("Veli", "Emmi", 13);

        Course c1 = new Course(tTeacher,  "Introduction to Computer Science", 101);
        Course c2 = new Course(tTeacher,  "Lab of Introduction to Computer Science", 107);

        aAdmin.addCourse(c1);
        aAdmin.addCourse(c2);
        aAdmin.showAddedCourses();

        System.out.println();

        try {
        tTeacher.addUser(sStudent, c1);
        tTeacher.addUser(sStudent2, c1);
        } catch (WrongObject e) {
            System.out.println(e);
        } catch (NotFoundElement e) {
            System.out.println(e);
        }

        // Duplicate testi
        sStudent.enrollToCourse(c1);
        sStudent2.enrollToCourse(c1);
        sStudent.enrollToCourse(c2);


        // Duplicate testi
        try {
            tTeacher.addUser(sStudent, c1);
            tTeacher.addUser(sStudent2, c1);
        } catch (WrongObject e) {
            System.out.println(e);
        } catch (NotFoundElement e) {
            System.out.println(e);
        }

        // ilk öğrencinin aldığı dersler
        sStudent.listMyCourses();

        System.out.println();

        // dersin öğrencileri
        c1.showStudentsOfTheCourse();

        // ilk öğrenciyi sil
        try {

            tTeacher.removeUser(sStudent, c1);
        } catch (NotFoundElement e) {
            System.out.println(e);
        } catch (WrongObject e) {
            System.out.println(e);
        }

        System.out.println("\nafter removing");
        c1.showStudentsOfTheCourse();

        // Scenario - 2
        /*
            c1 yani ana derse 2 assignment yükleniyor,
            bir tanesi geç yükleme tarihli bir tanesi sadece
            yükleme tarhli ve dersin ödevleri ekrana yazılıyor
         */

        Assignment testAssignment = new Assignment("Research Languages");
        Assignment testAssignment2 = new Assignment("Hello World Python");
        System.out.println();
        tTeacher.addAssignment(testAssignment, c1, "25-02-2016");
        tTeacher.addAssignment(testAssignment2, c1, "30-11-2016", "01-12-2016");
        c1.showAssignments();

        // Scenario - 3
        /*
            Öğretmen dersine admin eklemeyemez eklerse hata
            Öğretmen kendi kendini veya başka öğretmeni çıkaramaz hata
         */

        System.out.println();
        try {
            tTeacher.addUser(aAdmin, c1);
        } catch (WrongObject e) {
            System.out.println(e);
        } catch (NotFoundElement e) {
            System.out.println(e);
        }

        try {
            tTeacher.removeUser(tTeacher, c1);
        } catch (WrongObject e) {
            System.out.println(e);
        } catch (NotFoundElement e) {
            System.out.println(e);
        }

    }
}
