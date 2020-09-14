package calculator;

public class Calculator {
	
	// instantiate global variables
	private double x;
	private double y;
	
	
	
	// constructor without parameters 
	public Calculator() {
		
	}
	
	//constructor with parameters double x and double y
	public Calculator(double x, double y) { // good practice
	    	this.x = x;
	    	this.y = y;
			
		}
		
	
	// Adding two numbers
	public double add() {
		return x + y;
	}
//	public void add(int a, int b) {
//		System.out.println("void(int,int) was calles and result is " + (a + b));
//	}
//	
//	public int add(int a, int b, int c) {
//		System.out.println("void(int,int) was calles and result is ");
//		return a + b + c;
//	}
	
//	public void add(float a, float b) {
//		System.out.println("void(int,int) was calles and result is " + (a + b));
//	}
//	
	
//	// subtraction between two values of type int
//	public int subtract(int x, int y) {
//		return x - y;
//	}
//	
//	// subtraction between two values of type float
//	public float subtract(float x, float y) {
//		return x - y;
//	}
	
	// subtraction between two values of type double
	public double subtract(double x, double y) {
		return x - y;
	}
	
//	// subtraction between two values of type long 
//	public long subtract(long x, long y) {
//			return x - y;
//		}
//	
	  
//	// multiplication between two values of type int
//	public int multiply(int x, int y) {
//			return x * y;	
//		}
//	
	
	// multiplication between two values of type double
		public double multiply(double x, double y) {
				return x * y;	
			}
	
		
	// division between two values of type double
		public double divide(double x, double y) {
			double result = 0;
			if(y != 0) {
				result = x / y;
				}	
			return result;
			}
	
	public void printOptions() {
		System.out.println("Enter the number of the operation you like to use : ");
		System.out.println("1 : + ");
		System.out.println("2 : - ");
		System.out.println("3 : * ");
		System.out.println("4 : / ");
		
		
	}
	
	
	
	


}
