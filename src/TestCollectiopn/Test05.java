package TestCollectiopn;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				if (a < b)
					return 1;
				else {
					return -1;
				}
			}
		};
		Set<Integer> integers = new TreeSet<>(c);
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			integers.add(r.nextInt(50));
		}
		System.out.println(integers);

	}

}
