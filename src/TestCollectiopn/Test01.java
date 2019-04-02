package TestCollectiopn;
import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		int count=0;
		List<Integer> numbers = new ArrayList<>();
		for(int i =0;i<10;i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		for(int i=1;i<=1000000;i++) {
			Collections.shuffle(numbers);
			if(numbers.get(1).equals(3)&& numbers.get(2).equals(1)&&numbers.get(3).equals(4))
				count++;
		}
		System.out.println(count);
	}
}