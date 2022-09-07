public class Employee {

	private String fullNameEmployee;
	private String department;
	private double salary;
	private int id;

	private static int idCnt = 1;

	public Employee(String fullNameEmployee, String department, double salary) {
		this.fullNameEmployee = fullNameEmployee;
		this.department = department;
		this.salary = salary;
		this.id = idCnt++;
	}

	public String getFullNameEmployee() {
		return fullNameEmployee;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return this.id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return
				"Full name: " + fullNameEmployee + '\'' +
						", department: " + department + '\'' +
						", salary: " + salary +
						", id: " + id;
	}
}