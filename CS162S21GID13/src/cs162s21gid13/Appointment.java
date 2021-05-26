package prt;

import java.sql.Timestamp;
import java.util.*;

public class Appointment {
	private String appointmentNumber;
	private String patientId;
	private String doctorId;
	private Timestamp dateOfAppointmen;
	private String status;

	// Getters
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

}
