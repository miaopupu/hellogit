package NumberAndString;

public class Test01 {
	public static void main(String[] args) {
		char[] cs = new char[5];
		String pool="";
		for ( short i= '0';i<='9';i++){
			pool=pool+(char)i;	
		}
		for(short i='A';i<='Z';i++){
			pool=pool+(char)i;
		}
		for(short i='a';i<='z';i++){
			pool=pool+(char)i;
		}
		System.out.println(pool);
		
		for(int h=0;h<cs.length;h++){
			int index=(int)(Math.random()*pool.length());
			cs[h]=pool.charAt(index);
		}
		String str = new String(cs);
		System.out.println(str);


	}
}
