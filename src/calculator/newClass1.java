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
public class newClass1 {
    public static void main(String[] args) {
    
  Scanner input = new Scanner(System.in);
        double perimeter = 0;
        for(int i = 1; i <= 2; i++){
            System.out.println("Please enter the " + i + " side of the parallelogram here >>>");
            while((!input.hasNextDouble()) || (Perimeters.isPositive(input)) ){
                input.nextLine();
                System.out.println("This is not a valid value, please enter the side values in numbers >>>");
            }
            double side = input.nextDouble();
            perimeter = perimeter + (2 * side);
        }
        System.out.println(perimeter);
    }
    
}
