/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Admin {
    private List<SimpleDoctor>strList = new ArrayList<>();
    private static Admin obj;
    public List<SimpleDoctor> getStrList() {
        return strList;
    }

    public void setStrList(List<SimpleDoctor> strList) {
        this.strList = strList;
    }
    private Admin(){
        strList = new ArrayList<>();
    }
    static Admin getInstance(){
        if(obj == null){
            obj = new Admin();
        }
        return obj;
    }
    
    void saveDoctorInfo(){
        try{
            FileWriter fr = new FileWriter("DoctorInfo.txt");
            for(int i = 0;i<strList.size();i++){
                fr.write(strList.get(i).getName() + "," +strList.get(i).getEmail() + "," + strList.get(i).getCnic() + "," + strList.get(i).getPassword() + "," + strList.get(i).getPhoneNumber() + "," + strList.get(i).getAddress()) ;
            }
            fr.flush();
            fr.close();
        }
        catch(Exception ex){
            
        }
    }
    void readData(){
        try{
            FileReader fr = new FileReader("DoctorInfo.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                String []arr = line.split(",");
                SimpleDoctor doc = new SimpleDoctor();
                doc.setName(arr[0]);
                doc.setEmail(arr[1]);
                doc.setCnic(arr[2]);
                doc.setPassword(arr[3]);
                doc.setPhoneNumber(arr[4]);
                doc.setAddress(arr[5]);
                strList.add(doc);
                line = br.readLine();
            }
        }
        catch(Exception ex){
            
        }
    }
    
}
