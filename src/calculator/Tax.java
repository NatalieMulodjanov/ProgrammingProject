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
public class Tax {
    private static double national = 0.05;
    private static double provincial;
    
    public static void setProvincial(double provin){
        provincial = provin;
    }
    
    public static double getProvincial(){
        return provincial;
    }
    
      public static double getNational(){
        return national;
    }
      
    public static double getPrice(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Please eneter the price here >>>");
        while(!input.hasNextDouble()){
            input.next();
            System.out.println("This is not a valid input, please enter the price in numbers here >>>");
        }
        double price = input.nextDouble();
        return price;
    }
    
 }
