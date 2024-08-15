package javaapplication11;

import java.util.Scanner;
import set1.Calculator;
import set2.Distance;
/**
 *
 * @author felmaralfonso
 */
public class Main {

    public static void main(String[] args) {
        
    int i = 0;
    
    Scanner scn = new Scanner(System.in); 
    
    System.out.println("Hello world");
    
    while (i < 1){
        
        System.out.println("For Calculator input 1 and for Distance Measurement"
                + " input 2: ");
        int decide = scn.nextInt();
             
        if(decide == 1) {
            
            double num1;
            double num2;

            System.out.println("Input number 1:");
            num1 = scn.nextInt();
            
            System.out.println("Input number 2:");
            num2 = scn.nextInt();   

            Calculator calculator = new Calculator(num1, num2);
            
            System.out.println("Select again(1) or exit?(2):  ");
            int ask = scn.nextInt();
            
            if (ask == 1){
                continue;
            } else {
                i = 2;
            }

        }

        
      
        
        
        if(decide == 2) {
            
            double x1;
            double x2;
            double y1;
            double y2;
            double radius;

            System.out.println("Input Radius: ");
            radius = scn.nextDouble();
            
            System.out.println("Input x1: ");
            x1 = scn.nextDouble();
            
            System.out.println("Input x2: ");
            x2= scn.nextDouble();
            
            System.out.println("Input y1: ");
            y1 = scn.nextDouble();
            
            System.out.println("Input y2: ");
            y2 = scn.nextDouble();

            Distance distance = new Distance(x1, x2, y1, y2, radius);
        
            System.out.println("Select again(1) or exit?(2):  ");
            int ask = scn.nextInt();
            if (ask == 1){
                continue;
            } else {
                i++;
            }

       }
        
       else {
            i = 2; 
       }
             
    }
    
}
}