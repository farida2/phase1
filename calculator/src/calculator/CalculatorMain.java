package calculator;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		// variables
		// Creating a new Calculator object
		Calculator result = new Calculator();
		
		// Using Scanner to input the values in the console
		Scanner input =new Scanner(System.in);
		
		int operation;
		double num1;
		double num2;
		
		// Ask the user to enter the first number
		System.out.print("Enter your first number : ");
		num1 = input.nextDouble();
		
		// Ask the user to select the operation
		result.printOptions();
		operation = input.nextInt();
		
		// Ask the user to enter the second number
		System.out.print("Enter your second number : ");
		num2 = input.nextDouble();
		
		switch (operation) {
		  case 1:
		    System.out.print( num1 +" + "+ num2 +" = ");
		    System.out.println(result.add()); 
		    break;
		    
		  case 2:
			  System.out.print( num1 +" - "+ num2 +" = ");
			  System.out.println(result.subtract(num1, num2));		    
		    break;
		    
		  case 3:
			  System.out.print( num1 +" * "+ num2 +" = ");
			  System.out.println(result.multiply(num1, num2));    
		    break;
		    
		  case 4:
			  System.out.print( num1 +" / "+ num2 +" = ");
			  System.out.println(result.divide(num1, num2));		    
		    break;
		    
		    
		  default:
			    System.out.println("NOTHING!");
		}
	
		
	}

}
