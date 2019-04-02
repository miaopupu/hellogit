package TestInterface;
import java.util.*;
public class EmployeeSortTest {
public static void main(String[] args) {
	Employee[] staff = new Employee[3];
	staff[0] = new Employee ("sun",6000);
	staff[1] = new Employee ("yang",7500);
	staff[2] = new Employee ("chen",5500);
	Arrays.sort(staff);
	for(Employee x:staff)
		System.out.println("name = "+x.getName()+",salary= "+x.getSalary() );
}
}
