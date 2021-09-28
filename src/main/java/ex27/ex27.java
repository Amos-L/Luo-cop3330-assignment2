/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex27 {
    static String output = "";
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String FirstName = x.nextLine();
        System.out.print("Enter the last name: ");
        String LastName = x.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = x.nextLine();
        System.out.print("Enter the employee ID: ");
        String empID = x.nextLine();
        checkInput(FirstName, LastName, zip, empID);

    }

    public static String checkInput(String FirstName, String LastName, String zip, String ID) {
        boolean Name1Status = checkFirstName(FirstName);
        boolean Name2Status = checkLastName(LastName);
        boolean zipStatus = checkZIP(zip);
        boolean IDStatus = checkID(ID);
        if (Name1Status && Name2Status && zipStatus && IDStatus) {
            output = "There were no errors found.";
            System.out.print(output);
            return output;
        }
            return printOutput();
    }

    public static boolean checkFirstName(String FirstName)
        {
            if(FirstName.length() ==0 && FirstName.length() < 2) {
                output = output + "The first name must be at least 2 characters long.\n";
                output = output + "The first name must be filled in.\n";
                return false;
            }
        if(FirstName.length() < 2){
            output = output + "The first name must be at least 2 characters long.\n";
            return false;
        }
        if(FirstName.length() ==0){
            output = output + "The first name must be filled in.\n";
            return false;
        }

        return true;
    }
    public static boolean checkLastName(String LastName){
        if(LastName.length() < 2 && LastName.length() ==0){
            output = output + "The last name must be at least 2 characters long.\n";
            output = output + "The last name must be filled in.\n";
            return false;
        }

        if(LastName.length() < 2){
            output = output + "The last name must be at least 2 characters long.\n";
            return false;
        }
        if(LastName.length() ==0){
            output = output + "The last name must be filled in.\n";
            return false;
        }

        return true;
    }

    public static boolean checkZIP(String zip){
        char[] zipArray = zip.toCharArray();
        for(int i=0; i<zipArray.length;i++) {

            if (!Character.isDigit(zipArray[i])) {
                output = output + "The zipcode must be a 5 digit number.\n";
                return false;
            }
        }
        if((zip.length() != 5) && (zip.length() == 0)) {
            output = output + "The zipcode must be a 5 digit number.\n";
            output = output + "The zipcode must be filled in.\n";
            return false;
        }
        if (zip.length() != 5){
            output = output + "The zipcode must be a 5 digit number.\n";
            return false;
            }
            if(zip.length() == 0){
                output = output + "The zipcode must be filled in.\n";
                return false;
            }
        return true;
    }

    public static boolean checkID(String ID){
            String format = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
            if((!Pattern.matches(format, ID)) && (ID.length() == 0)){
                output = output + "The employee ID must be in the format of AA-1234.\n";
                output = output + "The employee ID must be filled in.\n";
                return false;
            }

            if (!Pattern.matches(format, ID)) {
                output = output + "The employee ID must be in the format of AA-1234.\n";
                return false;
        }
            if(ID.length() == 0){
                output = output + "The employee ID must be filled in.\n";
                return false;
            }
            return true;
    }

    public static String printOutput()
    {
        System.out.println(output);
        return output;
    }
}

