package staticDemo;

public class Demo {
	int x; // global and instance level
	int y;//  global and instance level
	static int z; // global and class level
	public static void main(String[] args) {
		hey();
		Demo d1 = new Demo();
		d1.x = 200;
		d1.y = 300;
		d1.z = 500;
		System.out.println("d1 values " );
		d1.printValues();
		
		Demo d2 = new Demo();
		d2.x = 100;
		
		System.out.println("d2 values " );
		d2.printValues();
		
		
		
		
	}
	public static void hey() {
		System.out.println("Hi static method");
	}
	
	public void printValues() {
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
	}

}
