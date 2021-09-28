/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex36;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ex36 {

    public static ArrayList<Integer> createArray(){

        ArrayList<Integer> values = new ArrayList<Integer>();
        boolean status = false;
        while (status == false) {
            System.out.printf("Enter a number: ");
            Scanner input = new Scanner(System.in);
            String nums = input.nextLine();

            //If input is equal to done, prints out numbers
            if (nums.equals("done")) {
                status = true;
            }

            try {
                int numbers = Integer.parseInt(nums);
            }
            //If error occurs, print prompt and continue with the while loop
            catch(Exception e){
                System.out.printf("Sorry. That's not a valid input.\n");
                continue;
            }

            int numbers = Integer.parseInt(nums);
            if (numbers >= 0) {
                values.add(numbers);
            }
        }
        System.out.printf("Numbers: ");
        for(int i=0; i < values.size(); i++) {
            System.out.print(+ values.get(i) + ", ");
        }
        System.out.println();
        return values;
    }

    public static double average(ArrayList<Integer> values){
        int total = 0;
        double average = 0;
        for(int i =0; i<values.size();i++){
            total += values.get(i);
        }
        average = total / values.size();
        return average;
    }

    public static int max(ArrayList<Integer> values){
        //Finding the max number in array list
        //Setting max as first value and start comparing from there by indexing
        int max = values.get(0);
        for(int i=0; i < values.size();i++){
            if(values.get(i) > max) {
                max = values.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> values){
        //Finding the min number in array list
        //Setting min as first value and start comparing from there by indexing
        int min = values.get(0);
        for(int i=0; i < values.size();i++){
            if(values.get(i) < min) {
                min = values.get(i);
            }
        }
        return min;
    }

    public static double standardD(ArrayList<Integer> values){
        //Gathering what is need to find standard deviation
        double average = average(values);
        double total = 0;
        double standardDeviation = 0;
        double result=0;

        for(int i=0; i< values.size();i++){
            standardDeviation += Math.pow(values.get(i) - average, 2);
        }
        result = Math.sqrt(standardDeviation/ values.size());
        return result;
    }

    public static void printResults(ArrayList<Integer> values){
        int min = min(values);
        int max = max(values);
        double ST = standardD(values);
        double average = average(values);
        System.out.printf("The average is %.1f\n",average);
        System.out.printf("The minimum is %d\n",min);
        System.out.printf("The maximum is %d\n",max);
        System.out.printf("The standard deviation is %.2f\n",ST);

    }
    public static void main(String[] args){
        ArrayList<Integer> numbers = createArray();
        printResults(numbers);

    }
}