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
public class WrongObject extends Exception {

    public WrongObject() {}

    /**
     * Constructor that accepts a message
     * @param message User-typed message
     */
    public WrongObject(String message) {

        super(message);
    }
}