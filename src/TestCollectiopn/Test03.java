package TestCollectiopn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import TestInterface.Hero;

public class Test03 {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		for(int i=0;i<2000000;i++) {
			heros.add(new Hero("hero"+i));
		}
		String target = "hero100000";
		for(int j =0;j<10;j++) {
			Collections.shuffle(heros);
			long start = System.currentTimeMillis();
			for(Hero h:heros)
				if(h.name.equals(target)) {
					System.out.println("ур╣╫ак");
					break;
				}
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		}
	}
	
}
