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
import java.util.*;
public class MedicineBillLog {
	List<MedicineBill>billList = new ArrayList<>();
	//add bill 
	public boolean addBill(MedicineBill obj) {
		if(obj != null) {
			billList.add(obj);
			return true;
		}
		else {
			return false;
		}
	}
	//search bill
//	public boolean searchBill
	    boolean checkTag(String tag) {
        boolean check = true;
        for (int i = 0; i < billList.size(); i++) {
            if (billList.get(i).getBillTag().equals(tag)) {
                check = false;
                break;
            }
        }
        return check;
    }
            
            //get bill lsit for patients
        List<MedicineBill>retrunBill(String id){
            List<MedicineBill>strList = new ArrayList<>();
            for(int i=0;i<billList.size();i++){
                if(billList.get(i).getPatientID().equals(id)){
                    strList.add(billList.get(i));
                }
            }
            return strList;
        }
        
        
       
}
