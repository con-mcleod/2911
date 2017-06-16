import java.util.Calendar;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Employee A = new Employee("Fred", 10000);
		System.out.println(A.toString());
		assert(A.getName() == "A");
		assert(A.getSalary() == 10000);
		
		Employee B = new Employee("Jane", 12000);
		System.out.println(B.toString());
		assert(B.getName() == "B");
		assert(B.getSalary() == 12000);
		
		//check whether getName and getSalary work
		assert(B.getName() != A.getName());
		assert(B.getSalary() != A.getSalary());
		
		//check whether equals works
		assert(A.equals(A) == true);
		assert(A.equals(B) == false);
		
		//test cloning and equals
		Employee C = A.clone();
		assert(C.equals(A));
		
		//Manager Testing
		
		Manager M = new Manager("Bossman", 20000, Calendar.getInstance());
		System.out.println(M.toString());
		
		assert(M.getName() == "Bossman");
		assert(M.getSalary() == 20000);
		Calendar now = Calendar.getInstance();
		assert(M.getHireDate() == now);
		
		//check getters for Manager
		assert(M.getName() == "Bossman");
		assert(M.getSalary() == 20000);
		assert(M.getHireDate() == now);
		
		Manager N = new Manager("Ladyboss", 220000, Calendar.getInstance());
		System.out.println(N.toString());
			
		//check whether Manager's are equal
		assert(M.equals(M) == true);
		assert(M.equals(N) == false);
		
		//check cloning for Managers
		Manager P = N.clone();
		assert(P.equals(N) == true);
		assert(P.equals(M) == false);
		
		//test hire date changes and inequality
		Thread.sleep(1000);
		P.setHireDate(Calendar.getInstance());
		System.out.println(P.toString());
		assert(P.equals(N) == false);
		
		System.out.println("All tests passed!");
		
	}
}
