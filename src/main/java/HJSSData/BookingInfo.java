/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HJSSData;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Madar
 */
public class BookingInfo {

    public Date date;
    public String coachName;
    public int studentLevel;
    public int studentID;
    public String timeSlot;

    public BookingInfo(Date date, String coachName, int studentLevel, int studentID, String timeSlot) {
        this.date = date;
        this.coachName = coachName;
        this.studentLevel = studentLevel;
        this.studentID = studentID;
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Date: " + sdf.format(date) + ", Time Slot: " + timeSlot + ", Coach: " + coachName + ", Student Level: " + studentLevel + ", Student ID: " + studentID;
    }

}
