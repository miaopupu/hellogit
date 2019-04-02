package TestCollectiopn;

import java.util.LinkedList;

import TestInterface.Hero;

public class MyStack implements Stack {
	LinkedList<Hero> mystack = new LinkedList<>();
	public void push (Hero a) {
		mystack.add(a);
	}
	public  Hero peek() {
		return mystack.getFirst();
	}
	public Hero pull() {
		Hero  a = mystack.removeLast();
	return a;
	}
	public static void main(String[] args) {
			MyStack heroStack = new MyStack();
			for(int i = 0;i<5;i++) {
				heroStack.push(new Hero("hero"+i));
			}
			for(int i=0;i<5;i++){
				System.out.println("µ¯³öµÚ"+(i+1)+"¸ö");
				Hero aHero = heroStack.pull();
				System.out.println(aHero);
			}
			
	}
	
			
}
