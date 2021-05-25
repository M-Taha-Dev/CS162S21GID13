/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author DELL
 */
public class MedicineLog {
   List<Medicine> medicineList = new ArrayList<>();

	// for adding medicine
	public boolean addMedicine(Medicine obj) {
		if (obj != null) {
			
			medicineList.add(obj);
			return true;
		} else {
			return false;
		}
	}

	// for returning index of medicine on basis of their tag
	public int getMedIndex(String tag) {

		int index = -1;
		for (int i = 0; i < medicineList.size(); i++) {
			if (medicineList.get(i).getMedicineTag().equals(tag)) {
				index = i;
			}
		}
		return index;
	}
	
	//for deleting medicine
	public void deleteMedicine(int index) {
			medicineList.remove(index);
	}
	
	//for updating medicine
	public void updateMedicine(int index, Medicine obj)
	{
		if(obj != null) {
			medicineList.set(index, obj);
		}
	}
	
	//for viewing medicine details
	public Medicine getMedicineDetails(int index) {
		return medicineList.get(index);
	}

	// for searching medicine
	public List<Medicine> searchMedicineByName(String name) {
		List<Medicine> medList = new ArrayList<>();
		for (int i = 0; i < medicineList.size(); i++) {
			if (medicineList.get(i).getMedicineName().equals(name)) {
				medList.add(medicineList.get(i));
			}
		}
		return medList;
	}
	     
}
