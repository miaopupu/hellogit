package xuexi;

import java.util.Arrays;

public class Hello {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = i;
		System.out.println(Arrays.toString(a));
		for (int element : a)
			System.out.print(element * element + "\t");
	}
}