/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author donchi
 */
public class CalculatorClient {

    public static void main(String[] args) throws RemoteException {
        try {
            ICalculator c = (ICalculator) Naming.lookup("MyCalculator");
//            System.out.println("The result of addition is " + c.add(5, 5));

            Scanner reader = new Scanner(System.in);
            
         System.out.println("------Simple calculator-------");

             System.out.print("Enter First numbers: ");
            double first = reader.nextDouble();
            
             System.out.print("Enter Second numbers: ");
            double second = reader.nextDouble();
            
            System.out.println("Select a calculator operation");
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = reader.next().charAt(0);
            double result;
            switch (operator) {
                case '+':
                    result = c.add(first, second);
                    break;
                case '-':
                    result = c.subtract(first, second);
                    break;
                case '*':
                    result = c.mutiply(first, second);
                    break;
                case '/':
                    result = c.divide(first, second);
                    break;
               
                default:
                    System.out.printf("Error! operator is not correct");
                    return;
            }
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
