package xuexi;

import java.util.Scanner;

public class ScoreRank {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());
		String[] strs = new String[num];
		for(int i=0;i<num;i++) {
		    strs[i] = s.nextLine();
		}
		int min = 101,max = 0;
		int score;
		for(String x:strs) {
			String [] res = x.split(" ");
			 score = Integer.parseInt(res[2]);
			if(score>max) {
				max = score;
			}
			if(score<min) {
				min = score;
			}
		}
		for(String y:strs) {
			String [] res2 = y.split(" ");
			if(Integer.parseInt(res2[2])==max) {
				System.out.println(res2[0]+" "+res2[1]);
			}
			if(Integer.parseInt(res2[2])==min) {
				System.out.println(res2[0]+" "+res2[1]);
			}
		}
	}
}
