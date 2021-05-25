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
	
}
