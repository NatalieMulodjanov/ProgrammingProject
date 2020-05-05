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
    private double provincial;
    private double price;
    
    Tax(double national, double provincial, double price){
        this.national = national;
        this.provincial = provincial;
        this.price = price;
    }
    
    Tax(double provincial, double price){
        this.provincial = provincial;
        this.price = provincial;
    }
     
    public void setProvincial(double provincial){
        this.provincial = provincial;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getProvincial(){
        return provincial;
    }
    
    public double getPrice(){
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
