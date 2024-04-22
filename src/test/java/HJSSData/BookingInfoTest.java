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
public class BookingInfoTest {
    
    public BookingInfoTest() {
    }
    
    @Test
    public void testGenerateBookingID() {
        System.out.println("Testing generateBookingID");
        String result = BookingInfo.generateBookingID();
        assertNotNull(result, "Booking ID should not be null");
        assertTrue(result.matches("[A-Z]{3}\\d{4}"), "Booking ID should match the pattern ABC1234");
    }
    /**
     * Test of toString method, of class BookingInfo.
     */
    @Test
    public void testToString() {
        System.out.println("Testing toString");
        BookingInfo instance = new BookingInfo(1, "Monday", "10:00 AM", "Coach John", 3, 123, "booked");
        String expectedFormat = "BookingID: " + instance.BookingID + ", Week: 1, Day: Monday, Time: 10:00 AM, Coach: Coach John, Learner Grade: 3, Learner ID: 123, Status: booked";
        String result = instance.toString();
        assertEquals(expectedFormat, result, "toString output does not match expected format.");
    }
    
        @Test
    public void testConstructorWithNewBooking() {
        BookingInfo instance = new BookingInfo(1, "Monday", "10:00 AM", "Coach John", 3, 123, "booked");
        assertEquals(1, instance.Week, "Week should match constructor input");
        assertEquals("Monday", instance.DayTime, "DayTime should match constructor input");
        assertEquals("10:00 AM", instance.Time, "Time should match constructor input");
        assertEquals("Coach John", instance.coachName, "Coach name should match constructor input");
        assertEquals(3, instance.studentLevel, "Student level should match constructor input");
        assertEquals(123, instance.studentID, "Student ID should match constructor input");
        assertEquals("booked", instance.status, "Status should match constructor input");
        assertNotNull(instance.BookingID, "Booking ID should not be null");
    }
    
        @Test
    public void testConstructorWithExistingBooking() {
        String existingID = "XYZ1234";
        BookingInfo instance = new BookingInfo(1, "Tuesday", "11:00 AM", "Coach Jane", 2, 456, "completed", existingID);
        assertEquals(existingID, instance.BookingID, "Existing Booking ID should be retained");
    }
    
    
}
