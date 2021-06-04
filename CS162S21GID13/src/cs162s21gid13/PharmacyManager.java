/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class PharmacyManager {

    private static PharmacyManager obj;
    Medicine medicineObj = new Medicine();
    MedicineBill medicineBillObj = new MedicineBill();
    MedicineBillLog billLogObj = new MedicineBillLog();
    MedicineRequestLog requestLog = new MedicineRequestLog();
    MedicineLog medLog = new MedicineLog();
    
    
    
    
    private PharmacyManager() {
         medLog.medicineList = new ArrayList<>();
        // readMedicine();
       //  requestLog.readRequest();
         //requestLog.readMedicineRequest();
        // JOptionPane.showMessageDialog(null, "Hello there");
    }//
    static PharmacyManager getInstance(){
        if(obj == null){
            obj = new PharmacyManager();
        }
        return obj;
    }
    
    
    
    void readMedicine(){
        try {
            FileReader fr = new FileReader("MedicineLog.txt");
            BufferedReader br = new BufferedReader(fr);
            String input = br.readLine();
            Medicine obj = new Medicine();  
            while(input != null){
                obj = new Medicine();
                String arr[] = input.split(",");
                obj.setMedicineTag(arr[0]);
                obj.setMedicineName(arr[1]);
                obj.setMedicineCost(Integer.parseInt(arr[2]));
               // obj.setExpiryDate(Timestamp.valueOf(arr[3]));
                input = br.readLine();
                medLog.medicineList.add(obj);
            }
                    
        } catch (Exception e) {
            
        }
    }
    
    boolean checkTag(String tag) {
        boolean check = true;
        for (int i = 0; i < medLog.medicineList.size(); i++) {
            if (medLog.medicineList.get(i).getMedicineTag().equals(tag)) {
                check = false;
                break;
            }
        }
        return check;
    }
    
    
    
    
    
    
    
    
    
    
}
