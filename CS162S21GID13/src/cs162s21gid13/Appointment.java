package cs162s21gid13;

import java.sql.Timestamp;
import java.util.*;

public class Appointment {

    private String appointmentNumber;
    private String patientId;
    private String doctorId;
    private Timestamp dateOfAppointmen;
    private Date date;
    private String status;
    // N/A corresponds to unoccupied times
 //   private String[] times = {"N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A"};
  //  private String[] appointmentTiming;
   // int expiredDate;
    private static int instanceNo = 0;
    public Appointment(){
        instanceNo++;
    }
    
    
    // Getters

    
    
    public Date getDate() {
        return date;
    }

  /*  public String[] getAppointmentTiming() {
        return appointmentTiming;
    }*/
    
    
   /* public String[] getTimes() {
        return times;
    }
*/
    public String getAppointmentNumber() {
        return appointmentNumber;
    }

    public Timestamp getDateOfAppointmen() {
        return dateOfAppointmen;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getStatus() {
        return status;
    }

    // Setters

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    /*public void setAppointmentTiming(String[] appointmentTiming) {
        this.appointmentTiming = appointmentTiming;
    }*/

   /* public void setTimes(String dates[]) {
        this.times = dates;
    }*/
    
    public void setAppointmentNumber(String appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public void setDateOfAppointmen() {
        Date dtDate = new Date();
        String varString = "";
        varString += dtDate;

        this.dateOfAppointmen = Timestamp.valueOf(varString);

    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //Methods
    void generateAppointmentNumber(){
        
    }

}
