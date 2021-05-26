/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ushher
 */
public class MedicalHistory {
   private List<Prescription> presList = new ArrayList<Prescription>();

    public List<Prescription> getPresList() {
        return presList;
    }
    
    
   //////CRUD operations
    
    public void addPrescription(Prescription pres)
    {
        this.presList.add(pres);
    }
    
    public boolean editPrescription(Prescription pres, int index)
    {
        if (index >= 0 && index <= this.presList.size() ) 
        {
            this.presList.set(index, pres);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean deletePrescription(int index)
    {
        if (index >= 0 && index <= this.presList.size() ) 
        {
            this.presList.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    /////////////////////////////////////////////////////////
    
    /**
     * Returns index of prescription after searching by tag
     * @param tag String
     * @return index in list
     */
    public int findPrescription_byTag(String tag)
    {
        int index = -1;
        
        for (int i = 0; i < presList.size(); i++) 
        {
            Prescription get = presList.get(i);
            if(get.getPrescriptionTag().equals(tag))
            {
                index = i;
                break;
            }
            
        }
        
        return index;
    }
    
    /**
     * Returns index of prescription after searching by Date
     * @param date Date
     * @return index in list
     */
    public int findPrescription_byDate(Date date)
    {
        int index = -1;
        
        for (int i = 0; i < presList.size(); i++) 
        {
            Prescription get = presList.get(i);
            if(get.getDateofCheckup() == date)
            {
                index = i;
                break;
            }
            
        }
        
        return index;
    }
    
}
