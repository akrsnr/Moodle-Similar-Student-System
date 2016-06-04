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
public class Tutor extends Student {

    /** No parameter ctor */
    public Tutor() {

        super();
    }

    /** Three parameter ctor */
    public Tutor(String name, String surname, int id) {

        super(name, surname, id);
    }

    @Override
    public String toString() {

        return "Name => " + this.getName() + "\t" + "Surname => " + this.getSurname()
                + "\t" + "Number => " + this.getId() + "\n";
    }

    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;

        if (object != null && object instanceof Tutor)
        {
            isEqual = (this.getId() == ((Tutor) object).getId() && this.getName().equals(((Tutor) object).getName())
                    && this.getSurname().equals(((Tutor) object).getSurname()));
        }

        return isEqual;
    }
}