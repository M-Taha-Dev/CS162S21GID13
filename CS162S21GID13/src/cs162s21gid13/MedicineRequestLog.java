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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.VoiceStatus;
import javax.swing.JOptionPane;



public class MedicineRequestLog {
	List<MedicineRequest> medReqList = new ArrayList<>();
        
<<<<<<< Updated upstream

=======
      
        
>>>>>>> Stashed changes
	// Accept Request
	public void acceptRequest(String reqId) {
		for (int i = 0; i < medReqList.size(); i++) {
			if (medReqList.get(i).getRequestId().equals(reqId)) {
				medReqList.get(i).setReqStatus("Added to Cart");
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
			if(medReqList.get(i).getRequestId().equals(tag)) {
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
        
        //Add medicine to a specific request
        
        
        void addMedicine(String reqNo, String name){
            for(int i=0;i<medReqList.size();i++){
                if(medReqList.get(i).getRequestId().equals(reqNo)){
                    medReqList.get(i).RequestedMedicine.add(name);
                    //JOptionPane.showMessageDialog(null, "Hello!");
                    Medicine o = new Medicine();
                    o.setMedicineName(name);
                    medReqList.get(i).getMedReqList().add(o);
                }
            }
        }
        
        
        void readRequest(){
            try{
                FileReader fr = new FileReader("PharmacyRequests.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line!= null){
                    String arr[] = line.split(",");
                    MedicineRequest obj = new MedicineRequest();
                    obj.setRequestId(arr[0]);
                    obj.setPatientId(arr[1]);
                    obj.setReqStatus(arr[2]);
                    medReqList.add(obj);
                    line = br.readLine();
                }
            }catch(Exception ex){
                System.err.println("Error");
            }
        }
        void readMedicineRequest(){
            try{
                FileReader fr =new FileReader("MedicineRequestLog.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null){
                    String arr[] = line.split(",");
                    addMedicine(arr[0], arr[1]);
                    line = br.readLine();
                }
            }catch(IOException IO){
                System.out.println("Error!");
            }
        }

        //Getter
        
        public MedicineRequest getRequest(int index)
        {
            return this.medReqList.get(index);
        }
                        
        public List<MedicineRequest> getList()
        {
            return this.medReqList;
        }
        
        
}

