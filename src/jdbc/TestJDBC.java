package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ���������ݿ��Connection����
		// ������Ҫ�ṩ��
		// ���ݿ������ڵ�ip:127.0.0.1 (����)
		// ���ݿ�Ķ˿ںţ� 3306 ��mysqlר�ö˿ںţ�
		// ���ݿ����� how2java
		// ���뷽ʽ UTF-8
		// �˺� root
		// ���� admin
		try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
				"root", "admin"); Statement s = c.createStatement();

		) {
			System.out.println("���ӳɹ�����ȡ���Ӷ��� " + c);
			String name = "dashen";
			// ��ȷ�������ǣ�thisispassword
			String password = "thisispassword1";
			String sql = "select * from user where name = '" + name + "' and password = '" + password + "'";
			ResultSet rs = s.executeQuery(sql);
			if (rs.next())
				System.out.println("�˺�������ȷ");
			else
				System.out.println("�˺��������");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}