package main_act;

import java.util.Stack;
//�����͸� �����ϴ� Ŭ�����̴�. ������ Ư�� ������ ���� ������ Ư�� ������ ���� �����Ͽ� ����Ѵ�. 
public class Database_sort_by_number {
	Stack<String > s; //���ο� ������ �����Ѵ�. ���ڿ� �����̴�.
	static StringBuilder sb = new StringBuilder(" "); //���ڿ��� sb�� �������ش�. 
	Database_sort_by_number(int i){
		
		if (i ==1){
			s = new Database_sort().sort_1(); //Database_sort���� �ִ� �޼ҵ� ���߿��� �� ��ȣ�� �ش��ϴ� �޼ҵ带 �����Ѵ�. //��ü�����͸� �޾ƿ´ٰ� ���� ��
			sb.setLength(0);                  // StringBuildeer sb�� static ���������̴�. ���� �Ź� ���ο� ������ �����Ҷ����� �� ���� �ʱ�ȭ����� �Ѵ�.  
			while(!s.empty()) {
				sb.append(s.pop()+""); //StringBuilder�� sb�� s.pop�� ���� �����Ѵ�. 
				//System.out.println(s.pop());//�ش罺�ÿ��� ���� ���� ����Ѵ�.	
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
				if (s.pop().equals("������"))
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
		return sb; //StringBuilder�� sb������ ��ȯ�Ѵ�. 
	}
}
