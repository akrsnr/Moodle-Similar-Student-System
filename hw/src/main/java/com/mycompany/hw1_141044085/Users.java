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
public abstract class Users extends Qualities {
    protected static ArrayList<Student> students  = new ArrayList<>();
    protected static ArrayList<Tutor> tutors  = new ArrayList<>();
    protected static ArrayList<Teacher> teachers  = new ArrayList<>();
    protected static ArrayList<Admin> admins  = new ArrayList<>();

    /**
     * Add user for current object in class type
     * @param o changeable according to class type
     * @throws WrongObject handle unknown object
     */
    public abstract void addUser(Object o) throws WrongObject;

    /**
     * Remove user for current object in class type
     * @param o changeable according to class type
     * @throws WrongObject handle unknown object
     * @throws NotFoundElement handle if element doesn't exist in arraylist
     */
    public abstract void removeUser(Object o) throws WrongObject, NotFoundElement;


}
