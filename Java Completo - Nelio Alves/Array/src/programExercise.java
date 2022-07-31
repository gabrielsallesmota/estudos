import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programExercise {

	public static void main(String[] args) {
		
		/*
		 * 1 - How many employees will be registrered?
		 * 2 - Employee #1: Id, Name, Salary
		 * 3 - Enter the emplyee id that will have salary increase:
		 * 4 - Enter the percentage:
		 * 
		 * Obs.: Se o Id do funcionário não existir exibir "This id does not exist!"
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int N = scanner.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Emplyee #"+(i+1)+":");
			System.out.println("Id: ");
			Integer id = scanner.nextInt();
			System.out.println("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Salary: ");
			Double salary = scanner.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.println("Enter the emplyee id that will have salary increase: ");
		int idSalary = scanner.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = scanner.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		scanner.close(); 
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}