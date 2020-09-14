package overloadDemo;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		Calculator c1 = new Calculator(100, 200);
		
		int x = 100;
		int y = 55;
		int z = 22;
		
		float f1 = 19.98f;
		float f2 = 32.75f;
		
		c.add(x, y);// call by value
		int res = c.add(x, y, z);
		System.out.println("res = " + res);
		
		c.add(f1, f2);
		String name = c.add("Farida", "Belhous"); // call by reference
		System.out.println(name);
		
		System.out.println("result is  : " + c1.add());
		System.out.println("result is  : " + c.add());
		
	}

}
