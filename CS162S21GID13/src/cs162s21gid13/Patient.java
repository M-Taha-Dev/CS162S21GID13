/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
/**
 *
 * @author Ushher
 */
public class Patient extends Person {
    
  private String Id;
  private PatientBilling finance;
  private MedicalHistory history;
  private Prescription latestPres;
  private MedicineRequestLog medRequests;
  private LabTestLog labTests;
  
  
    /*public Patient(String Id, String password, PatientBilling finance, MedicalHistory history, Prescription latestPres, MedicineRequestLog medRequests) {
        this.Id = Id;
        this.finance = finance;
        this.history = history;
        this.latestPres = latestPres;
        this.medRequests = medRequests;
    }*/
  
    //Getters and Setters

    public void setpassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    /**
     * For displaying Finance Data
     * @return Stack
     */
    public Stack<PatientBill> viewFinance() 
    {
        Stack<PatientBill> financeStack = new Stack<PatientBill>();
        
        for (int i = 0; i < this.finance.getBillList().size(); i++) 
        {
            financeStack.push(finance.returnBillObject(i));
            
        }
        
        return financeStack;
    }

    public void setFinance(PatientBilling finance) {
        this.finance = finance;
    }
    
    /**
     * For displaying History Data
     * @return Stack
     */
    public Stack<Prescription> viewHistory() 
    {
        Stack<Prescription> prescriptionStack = new Stack<Prescription>();
        
        for (int i = 0; i < this.history.getPresList().size(); i++)
        {
            prescriptionStack.push(history.getPrescription(i));
            
        }
        
        return prescriptionStack;
    }
    
    /**
     * For displaying Requests for Medicines
     * @return Stack
     */
    
    public Stack<MedicineRequest> viewMedRequestsHistory()
    {
        Stack<MedicineRequest> MedReqStack = new Stack<MedicineRequest>();
        
        for (int i = 0; i < this.medRequests.getList().size(); i++)
        {
            MedReqStack.push(medRequests.getRequest(i));
            
        }
        
        return MedReqStack;
    }
    
    /**
     * For displaying LabTest History
     * @return Stack 
     */
    public Stack<LabTest> viewLabTestsHistory()
    {
        Stack<LabTest> LabTestStack = new Stack<LabTest>();
        
        for (int i = 0; i < this.labTests.getTestLog().size(); i++)
        {
            LabTestStack.push(labTests.getLabTest(i));
            
        }
        
        return LabTestStack;
    }
    
    
    public void setHistory(MedicalHistory history) {
        this.history = history;
    }

    public Prescription getLatestPres() {
        return latestPres;
    }

    public void setLatestPres(Prescription latestPres) {
        this.latestPres = latestPres;
    }
  
    /**
     * For displaying Medicine Requests data
     * @return Stack
     */
    public Stack<MedicineRequest> viewMedicineRequests()
    {
        Stack<MedicineRequest> medReqStack = new Stack<MedicineRequest>();
        
        for (int i = 0; i < this.medRequests.getList().size(); i++)
        {
            medReqStack.push(this.medRequests.getRequest(i)); 
        }
        
        return medReqStack;
    }

    public List<PatientBill> getFinanceList() 
    {
        return finance.getBillList();
    }

    public List<Prescription> getHistory() 
    {
        return history.getPresList();
    }

    public List<MedicineRequest> getMedRequests() {
        return medRequests.getList();
    }
  
}
