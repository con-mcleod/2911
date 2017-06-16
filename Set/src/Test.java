import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Test for ArraySet by reading in input files and performing operations
 * @author connormcleod
 * To test in terminal: navigate to Set in workspace
 * Type: javac *.java
 * Type: java Test > output1.txt
 * To see results, type: subl output1.txt
 */
public class Test {
	
	public static void main(String[] args) {
		
		Set<Integer> s1 = new ArraySet<Integer>();
		Set<Integer> s2 = new ArraySet<Integer>();
		
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("input.txt"));
			while (sc.hasNextLine()) {
				s1.add(Integer.parseInt(sc.nextLine()));
			}
			sc.close();
			sc = new Scanner(new FileReader("input1.txt"));
			while (sc.hasNextLine()) {
				s2.add(Integer.parseInt(sc.nextLine()));
			}
			sc.close();
			
			System.out.println("Set 1: " + s1.toString());
			System.out.println("Set 2: " + s2.toString());
			System.out.println("Is Set 1 equal to Set 2?: " + s1.toString().equals(s2.toString()));
			System.out.println("Does Set 1 contain 1?: " + s1.contains(1));
			System.out.println("Union Set: " + s1.union(s2).toString());
			System.out.println("Intersection Set: " + s1.intersection(s2).toString());
			System.out.println("Is Set 1 a subset of Set 2?: " + s1.subset(s2));
			s1.remove(1);
			System.out.println("Remove '1' from Set 1: " + s1.toString());
			s1.add(1);
			System.out.println("Add '1' to Set 1: " + s1.toString());
			
			System.out.println("Final Set 1 contains: ");
			s1.print();
			System.out.println("Final Set 2 contains: ");
			s2.print();
			
			System.out.println("Is final set 2 equal to final set 1? " + s1.equals(s2));
			System.out.println("Is final set 1 equal to final set 1? " + s1.equals(s1));
			
			System.out.println("\nAll tests passed!");
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
