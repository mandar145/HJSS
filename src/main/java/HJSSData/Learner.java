/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HJSSData;

import java.util.Random;

/**
 *
 * @author Madar
 */
public class Learner {
    private String name;
    private int age;
    private int level;
    private Long number;
    private int ID;
    private Random random = new Random();

    // Constructor
    public Learner(String name, int age, int level, Long number) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLevel() {
        return level;
    }

    public Long getNumber() {
        return number;
    }

    public int getID() {
        return ID;
    }

    public void setID() {
        ID = random.nextInt(1000);
    }
}