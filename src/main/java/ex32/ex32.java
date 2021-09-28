/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex32;

import java.lang.*;
import java.util.Scanner;
import java.util.Random;

public class ex32 {
    public static void prompt() {

        //Used to generate random number
        Random numGen = new Random();

        //Loops until status2 is true, which is when the difficulty is set
        boolean status2 = false;
        while (status2 == false) {
            //Asking for user input
            System.out.printf("Enter the difficulty level (1, 2, or 3): ");
            Scanner x = new Scanner(System.in);
            String input = x.nextLine();

            //Try to convert string into int
            try {
                int difficulty = Integer.parseInt(input);
            }
            //If error occurs, print prompt and continue with the while loop
            catch (Exception e) {
                System.out.printf("Sorry. That's not a valid input.\n");
                continue;
            }
            //Converts now that input isn't letters
            int difficulty = Integer.parseInt(input);
            int ranNum = 0;

            if (difficulty <= 0) {
                System.out.printf("Sorry. That's not a valid input.\n");
                continue;
            }

            if (difficulty == 1) {
                ranNum = numGen.nextInt(9);
                status2 = true;
            }

            if (difficulty == 2) {
                ranNum = numGen.nextInt(99);
                status2 = true;
            }
            if (difficulty == 3) {
                ranNum = numGen.nextInt(999);
                status2 = true;
            }
            //Sending random number to the guessing prompt
            guessing(ranNum);
            return;
        }
    }

    public static int guessing(int ranNum){

            //Since the number to guess is 1-10, add one to prevent 0
            int Num = ranNum+1;
            int numOfGuess=0;
            int guess = 0;
            boolean status = false;

            System.out.printf("I have my number. What's your guess? ");

            while (status == false) {
                //Asking for user input
                Scanner x = new Scanner(System.in);
                String input = x.nextLine();

                //Try to convert string into int
                try {
                    guess  = Integer.parseInt(input);
                }
                //If error occurs, print prompt and continue with the while loop
                catch (Exception e) {
                    System.out.printf("Sorry. That's not a valid input.\n");
                    continue;
                }
                //Converts now that input isn't letters
                guess  = Integer.parseInt(input);

                if (guess > Num) {
                    System.out.printf("Too High. Guess again: ");
                    status = false;
                    numOfGuess += 1;
                }

                if (guess < Num) {
                    System.out.printf("Too low. Guess again: ");
                    status = false;
                    numOfGuess += 1;
                }

                if (guess == Num) {
                    System.out.printf("You got it in %d guesses!\n", numOfGuess);
                    status = true;
                }
        }
            //Going to the "Do you wish to play again" prompt
            return goAgain();
        }

    public static int goAgain(){

        System.out.printf("Do you wish to play again (Y/N)?\n");
            Scanner again = new Scanner(System.in);
            char input = again.next().charAt(0);

            if(input == 'N' || input == 'n') {
                return 0;
            }
            //If "yes" run the prompt function to start again
            if(input == 'Y' || input == 'y'){
                prompt();
                return 0;
            }
            return 0;
        }

        public static void main(String[] args){

        System.out.printf("Let's play Guess the Number!\n\n");
        prompt();
        }
}
