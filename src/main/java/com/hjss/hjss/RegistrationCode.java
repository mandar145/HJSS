/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hjss.hjss;

/**
 *
 * @author Madar
 */
public class RegistrationCode {
    
    private String name; 
    private int age;
    private int level;
    private int ID;
    
    //constructor
    public RegistrationCode(String name,int age, int level, int ID){
        this.name = name;
        this.age=age;
        this.level=level;
        this.ID=ID;
            }
    
    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
    public int getLevel()
    {
        return level;
    }   
    public int getID()
    {
        return ID;
    }       
    
}
