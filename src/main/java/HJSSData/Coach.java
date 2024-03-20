/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HJSSData;

/**
 *
 * @author Madar
 */
public class Coach {

    // Add a constructor that accepts a String parameter for the coach's name
    public Coach(String Cname) {
        this.Cname = Cname;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    private String Cname;

}
