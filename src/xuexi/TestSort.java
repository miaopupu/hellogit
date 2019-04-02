package xuexi;
import java.util.*;
public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n, m;
		Scanner in = new Scanner(System.in);
		System.out.println("please input a number");
		n = in.nextInt();
		System.out.println("what is the highedt number you can draw");
		m = in.nextInt();
 		int[]numbers= new int[n];
		for(i=0;i<n;i++)
			numbers[i]=i+1;
//		draw some numbers
		int[] result=new int[m];
		for(i=0;i<m;i++)
		{int r = (int)(Math.random()*n);
		result[i]=numbers[r];
		numbers[r]=numbers[n-1];
		n--;
		}
		Arrays.sort(result);
		for(int s:result)
			System.out.print(s+"\t");
		
	}

}
