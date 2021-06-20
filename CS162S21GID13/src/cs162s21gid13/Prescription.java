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
public class Prescription {
    private String DoctorID, PatientID, Diagnosis, TestRecommended, prescriptionTag;
    private Date dateofCheckup;
    private List<Medicine> medList = new ArrayList<Medicine>();

    /// Getters and Setters
    
    public List<Medicine> getMedList() {
        return medList;
    }
    
    public String getPrescriptionTag() {    
        return prescriptionTag;
    }

    public void setPrescriptionTag(String prescriptionTag) {
        this.prescriptionTag = prescriptionTag;
    }

    public Date getDateofCheckup() {
        return dateofCheckup;
    }
    
    public void setDateofCheckup(Date dateofCheckup) {
        this.dateofCheckup = dateofCheckup;
    }

    public String getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public String getTestRecommended() {
        return TestRecommended;
    }

    public void setTestRecommended(String TestRecommended) {
        this.TestRecommended = TestRecommended;
    }
    
    
}
