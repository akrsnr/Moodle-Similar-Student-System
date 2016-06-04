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
public class Qualities implements GetSet {

    private String name;
    private String surname;
    private int id = 0;

    // Getter - Setter Name

    /**
     * Setter for name
     * @param s specified string for name
     */
    public void setName(String s) {

        this.name = s;
    }

    /**
     * Getter for name
     * @return name as string
     */
    public String getName() {

        return this.name;
    }

    // Getter - Setter Surname

    /**
     * Setter for name
     * @param s specified string for surname
     */
    public void setSurname(String s) {

        this.surname = s;
    }

    /**
     * Getter for surname
     * @return name as string
     */
    public String getSurname() {

        return this.surname;
    }

    // Getter - Setter Id

    /**
     * Setter for id
     * @param val integer value
     */
    public void setId(int val) {

        this.id = val;
    }

    /**
     * Getter for id
     * @return integer value
     */
    public int getId() {

        return id;
    }

}