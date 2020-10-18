package main_act;

import java.util.Stack;
//데이터를 정렬하는 클래스이다. 지역은 특정 지역에 따라 국가는 특정 국가에 따라 정렬하여 출력한다. 
public class Database_sort_by_number {
	Stack<String > s; //새로운 스택을 생성한다. 문자열 스택이다.
	static StringBuilder sb = new StringBuilder(" "); //문자열을 sb에 저장해준다. 
	Database_sort_by_number(int i){
		
		if (i ==1){
			s = new Database_sort().sort_1(); //Database_sort내에 있는 메소드 들중에서 각 번호에 해당하는 메소드를 생성한다. //전체데이터를 받아온다고 생각 ㄱ
			sb.setLength(0);                  // StringBuildeer sb는 static 참조변수이다. 따라서 매번 새로운 동작을 실행할때마다 그 값을 초기화해줘야 한다.  
			while(!s.empty()) {
				sb.append(s.pop()+""); //StringBuilder의 sb에 s.pop한 값을 저장한다. 
				//System.out.println(s.pop());//해당스택에서 뽑힌 값을 출력한다.	
			}
		}
		if (i ==2){
			s = new Database_sort().sort_2();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
		}}
		if (i ==3){
			s = new Database_sort().sort_3();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
		}}
		if (i ==4){
			s = new Database_sort().sort_4();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==5){
			s = new Database_sort().sort_5();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==6){
			s = new Database_sort().sort_6();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
				if (s.pop().equals("강동구"))
					System.out.println("---------------------------------------------");
			}}
		if (i ==7){
			s = new Database_sort().sort_7();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==8){
			s = new Database_sort().sort_8();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==9){
			s = new Database_sort().sort_9();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==10){
			s = new Database_sort().sort_10();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==11){
			s = new Database_sort().sort_11();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==12){
			s = new Database_sort().sort_12();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==13){
			s = new Database_sort().sort_13();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
			}}
		if (i ==14){
			s = new Database_sort().sort_14();
			sb.setLength(0);
			while(!s.empty()) {
				sb.append(s.pop()+"\n");
		}}
	}
	
	
	public static StringBuilder sb_value() {
		return sb; //StringBuilder의 sb변수를 반환한다. 
	}
}
