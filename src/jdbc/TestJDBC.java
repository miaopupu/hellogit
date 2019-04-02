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
		// 建立与数据库的Connection连接
		// 这里需要提供：
		// 数据库所处于的ip:127.0.0.1 (本机)
		// 数据库的端口号： 3306 （mysql专用端口号）
		// 数据库名称 how2java
		// 编码方式 UTF-8
		// 账号 root
		// 密码 admin
		try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
				"root", "admin"); Statement s = c.createStatement();

		) {
			System.out.println("连接成功，获取连接对象： " + c);
			String name = "dashen";
			// 正确的密码是：thisispassword
			String password = "thisispassword1";
			String sql = "select * from user where name = '" + name + "' and password = '" + password + "'";
			ResultSet rs = s.executeQuery(sql);
			if (rs.next())
				System.out.println("账号密码正确");
			else
				System.out.println("账号密码错误");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}