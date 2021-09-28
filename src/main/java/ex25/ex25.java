/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex25;
import java.util.Scanner;

public class ex25 {

    public static int PasswordChecker(String password){

        //Converting string to an array
        char[] passwordArray = password.toCharArray();

        //Setting boundaries for the needed components to determine password complexity
        boolean length = false, Num = false, letters = false, specialcharacters = false;
        int i = password.length();

        //Goes through the array and checks for components and settings them as true if its found
        for(int j=0; j<i; j++){
            if(Character.isDigit(passwordArray[j])) //If there is a digit
                Num = true;
            if(i > 8) //Checking length
                length = true;
            if(!Character.isDigit(passwordArray[j]) && !Character.isAlphabetic(passwordArray[j])) //Checking for special chars
                specialcharacters = true;
            if(Character.isLetter(passwordArray[j])) //Checking for letters
                letters = true;
        }

        //Very weak components
        if(Num && i<8) {
            System.out.printf("The password \'%s\' is a very weak password.", password);
            return 0;
        }
        //Weak components
        if(letters && i<8) {
            System.out.printf("The password \'%s\' is a weak password.", password);
            return 1;
        }

        //Strong components, has to exclude special characters so it doesn't print strong and very strong
        if(letters && Num && i >8 && !specialcharacters) {
            System.out.printf("The password \'%s\' is a strong password.", password);
            return 2;
        }

        //Very strong components
        if(letters && Num && specialcharacters && i > 8) {
            System.out.printf("The password \'%s\' is a very strong password.", password);
            return 3;
        }

        return 4;
    }

    public static void main(String[] args){
        String pass;
        Scanner x = new Scanner(System.in);
        System.out.printf("Enter Password: ");
        pass = x.nextLine();
        PasswordChecker(pass);
    }
}