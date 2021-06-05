package cs162s21gid13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AppointmentLog {
	static List<Appointment>appointmentList = new ArrayList<>();
	// add appointment 
	public void addAppointment(Appointment obj) {
		if(obj != null) {
			appointmentList.add(obj);
		}
	}
	
	// accept appointment 
	
	public void acceptAppointment(String appNo) {
		for(int i=0;i<appointmentList.size();i++) {
			if(appointmentList.get(i).getAppointmentNumber().equals(appNo)) {
				appointmentList.get(i).setStatus("Scheduled");
			}
		}
	}
	
	// reject appointment reque
	public void rejectAppointment(String appNo) {
		for (int i= 0;i<appointmentList.size();i++) {
			if(appointmentList.get(i).getAppointmentNumber().equals(appNo)) {
				appointmentList.get(i).setStatus("Rejected");
			}
		}
	}
	
	// completing appointment 
	public void completeAppointment (String appNo) {
		for (int i= 0;i<appointmentList.size();i++) {
			if(appointmentList.get(i).getAppointmentNumber().equals(appNo)) {
				appointmentList.get(i).setStatus("Completed");
			}
		}
	}
	
	// remove appointment 
	public void removeAppointment(String appNo) {
		for(int i=0;i<appointmentList.size();i++) {
			if(appointmentList.get(i).getAppointmentNumber().equals(appNo)) {
				appointmentList.remove(i);
			}
		}
	}
	
	// to get appointment index
	public int getAppointmentIndex(String appNo) {
		for (int i=0;i<appointmentList.size();i++)
		{
			if(appointmentList.get(i).getAppointmentNumber().equals(appNo)) {
				return i;
			}
		}
		return -1;
	}
	
	// to update appointment 
	public void updateAppointmentIndex (int index, Appointment obj) {
		appointmentList.set(index, obj);
	}
        
        void readAppointmentRequest(){
            try{
                FileReader fr = new FileReader("AppointmentRequest.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null){
                    String arr[] = line.split(",");
                    Appointment obj = new Appointment();
                    obj.setAppointmentNumber(arr[0]);
                    obj.setPatientId(arr[1]);      
                    appointmentList.add(obj);
                    line = br.readLine();
                  //  obj.setDateOfAppointmen(arr[2]);
                }
            }catch(Exception ex){
        }
        }
        
                void readPatientData(){
            try{
                FileReader fr = new FileReader("PatientData.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null){
                    String arr[] = line.split(",");
                    Patient obj = new Patient();
                    obj.setId(arr[0]);
                    obj.setName(arr[1]);
                    SimpleDoctor.patientList.add(obj);
                  //obj.setDateOfAppointmen(arr[2]);
                }
            }catch(Exception ex){
        }
        }
        
	
	
	
}
