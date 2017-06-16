
public class Employee {
	
	private String empName;
	private int empSalary;

	public Employee(String empName, int empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public String getName() {
		return this.empName;
	}
	
	public int getSalary() {
		return this.empSalary;
	}
	
	public void setSalary(int newSalary) {
		this.empSalary = newSalary;
	}
	
	public String toString() {
		return "Employee Name: " + empName + "; Salary: $" + getSalary();
	}
	
	public Employee clone() {
		return new Employee(empName, empSalary);
	}
	
	public boolean equals(Employee e) {
		Employee E = (Employee) e;
		if (E.getName() == this.getName() && E.getSalary() == this.getSalary()) {
			return true;
		}
		else return false;
	}
}
