/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Please enter your weight in kg");
        
        Scanner inputWeightKg = new Scanner (System.in);
        
        System.out.println("Please enter your weight in lbs");
        
        Scanner inputWeightLbs = new Scanner (System.in);
        
        System.out.println("Please enter your height");
        
        Scanner inputHeight = new Scanner (System.in);
        
        
        
        double metricWeight = inputWeightKg.nextDouble();
        double imperialWeight = inputWeightLbs.nextDouble();
        double height = inputHeight.nextDouble();
        double bmiMetric = (metricWeight / (height * height));
        double bmiImperial = (imperialWeight * 703 / (height*height));
        
        
        
        
    }
    
}
