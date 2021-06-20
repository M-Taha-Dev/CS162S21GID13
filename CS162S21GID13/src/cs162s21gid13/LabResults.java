package cs162s21gid13;

import java.util.*;


   


import java.util.*;

    


public class LabResults {
     String PatientID;
    List<LabTest> testList = new ArrayList<>();
    

// add test
    public void addResult(LabTest obj){
        if(obj != null && obj.getStatus().equals("Tested")){
            testList.add(obj);
        }
    }
    
    //get index number
    public int getIndex(String testId){
        for (int i=0;i<testList.size();i++){
            if(testList.get(i).getTestId().equals(testId)){
                return i;
            }
        }
        return -1;
    }
    
    
    
    // view test
    public LabTest viewTest(int index){
        return testList.get(index);
    }
    
    
    
}
