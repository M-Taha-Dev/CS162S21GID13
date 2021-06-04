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
public class PurchasedEquiplog 
{
    private List<Equipment> purchasedEquipLog = new ArrayList<Equipment>();

    
    ///Getter
    public List<Equipment> getPurchasedEquipLog() 
    {
        return purchasedEquipLog;
    }
    
    public Equipment getEquip(int index)
    {
        return this.purchasedEquipLog.get(index);
    }
    
    
    
    ////CRUD Operations
    public void addEquipment(Equipment e)
    {
        this.purchasedEquipLog.add(e);
    }
    
    public boolean editEquipment(Equipment e, int index)
    {
        if (index >= 0 && index <= this.purchasedEquipLog.size() ) 
        {
            this.purchasedEquipLog.set(index, e);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public boolean deleteEquipment(int index)
    {
        if (index >= 0 && index <= this.purchasedEquipLog.size() ) 
        {
            this.purchasedEquipLog.remove(index);
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
        
        for (int i = 0; i < purchasedEquipLog.size(); i++) 
        {
           if(this.purchasedEquipLog.get(i).getName().equals(str))
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
        
        for (int i = 0; i < purchasedEquipLog.size(); i++) 
        {
           if(this.purchasedEquipLog.get(i).getEquipmentId().equals(str))
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
        
        for (int i = 0; i < purchasedEquipLog.size(); i++) 
        {
            Equipment get = this.purchasedEquipLog.get(i);
           if(get.getDateofBuying().equals(dt))
           {
               list.add(get);
               break;
           }
            
        }
        
        return list;
    }
    
}
