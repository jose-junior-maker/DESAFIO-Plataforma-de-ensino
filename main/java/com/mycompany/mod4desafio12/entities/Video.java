/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mod4desafio12.entities;

/**
 *
 * @author usuario
 */
public class Video extends Lesson{
    
    private String url;
    private int seconds;

    public Video() {
    }

    public Video(String url, int seconds, String title) {
        super(title);
        this.url = url;
        this.seconds = seconds;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public int duration() {
        return seconds;
    }
    
}
