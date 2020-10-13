
public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(123456);
		Employee e2 = new Employee(654321);
		Employee e3 = new Employee(987654);
		
		e1.setFirstName("Bugs");
		e1.setLastName("Bunny");
		e1.setAge(82);
		e1.setTitle("CEO");
		e1.setStatus("f");
		
		e2.setFirstName("Daffy");
		e2.setLastName("Duck");
		e1.setAge(80);
		e1.setTitle("CTO");
		e2.setStatus("p");
		
		e3.setFirstName("Mickey");
		e3.setLastName("Mouse");
		e3.setAge(89);
		e3.setTitle("Salesmouse");
		e3.setStatus("c");
		
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();
		
	}

}
