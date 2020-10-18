package main_act;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;
import java.util.Stack;
//�������� �ش� �������� ��� �����͸� �޴´�. 
public class Database_sort {
	public Stack<String> sort_1() {// 1�� �� ���� year_number�� ���� �����͸� Stack<String>�� �Ҵ��Ѵ�. 1~14�� exposure ���� ���� ����̴�. 
		Stack<String> s1 = new Stack<>();

		try {
		String sql = "SELECT year_number FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push(r.getString("year_number")); //���ÿ� �ڷʴ�� �����ͺ��̽��� ������ ����ִ´�. 
		}
		}catch(SQLException e1) {}
		return s1;                               //�ش� ������ ��ȯ�Ѵ�. 
	}
	
	public Stack<String> sort_2() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT confirm_date FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("confirm_date"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_3() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT patient_number FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("patient_number"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_4() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT nation FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("nation"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_5() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT patient_info FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("patient_info"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_6() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT location FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("location")); 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_7() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT travel FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("travel"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_8() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT contact FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("contact"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_9() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT action FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("action"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_10() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT state FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("state"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_11() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT move_trace FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("move_trace"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_12() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT regist_date FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("regist_date"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_13() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT modify_date FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("modify_date"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}
	
	public Stack<String> sort_14() {
		Stack<String> s1 = new Stack<>();
		 
		 
		try {
		String sql = "SELECT exposure FROM test_table3;";
		Connection c = Database_create.makeConnection();
		PreparedStatement p = c.prepareStatement(sql);
		ResultSet r = p.executeQuery();
		
		while(r.next()) {
			s1.push( r.getString("exposure"));
			 
		}
		}catch(SQLException e1) {}
		
		 
		return s1;
	}

}
//String sql = "SELECT year_number FROM test_table3;";
//Connection c = Database_create.makeConnection();
//PreparedStatement p = c.prepareStatement(sql);
//ResultSet r = p.executeQuery();
//
//
//while(r.next()) {
//	s1.push( r.getString("year_number");
//	 
//	 
//}
//System.out.println("������ ���� Ŭ�������� ����Ǵ� �����Դϴ�. ");
//System.out.println(Stack);