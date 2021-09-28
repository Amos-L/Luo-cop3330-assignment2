/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex31;

import java.lang.*;
import java.util.Scanner;

public class ex31 {

    public static int checkAge(){
        int age = 0;
        boolean status = false;
        while (status == false){

            //Asking for user input
            System.out.printf("What is your age? ");
            Scanner x = new Scanner(System.in);
            String ageHold = x.nextLine();

            //Try to convert string into int
            try {
                age = Integer.parseInt(ageHold);
            }

            //If error occurs, print prompt and continue with the while loop
            catch (Exception e) {
                System.out.printf("That's not a valid input.\n");
                continue;
            }
            age = Integer.parseInt(ageHold);

            //If age = 0, ask question again
            if (age == 0)
                System.out.printf("That's not a valid input.\n");
            status = false;
            if (age > 0) {
                status = true;
            }
        }
        return age;
    }

    public static int checkHR(){
        int restingHR = 0;
        boolean status2 = false;
        while (status2 == false) {

            //Asking for user input
            System.out.printf("What is your resting heart rate? ");
            Scanner x = new Scanner(System.in);
            String HRHold = x.nextLine();

            //Try to convert string into int
            try {
                restingHR = Integer.parseInt(HRHold);
            }
            //If error occurs, print prompt and continue with the while loop
            catch (Exception e) {
                System.out.printf("That's not a valid input.\n");
                continue;
            }

            restingHR = Integer.parseInt(HRHold);

            //If resting heart rate = 0, ask question again
            if (restingHR == 0)
                System.out.printf("That's not a valid input.\n");
            status2 = false;
            if (restingHR > 0) {
                status2 = true;
            }
        }
        return restingHR;
    }

    public static void printChart(int age, int restingHR){
        //Printing the top of the chart
        System.out.printf("Resting Pulse: %d\t\tAge: %d", restingHR, age);
        System.out.printf("\n");
        System.out.printf("Intensity    | Rate\n");
        System.out.printf("-------------|--------\n");

        //Printing the intensity and rate values
        double THR = 0;
        double intensity = .55;
        for (double i = .55; i <= 1; i += .05) {
            THR = findHeartRate(intensity, age, restingHR);
            THR = Math.round(THR);
            System.out.printf("%.0f%%          | %.0f bmp      \n",intensity*100,THR);
            intensity = intensity + .05;
        }
    }

    //Calculating the target heart rate
    public static double findHeartRate(double rate, double age, double HR) {
        double THR = (((220 - age) - HR) * rate) + HR;
        return THR;
    }

    public static void main(String[] args) {

        //Calling for check functions
        int age = checkAge();
        int restingHR = checkHR();

        //PrintChart
        printChart(age,restingHR);
    }
}