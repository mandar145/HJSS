package HJSSData;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    /**
     * @return the Cname
     */
    public String getCname() {
        return Cname;
    }

    /**
     * @param Cname the Cname to set
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }
    private String Cname;
    private String coachID;
    private List<String> qualifications;
    private List<Lesson> lessons; // Assuming a Lesson class exists
    private double averageRating;
    
    public Coach(String coachID, String Cname) {
        this.coachID = coachID;
        this.Cname = Cname;
        this.qualifications = new ArrayList<>();
        this.lessons = new ArrayList<>();
        this.averageRating = 0.0;
    }

    // Getter and Setter for coachID
    public String getCoachID() {
        return coachID;
    }

    public void setCoachID(String coachID) {
        this.coachID = coachID;
    }

    // Existing getName and setName methods

    // Methods for qualifications
    public void addQualification(String qualification) {
        this.qualifications.add(qualification);
    }

    public List<String> getQualifications() {
        return qualifications;
    }

    // Methods for handling lessons
    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    // Methods for averageRating
    public double getAverageRating() {
        return averageRating;
    }

    public void updateRating(double newRating) {
        // This is a simplified way to update the average rating
        // You might need a more sophisticated method depending on how ratings are collected and averaged
        this.averageRating = newRating;
    }

    // Existing methods for Cname
}
