/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author donchi
 */
public class Calculator extends UnicastRemoteObject implements ICalculator {

    public Calculator() throws RemoteException {

    }

    public double add(double n1, double n2) throws RemoteException {
        return n1 + n2;
    }
    public double subtract(double n1, double n2) throws RemoteException {
        return n1 - n2;
    }
    public double mutiply(double n1, double n2) throws RemoteException {
        return n1 * n2;
    }
    public double divide(double n1, double n2) throws RemoteException {
        return n1 / n2;
    }
}
