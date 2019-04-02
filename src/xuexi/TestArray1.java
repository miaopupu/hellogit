package xuexi;
import java.util.*;
public class TestArray1 {
public static void main(String[] args) {
	int[] b = {2,3,5,7,9};
	int[] a;
	a=b;
	int[]copiedb = Arrays.copyOf(b,b.length);
	for(int element :copiedb)
	System.out.print(element+"\t");
}
}
