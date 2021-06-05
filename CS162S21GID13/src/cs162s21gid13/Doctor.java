package cs162s21gid13;
import java.util.*;
public interface Doctor {
	String getId();
        SimpleDoctor DataDoctor = new SimpleDoctor();
	List<Prescription> getHistory();
        void printPrescription();
}
