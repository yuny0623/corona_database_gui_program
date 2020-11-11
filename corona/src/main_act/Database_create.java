//자바 JDBC프로그래밍 database 클래스
//mysql에 getConnection을 통해 접근한다. 
//mysql에서 sql문을 통해 데이터를 가져온다. 
package main_act;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class Database_create {
	//Database_create(){} //생성자
	public static Connection makeConnection() { //인스턴스 생성여부와 관계없이 static메모리에 적재되어 실행된다. 가장 먼저 mysql에 연결 
		String url = "jdbc:mysql://localhost:3306/corona?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 중...");
			con = DriverManager.getConnection(url,"root","password");
			System.out.println("데이터베이스 연결 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾이 못했습니다...");
		}catch(SQLException e) {
			System.out.println("데이터베이스 연결 실패");
		}
		return con; //con객체를 반환한다. 
	}

}
