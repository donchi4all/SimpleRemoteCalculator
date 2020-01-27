/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author donchi
 */
public class CalculatorServer {
    
    public static void main (String[] args) throws RemoteException
    {
        try
        {
            Registry reg=LocateRegistry.createRegistry(1099);
            //1099 is the port for the RMI protocol
            
            Calculator c=new Calculator();
            reg.rebind("MyCalculator", c);
            
            System.out.println("Server is ready...");
               
    }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    

    }
}