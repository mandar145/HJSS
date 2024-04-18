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

    public String DayTime;
    public String coachName;
    public int studentLevel;
    public int studentID;
    public String status;
    public String BookingID;

    public BookingInfo(String DayTime, String coachName, int studentLevel, int studentID, String status) {
        this.DayTime = DayTime;
        this.coachName = coachName;
        this.studentLevel = studentLevel;
        this.studentID = studentID;
        this.status = status;
        this.BookingID = generateBookingID();
    }

    /**
     * Generate a unique booking ID.
     */
    public static String generateBookingID() {
        return generateRandomString(3) + generateRandomNumber(4); // 3 letters and 4 numbers
    }

     //Generate a random string of letters.
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
    //Generate Random Number
        private static String generateRandomNumber(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));  // Append random digit
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "BookingID: " + BookingID + ", Day & Time: " + DayTime + ", Coach: " + coachName + ", Student Level: " + studentLevel + ", Student ID: " + studentID + ", Status: " + status;
    }

}
