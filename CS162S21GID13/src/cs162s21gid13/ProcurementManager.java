/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.List;

/**
 *
 * @author Ushher
 */
public class ProcurementManager 
{
    EquipmentLog equipLog;
    PurchasedEquiplog purchasedEquiplog;

    
    
    public List<Equipment> viewEquipLog() {
        return equipLog.getEquipLog();
    }

    public List<Equipment> viewPurchasedEquiplog() {
        return purchasedEquiplog.getPurchasedEquipLog();
    }
    
    
    
    
}
