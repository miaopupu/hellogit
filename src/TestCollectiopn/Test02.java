package TestCollectiopn;

import java.util.ArrayList;

import TestInterface.Hero;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
            heros.add(new Hero("hero" + i));
        }
		
		for(Hero h:heros) {
			
			int num = Integer.parseInt((new StringBuffer(h.name).delete(0, 4)).toString());
			if(num%8==0) {
				heros.remove(num);
				
			}
			
		} 
		System.out.println("finally");
		System.out.println(heros);
	       
       

	}
}
