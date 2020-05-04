/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Natalie Mulodjanov 
 */
public class Perimeters {
    public static double rectangleP(){
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        for(int i = 1; i <= 2; i++){
            System.out.println("Please enter the "  + 1 + " side here >>>");
            while((!input.hasNextDouble())|| (Perimeters.isPositive(input))){
                input.nextLine();
                System.out.println("This is not a valid value, please enter the side values in positive numbers greater than 0  >>>");
            }
            double side = input.nextDouble();
            perimeter = perimeter + (2 * side);
        }
        return perimeter;
    }
    
    public static double parallelogramP(){
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        for(int i = 1; i <= 2; i++){
            System.out.println("Please enter the " + i + " side of the parallelogram here >>>");
            while((!input.hasNextDouble()) || (Perimeters.isPositive(input)) ){
                input.nextLine();
                System.out.println("This is not a valid value, please enter the side values in positive numbers greater than 0 >>>");
            }
            double side = input.nextDouble();
            perimeter = perimeter + (2 * side);
        }
        return perimeter;
    }
    
    public static double triangleP(){
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        for(int i = 1; i <= 3; i++){
           System.out.println("Please enter all three sides of your triangle >>>");
        while((!input.hasNextDouble()) || (Perimeters.isPositive(input))){
            input.nextLine();
            System.out.println("This is not a valid value, please enter the side values in numbers >>>");
            } 
        double side = input.nextDouble();
        perimeter += side;
        }
        return perimeter;
    }
    
    public static double circleP(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius >>>");
        while((!input.hasNextDouble()) || (Perimeters.isPositive(input))){
            input.nextLine();
            System.out.println("This is not a valid value, please enter the radius in numbers >>>");
        }
        double radius = input.nextDouble();
        double perimeter = 2 * (Math.PI) * radius;
        return perimeter;
    }
    
    public static double hexagonP(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the side >>> ");
        while((!input.hasNextDouble()) || (Perimeters.isPositive(input))){
            input.nextLine();
            System.out.println("This is not a valid value, please enter the side in numbers >>>");
        }
        double side = input.nextDouble();
        double perimeter = 6 * side;
        return perimeter;
    }
    
    public static double trapezoidP(){
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        for (int i = 1; i <= 4; i ++){
            System.out.println("Enter the " + i + " side here >>>");
            while((!input.hasNextDouble()) || (Perimeters.isPositive(input))){
                input.nextLine();
                System.out.println("This is not a valid value, please enter the side in numbers >>>");
            }
            double side = input.nextDouble();
            perimeter += side;
        }
        return perimeter;
    }
    
    public static boolean isPositive(Scanner input){
        double value = input.nextDouble();
        if(value <= 0){
            return true;
        }else return false;
    }
}
