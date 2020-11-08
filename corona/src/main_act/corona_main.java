//corona information program 메인 구동 클래스 (메인 클래스) 자바 gui클래스를 생성하고, database클래스를 생성한다. 
package main_act;
import java.sql.Connection;
public class corona_main {
	
	
	/*
	 * 코로나 데이터베이스 GUI프로그램입니다. 
		1. mysql 서버가 켜져있어야 사용할 수 있습니다. 
		2. mysql 3306 포워딩이 되어있어야 외부에서 사용할 수 있습니다. 
		3. 1번과 2번이 충족되지 않으면 서버컴퓨터에서만 사용할 수 있습니다. 외부에서는 사용불가 
		4. 아이디와 비밀번호는 각각 root와 password 입니다. 
		5. 프로그램에 사용된 데이터베이스는 최신데이터가 아닙니다. 현재와는 다를 수 있습니다. 
	 */
	
	
	public static void main(String[] args) {
		new login_menu(); //로그인 메뉴창 생성하기./ 여기서 통과해야. 즉 아이디랑 비번이 맞아야 프로그램이 실행된다. 
	}
}

