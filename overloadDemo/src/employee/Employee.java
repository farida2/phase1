package employee;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int age;
	private String city;
	private long contact;
	
	
	public Employee() {
		
	}


	public Employee(int employeeId, String employeeName) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	
	
	public Employee(int employeeId, String employeeName, int age, String city, long contact) {
		this(employeeId,employeeName); //constructor CHAINING
		this.age = age;
		this.city = city;
		this.contact = contact;
	}


	public void printEmployee() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Age : " + age);
		System.out.println("Employee City : " + city);
		System.out.println("Employee contact : " + contact);
	}
	

}
