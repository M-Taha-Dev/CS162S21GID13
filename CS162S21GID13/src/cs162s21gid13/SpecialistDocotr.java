package prt;

public class SpecialistDocotr extends SimpleDoctor implements Doctor,LabDoctor,GeneralDoctor  {
	
	@Override
	public void printname() {
		// TODO Auto-generated method stub
		System.out.print("Name is: " + nameString);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		nameString = name;
	}
	

}
