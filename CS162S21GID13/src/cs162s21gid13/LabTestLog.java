/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Ushher
 */
public class LabTestLog 
{
    
    private List<LabTest> TestLog = new ArrayList<LabTest>();

    //Getter
    public List<LabTest> getTestLog() {
        return this.TestLog;
    }
    
    //CRUD Operations
    
    public void addLabTest(LabTest labtest)
    {
        this.TestLog.add(labtest);
    }
    
     public boolean editLabTest(LabTest labtest, int index)
    {
        if (index >= 0 && index <= this.TestLog.size() ) 
        {
            this.TestLog.set(index, labtest);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean deleteLabTest(int index)
    {
        if (index >= 0 && index <= this.TestLog.size() ) 
        {
            this.TestLog.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //Finding Operations
    
    /**
     * Returns List of LabTest after searching by LabDoctorID
     * @param ID String
     * @return  list of LabTests, If no Object is found returns an empty lIST
     */
    public List<LabTest> findLabTest_byLabDoctorID(String ID)
    {
        List<LabTest> list = new ArrayList<>();
        
        for (int i = 0; i < this.TestLog.size(); i++) 
        {
            LabTest get = this.TestLog.get(i);
            
            if(get.getLabDoctorId().equals(ID))
            {
               list.add(get);
                break;
            }
            
        }
        
        return list;
    }
    
    /**
     * Returns index of LabTest after searching by Date
     * @param date Date
     * @return index in list
     */
    public int findLabTest_byDate(Date date)
    {
        int index = -1;
        
        for (int i = 0; i < this.TestLog.size(); i++) 
        {
            LabTest get = this.TestLog.get(i);
            if(get.getDateofTest().equals(date))
            {
                index = i;
                break;
            }
            
        }
        
        return index;
    }
    
    
    /**
     * 
     * @param index index of the LabTest list
     * @return LabTest Object if Index is Valid, Otherwise returns null
     */
    public LabTest getLabTest(int index)
    {
        if(index >=0 && index <= this.TestLog.size())
        {
            return this.TestLog.get(index);
        }
        else
        {
            return null;
        }
    }
    
}
