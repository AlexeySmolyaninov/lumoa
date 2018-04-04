/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexey.lumoa.jsontocsv.entity;

/**
 *
 * @author user
 */
public class UserInput {
    private String destination;
    private String newFile;
    private String json;
    private String arrayName;

    public String getNewFile() {
        return newFile;
    }

    public void setNewFile(String newFile) {
        this.newFile = newFile;
    }

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
