/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HJSSData;

/**
 *
 * @author Madar
 */
public class Feedback {

    private String review;
    private int rating;
    private Learner learner; // Reference to the learner who provided the feedback
    private Lesson lesson; // Reference to the lesson the feedback is for

    // Constructor
    public Feedback(Learner learner, Lesson lesson, String review, int rating) {
        this.learner = learner;
        this.lesson = lesson;
        this.review = review;
        this.setRating(rating); // Use the setter to apply any rating constraints
    }

    // Getters and Setters
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    // Ensure the rating is within a valid range (e.g., 1 to 5)
    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 1 and 5.");
        }
    }

    public Learner getLearner() {
        return learner;
    }

    // Consider whether you need to allow changing the learner after feedback creation
    public void setLearner(Learner learner) {
        this.learner = learner;
    }

    public Lesson getLesson() {
        return lesson;
    }

    // Consider whether you need to allow changing the lesson after feedback creation
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

}
