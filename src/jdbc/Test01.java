package jdbc;

public class Test01 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功 ！");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
}
