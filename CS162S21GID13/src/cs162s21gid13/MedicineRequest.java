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
import java.sql.Timestamp;
import java.util.*;
public class MedicineRequest 
{
	private List<Medicine> medReqList = new ArrayList<>();
	private String patientId;
	private String doctorIdString;
	private Timestamp reqDate;
	private String requestId;
	private String reqStatus;
        List<String>RequestedMedicine = new ArrayList<>();
	
	// Getters
	public String getReqStatus() {
		return reqStatus;
	}
	public String getRequestId() {
		return requestId;
	}
	public String getDoctorIdString() {
		return doctorIdString;
	}

	public List<Medicine> getMedReqList() {
		return medReqList;
	}

	public MedicineRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getPatientId() {
		return patientId;
	}

	public Timestamp getReqDate() {
		return reqDate;
	}

	// Setters
	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public void setDoctorIdString(String doctorIdString) {
		this.doctorIdString = doctorIdString;
	}

	public void setMedReqList(List<Medicine> medReqList) {
		this.medReqList = medReqList;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setReqDate() {
		Date dtDate = new Date();
		String varString = "";
		varString += dtDate;
		Timestamp dateTimestamp = Timestamp.valueOf(varString);
		this.reqDate = dateTimestamp;
	}

    /*public void setReqDate(Timestamp reqDate) {
        this.reqDate = reqDate;
    }*/
        

}
