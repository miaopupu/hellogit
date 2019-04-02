package TestInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
public class TestLambda {
	public static void main(String[] args) {
		 Random r =new Random();
		List<Hero> heros = new ArrayList<>();
		for(int i=0;i<10;i++) {
			heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
		}
		System.out.println("show");
		for(Hero h:heros) {
			System.out.println(h);
		}
		Collections.sort(heros, (h1,h2)->(h1.hp<h2.hp?1:-1));
		System.out.println("after sorting");
		for(Hero h:heros) {
			System.out.println(h);
		}
	}
}
