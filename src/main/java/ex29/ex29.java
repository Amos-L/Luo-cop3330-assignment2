/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex29;

import java.lang.*;
import java.util.Scanner;

public class ex29 {

    public static void main(String[] args) {
        //While loop runs forever
        while (true) {
            //Asking for user input
            System.out.printf("What is the rate of return? ");
            Scanner x = new Scanner(System.in);
            String input = x.nextLine();

            //Try to convert string into int
            try {
                int rate = Integer.parseInt(input);
            }
            //If error occurs, print prompt and continue with the while loop
            catch(Exception e){
                System.out.printf("Sorry. That's not a valid input.\n");
                continue;
            }
            //Converts now that input isn't letters
            int rate = Integer.parseInt(input);

            if (rate == 0)
                System.out.printf("Sorry. That's not a valid input.\n");
            if (rate > 0) {
                int year = 72 / rate;
                System.out.printf("It will take %d years to double your initial investment.", year);
                break;
            }
        }
    }
}





