package cs162s21gid13;

import java.util.ArrayList;
import java.util.List;

public class AppointmentLog {
	List<Appointment>appointmentList = new ArrayList<>();
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
	
	// reject appointment request
	
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
	
	
	
}
