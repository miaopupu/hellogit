package xuexi;

import java.util.ArrayList;

public class TestGenericArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>(); 
		staff.add(new Employee("sun",10000));
		System.out.println(staff.size());
		double m = max(3.1,4.5,5.6,2.1);
		System.out.println(m);
	}
	
	public static double max(double...values) {
		double largest = Double.MIN_NORMAL;
		for(double x:values)
			if(x>largest)
				largest = x;
		return largest;
	}
}
