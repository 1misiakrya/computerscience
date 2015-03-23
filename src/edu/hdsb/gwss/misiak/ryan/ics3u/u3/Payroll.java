/*
 * Name: Payroll
 * Date: February 26, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program gives the user information on their hours worked, taxes, and pay amounts.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

/**
 *
 * @author 1misiakrya
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    long   hoursWorked = 40;    
    double payRate     = 10.0, taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
    }
    
}
