/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod4desafio12.entities;

/**
 *
 * @author usuario
 */
public class Task extends Lesson{
    
    private String description;
    private int questionCount;

    public Task() {
    }

    public Task(String description, int questionCount, String title) {
        super(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    @Override
    public int duration() {
        return questionCount * 300;
    }
    
    
}
