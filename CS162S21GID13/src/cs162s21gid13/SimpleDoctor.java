package cs162s21gid13;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.util.*;

public class SimpleDoctor extends Person {

    private String doctorId = "";
    private String category = "General";
    private List<Patient> patientList = new ArrayList<>();
    
    private String[] times = {"N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A"};

    //Setters
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   /* public void setAppLog(AppointmentLog appLog) {
        this.appLog = appLog;
    }*/
    // Getters

    public String getDoctorId() {
        return doctorId;
    }

    public String getCategory() {
        return category;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

   /* public AppointmentLog getAppLog() {
        return appLog;
    }*/

  /*  Stack<String> getAvailableTime(int day) {
        Stack<String> strStack = new Stack();
        for (int i = 0; i < appLog.getAppointmentList().size(); i++) {
            Appointment o = new Appointment();
            o = appLog.getAppointmentList().get(i);
            if (o.getDate().getDate() == day) {
                String arr[];
                for (int k = 0; k < times.length; k++) {
                    if (times[i].equals("NA")) {
                        if (i == 0) {
                            strStack.push("8:00 - 8:30 am");
                        } else if (i == 1) {
                            strStack.push("8:30 - 8:30 am");
                        } else if (i == 2) {
                            strStack.push("9:00 - 9:30 am");
                        } else if (i == 3) {
                            strStack.push("9:30 - 10:00 am");
                        } else if (i == 4) {
                            strStack.push("10:00 - 10:30 am");
                        } else if (i == 5) {
                            strStack.push("10:30 - 11:00 am");
                        } else if (i == 6) {
                            strStack.push("11:00 - 11:30 am");
                        } else if (i == 7) {
                            strStack.push("11:30 - 12:00 am");
                        } else if (i == 8) {
                            strStack.push("1:00 - 1:30 pm");
                        } else if (i == 9) {
                            strStack.push("1:30 - 2:00 pm");
                        }
                    }
                }
            }
        }
        if (strStack.empty()) {
            strStack.push("8:00 - 8:30 am");
            strStack.push("8:30 - 8:30 am");
            strStack.push("9:00 - 9:30 am");
            strStack.push("9:30 - 10:00 am");
            strStack.push("10:00 - 10:30 am");
            strStack.push("10:30 - 11:00 am");
            strStack.push("11:00 - 11:30 am");
            strStack.push("11:30 - 12:00 am");
            strStack.push("1:00 - 1:30 pm");
            strStack.push("1:30 - 2:00 pm");
        }
        return strStack;
    }
    
    void resetSchedule(){
        String arr[] = {"N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A"};
        for(int i=0;i<10;i++){
            times[i] = arr[i];
        }
    }
    

    int getIndex(String time){
        String arr[] = {"8:00 - 8:30 am","8:30 - 8:30 am","9:00 - 9:30 am","9:30 - 10:00 am","10:00 - 10:30 am","10:30 - 11:00 am","11:00 - 11:30 am","11:30 - 12:00 am","1:00 - 1:30 pm","1:30 - 2:00 pm"};
        for(int i=0;i<10;i++){
            if(time.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
    */
    
   /* boolean bookAppointment(String time, int Date) {
        int index = getIndex(time);
        for (int i = 0; i < appLog.getAppointmentList().size(); i++) {
                if(appLog.getAppointmentList().get(i).getDate().getDate() == Date){
                    
                }
        }
    }*/

    
    
    
    
    
    
    
}
