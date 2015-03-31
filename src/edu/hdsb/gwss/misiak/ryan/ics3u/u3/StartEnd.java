/*
 * Name: StartEnd
 * Date: March 30, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program asks the user for a starting value and an ending value, and then writes all the integers (inclusive) between those two values.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Get Start Value.
        System.out.println("Enter Start Value: ");
        
        Scanner inputStartValue = new Scanner (System.in);
        int startValue = inputStartValue.nextInt();
        
        //Get End Value.
        System.out.println("Enter End Value: ");
        
        Scanner inputEndValue = new Scanner (System.in);
        int endValue = inputEndValue.nextInt();
        
        //Start value is less than end value.
        if (startValue<=endValue){
            while(startValue<=endValue){
                System.out.println("Output: " + startValue);
                startValue = (startValue + 1);
            }
            
        }
        //Start value is more than end value.
        else{
            while (startValue>=endValue){
                System.out.println("Output: " + startValue);
                startValue = startValue - 1;
            }
        }
    }
}
