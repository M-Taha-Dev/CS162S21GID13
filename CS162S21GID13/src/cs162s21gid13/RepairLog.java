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
public class RepairLog 
{
    private List <Equipment> repairLog = new ArrayList<>();
    
    
    //Getter
    public List<Equipment> getRepairLog() 
    {
        return repairLog;
    }
    
    
    public Equipment getRepairedEquipment(int index)
    {
        return this.repairLog.get(index);
    }
    
    ///CRUD operations 
    
    public void addRepairs(Equipment rpequip)
    {
        this.repairLog.add(rpequip);
    }
    
    //Find Operations
    
    /**
     * Finds object in the repair log 
     * @param e 'Equipment' Type Object
     * @return index of the object in the log
     */
    public int findRepairedEquip_byID(String id)
    {
        int index = -1;
         for (int i = 0; i < repairLog.size(); i++) 
         {
            if(repairLog.get(i).getEquipmentId().equals(id))
            {
                index = i;
                break;
            }
        }
         
         return index;
    }  
    
    
    /**
     * Finds Repaired equipment based on their repair dates and returns a list
     * @param dt 'Date' Type var, for searching
     * @return list of type 'Equipment'
     */
    public List<Equipment> findRepairedEquip_byDates(Date dt)
    {
        List <Equipment> list = new ArrayList<>();
        for (int i = 0; i < repairLog.size(); i++) 
        {
            Equipment get = repairLog.get(i);
            if(get.getDate(i).equals(dt))
            {
                list.add(get);
            }
        }
        
        return list;
    }
    
    
    
    
    
}
