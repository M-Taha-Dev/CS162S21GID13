/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ushher
 */
public class PatientBlling {
    
   private List <PatientBill> billList = new ArrayList<PatientBill>();

    // Getter for List
    public List<PatientBill> getBillList() {
        return billList;
    }
    
    //CRUD Operations
    public void addBill(PatientBill bill)
    {
        this.billList.add(bill);
    }
    
    public boolean editBill(PatientBill bill, int index)
    {
        
        if (index >= 0 && index <= this.billList.size())         
        {
            this.billList.set(index, bill);
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public boolean deleteBill(int index)
    {
        if (index >= 0 && index <= this.billList.size())         
        {
            this.billList.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //////////////////////////////
    
    /**
     * To find a particular bill in the list
     * 
     * @param billtag 
     * @return index of the object in the list
     * returns -1 if not found
     */
    public int findBill(String billtag)
    {
        int index = -1;
        
        for (int i = 0; i < billList.size(); i++) 
        {
            PatientBill get = billList.get(i);
            
            if(get.getBillTag().equals(billtag))
            {
                index = i;
                break;
            }
            
        }
        
        return index;
    }

    /**
     * To Return a bill object from the list
     * 
     * @param index the Index of the bill
     * @return Object of Type PatientBill
     * returns null If index is invalid
     */
    public PatientBill returnBillObject(int index)
    {
        if (index >= 0 && index <= this.billList.size()) 
        {
            return this.billList.get(index);
        }
        else
        {
            return null;
        }
    }
    
    
}
