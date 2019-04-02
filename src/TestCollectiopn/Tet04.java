package TestCollectiopn;

import java.util.ArrayList;
import java.util.List;

public class Tet04 {
	public static int  hashcode(String a) {
		if(a.length()==0)
			return 0;
		else {
			int count = 0;
			char x[] = a.toCharArray();
			for(int i =0;i<a.length();i++) {
				count+=(int)x[i];}
			if(count>1999) {
				return count%2000;
			}
			if(count<0) {
				return -count;
			}
			return count;
		}
	}
	public static void main(String[] args) {
		List<String>list  = new ArrayList<>();
		for(int i = 0;i<20;i++)
			 list.add("hero"+i);
		for(String a:list)
			System.out.println(hashcode(a));
	}
}
