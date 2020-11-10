//�ڹ� JDBC���α׷��� database Ŭ����
//mysql�� getConnection�� ���� �����Ѵ�. 
//mysql���� sql���� ���� �����͸� �����´�. 
package main_act;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class Database_create {
	//Database_create(){} //������
	public static Connection makeConnection() { //�ν��Ͻ� �������ο� ������� static�޸𸮿� ����Ǿ� ����ȴ�. ���� ���� mysql�� ���� 
		String url = "jdbc:mysql://localhost:3306/corona?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("�����ͺ��̽� ���� ��...");
			con = DriverManager.getConnection(url,"root","password");
			System.out.println("�����ͺ��̽� ���� ����");
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� ���߽��ϴ�...");
		}catch(SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
		}
		return con; //con��ü�� ��ȯ�Ѵ�. 
	}

}
