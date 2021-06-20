/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ushher
 */
public class Transfusion 
{
    private Donor donor;
    private String ReciepientName;
    private String TimeofTransfusion;

    public Transfusion(Donor donor, String ReciepientName, String TimeofTransfusion) {
        this.donor = donor;
        this.ReciepientName = ReciepientName;
        this.TimeofTransfusion = TimeofTransfusion;
    }

    public Transfusion() 
    {
        this.setTimeofTransfusion();
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public String getReciepientName() {
        return ReciepientName;
    }

    public void setReciepientName(String ReciepientName) {
        this.ReciepientName = ReciepientName;
    }

    public String getTimeofTransfusion() {
        return TimeofTransfusion;
    }

    public void setTimeofTransfusion() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        this.TimeofTransfusion = date + "";
        
    }
    
    
    
}
