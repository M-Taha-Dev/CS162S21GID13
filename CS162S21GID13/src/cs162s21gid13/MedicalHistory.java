/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sun.security.jca.GetInstance;

/**
 *
 * @author Ushher
 */
public class MedicalHistory {
   private List<Prescription> presList = new ArrayList<Prescription>();
   static MedicalHistory obj ;
    static MedicalHistory getInstance(){
        if(obj == null){
            obj = new MedicalHistory();
        }
        return obj;
    }
   
   //Getter
    public List<Prescription> getPresList() {
        return presList;
    }
    
    
   //////CRUD operations
    
    public void addPrescription(Prescription pres)
    {
        this.presList.add(pres);
    }
    
    Patient getPatientIDByPresID(String id){
        for(int i=0;i<presList.size();i++){
            if(presList.get(i).getPrescriptionTag().equals(id)){
                return  PatientLog.getInstatnce().returnPatient(presList.get(i).getPatientID());
            }
        }
        return null;
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
            if(get.getDateofCheckup().equals(date))
            {
                index = i;
                break;
            }
            
        }
        
        return index;
    }
    
    
    /**
     * 
     * @param index index of the prescription list
     * @return Prescription Object if Index Valid, Otherwise returns null
     */
    public Prescription getPrescription(int index)
    {
        if(index >=0 && index <= this.presList.size())
        {
            return this.presList.get(index);
        }
        else
        {
            return null;
        }
    }
    
    boolean checkPrescripiton(String tag){
        for (int i=0;i<presList.size();i++){
            if(presList.get(i).getPrescriptionTag().equals(tag)){
                return false;
            }
        }
        return true;
    }
    
    Prescription getPrescriptionByEmail(String email){
        for(int i=0;i<PatientLog.getInstatnce().pList.size();i++)
        {
            if(PatientLog.getInstatnce().pList.get(i).getEmail().equals(email)){
                return PatientLog.getInstatnce().pList.get(i).getLatestPres();
            }
        }
        return null;
    }
    
}
