package prt;

import java.util.ArrayList;
import java.util.List;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabDoctor objDoctor = new SpecialistDocotr();
		List<LabDoctor> strList = new ArrayList<>();
		strList.add(objDoctor);
		objDoctor.setName("Ushher");
		objDoctor.printname();
		GeneralDoctor objDoctor2 = new SpecialistDocotr();
		objDoctor2.setName("Taha");
		objDoctor2.printname();
		
	}

}
