/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.sql.Timestamp;

/**
 *
 * @author DELL
 */
public class Medicine {

    private String medicineName;
    private Timestamp expiryDate;
    private int noOfTablets;
    private String medicineTag;
    private int medicineCost;
    
    
    //getters
    public String getMedicineName() {
		return medicineName;
	}
    public Timestamp getExpiryDate() {
		return expiryDate;
	}
    public int getNoOfTablets() {
		return noOfTablets;
	}
    public String getMedicineTag() {
		return medicineTag;
	}
    public int getMedicineCost() {
		return medicineCost;
	}
    //setters
    public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}
    public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
    public void setNoOfTablets(int noOfTablets) {
		this.noOfTablets = noOfTablets;
	}
    public void setMedicineTag(String medicineTag) {
		this.medicineTag = medicineTag;
	}
    public void setMedicineCost(int medicineCost) {
		this.medicineCost = medicineCost;
	}
}
