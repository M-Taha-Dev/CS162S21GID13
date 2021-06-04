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
public class Equipment 
{
    String Name;
    String ModelNumber;
    String EquipmentId;
    Date   DateofBuying;
    String CompanyName;
    int cost;
    List <Date> RepairDates = new ArrayList<Date>();
    
    // Getters and setters
    
    public int getCost() {
        return cost;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }
   
    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getEquipmentId() {
        return EquipmentId;
    }

    public void setEquipmentId(String EquipmentId) {
        this.EquipmentId = EquipmentId;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getDateofBuying() {
        return DateofBuying;
    }

    public void setDateofBuying(Date DateofBuying) {
        this.DateofBuying = DateofBuying;
    }
    
    public List<Date> getRepairDates() {
        return RepairDates;
    }

    public void addRepairDate(Date dt)
    {
        this.RepairDates.add(dt);
    }
    
    public Date getDate(int index)
    {
       return this.RepairDates.get(index);
    }
    
    
}
