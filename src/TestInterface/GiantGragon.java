package TestInterface;

public class GiantGragon {
	private GiantGragon(){
		}//˽�л����������ⲿ�޷���new����
	private static GiantGragon instance = new GiantGragon();//����ʽ�����ٴ���һ��ʵ��
	public static GiantGragon getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		GiantGragon2 nash = GiantGragon2.getInstance();
		GiantGragon2 hoho = GiantGragon2.getInstance();
		System.out.println(hoho.equals(nash));
	}
}
class GiantGragon2{
	private GiantGragon2() {
		System.out.println("dalong");
	}
	private static GiantGragon2 instance ;
	public static GiantGragon2 getInstance() {
		if(null == instance) {
			instance  = new GiantGragon2();
			}
		return instance;
	}
	
}
