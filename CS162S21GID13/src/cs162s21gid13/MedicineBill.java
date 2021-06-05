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
import java.sql.Timestamp;

public class MedicineBill {

    private String billTag;
    private String patientID;
    private String doctorID;
    private double totalCost;
    private Timestamp billDate;
    private List<Medicine> medList = new ArrayList<>();

    // Getters
    public List<Medicine> getMedList() {
        return medList;
    }

    public String getBillTag() {
        return billTag;
    }

    public Timestamp getBillDate() {
        return billDate;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public double getTotalCost() {
        return totalCost;
    }
    // Setters  

    public void setMedList(List<Medicine> medList) {
        this.medList = medList;
    }

    public void setBillTag(String billTag) {
        this.billTag = billTag;
    }

    public void setBillDate() {
        Date dtDate = new Date();
        String varString = "";
        varString += dtDate;
//        this.billDate = Timestamp.valueOf(varString);
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    static public String generateID() {
        char arr[] = new char[10];
        boolean flag = false;
        String var = "";
        while (flag == false) {
            arr[0] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
            arr[1] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
            arr[2] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
            arr[3] = '-';
            arr[4] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
            arr[5] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
            arr[6] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
            arr[7] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
            arr[8] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
            arr[9] = (char) (new Random().nextInt(57 - 48 + 1) + 48);

            var = String.valueOf(arr);
            flag = PharmacyManager.getInstance().billLogObj.checkTag(var);
        }
        return var;
    }
    void addMedicine(Medicine objMedicine){
        medList.add(objMedicine);
    }
 

}
