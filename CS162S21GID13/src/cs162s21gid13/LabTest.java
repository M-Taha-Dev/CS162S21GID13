package prt;

import java.sql.Timestamp;
import java.util.Date;

public class LabTest {
	private String testName;
	private String patientId;
	private Timestamp dateofTest;
	private String labDoctorId;

	// Getters
	public Timestamp getDateofTest() {
		return dateofTest;
	}

	public String getLabDoctorId() {
		return labDoctorId;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getTestName() {
		return testName;
	}

	// Setters
	public void setDateofTest(Timestamp dateofTest) {
		Date dtDate=new Date();
		String varString = "";
		varString += dateofTest;
		this.dateofTest = Timestamp.valueOf(varString);
	}

	public void setLabDoctorId(String labDoctorId) {
		this.labDoctorId = labDoctorId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
}
