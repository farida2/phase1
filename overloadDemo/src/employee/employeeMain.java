package employee;

public class employeeMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Maria");
		Employee emp2 = new Employee(15, "Jack");
		Employee emp3 = new Employee(1, "Farida", 25, "Boston", 89765443);
		
		System.out.println("The first employee is :");
		emp1.printEmployee();
		System.out.println();
		System.out.println("The second employee is :");
		emp2.printEmployee();
		System.out.println();
		System.out.println("The third employee is :");
		emp3.printEmployee();
	}

}
