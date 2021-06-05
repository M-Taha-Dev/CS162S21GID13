/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.Date;

/**
 *
 * @author Ushher
 */
public class BloodRequest 
{
    private String reciepientName;
    private String reciepientCNIC;
    private String BloodType;
    private String amountofBlood;
    private String status = "Pending";
    private Date Timestamp;

    public String getStatus() {
        return status;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public String getReciepientName() {
        return reciepientName;
    }

    public void setReciepientName(String reciepientName) {
        this.reciepientName = reciepientName;
    }

    public String getReciepientCNIC() {
        return reciepientCNIC;
    }

    public void setReciepientCNIC(String reciepientCNIC) {
        this.reciepientCNIC = reciepientCNIC;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getAmountofBlood() {
        return amountofBlood;
    }

    public void setAmountofBlood(String amountofBlood) {
        this.amountofBlood = amountofBlood;
    }
    
    
    
    
    
}
