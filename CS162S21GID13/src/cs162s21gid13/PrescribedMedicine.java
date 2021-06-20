/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

/**
 *
 * @author DELL
 */
public class PrescribedMedicine {
    private String name;
    private String time;
    private String duration;

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
    
}
