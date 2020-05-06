/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ntali
 */
public class Currency {
    static final double CAD_TO_CAD = 1;
    static final double CAD_TO_USD = 0.71;
    static final double CAD_TO_EUR = 0.66;
    static final double CAD_TO_SHK = 2.5;
    static final double CAD_TO_JPY = 75.79;
    static final double USD_TO_CAD = 1.4;
    static final double EUR_TO_CAD = 1.52;
    static final double SHK_TO_CAD = 0.4;
    static final double JPY_TO_CAD = 0.013;
    
    public static void menuOfOptions1(){
        Scanner input = new Scanner(System.in);
        int option;
        do{
            System.out.println("What currency would you like to convert to? ");
            System.out.println("Please choose: " + 
                                       "\nPress 1 for Canadian Dollar" + 
                                       "\nPress 2 for United Stated Dollar" + 
                                       "\nPress 3 for Euros" + 
                                       "\nPress 4 for Israeli Shekel" + 
                                       "\nPress 5 for Japanese Yen ");
            option = input.nextInt();
        }while(option > 5);
        System.out.println("What is the amount? >>>");
        while(!input.hasNextDouble()){
            input.next();
            System.out.println("This is an invalid input, please enter the amount in numbers >>>");
        }
        double howMuch = input.nextDouble();
        while(!Perimeters.isPositive(howMuch)){
           System.out.println("This is an invalid input, the amount has to be a positive greater than zero number >>>");
           howMuch = input.nextDouble();
        }
        switch(option){
            case 1:
                System.out.println(howMuch + " Canadian dollars are equal to: " + (howMuch * CAD_TO_CAD) + " Canadian dollars");
                break;
            case 2: 
                System.out.println(howMuch + " Canadian dollars are equal to: " + (howMuch * CAD_TO_USD) + " United States dollars");
                break;
            case 3: 
                System.out.println(howMuch + " Canadian dollars are equal to: " + (howMuch * CAD_TO_EUR) + " Euros");
                break;
            case 4: 
                System.out.println(howMuch + " Canadian dollars are equal to: " + (howMuch * CAD_TO_SHK) + " Israeli Shekels");
                break;
            case 5:
                System.out.println(howMuch + " Canadian dollars are equal to : " + (howMuch * CAD_TO_JPY) + " Japanese Yens");
                break;
            default: 
                System.out.println("No such option");
                break;
        }

        
    }
}

