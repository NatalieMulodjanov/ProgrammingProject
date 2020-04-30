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
public class Perimeters {
    public static double rectangleP(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the length value followed by width value  >>>");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is not a valid value, please enter the length and width values in numbers >>>");
        }
        
        double length = input.nextDouble();
        double width = input.nextDouble();
        
        double perimeter = 2*(length + width);
        return perimeter;
    }
    
}
