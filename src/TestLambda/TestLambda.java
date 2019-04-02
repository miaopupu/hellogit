package TestLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import TestInterface.Hero;

public class TestLambda {
	public static void main(String[] args) {
		Random random = new Random();
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 10; i++) {
			heros.add(new Hero("hero" + i, random.nextInt(1000), random.nextInt(100)));

		}
		HeroChecker checker = new HeroChecker() {
			public boolean test(Hero h) {
				return (h.hp > 100 && h.damage < 50);
			}
		};//匿名类，只需创建一个对象时采用。
		filter(heros, h -> h.hp > 500 && h.damage < 50);

	}

	private static void filter(List<Hero> s, HeroChecker checker) {
		for (Hero h : s) {
			if (checker.test(h))
				System.out.println(h);
		}
	}
}
