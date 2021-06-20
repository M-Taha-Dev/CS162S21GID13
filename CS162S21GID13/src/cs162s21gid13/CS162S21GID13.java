/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author DELL
 */
public class CS162S21GID13 {

    /**
     * @param args the command line arguments
     */
    static void readPrescription(){
        try{
            FileReader fr = new FileReader("PrescriptionInfo.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            Prescription obj = new Prescription();
         
            while(line != null){
                String s1[] = line.split(";");
                System.out.println("1");
                obj.setPrescriptionTag(s1[0]);
                System.out.println("2");
                Patient obj1 = PatientLog.getInstatnce().returnPatient(s1[0]);
                System.out.println("3");
                 String s2[] = s1[1].split(",");
                System.out.println("4");
                String[] s3;
              System.out.println("5");
                 int i =0;
                 do{
                    s3 = s2[i].split(":");
                    System.out.println("6");
                    PrescribedMedicine o = new PrescribedMedicine();
                    System.out.println("7");
                    o.setName(s3[0]);
                    o.setTime(s3[1]);
                    o.setDuration(s3[2]);
                    System.out.println("8");
                    obj.getpMed().add(o);
                    System.out.println("9");
                    if(obj1 == null){
                        System.out.println("9");
                    }
                    obj1.setLatestPres(obj);
                    
                    System.out.println("Output: " + obj.getpMed().size());
                    i++;
                 }while(i < s2.length);
                line = br.readLine();
            }
        }
        catch(Exception ex){
            
        }
    }
    
    static void readPrescriptionDetails(){
        try{
            FileReader fr = new FileReader("PrescriptionsDetails.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            //fr.write(pPatientID.getText() + "," + generateID() + "," +new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            while(line != null){
                String arr[] = line.split(",");
                Prescription o = MedicalHistory.getInstance().getPrescriptionByEmail(arr[0]);
                o.setPrescriptionTag(arr[1]);
                o.setDateofCheckup(new SimpleDateFormat("dd/MM/yyyy").parse(arr[2]));
            }
        }
        catch(Exception ex){
            
        }
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Admin.getInstance().readData();
        PatientLog.getInstatnce().readPatient();
        PharmacyManager.getInstance().readMedicine();
        PharmacyManager.getInstance().requestLog.readRequest();
        PharmacyManager.getInstance().requestLog.readMedicineRequest();
        readPrescription();
        LoginFrame obj1 = new LoginFrame();
        obj1.setVisible(true);
      /*  SimpleDoctor obj = new SimpleDoctor();
        obj.setAddress("Lahore,Punjab");
        obj.setAge("32");
        obj.setName("Muhammad Taha");
        obj.setCnic("4250141382629");
        obj.setEmail("taha@gmail.com");
        obj.setCategory("General Doctor");
      //  obj.*/
    }
    
}
