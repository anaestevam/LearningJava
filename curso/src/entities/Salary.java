package entities;

public class Salary {
	private int id;
	private String name;
	private double salary;
	
	public Salary() {}

	public Salary(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void increaseSalary(Double percentage) {
		salary += salary * percentage /100.0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return " " + id + ", " + name + ", " + salary ;
	}
	
	
}
