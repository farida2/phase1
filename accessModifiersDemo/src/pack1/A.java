package pack1;

public class A {
	
	public void helloPublic() {
		System.out.println("Hello from public method from class A");
		
	}
	
	private void helloPrivate() {
		System.out.println("Hello from private method from class A");
		
	}
	
	protected void helloProtected() {
		System.out.println("Hello from protected method from class A");
		
	}
	
	 void helloDefault() {
		System.out.println("Hello from default method from class A");
		
	}
	 
	 public static void helloStatic() {
			System.out.println("Hello from static method from class A");
			
		}
		
	public void accessPrivate() {
		helloPrivate();
	}
	

}
