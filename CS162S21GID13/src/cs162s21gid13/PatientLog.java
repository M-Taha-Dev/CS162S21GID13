/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

/**
 *
 * @author DELL
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class PatientLog {
    private static PatientLog obj;
    List<Patient> pList;
    HashSet<Patient> patientSet = new HashSet<>();
    private PatientLog(){
        pList = new ArrayList<>();
    }
    
    public static PatientLog getInstatnce(){
        if(obj == null){
            obj = new PatientLog();
        }
        return obj;
    }
    
    void addPatient(Patient obj) {
        pList.add(obj);
    }

    void addPatientSet(Patient obj) {
        patientSet.add(obj);
    }

    Patient returnPatient(String IDString) {
        Patient obj = new Patient();
        for (int i = 0; i < patientSet.size(); i++) {
            obj = (Patient) patientSet.toArray()[i];
            if (obj.getId().equals(IDString)) {
                return obj;
            }
        }
        return null;
    }

    static void readDoctor() {
    /*    try {
            FileReader fr = new FileReader("DoctorData.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            Doctor obj = new SpecialistDocotr();
            while (line != null) {
                obj = new SpecialistDocotr();
                String arr[] = line.split(",");
                obj.DataDoctor.setDoctorId(arr[0]);
                obj.DataDoctor.name = arr[1];
                obj.DataDoctor.cnic = arr[2];
                obj.DataDoctor.email = arr[3];
                obj.DataDoctor.phoneNumber = arr[4];
                DoctorMain.dList.add(obj);
                PatientFrame.dList.add(obj);
                line = br.readLine();
            }
        } catch (Exception ex) {

        }*/
    
    }
    
    public void savePatientData(){
        try{
            FileWriter fw = new FileWriter("PatientData.txt");
            for (int i=0;i<PatientLog.getInstatnce().pList.size();i++){
                Patient obj = PatientLog.getInstatnce().pList.get(i);
                   fw.write(obj.getName() + ",");
                fw.write(obj.getCnic() + ",");
                fw.write(obj.getEmail() + ",");
                fw.write(obj.getPassword());
                fw.write(obj.getPhoneNumber() + "\n");
            }
            fw.flush();
            fw.close();
        }catch(Exception ex){
            
        }
    }
    
    
    
    
    void readPatient() {
        try {
            FileReader fr = new FileReader("PatientData.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();          
            while (line != null) {         
                String arr[] = line.split(",");
                Patient obj = new Patient();           
                obj.setName(arr[0]);
                obj.setCnic(arr[1]);
                obj.setEmail(arr[2]);
                obj.setPassword(arr[3]);
                obj.setPhoneNumber(arr[4]);
                PatientLog.getInstatnce().pList.add(obj);
                line = br.readLine();
            }
            fr.close();
        } catch (Exception ex) {

        }
    }

}
