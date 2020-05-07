/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ntali
 */
public class Calories{
   
   
    public static double getTime(){
        int option;
        double timeM = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Choose the time >>>" +
                               "\nPress 1 for minutes" + 
                               "\nPress 2 for hours");
            while(!input.hasNextDouble()){
                input.next();
                System.out.println("Please choose a number \n");
            }
            option = input.nextInt();
            switch(option){
                case 1:
                    System.out.println("Please enter the time of your exercise in minutes >>>");  
                    while(!input.hasNextDouble()){
                        input.next();
                        System.out.println("This is an invalid input, please enter the time in numbers >>>");
                    }
                    timeM = input.nextDouble();
                    break;
                case 2:
                    System.out.println("Please enter the time of your exercise in hours >>>");  
                    while(!input.hasNextDouble()){
                        input.next();
                        System.out.println("This is an invalid input, please enter the time in numbers >>>");
                    }
                    double time = input.nextDouble();
                    timeM = Calories.toMinutes(time);
                    break;
                default:
                    System.out.println("No such option");
            }
        }while(option > 2);
        return timeM; 
    }
    
    public static double getWeight(){
        int option;
        double weightKG = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Choose the weight >>>" +
                               "\nPress 1 for KG" + 
                               "\nPress 2 for LBS");
            while(!input.hasNextDouble()){
                input.next();
                System.out.println("Please choose a number \n");
            }
            option = input.nextInt();
            switch(option){
                case 1:
                    System.out.println("Please enter your weight in KG >>>");
                    while(!input.hasNextDouble()){
                        input.next();
                        System.out.println("This is an invalid input, please enter the weight in numbers >>>");
                    }
                    weightKG = input.nextDouble();
                    break;
                case 2:
                    System.out.println("Please enter your weight in LBS >>>");
                    while(!input.hasNextDouble()){
                        input.next();
                        System.out.println("This is an invalid input, please enter the weight in numbers >>>");
                    }
                    double weight = input.nextDouble();
                    weightKG = Calories.toKilograms(weight);
                    break;
                default:
                    System.out.println("No such option");
                    break;
            }
        }while(option > 2);
        return weightKG;
    }
    
    public static double toMinutes(double durationH){
       final int TO_MINUTES = 60; 
       double durationM = durationH * TO_MINUTES;
       return durationM;
    }
    
    public static double toKilograms(double weightLbs){
        final double toKG = 2.20462;
        double kilograms = weightLbs * toKG;
        return kilograms;
    }
    
    public static double caloriesFormula(double durationM, double met, double weightKG){
        final double constantV1 = 3.5;
        final int constantV2 = 200;
        double calories = (durationM * met * constantV1 * weightKG) / constantV2;
        return calories;
    }
}
