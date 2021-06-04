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
public class EquipmentLog 
{
    private List<Equipment> EquipLog = new ArrayList<Equipment>();

    
    ///Getter
    public List<Equipment> getEquipLog() 
    {
        return EquipLog;
    }
    
    public Equipment getEquip(int index)
    {
        return this.EquipLog.get(index);
    }
    
    
    
    ////CRUD Operations
    public void addEquipment(Equipment e)
    {
        this.EquipLog.add(e);
    }
    
    public boolean editEquipment(Equipment e, int index)
    {
        if (index >= 0 && index <= this.EquipLog.size() ) 
        {
            this.EquipLog.set(index, e);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public boolean deleteEquipment(int index)
    {
        if (index >= 0 && index <= this.EquipLog.size() ) 
        {
            this.EquipLog.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    /////Find Operations
    
    public int findEquip_ByName(String str)
    {
        
        int index = -1;
        
        for (int i = 0; i < EquipLog.size(); i++) 
        {
           if(this.EquipLog.get(i).getName().equals(str))
           {
               index = i;
               break;
           }
            
        }
        
        return index;
    }
    
    public int findEquip_ByID(String str)
    {
        
        int index = -1;
        
        for (int i = 0; i < EquipLog.size(); i++) 
        {
           if(this.EquipLog.get(i).getEquipmentId().equals(str))
           {
               index = i;
               break;
           }
            
        }
        
        return index;
    }
    
    /**
     * Searches for equipment bought on the date passed and returns a list of the found equipment
     * @param dt Date type variable
     * @return List of type Equipment
     */
    
    public List<Equipment> findEquip_ByDateofPurchase(Date dt)
    {
        
        List <Equipment> list = new ArrayList<Equipment>();
        
        for (int i = 0; i < EquipLog.size(); i++) 
        {
            Equipment get = this.EquipLog.get(i);
           if(get.getDateofBuying().equals(dt))
           {
               list.add(get);
               break;
           }
            
        }
        
        return list;
    }
    
}
