package TestAbstract;

public class TestAbstract1 {
 public  static void main(String[] args) {
	 System.out.println("xixi");
	 Person p = new Student ("sun", "math");
	 
	 System.out.println(p.getDescription());
 }
}
abstract class Person {
	protected String name;
	public Person(String n) {
		name = n;
	}
	public abstract  String getDescription();
	public String getName() {
		return name;
	}
}
class Student extends Person{
	private String major;
	public Student(String n,String m) {
		super(n);
		major = m;
	}
	public String getDescription() {
		return "a student named  "+name+" majoring in  "+major;
	}
}
