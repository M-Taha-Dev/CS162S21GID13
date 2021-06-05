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
public class DonorLog 
{
    List<Donor> DonorList = new ArrayList<Donor>();

    
    
    //Getter
    public List<Donor> getDonorList() {
        return DonorList;
    }
    
    public Donor getDonor(int index)
    {
        return this.DonorList.get(index);
    }
      
    
    ///CRUD Operations
    
    public void addDonor(Donor donor)
    {
        this.DonorList.add(donor);
    }
    
    public boolean editDonor(Donor donor,int index)
    {
        if (index >= 0 && index <= this.DonorList.size() ) 
        {
            this.DonorList.set(index, donor);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public boolean deleteDonor(int index)
    {
        if (index >= 0 && index <= this.DonorList.size() ) 
        {
            this.DonorList.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //////FIND Operations
    
    /**
     * Returns List of Donor after searching by tag
     * @param tag String
     * @return  list
     */
    public List<Donor> findDonor_byName(String Name)
    {
        List<Donor> list = new ArrayList<>();
        
        for (int i = 0; i < this.DonorList.size(); i++) 
        {
            Donor get = DonorList.get(i);
            if(get.getName().equals(Name))
            {
                list.add(get);
            }
            
        }
        
        return list;
    }
    
    /**
     * Returns index of Donor after searching by CNIC
     * @param CNIC String
     * @return index in list
     */
    public int findDonor_byCNIC(String cnic)
    {
        int index = -1;
        
        for (int i = 0; i < this.DonorList.size(); i++) 
        {
            Donor get = this.DonorList.get(i);
            if(get.getCnic().equals(cnic))
            {
                index = i;
                break;
            }
            
        }
        
        return index;
    }
    
    /**
     * Returns List of Donor after searching by BloodGroup
     * @param bloodGroup String
     * @return  list
     */
    public List<Donor> findDonor_byBloodGroup(String bloodGroup)
    {
        List<Donor> list = new ArrayList<>();
        
        for (int i = 0; i < this.DonorList.size(); i++) 
        {
            Donor get = DonorList.get(i);
            if(get.getBloodType().equals(bloodGroup))
            {
                list.add(get);
            }
            
        }
        
        return list;
    }
    
}
