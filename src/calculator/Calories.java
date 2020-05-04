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
    
    
    public static void sleeping(){
        double met = 0;
        double weight = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the amount of hours you slept >>>");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input please enter the amount of hours you slept in numbers >>>");
        }
        double durationH = input.nextDouble();
        System.out.println("Would you like to enter your weight in Kilograms or Pounds? enter 'KG' or 'LB'");
        String answer = input.next();
        if(answer.equals("KG")){
            System.out.println("Please enter your weight in kilograms here >>>");
            weight = input.nextDouble();
        }
        if(answer.equals("LB")) {
            System.out.println("Please enter your weight in pounds >>>");
            weight = toKilograms(input.nextDouble());
        }
        /*while(fileMET.hasNext()){
            met = fileMET.nextDouble();
        }*/
        
        double calories = caloriesFormula(toMinutes(durationH),met ,weight );
        
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
