package cs162s21gid13;

import java.util.List;

public class SpecialistDocotr extends SimpleDoctor implements Doctor,LabDoctor,GeneralDoctor  {
	
	@Override
	public void printname() {
		// TODO Auto-generated method stub
		System.out.print("Name is: " + name);
	}

	@Override
	public void setName(String name1) {
		// TODO Auto-generated method stub
		name = name1;
	}

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPatientHistory() {
         //To change body of generated methods, choose Tools | Templates.
            return null;
        
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  // @Override
    //public String getHistory() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    @Override
    public void performTest(String testId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPrescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Prescription> getHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	

}