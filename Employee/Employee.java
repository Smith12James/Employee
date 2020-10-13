
public class Employee {

	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	
	public Employee(int employeeID) {
		
		this.employeeID = employeeID;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		
		status = status.toLowerCase();
		
		if(status.equals("f")) {
			
			status = "Full Time";
			
		} else if(status.equals("p")) {
			
			status = "Part Time";
			
		} else if(status.equals("c")) {
			
			status = "Commission";
			
		} else if(status.equals("v")) {
			
			status = "Volunteer";
			
		} else {
			
		status = "Unknown";
			
		}
		
		this.status = status;
	}
	
	public int getEmployeeID() {
		
		return employeeID;
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printEmployee() {
		
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("Employee ID: " + this.employeeID);
		System.out.println("Age: " + this.age);
		System.out.println("Title: " + this.title);
		System.out.println("Status: " + this.status);
		System.out.println("\n-----------------------------------------------\n");
		
	}
	
}
