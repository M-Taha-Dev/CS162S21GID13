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
    public void updateMedicine(int index, Medicine obj) {
        if (obj != null) {
            medicineList.set(index, obj);
        }
    }

    //for viewing medicine details
    public Medicine getMedicineDetails(int index) {
        return medicineList.get(index);
    }

    //For checking medicines
    
    public boolean checkMedicine(String name){
        for(int i=0;i<medicineList.size();i++){
            if(medicineList.get(i).getMedicineName().equals(name)){
                return true;
            }
        }
        return false;
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

    public int medicineCount(String name) {
        int count = 0;
        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getMedicineName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public void buildCart(MedicineRequest obj) {
       
        obj.setReqStatus("Added to cart");
        boolean check = false;
        for (int i = 0; i < obj.getMedReqList().size(); i++) {
            if (medicineCount(obj.getMedReqList().get(i).getMedicineName()) > 0) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            obj.setReqStatus("Added to Cart");
            for (int i = 0; i < obj.getMedReqList().size(); i++) {
                for (int k = 0; k < medicineList.size(); k++) {

                    if (obj.getMedReqList().get(i).getMedicineName().equals(medicineList.get(k).getMedicineName())) {
                        obj.getMedReqList().get(i).setMedicineCost(medicineList.get(k).getMedicineCost());
                        obj.getMedReqList().get(i).setMedicineName(medicineList.get(k).getMedicineName());
                        obj.getMedReqList().get(i).setMedicineTag(medicineList.get(k).getMedicineTag());
                        obj.getMedReqList().get(i).setExpiryDate(medicineList.get(k).getExpiryDate());
                        medicineList.get(k).setStatus("Added to Cart");
                        break;
                    }
                }
            }
        } else {
            obj.setReqStatus("Failed to process the request");
        }
    }

}
