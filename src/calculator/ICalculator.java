/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author donchi
 */
public interface ICalculator extends Remote{
    public double add (double n1, double n2) throws RemoteException;
    public double subtract (double n1, double n2) throws RemoteException;
    public double mutiply (double n1, double n2) throws RemoteException;
    public double divide (double n1, double n2) throws RemoteException;
}
