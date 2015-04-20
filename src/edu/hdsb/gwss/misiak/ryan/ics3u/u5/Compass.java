/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Compass Directions");

        System.out.println("Compass directions are written in the following form: S45W. This "
                + "indicates \nthat the direction is determined by facing SOUTH and then turning "
                + "45 \ndegrees towards the WEST. This program has the user enter a compass direction \n"
                + "and then prints a message.");

        System.out.println("Enter Direction: ");

        Scanner inputDirection = new Scanner(System.in);

        String userInput = inputDirection.nextLine();
        userInput = userInput.toUpperCase();

        int lengthOfInput = userInput.length();
        String direction;

        String givenDirection;

        for (int i = 0; i < lengthOfInput; i++) {
            if (userInput.substring(0, 1).equals 'S'){
                direction = "SOUTH";
            }else if(userInput.substring(0, 1) == "N"){
                direction = "NORTH";
            }else if(userInput.substring(0, 1) == "E"){
                direction = "EAST";
            }else if(userInput.substring(0, 1) == "W"){
                direction = "WEST";
            }else {
                System.out.println("Error");
            }
            
            if (lengthOfInput < 2 || lengthOfInput > 5) {
                System.out.println("Error. Invalid Entry.");
            } else if (lengthOfInput == 3) {
                givenDirection = userInput.substring(1, 1);
            } else if (lengthOfInput == 4) {
                givenDirection = userInput.substring(1, 2);
            } else {
                givenDirection = userInput.substring(1, 3);
            }
        }
        System.out.println("Start facing" + direction);

    }

}
