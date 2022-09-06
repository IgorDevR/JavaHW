public class Main {
	public static void main(String[] args) {

		Employee[] employees = new Employee[]{
				new Employee("Semenov Semen Semenovich 1", "1", 10000),
				new Employee("Semenov Semen Semenovich 2", "3", 1200),
				new Employee("Semenov Semen Semenovich 3", "2", 15000),
				new Employee("Semenov Semen Semenovich 4", "5", 9000),
				new Employee("Semenov Semen Semenovich 5", "4", 9500),
				new Employee("Semenov Semen Semenovich 6", "5", 11000),
				new Employee("Semenov Semen Semenovich 7", "1", 18000),
				new Employee("Semenov Semen Semenovich 8", "2", 9900),
				new Employee("Semenov Semen Semenovich 9", "4", 11200),
				new Employee("Semenov Semen Semenovich 10", "3", 11750)
		};

		System.out.println("________________________________");
		getAllemployees(employees);
		System.out.println("________________________________");
		System.out.println("The total amount of all costs for employees: " + sumOrAverageSalarys(employees, false));
		System.out.println("________________________________");
		System.out.println("The minimum wage for an employee: " + thePoorestWorker(employees));
		System.out.println("________________________________");
		System.out.println("The maximum wage for an employee: " + theProsperousWorker(employees));
		System.out.println("________________________________");
		System.out.println("Average salary of all employees: " + sumOrAverageSalarys(employees, true));
		System.out.println("________________________________");
		listAllEmployees(employees);
		System.out.println("________________________________");


	}

	private static void getAllemployees(Employee[] employees) {

		System.out.println("Employee Information: ");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

	private static double sumOrAverageSalarys(Employee[] employees, boolean isAverage) {

		double sum = 0;

		for (int i = 0; i < employees.length; i++) {
			sum = employees[i].getSalary();
		}
		if (isAverage) {
			sum /= employees.length;
		}
		return sum;
	}

	private static Employee thePoorestWorker(Employee[] employees) {
		double min = employees[0].getSalary();
		int poorWorkerIndex = 0;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() < min) {
				min:
				employees[i].getSalary();
				poorWorkerIndex = i;
			}
		}
		return employees[poorWorkerIndex];
	}

	private static Employee theProsperousWorker(Employee[] employees) {
		double max = employees[0].getSalary();
		int prosperousWorkerIndex = 0;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() > max) {
				max:
				employees[i].getSalary();
				prosperousWorkerIndex = i;
			}
		}
		return employees[prosperousWorkerIndex];
	}

	private static void listAllEmployees(Employee[] employees) {

		System.out.println("list of all employees: ");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getFullNameEmployee());
		}


	}

}