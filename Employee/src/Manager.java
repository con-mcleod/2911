import java.util.Calendar;

public class Manager extends Employee {
	
	private Calendar hireDate;

	public Manager(String empName, int empSalary, Calendar hireDate) {
		super(empName, empSalary);
		this.hireDate = hireDate;
	}
	
	public Calendar getHireDate() {
		return this.hireDate;
	}
	
	public void setHireDate(Calendar newHireDate) {
		this.hireDate = newHireDate;
	}
	
	public String toString() {
		return "Manager Name: " + this.getName() + "; Salary: $" + this.getSalary() + "; Hire Date: "
				+ this.getHireDate();
	}

	public Manager clone() {
		return new Manager(this.getName(), this.getSalary(), this.getHireDate());
	}
	
	public boolean equals(Object o) {
		Manager other = (Manager) o;
		if (other.getName() == this.getName() && other.getSalary() == this.getSalary() && 
				other.getHireDate() == this.getHireDate()) {
			return true;
		} 
		else return false;
	}
}
