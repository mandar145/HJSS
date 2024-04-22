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
public class LearnerTest {

    private Learner learner;

    public LearnerTest() {

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

        learner = new Learner("John Doe", "Male", 25, 1, 1234567890L, "911");

    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addBooking method, of class Learner.
     */
    @Test
    public void testAddBooking() {
        BookingInfo booking = new BookingInfo(1, "Monday", "10:00 AM - 11:00 AM", "Coach A", 1, learner.getID(), "booked");
        learner.addBooking(booking);
        assertTrue(learner.getBookings().contains(booking), "Booking should be added.");
    }

    /**
     * Test of cancelBooking method, of class Learner.
     */
    @Test
    public void testCancelBooking() {
        BookingInfo booking = new BookingInfo(1, "Tuesday", "11:00 AM - 12:00 PM", "Coach B", 1, learner.getID(), "booked");
        learner.addBooking(booking);
        assertTrue(learner.cancelBooking(booking), "Booking should be cancellable.");
        assertFalse(learner.getBookings().contains(booking), "Booking should be removed.");
    }

    /**
     * Test of updateLevel method, of class Learner.
     */
    @Test
    public void testUpdateLevel() {
        int newLevel = 2;
        learner.updateLevel(newLevel);
        assertEquals(newLevel, learner.getLevel(), "Level should be updated to the higher level.");
    }

    /**
     * Test of getName method, of class Learner.
     */
    @Test
    public void testGetName() {
        assertEquals("John Doe", learner.getName(), "Name should match.");
    }

    /**
     * Test of getAge method, of class Learner.
     */
    @Test
    public void testGetAge() {
        assertEquals(25, learner.getAge(), "Age should match.");
    }

    /**
     * Test of getLevel method, of class Learner.
     */
    @Test
    public void testGetLevel() {
        assertEquals(1, learner.getLevel(), "Initial level should match.");
    }

    /**
     * Test of getNumber method, of class Learner.
     */
    @Test
    public void testGetNumber() {
        assertEquals(1234567890L, learner.getNumber(), "Phone number should match.");
    }

    /**
     * Test of getID method, of class Learner.
     */
    @Test
    public void testGetID() {
        System.out.println("Testing getID");
        int id = learner.getID();
        assertTrue(id > 0, "ID should be greater than zero.");  // Check that ID is positive
    }

    @Test
    public void testGetBookings() {
        BookingInfo booking1 = new BookingInfo(1, "Monday", "10:00 AM - 11:00 AM", "Coach A", 1, learner.getID(), "booked");
        BookingInfo booking2 = new BookingInfo(1, "Wednesday", "11:00 AM - 12:00 PM", "Coach B", 1, learner.getID(), "booked");
        learner.addBooking(booking1);
        learner.addBooking(booking2);
        assertEquals(2, learner.getBookings().size(), "There should be two bookings.");
        assertTrue(learner.getBookings().contains(booking1) && learner.getBookings().contains(booking2), "Both bookings should be present.");
    }

}
