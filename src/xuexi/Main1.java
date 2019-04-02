package xuexi;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = s.nextLine();
		}

		for (String x : str) {
			check(x);
		}
	}
	public static  void check(String x) {
		char[] a = x.toCharArray();
		int i = 0;
		for (char y : a) {

			if (y != 'A' && y != 'P' && y != 'T' ) {
				System.out.println("NO");
				break;
			}
			if (y == 'A') {
				if (i == 1) {
					i++;
				}

			}
			if (y == 'P') {
				if (i == 0) {
					i++;
				}

			}
			if (y == 'T') {
				if (i >= 2) {
					System.out.println("YES");
					i=-1;
					
				}

			}
					
		}
		if(i!=-1&&i!=0) {
			System.out.println("NO");
		}
	}
}
