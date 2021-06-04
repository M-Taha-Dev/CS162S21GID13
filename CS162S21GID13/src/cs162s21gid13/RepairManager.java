/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ushher
 */
public class RepairManager 
{
    RepairLog repairlog;
    EquipmentLog equiplog;

    public List<Equipment> viewRepairlog() {
        return repairlog.getRepairLog();
    }

    public List<Equipment> viewEquiplog() {
        return equiplog.getEquipLog();
    }
    
    public Equipment SearchEquipment(String str)
    {
        int index = equiplog.findEquip_ByName(str);
        return equiplog.getEquip(index);
    }
    
    
    /**
     *Function for repair equipment. Takes equipment and date, then adds the date to the Equipment's list of repair dates 
     * @param e 'Equipment' Type object
     * @param dt 'Date' type variable
     */
    public void RepairEquipment(Equipment e, Date dt)
    {
        e.addRepairDate(dt);
        repairlog.addRepairs(e);
    }
    
    
}
