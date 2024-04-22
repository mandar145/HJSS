/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package HJSSData;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Madar
 */
public class FeedbackTest {

    private Feedback feedback;
    private Learner mockLearner;
    private Lesson mockLesson;
    private Coach mockCoach;

    public FeedbackTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        // Create a coach with a valid ID and name
        mockCoach = new Coach("C001", "Jane Doe");
        // Create a lesson with a valid constructor
        mockLesson = new Lesson("Mathematics", 2, "Learn basic algebra", "Algebra", mockCoach);
        // Create a learner
        mockLearner = new Learner("John Doe", "Male", 10, 2, 1234567890L, "911");
        // Create feedback
        feedback = new Feedback(mockLearner, mockLesson, "Very good", 4);
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getReview method, of class Feedback.
     */
    @Test
    public void testGetReview() {
        String expectedReview = "Very good";
        String actualReview = feedback.getReview();
        assertEquals(expectedReview, actualReview, "Review should match the provided input.");
    }

    /**
     * Test of setReview method, of class Feedback.
     */
    @Test
    public void testSetReview() {
        String newReview = "Excellent";
        feedback.setReview(newReview);
        assertEquals(newReview, feedback.getReview(), "Review should be updated to the new value.");
    }

    /**
     * Test of getRating method, of class Feedback.
     */
    @Test
    public void testGetRating() {
        int expectedRating = 4;
        int actualRating = feedback.getRating();
        assertEquals(expectedRating, actualRating, "Rating should match the provided input.");
    }

    /**
     * Test of setRating method, of class Feedback.
     */
    @Test
    public void testSetRating() {
        int newRating = 5;
        feedback.setRating(newRating);
        assertEquals(newRating, feedback.getRating(), "Rating should be updated to the new value.");
    }
    /**
     * Test of getLearner method, of class Feedback.
     */
    @Test
    public void testGetLearner() {
        assertEquals(mockLearner, feedback.getLearner(), "Should return the correct learner.");
    }
    /**
     * Test of setLearner method, of class Feedback.
     */
    @Test
    public void testSetLearner() {
        Learner newLearner = new Learner("Alice", "Female", 11, 3, 9876543210L, "112");
        feedback.setLearner(newLearner);
        assertEquals(newLearner, feedback.getLearner(), "Learner should be updated to the new value.");
    }

    /**
     * Test of getLesson method, of class Feedback.
     */
    @Test
    public void testGetLesson() {
        assertEquals(mockLesson, feedback.getLesson(), "Should return the correct lesson.");
    }


    /**
     * Test of setLesson method, of class Feedback.
     */
    @Test
    public void testSetLesson() {
        Lesson newLesson = new Lesson("Science", 3, "Learn basic physics", "Physics", mockCoach);
        feedback.setLesson(newLesson);
        assertEquals(newLesson, feedback.getLesson(), "Lesson should be updated to the new value.");
    }

}
