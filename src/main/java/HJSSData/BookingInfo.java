/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HJSSData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Madar
 */
public class BookingInfo {

    public int Week;
    public String DayTime;
    public String Time;
    public String coachName;
    public int studentLevel;
    public int studentID;
    public String status;
    public String BookingID;

    // Constructor for new bookings
    public BookingInfo(int Week,String DayTime,String Time, String coachName, int studentLevel, int studentID, String status) {
        
        this.Week = Week;
        this.DayTime = DayTime;
        this.Time = Time;
        this.coachName = coachName;
        this.studentLevel = studentLevel;
        this.studentID = studentID;
        this.status = status;
        this.BookingID = generateBookingID(); // Only generate for new bookings
    }

    // Constructor for existing bookings (from CSV)
    public BookingInfo(int Week,String DayTime,String Time, String coachName, int studentLevel, int studentID, String status, String BookingID) {
        this.Week = Week;
        this.DayTime = DayTime;
        this.Time = Time;
        this.coachName = coachName;
        this.studentLevel = studentLevel;
        this.studentID = studentID;
        this.status = status;
        this.BookingID = BookingID; // Use existing BookingID
    }

    public static String generateBookingID() {
        return generateRandomString(3) + generateRandomNumber(4);
    }

    private static String generateRandomString(int length) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    private static String generateRandomNumber(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

@Override
public String toString() {
    return "BookingID: " + BookingID + ", Week: " + Week +", Day: " + DayTime +", Time: " + Time + ", Coach: " + coachName
           + ", Learner Grade: " + studentLevel + ", Learner ID: " + studentID + ", Status: " + status;
}

}
