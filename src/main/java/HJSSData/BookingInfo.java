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

    /**
     *
     * @author Madar
     */
    public class BookingInfo {

        public String DayTime;
        public String coachName;
        public int studentLevel;
        public int studentID;

        public BookingInfo(String DayTime, String coachName, int studentLevel, int studentID) {
            this.DayTime = DayTime;
            this.coachName = coachName;
            this.studentLevel = studentLevel;
            this.studentID = studentID;
        }



        @Override
        public String toString() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            return "Day & Time: " + DayTime + ", Coach: " + coachName + ", Student Level: " + studentLevel + ", Student ID: " + studentID;
        }

    }
