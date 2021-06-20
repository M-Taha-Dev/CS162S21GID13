/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Ushher
 */
public class BloodrequestLog 
{
    private static List<BloodRequest> bloodReqlog;
    
    private static BloodrequestLog object = new BloodrequestLog();

    private BloodrequestLog() 
    {
        bloodReqlog = new ArrayList<BloodRequest>();
    }
    
    
    ////GET Object
    public static BloodrequestLog getInstance()
    {
        if(object == null)
        {
            object = new BloodrequestLog();
        }
        
        return object;
    }
    
    //Getter
    public List<BloodRequest> getBloodReqlog() 
    {
        return bloodReqlog;
    }
    
    public BloodRequest getBloodRequest(int index)
    {
        return BloodrequestLog.bloodReqlog.get(index);
    }
    
    //View
    
    public static Stack<BloodRequest> viewBloodRequestLog()
    {
        Stack<BloodRequest> stack = new Stack<BloodRequest>();
        
        for (int i = 0; i < BloodrequestLog.bloodReqlog.size(); i++) 
        {
            BloodRequest get = bloodReqlog.get(i);
            stack.push(get);
            
        }
        
        return stack;
    }
    
    ///CRUD Operations
    
    public void addBloodRequest(BloodRequest bloodreq)
    {
        this.bloodReqlog.add(bloodreq);
    }
    
    public boolean editRequest(BloodRequest bloodreq, int index)
    {
        if (index >= 0 && index <= this.bloodReqlog.size() ) 
        {
            BloodrequestLog.bloodReqlog.set(index, bloodreq);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean deletePrescription(int index)
    {
        if (index >= 0 && index <= BloodrequestLog.bloodReqlog.size() ) 
        {
            BloodrequestLog.bloodReqlog.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /////////
    //Find Operations
    
    /**
     * Returns a list of BloodRequests objects
     * @param Name String
     * @return list
     */
    public List<BloodRequest> FindRequests_byReciepientName(String Name)
    {
        List<BloodRequest> list = new ArrayList<>();
        
        for (int i = 0; i < BloodrequestLog.bloodReqlog.size(); i++) 
        {
            BloodRequest get = list.get(i);
            
            if(get.getReciepientName().equals(Name))
            {
                list.add(get);
            }
        }
        
        return list;
    }
    
    /**
     * Returns a list of BloodRequests objects
     * @param CNIC string
     * @return list
     */
    public List<BloodRequest> FindRequests_byReciepientCNIC(String CNIC)
    {
        List<BloodRequest> list = new ArrayList<>();
        
        for (int i = 0; i < BloodrequestLog.bloodReqlog.size(); i++) 
        {
            BloodRequest get = list.get(i);
            
            if(get.getReciepientCNIC().equals(CNIC))
            {
                list.add(get);
            }
        }
        
        return list;
    }
    
    /**
     * Returns a list of BloodRequests objects
     * @param bloodGroup String
     * @return list
     */
    public List<BloodRequest> FindRequests_byBloodGroup(String bloodGroup)
    {
        List<BloodRequest> list = new ArrayList<>();
        
        for (int i = 0; i < BloodrequestLog.bloodReqlog.size(); i++) 
        {
            BloodRequest get = list.get(i);
            
            if(get.getBloodType().equals(bloodGroup))
            {
                list.add(get);
            }
        }
        
        return list;
    }
    
}


    
    
    
    
    

