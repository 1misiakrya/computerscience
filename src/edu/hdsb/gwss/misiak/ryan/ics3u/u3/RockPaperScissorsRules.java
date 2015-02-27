/*
 * Name: RockPaperScissorsRules
 * Date: February 25, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Descrption: This program lists the rules for the game Rock Paper Scissors.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u3;

/**
 *
 * @author 1misiakrya
 */
public class RockPaperScissorsRules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    System.out.println("Rock Paper Scissors Rules");
    System.out.println("Players decide on different hand signals to represent "
            + "rock, paper, and scissors.");
    System.out.println("Players make a throw at the same time.");
    System.out.println("The hand signals thrown by the players are then compared to the rules of the game to determine the winner:");
    System.out.format("%10s %8s", "", "Rock dulls scissors <Rock wins>. \n");
    System.out.format("%10s %8s", "", "Scissors cuts paper <Scissors wins>. \n");
    System.out.format("%10s %8s", "", "Paper covers rock <Paper wins>.");
    }
    
}
