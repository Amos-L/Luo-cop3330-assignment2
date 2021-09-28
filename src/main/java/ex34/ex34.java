/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex34;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ex34 {

    //Creates the array list of provided employees and returns it
    public static ArrayList<String> creatingArrayList(){
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        return employees;
    }

    public static void prompt(){
        //Makes another arraylist in this function and copies from the create function
        ArrayList<String> employees = creatingArrayList();

        //Finds out many indexes are in employees
        int sizeOf = employees.size();
        System.out.printf("There are %d employees: \n",sizeOf);

        //Loops through indexes and prints
        for(int i=0; i < sizeOf; i++){
            System.out.println(employees.get(i));
        }

        //Removes specified employee
        System.out.printf("\nEnter an employee name to remove: ");
        Scanner input = new Scanner(System.in);
        String employeeToRemove = input.nextLine();
        employees.remove(employeeToRemove);

        //Loops through indexes and prints
        sizeOf = employees.size();
        System.out.printf("\nThere are %d employees: \n",sizeOf);
        for(int j=0 ; j < sizeOf; j++){
            System.out.println(employees.get(j));
        }

    }
    public static void main(String[] args){

        prompt();
    }
}
