/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid13;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Ushher
 */
public class TransfusionLog 
{
    private List<Transfusion> transfusionLog;
    
    private static TransfusionLog object = new TransfusionLog();

    private TransfusionLog() 
    {
        transfusionLog = new ArrayList<Transfusion>();
    }
    
    
    ////GET Object
    public static TransfusionLog getInstance()
    {
        if(object == null)
        {
            object = new TransfusionLog();
        }
        
        return object;
    }
    
    //Getter

    public List<Transfusion> getTransfusionLog() {
        return transfusionLog;
    }
    
    public Transfusion getTransfusionObj(int index)
    {
        return this.transfusionLog.get(index);
    }
    
    //View
    
    public Stack<Transfusion> viewTransfusionHistory()
    {
        Stack<Transfusion> stack = new Stack<Transfusion>();
        
        for (int i = 0; i < this.transfusionLog.size(); i++) 
        {
            Transfusion get = this.transfusionLog.get(i);
            stack.push(get);
            
        }
        
        return stack;
    }
    
    ///CRUD Operations
    
    public void addTransfusion(Transfusion transfusion)
    {
        this.transfusionLog.add(transfusion);
    }
    
    public boolean editTransfusion(Transfusion transfusion, int index)
    {
        
        if (index >= 0 && index <= this.transfusionLog.size())         
        {
            this.transfusionLog.set(index, transfusion);
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public boolean deleteTransfusion(int index)
    {
        if (index >= 0 && index <= this.transfusionLog.size())         
        {
            this.transfusionLog.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
