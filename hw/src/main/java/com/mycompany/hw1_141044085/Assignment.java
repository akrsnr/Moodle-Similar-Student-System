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
public class Assignment {

    private String assignmentName;
    private String dateLine;
    private String lateDateLine;

    /** Three parameter ctor */
    public Assignment(String assignmentName, String dateLine, String lateDateLine) {
        this.assignmentName = assignmentName;
        this.dateLine = dateLine;
        this.lateDateLine = lateDateLine;
    }

    /** Two parameter ctor */
    public Assignment(String assignmentName, String dateLine) {
        this.assignmentName = assignmentName;
        this.dateLine = dateLine;
    }

    /** ONe parameter ctor */
    public Assignment(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * Setter for due date
     * @param dateLine due date as string
     */
    public void setDateLine(String dateLine) {
        this.dateLine = dateLine;
    }

    /**
     * Setter for due date
     * @param lateDateLine late due date as string
     */
    public void setLateDateLine(String lateDateLine) {
        this.lateDateLine = lateDateLine;
    }

    /**
     * Getter for due date
     * @return due date
     */
    public String getDateLine() {
        return dateLine;
    }

    /**
     * Getter for late due date
     * @return late due date
     */
    public String getLateDateLine() {
        return lateDateLine;
    }

    @Override
    public String toString() {
        return
                "assignmentName = '" + assignmentName + '\'' +
                        ", dateLine = '" + dateLine + '\'' +
                        ", lateDateLine = '" + lateDateLine + '\'';
    }

    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;

        if (object != null && object instanceof Assignment)
        {
            isEqual = this.assignmentName.equals(((Assignment) object).assignmentName)
                    && this.dateLine.equals(((Assignment) object).dateLine)
                    && this.lateDateLine.equals(((Assignment) object).lateDateLine);
        }

        return isEqual;
    }
}