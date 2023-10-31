/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod4desafio12.entities;

/**
 *
 * @author usuario
 */
public abstract class Lesson {
    
    private String title;

    public Lesson() {
    }

    public Lesson(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public abstract int duration();
    
}
