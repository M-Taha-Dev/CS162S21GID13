/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

/**
 *
 * @author Ushher
 */
public class PatientBill {
    private String billTag;
    private int labBill;
    private int doctorFees;
    private double medicineBill;

    public PatientBill() 
    {
        this.billTag = null;
        this.labBill = 0;
        this.doctorFees = 0;
        this.medicineBill = 0.0;
        
    }
    

    
    
    
    //Getters and setters
    public String getBillTag() {
        return billTag;
    }

    public void setBillTag(String billTag) {
        this.billTag = billTag;
    }

    public int getLabBill() {
        return labBill;
    }

    public void setLabBill(int labBill) {
        this.labBill = labBill;
    }

    public int getDoctorFees() {
        return doctorFees;
    }

    public void setDoctorFees(int doctorFees) {
        this.doctorFees = doctorFees;
    }

    public double getMedicineBill() {
        return medicineBill;
    }

    public void setMedicineBill(double medicineBill) {
        this.medicineBill = medicineBill;
    }
    
    /////////////////////////////////////////////////////
    
    
    
    
}
