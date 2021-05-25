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
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.VoiceStatus;



public class MedicineRequestLog {
	List<MedicineRequest> medReqList = new ArrayList<>();

	// Accept Request
	public void acceptRequest(String reqId) {
		for (int i = 0; i < medReqList.size(); i++) {
			if (medReqList.get(i).getRequestId().equals(reqId)) {
				medReqList.get(i).setReqStatus("Accepted");
			}
		}
	}

	// Add Request
	public void addRequest(MedicineRequest obj) {
		if (obj != null) {
			medReqList.add(obj);
			
		}
	}

	// get request index
	public int getRequestIndex(String reqId) {
		int index = -1;
		for (int i = 0; i < medReqList.size(); i++) {
			if (medReqList.get(i).getRequestId().equals(reqId)) {
				index = i;
			}
		}
		return index;
	}

	// Remove Request
	public void removeRequest(int index) {
		medReqList.remove(index);
	}

	// Update Request
	public void updateRequest(int index, MedicineRequest obj) {
		medReqList.set(index, obj);
	}

	// Reject Request
	public void rejectRequest(String reqId) {
		for (int i = 0; i < medReqList.size(); i++) {
			if (medReqList.get(i).getRequestId().equals(reqId)) {
				medReqList.get(i).setReqStatus("Rejected");
			}
		}
	}
	//for getting request details
	public MedicineRequest getReqDetails(String tag) {
		MedicineRequest obj = new MedicineRequest();
		
		for(int i=0;i<medReqList.size();i++)
		{
			if(medReqList.get(i).equals(tag)) {
				obj = medReqList.get(i);
			}
		}
		return obj;
	}
	
	//for searching medicine request by patient id
	public List<MedicineRequest> searchReqByPatient(String patientId)
	{
		List<MedicineRequest>strList = new ArrayList<>();
		for(int i=0;i<medReqList.size();i++) {
			if(medReqList.get(i).getPatientId().equals(patientId)) {
				strList.add(medReqList.get(i));
			}
		}
		return strList;
	}

}

