package TestReflection;



import TestInterface.Hero;

public class test01 {
	public static void main(String[] args) {
		Hero hero = new Hero();
		Class cl = hero.getClass();
		System.out.println(cl.getName());
	
 }
}

