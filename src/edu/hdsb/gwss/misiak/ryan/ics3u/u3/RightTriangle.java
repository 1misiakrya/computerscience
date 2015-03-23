/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Please enter a side length: ");
        
        Scanner inputSideA = new Scanner (System.in);
        
        System.out.println("Please enter a second side length: ");
        
        Scanner inputSideB = new Scanner (System.in);
        
        System.out.println("Please enter a final side length: ");
        
        Scanner inputSideC = new Scanner (System.in);
        
        double sideA = inputSideA.nextDouble();
        double sideB = inputSideB.nextDouble();
        double sideC = inputSideC.nextDouble();
        double longestSide = 0;
        
        if (sideA>sideB){
            if (sideA>sideC){
                longestSide = sideA;
            }
            else {
                longestSide = sideC;
            }
        }
        else if (sideC>sideB){
            longestSide = sideC;
        }
        else {
            longestSide = sideB;
        }
        
    }
    
}
