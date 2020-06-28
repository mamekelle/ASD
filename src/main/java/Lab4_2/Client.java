package Lab4_2;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Employee emp1 = new Employee(1, "B", "Mo", "1000 N 4th St", "Fairfield", "IO", "11111");
		Employee emp2 = new Employee(2, "A", "Ha", "1000 N 4th St", "Fairfield", "IO", "22222");
		Employee emp3 = new Employee(3, "M", "MM", "1000 N 4th St", "Fairfield", "IO", "33333");
		Employee emp4 = new Employee(4, "H", "ED", "1000 N 4th St", "Fairfield", "IO", "44444");
		Employee emp5 = new Employee(5, "M", "Aman", "1000 N 4th St", "Fairfield", "IO", "55555");
		
		emp1.setSupervisor(emp2);
	
		Employee [] staffsUnderemp1 = {emp4, emp5};
		
		emp1.setStaff(staffsUnderemp1);
		
		System.out.println("Printing employee: emp1");
		System.out.println(emp1);
		
		Employee clonedEmployee = (Employee)emp1.clone();
		
		System.out.println("\nPrinting cloned employee: newEmployee");
		System.out.println(clonedEmployee);
		
		System.out.println("\n");
		clonedEmployee.setSupervisor(emp3);
		System.out.println(emp1);
		System.out.println(clonedEmployee);
		
		
	}

}
