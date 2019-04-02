package NumberAndString;

public class Test03 {
	public static void main(String[] args) {
		int count=0;
		 String a[]=new String [100];
		 String dictionary = new String();
		 for(short i ='0';i<='9';i++)
			 dictionary+=(char)i;
		 for(short i ='a';i<='z';i++)
			 dictionary+=(char)i;
		 for(short i ='A';i<='Z';i++)
			 dictionary+=(char)i;
		 char[] c = dictionary.toCharArray();
		 for(int i=0;i<a.length;i++) {
			 char c1 = c[(int)(Math.random()*dictionary.length())];
			 char c2 = c[(int)(Math.random()*dictionary.length())];
			 a[i] = ""+c1+c2;
		 }
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+"  ");
			 if((i+1)%5==0)
				 System.out.println();
		 }
		 String x = "";
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i].equals(a[j])) {
					 count++;
					 x=a[j]+" ";
				 }
			 }  //每个元素只需与它之后的元素比较。
				 
		 }
		 System.out.println(x);
		 }
}
