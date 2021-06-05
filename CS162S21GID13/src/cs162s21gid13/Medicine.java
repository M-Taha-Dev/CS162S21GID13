/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.sql.Timestamp;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Medicine {

    private String medicineName;
    private Timestamp expiryDate;
   // private int noOfTablets;
    static private String medicineTag;
    private String status;
    private int medicineCost;
    private String Potency;
    
    

    //getters
    
    public String getStatus() {
		return status;
    }
    //Getters
    public String getMedicineName() {
		return medicineName;

	}

   /* public String getMedicineName() {
        return medicineName;
    }*/
    public Timestamp getExpiryDate() {
		return expiryDate;
	}
   // public int getNoOfTablets() {
	//	return noOfTablets;
	//}
    public String getMedicineTag() {
		return medicineTag;
	}
    public int getMedicineCost() {
		return medicineCost;
	}
    
    
    public String getPotency() {
        return Potency;
    }
    //setters

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}
    public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
   // public void setNoOfTablets(int noOfTablets) {
	//	this.noOfTablets = noOfTablets;
	//}
    public void setMedicineTag(String medicineTag) {
		this.medicineTag = medicineTag;
	}
    public void setMedicineCost(int medicineCost) {
		this.medicineCost = medicineCost;
	}

       static public String generateID() {
        char arr[] = new char[9];
        boolean flag = false;
        String var = "";
        while(flag == false)
        {
        arr[0] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
        arr[1] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
        arr[2] = (char) (new Random().nextInt(90 - 65 + 1) + 65);
        arr[3] = '-';
        arr[4] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        arr[5] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        arr[6] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        arr[7] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        arr[8] = (char) (new Random().nextInt(57 - 48 + 1) + 48);
        
        var = String.valueOf(arr);
        flag = PharmacyManager.getInstance().checkTag(var);
        }
        return var;
    }



    public void setPotency(String Potency) {
        this.Potency = Potency;
    }
    
    

}
