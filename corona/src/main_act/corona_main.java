//corona information program 메인 구동 클래스 (메인 클래스) 자바 gui클래스를 생성하고, database클래스를 생성한다. 
package main_act;
import java.sql.Connection;
public class corona_main {

	public static void main(String[] args) {
		
		
		new login_menu(); //로그인 메뉴창 생성하기./ 여기서 통과해야. 즉 아이디랑 비번이 맞아야 프로그램이 실행된다. 


	}
}

//if (s.var == 1) {
//System.out.println(s.var);
//System.out.println("ok to go");
//new guiAct2(); //gui창을 생성하는 클래스의 생성자입니다. 
//}	



//일반 이용자 모드 사용할 건지. 아니면, 관리자 이용할 건지 선택하는 창 뜨게 하기. 
//관리자 모드 추가하기. 로그인 창 입력해서. mysql login id랑 password 입력하고, 입력 성공하면 관리자 창 열어주기. 
//관리자 창에서는 sql문 직접 전달할 수 있음. 
