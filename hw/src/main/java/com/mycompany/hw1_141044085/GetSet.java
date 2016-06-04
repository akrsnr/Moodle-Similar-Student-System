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
public interface GetSet {

    /**
     * Overall setter for name of the stuffs
     * @param s specified string for name
     */
    void setName(String s);

    /**
     * Overall getter for name of the stuffs
     * @return stuff name as string
     */
    String getName();

    /**
     * Overall setter for numbers indicating stuffs
     * @param val integer value
     */
    void setId(int val);

    /**
     * Overall getter for numbers indicating stuffs
     * @return integer value
     */
    int getId();
}
