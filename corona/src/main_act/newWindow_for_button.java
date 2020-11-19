package main_act;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.HashSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//로그인창 만들어주기 
@SuppressWarnings("serial")
public class newWindow_for_button extends JFrame{
	ImageIcon icon;   //background 생성해줄 이미지아이콘 생성하기. 
	static JTextArea area;
	static JScrollPane scroll;
	newWindow_for_button(int i){
		setTitle("BUTTON CLICK ACTION");
		//프레임바 자바 이모티콘 말고, 원하는 이미지로 지정함. 
		ImageIcon img = new ImageIcon("images2/covid.jpg");
		setIconImage(img.getImage());
		
		area = new JTextArea(10,30);
		scroll = new JScrollPane(area);
		JPanel panel_for_scroll = new JPanel();
		
		//"C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg"
		icon = new ImageIcon("images2/coronavirus-4924022_1280.jpg");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		new Database_sort_by_number(i);
		String data_set = Database_sort_by_number.give_string_data().toString();
		//이제부터 data_set에 DB에서 받아온 데이터의 문자열값을 할당해서 data_set으로 사용할 것이다. 
		
		if(i == 1) {//연번
			JTextField total_corona_person_text = new JTextField(20);
			total_corona_person_text.setText(String.valueOf(data_set.length()) +"명이 감염되었습니다."); //int -> string 형변환
			background.add(total_corona_person_text);
			area.setText(data_set);
		}
		if(i == 2) {//확진일 
			JTextField confirm_date_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}	
			confirm_date_text.setText("확진일은 아래와 같습니다.");
			background.add(confirm_date_text);
			area.setText(data_set);
		}
		if(i == 3) {//환자 번호
			JTextField patient_number_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			patient_number_text.setText("환자 번호는 아래와 같습니다.");
			background.add(patient_number_text);
			area.setText(data_set);
		}
		if(i == 4) {//국적
			JTextField nation_text = new JTextField(20);
			//String[] data_set_arr = data_set.split("\n");
			area.setText("해당되는 국적 정보가 존재하지 않습니다. \n"
				    + "데이터베이스의 정보를 다시 구성하십시오. ");
			nation_text.setText("국적 정보는 아래와 같습니다.");
			background.add(nation_text);
		}
		if(i == 5) { //환자정보 (환자정보는 데이터베이스에 데이터가 존재하지 않는다. )
			JTextField patient_info_text = new JTextField(20);
			//String[] data_set_arr = data_set.split("\n");
			area.setText("해당되는 환자 정보가 존재하지 않습니다. \n"
					    + "데이터베이스의 정보를 다시 구성하십시오. ");
			patient_info_text.setText("환자 정보는 아래와 같습니다.");
			background.add(patient_info_text);
		}
		if(i == 6) {//지역
			System.out.println("ok1");
			JTextField location_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			System.out.println(data_set_arr.length);
			String[] location_data = new String[2500];       //2157개의 배열 넉넉하게 2500으로 잡음 
			
			System.out.println("ok2");
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					location_data[index] = data_set_arr[j];
					index+=1; 
				}
			}
			
			System.out.println(index);
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("ok4");
					new show_detail_location(data_set,location_data);            //show_detail_travel()클래스 호출하기. 동시에 문자열을 전달함 원본 문자열 
				}
			};
			show_detail.addActionListener(l); //버튼 눌렀을 때 동작 
			location_text.setText("지역 정보는 아래와 같습니다.");
			background.add(location_text);
			background.add(show_detail);
			area.setText(data_set);
		}
		if(i == 7) {//여행력/ 빈칸제외하고 395개 
			JTextField travel_trace_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			String[] travel_data = new String[395];       //여행력만을 할당할 문자열배열
				
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					travel_data[index] = data_set_arr[j];
					index+=1; //395개 
				}
			}
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new show_detail_travel(data_set,travel_data);            //show_detail_travel()클래스 호출하기. 동시에 문자열을 전달함 원본 문자열 
				}
			};
			show_detail.addActionListener(l); //버튼 눌렀을 때 동작 
			
			travel_trace_text.setText("여행력은 아래와 같습니다.");
			background.add(travel_trace_text);
			background.add(show_detail);
			area.setText(data_set);
		}
		if(i == 8) { //접촉력
			JTextField contact_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			String[] contact_data = new String[5000];       //여행력만을 할당할 문자열배열
				
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					contact_data[index] = data_set_arr[j];
					index+=1; 
				}
			}
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new show_detail_contact(data_set,contact_data);            //show_detail_travel()클래스 호출하기. 동시에 문자열을 전달함 원본 문자열 
				}
			};
			show_detail.addActionListener(l); //버튼 눌렀을 때 동작 
			
			contact_text.setText("접촉력은 아래와 같습니다.");
			background.add(contact_text);
			background.add(show_detail);
			area.setText(data_set);
		}
		if(i == 9) {//조치사항 
			JTextField action_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			action_text.setText("조치사항은 다음과 같습니다.");
			background.add(action_text);
			area.setText(data_set);
		}
		if(i == 10) { //상태
			int death = 0;//사망한 사람 
			int discharge = 0; //퇴원한 사람 
			String[] data_set_arr = data_set.split("\n"); //data_set을 문자열 배열로 선언했다. 인덱스를 통해 하나씩 접근할 수 있다. 
			for(int j = 0;j<data_set_arr.length;j++) {
				if(data_set_arr[j].equals("사망"))
					death +=1;
				if(data_set_arr[j].equals("퇴원"))
					discharge +=1;
			}
			System.out.println("현재까지 사망한 환자: "+death);
			System.out.println("현재까지 사망한 환자: "+discharge);
			
			JTextField death_text = new JTextField(10);
			JTextField discharge_text = new JTextField(10);
			death_text.setText(String.valueOf(death) + "명 사망");
			discharge_text.setText(String.valueOf(discharge) +"명 퇴원");
			background.add(death_text);
			background.add(discharge_text);
			area.setText(data_set);
		}
		if(i == 11) {//이동경로
//			JTextField move_trace_text = new JTextField(20);
//			String[] data_set_arr = data_set.split("\n");
//			for(int j = 0;j<data_set_arr.length;j++) {
//				System.out.println(data_set_arr[j]);
//			}
//			move_trace_text.setText("이동경로는 아래와 같습니다.");
//			background.add(move_trace_text);
//			area.setText(data_set);
			JTextField move_trace_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			String[] move_data = new String[5000];       //여행력만을 할당할 문자열배열
				
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					move_data[index] = data_set_arr[j];
					index+=1; 
				}
			}
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new show_detail_move(data_set,move_data);            //show_detail_travel()클래스 호출하기. 동시에 문자열을 전달함 원본 문자열 
				}
			};
			show_detail.addActionListener(l); //버튼 눌렀을 때 동작 
			
			move_trace_text.setText("이동경로는 아래와 같습니다.");
			background.add(move_trace_text);
			background.add(show_detail);
			area.setText(data_set);
			
		}
		if(i == 12) {//등록일 
			JTextField regist_date_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			regist_date_text.setText("등록된 날짜는 아래와 같습니다.");
			background.add(regist_date_text);
			area.setText(data_set);
		}
		if(i == 13) {//수정일 
			JTextField date_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			date_text.setText("수정된 날짜는 아래와 같습니다.");
			background.add(date_text);
			area.setText(data_set);
		}	
		if(i == 14) { //노출여부 
			int exposure_number = 0;
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				exposure_number+=1;
			}
			JTextField exposure_number_text = new JTextField(20);
			
			exposure_number_text.setText(String.valueOf(exposure_number) + "명이 노출 확인 되었습니다.");
			background.add(exposure_number_text);
			area.setText(data_set);
		}
		
		area.setLocation(30,50);
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		
		panel_for_scroll.add(scroll);
		background.add(panel_for_scroll);

		add(background);                 		
		setSize(500,300);
		setVisible(true);
	}
}

//이동경로 