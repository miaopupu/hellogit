package NumberAndString;

public class Test02 {
	public static void main(String[] args) {
		String sentence = "lengendary";
		char x []= sentence.toCharArray();
		for(int i=0;i<sentence.length();i++)
			if(i%2==0) {
				int a=(int)(x[i]);
				a=a-32;
				x[i]= (char)(a);
			}
			
		String str = new String(x);
		System.out.println(str);
	}
}