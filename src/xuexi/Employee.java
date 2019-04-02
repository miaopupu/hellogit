package xuexi;

public class Employee {
private String name;
 double salary;
public String getName() {
	return name;
}
public void raiseSalary ( double percent) {
	double raise = salary*percent/100;
	salary +=raise;
}
public Employee(String n,double m ) {
	name = n;
	salary = m;
}


}
