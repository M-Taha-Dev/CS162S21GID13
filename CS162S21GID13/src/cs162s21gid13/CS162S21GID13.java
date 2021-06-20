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
public class CS162S21GID13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin.getInstance().readData();
        PatientLog.getInstatnce().readPatient();
        PharmacyManager.getInstance().readMedicine();
        PharmacyManager.getInstance().requestLog.readRequest();
        PharmacyManager.getInstance().requestLog.readMedicineRequest();
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
