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
public class Document {

    private String documentFormat;

    /** One parameter ctor */
    public Document(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * Getter for type of the document
     * @return type of the document
     */
    public String getDocumentFormat() {
        return documentFormat;
    }

    /**
     * Setter for type of the document
     * @param documentFormat indicates document type like ppt,doc
     */
    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }
}
