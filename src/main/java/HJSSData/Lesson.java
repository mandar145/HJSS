/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HJSSData;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Madar
 */
public class Lesson {
    // Attributes
    private String lessonId;
    private int gradeLevel;
    private String timeSlot;
    private String day;
    private final int maxCapacity = 4;
    private List<Learner> enrolledLearners;
    private Coach coach;
    private List<Feedback> feedbackList; // Assuming a Feedback class exists
    
    
        public Lesson(String lessonId, int gradeLevel, String timeSlot, String day, Coach coach) {
        this.lessonId = lessonId;
        this.gradeLevel = gradeLevel;
        this.timeSlot = timeSlot;
        this.day = day;
        this.coach = coach;
        this.enrolledLearners = new ArrayList<>();
        this.feedbackList = new ArrayList<>();
    }
    // Constructor and other methods...
    public boolean enrollLearner(Learner learner) {
        if (enrolledLearners.size() < maxCapacity) {
            enrolledLearners.add(learner);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeLearner(Learner learner) {
        return enrolledLearners.remove(learner);
    }

    // Feedback methods
    public void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
    }

    public double calculateAverageRating() {
        if (feedbackList.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Feedback feedback : feedbackList) {
            total += feedback.getRating();
        }
        return total / feedbackList.size();
    }

        
        
    // Getters
    public String getLessonId() {
        return lessonId;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public String getDay() {
        return day;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Learner> getEnrolledLearners() {
        return enrolledLearners;
    }

    public Coach getCoach() {
        return coach;
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    // Setters
    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setDay(String day) {
        this.day = day;
    }

    // No setter for maxCapacity as it's final

    // Note: Typically, we do not provide a setter for collections like enrolledLearners and feedbackList.
    // Instead, we manage the collection through methods that add or remove items.
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    // Add and remove methods for `enrolledLearners` and `feedbackList` are already defined.
}
