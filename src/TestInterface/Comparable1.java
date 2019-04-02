package TestInterface;

public interface Comparable1 {
	int compareTo(Object other);
}
class Employee implements Comparable1{
	 double salary;
	 String name;
	 public String getName() {
		 return name;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public Employee(String n,double m) {
		 name = n;
		 salary = m;
	 }
	public int compareTo(Object other ) {
		Employee other1= (Employee)other;
		return Double.compare(salary, other1.salary);
	}
}

