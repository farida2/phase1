package overloadDemo;

public class Calculator {
	
	private int x;
	private int y;
	
	
	// CONSTRUCTORs
	
	public Calculator() {
		
	}
	 public Calculator(int x, int y) { // good practice
	    	this.x = x;
	    	this.y = y;
			
		}
		
	
//    public Calculator(int a, int b) { // bad practice
//    	x = a;
//    	y = b;
//		
//	}
	
	public Calculator(String str) {
		System.out.println(str);
	  
	}
	
	public int add() {
		return x + y;
	}
	public void add(int a, int b) {
		System.out.println("void(int,int) was calles and result is " + (a + b));
	}
	
	public int add(int a, int b, int c) {
		System.out.println("void(int,int) was calles and result is ");
		return a + b + c;
	}
	
	public void add(float a, float b) {
		System.out.println("void(int,int) was calles and result is " + (a + b));
	}
	
	public String add(String str1, String str2) {
		return str1 + " " + str2;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	


}
