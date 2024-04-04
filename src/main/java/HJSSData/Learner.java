/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HJSSData;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;


/**
 *
 * @author Madar
 */
public class Learner {
    
    private static int nextId = 1; // Static counter to ensure unique IDs
    private String name;
    private String gender;
    private int age;
    private int level;
    private Long number; // Consider renaming to phoneNumber for clarity
    private String emergencyContact;
    private int ID;
    private List<BookingInfo> bookings; // Assuming a Booking class exists
   // Constructor
    public Learner(String name, String gender, int age, int level, Long number, String emergencyContact) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.level = level;
        this.number = number;
        this.emergencyContact = emergencyContact;
        this.ID = getNextUniqueId();
        this.bookings = new ArrayList<>();
    }
    
    
    // Unique ID generation method
    private synchronized static int getNextUniqueId() {
        return nextId++;
    }

    // Getters and setters, and other methods

    // Booking management methods adjusted for BookingInfo
    public void addBooking(BookingInfo booking) {
        bookings.add(booking);
    }

    public boolean cancelBooking(BookingInfo booking) {
        return bookings.remove(booking);
    }

    // Feedback submission method
    public void submitFeedbackForLesson(Lesson lesson, String review, int rating) {
        // This assumes you have a way to associate the feedback with the lesson
    }

    // Update learner level
    public void updateLevel(int newLevel) {
        if (newLevel > this.level) {
            this.level = newLevel;
        }
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
    
}