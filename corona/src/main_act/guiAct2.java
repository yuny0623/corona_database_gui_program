package main_act;
//메인프레임과 함께 gui이벤트를 정의한 클래스입니다. 



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class guiAct2 extends JFrame implements ActionListener{

	static String path = null;  //이미지의 경로 
	
	//생성자
	guiAct2(){                                           //guiAct 클래스의 생정자. 
		setTitle("corona information program");
		setLayout(new BorderLayout(10,10));    
		
		makeMenu();//makeMenu()메서드 실행 
		showEast();//프레임 왼쪽에 붙는 예방수칙 텍스트 영역을 만들어내는 showEast메서드 실행 
		show_image_center(); //서울시 이미지를 프레임의 중앙에 표시하는 메서드  
		//showSouth();
		//new image_show();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x를 누르면 바로 종료함. 
		setSize(1080,600);                              //화면 크기 1080X720 설정  
		setVisible(true);                               //gui창 보이게 함. 
	}
	
	//---------------------새로운 창을 만들어서 메뉴의 내용을 출력해준다. database를 확인하기 위한 목적임 ------------------------	
	//메뉴바에 있는 보기 메뉴를 클릭했을 때 각 메뉴에 따른 내용을 출력해줄 수 있는 내용. switch에서 호출할 클래스임. 
	//새로운 창을 만들고, 텍스트 영역에 해당하는 데이터값을 표시해준다. 
		static class newWindow extends JFrame{ //정적 메서드 // 미리 로드시켜놓는다. 
			JPanel panel;   //다른 메서드에서 사용할 수 있도록 static으로 정의했다.  
			static JTextArea area; //다른 메서드에서 사용할 수 있도록 static으로 정의했다. 
			newWindow(){
				setTitle("해당 내용 출력");
				setLayout(new BorderLayout(10,10));
				
				panel = new JPanel();
				area = new JTextArea(30,20);
				area.setText("");
				area.setEditable(false);
				area.setForeground(Color.BLUE);			
				panel.add(area);
				add(panel,BorderLayout.CENTER);		

				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //종료할때 이 창만 종료시키고, 자원을 모두 반납한다. 
				setSize(300,500);
				setVisible(true);
			}
		}
		class newWindow_for_button extends JFrame{ //정적 메서드 // 미리 로드시켜놓는다. 
			JPanel panel;   //다른 메서드에서 사용할 수 있도록 static으로 정의했다.  
			JTextArea area; //다른 메서드에서 사용할 수 있도록 static으로 정의했다. 
			JScrollPane scrollPane;
			newWindow_for_button(int i){  //버튼을 눌렀을 때 사용할 메서드의 생성자 정의이다. 

				setTitle("Data");
				setLayout(new BorderLayout(10,10));
				
				panel = new JPanel();
				area = new JTextArea(30,20);
				
				//String log = Database_sort_by_number.sb_value().toString()	
				new Database_sort_by_number(i);// int i는 각각 1~14번에 해당하는 번호를 의미한다. Database_sort_by_number에 인수로 전달하고 해당클래스 내부에서
				//데이터 정렬을 진행한다. 
				area.setText(Database_sort_by_number.sb_value().toString()); //번호에 따른 정보를 toString으로 가져온다. 
				area.setEditable(false);
				area.setForeground(Color.BLUE);		
				scrollPane = new JScrollPane(area);
				//panel.add(scrollPane);
				panel.add(area);
				add(panel,BorderLayout.CENTER);		

				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //종료할때 이 창만 종료시키고, 자원을 모두 반납한다. 
				setSize(300,500);
				setVisible(true);
			}

		}
	//---------------------새로운 창을 만들어서 메뉴의 내용을 출력해준다. database를 확인하기 위한 목적임 ------------------------

	class MyPanel extends JPanel{ // 이미지를 생성하는 클래스 new Mypanel(s) 이때 s 경로에 path 값을 써주면 됩니다. 
		BufferedImage img;
		public MyPanel(String s) {
			try {
				img = ImageIO.read(new File(s));
			}catch(IOException e) {}
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,getWidth(),getHeight(),null);
		}
	}
	
	// 프레임의 정중앙에 서울시 이미지를 출력하는 메서드 입니다. 
	void show_image_center() {

		add(new MyPanel("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\map.png"));
	}
	
	//예방 수칙 패널에 담아 출력 하기 
	void showEast() {
		
		JPanel panel_east_main = new JPanel();   //프레임에 부착할 메인 패널을 생성한다. 
		
		JPanel panel_east_top = new JPanel();//메인 패널에 부착할 우측 상단의 패널을 생성함,. 
		JPanel panel_east_center = new JPanel();//메인 패널에 부착할 우측 중앙의 패널을 생성한다. 
		JPanel panel_east_bottom = new JPanel(); //메인 패널의 우측 하단에 부착할 패널을 생성함. 
		JTextArea area1 = new JTextArea(30,40);  //텍스트 영역을 생성한다, 
		//JTextArea area2 = new JTextArea(30,40);  //텍스트 영역을 생성한다,. 
		
		JCheckBox cb1 = new JCheckBox("발열"); //체크박스를 생성한다. 코로나 진단 검사를 간단하게 실시해주는 체크박스이다. 
		cb1.setBounds(100,100,150,20);
		panel_east_center.add(cb1);
		
		JButton btn1 = new JButton("연번"); //1~14번에 해당하는 버튼을 정의한다. 
		JButton btn2 = new JButton("확진일");
		JButton btn3 = new JButton("환자번호");
		JButton btn4 = new JButton("국적");
		JButton btn5 = new JButton("환자정보");
		JButton btn6 = new JButton("지역");
		JButton btn7 = new JButton("여행력");
		JButton btn8 = new JButton("접촐력");
		JButton btn9 = new JButton("조치사항");
		JButton btn10 = new JButton("상태");
		JButton btn11 = new JButton("이동경로");
		JButton btn12= new JButton("등록일");
		JButton btn13 = new JButton("수정일");
		JButton btn14 = new JButton("노출여부");
		
		panel_east_bottom.setLayout(new GridLayout(0,2)); //우측 하단의 패널의 정렬릉ㄹ 3열로 정의한다. 
		panel_east_main.setLayout(new GridLayout(0,1));  //메인 패널의 정렬을 gridlayout으로 한다. 1열을 생성한다. 
		
		area1.setText("1. 흐르는 물에 비누로 손을 꼼꼼하게 씻기. \n"         
					+ "2. 기침이나 재채기 할 때 옷소매로 입과 코를 가리기.\n"
					+ "3. 씻지 않은 손으로 눈,코,입 만지지 않기.\n"
					+ "4. 사람 많은 곳에 방문을 자제하고 의료기관 방문 시 마스크 착용. \n"
					+ "5. 발열 호흡기 증상이 있는 사람과 접촉 피하기. \n"
					+ "\n"
					+ "콜센터: 1339 \n"
					+ "지역번호+129 \n"
					+ "보건소 문의, 선별진료소 우선 방문 진료 \n");
		area1.setEditable(false);        
		area1.setForeground(Color.BLUE);

		//area2.setText("for image space");
		//area2.setEditable(false);
		//area2.setForeground(Color.BLUE);
		
		panel_east_bottom.add(btn1);
		panel_east_bottom.add(btn2);
		panel_east_bottom.add(btn3);
		panel_east_bottom.add(btn4);
		panel_east_bottom.add(btn5);
		panel_east_bottom.add(btn6);
		panel_east_bottom.add(btn7);
		panel_east_bottom.add(btn8);
		panel_east_bottom.add(btn9);
		panel_east_bottom.add(btn10);
		panel_east_bottom.add(btn11);
		panel_east_bottom.add(btn12);
		panel_east_bottom.add(btn13);
		panel_east_bottom.add(btn14);
//		JButton btn1 = (JButton) (e.getSource());    // 버튼을 클릭했을 때 동작을 정의한다. 
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) (e.getSource());
				
				switch(btn.getText()) {
				case "연번":
					new newWindow_for_button(1); //새로운 윈도우 창을 오픈한다. 
					System.out.println("연번이 클릭되었습니다.");
					break;
				case "확진일":
					new newWindow_for_button(2);
					System.out.println("확진일이 클릭되었습니다.");
					break;
				case "환자번호":
					new newWindow_for_button(3);
					System.out.println("환자번호이 클릭되었습니다.");
					break;
				case "국적":
					new newWindow_for_button(4);
					System.out.println("국적이 클릭되었습니다.");
					break;
				case "환자정보":
					new newWindow_for_button(5);
					System.out.println("환자정보이 클릭되었습니다.");
					break;
				case "지역":
					new newWindow_for_button(6);
					System.out.println("지역이 클릭되었습니다.");
					break;
				case "여행력":
					new newWindow_for_button(7);
					System.out.println("여행력이 클릭되었습니다.");
					break;
				case "접촉력":
					new newWindow_for_button(8);
					System.out.println("접촉력이 클릭되었습니다.");
					break;
				case "조치사항":
					new newWindow_for_button(9);
					System.out.println("조치사항이 클릭되었습니다.");
					break;
				case "상태":
					new newWindow_for_button(10);
					System.out.println("상태이 클릭되었습니다.");
					break;
				case "이동경로":
					new newWindow_for_button(11);
					System.out.println("이동경로이 클릭되었습니다.");
					break;
				case "등록일":
					new newWindow_for_button(12);
					System.out.println("등록일이 클릭되었습니다.");
					break;
				case "수정일":
					new newWindow_for_button(13);
					System.out.println("수정일이 클릭되었습니다.");
					break;
				case "노출여부":
					new newWindow_for_button(14);
					System.out.println("노출여부이 클릭되었습니다.");
					break;	
				}
			}
		};
		
		
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		btn3.addActionListener(l);
		btn4.addActionListener(l);
		btn5.addActionListener(l);
		btn6.addActionListener(l);
		btn7.addActionListener(l);
		btn8.addActionListener(l);
		btn9.addActionListener(l);
		btn10.addActionListener(l);
		btn11.addActionListener(l);
		btn12.addActionListener(l);
		btn13.addActionListener(l);
		btn14.addActionListener(l);



		panel_east_top.add(area1);                 //우측상단 패널에 area1 텍스트영역을 부착한다. 
		panel_east_main.add(panel_east_top);       //메인 패널에 우측상단 패널을 부착한다. 
		panel_east_main.add(panel_east_center);    //메인 패널에 우측중앙에 부착한다. 
		panel_east_main.add(panel_east_bottom);    //메인 패널에 우측하단 패널을 부착한다. 
		
		add(panel_east_main,BorderLayout.EAST);    //메인 프레임에 패널을 부착한다. 
	}
	
	void makeMenu() {    //메뉴바를 생성하고 세부 사항을 생성하는 메서드입니다. 
		JMenuItem item;
		JMenuBar mb = new JMenuBar();
		JMenu m0 = new JMenu("프로그램 정보");
		JMenu m1 = new JMenu("설정");
		JMenu m2 = new JMenu("데이터베이스");
		JMenu m3 = new JMenu("코로나 정보");
		JMenu m4 = new JMenu("더 많은 정보");
		
//-----------------------ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ-------------------------	
		item = new JMenuItem("프로그램 설명");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("개발 환경");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("개발 기간");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("개발자 정보");
		item.addActionListener(this);
		m0.add(item);
//-----------------------ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ-------------------------
		item = new JMenuItem("텍스트 데이터 열기");
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("파일 저장");
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("종료");
		item.addActionListener(this);
		m1.add(item);
//-------------------------ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ-------------------------	
//--------------------------ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ---------------------------
		item = new JMenuItem("year_number출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("confirm_date출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("patient_number출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("nation출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("patient_info출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("location출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("travel출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("contact출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("action출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("state출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("move_trace출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("regist_date출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("modify_date출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("execute출력");
		item.addActionListener(this);
		m2.add(item);
//-------------------------ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ--------------------------			
		item = new JMenuItem("COVID-19정보");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("바이러스 분류표");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("국내 동향");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("국내 백신");
		item.addActionListener(this);
		m3.add(item);
		
		
		
		
		item = new JMenuItem("해외 코로나 정보");
		item.addActionListener(this);
		m4.add(item);
		item = new JMenuItem("해외 코로나 사이트");
		item.addActionListener(this);
		m4.add(item);
		item = new JMenuItem("해외 바이러스 문건");
		item.addActionListener(this);
		m4.add(item);
		item = new JMenuItem("해외 백신 정보");
		item.addActionListener(this);
		m4.add(item);
		
			
		
		mb.add(m0);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		setJMenuBar(mb);
	}

//------------------------------------------------------------------------------------------------------------	
	//@SuppressWarnings("resource")
	public void actionPerformed(ActionEvent e) {  //메뉴에 있는 항목 중 하나를 클릭했을 때// 발생하는 동작을 정의함. 
		JMenuItem mi = (JMenuItem) (e.getSource()); //메뉴 아이템을 클릭했을때. 	
		//Connection con = Database_create.makeConnection();        //database클래스의 action()메서드에서 con객체를 전달받아 Connection타입으로 사용한다. 
		System.out.println("2");
		try { //SQLException 으로 예외처리문을 만든다. 해당 
			
			System.out.println("3");		
	//각 이벤트에 따른 실행문을 case로 나눔. 	
			switch(mi.getText()) {
			case "프로그램 설명":
				//corona_info();
				new newWindow();
				newWindow.area.setText("프로그램 설명");
				break;
			case "개발 환경":
				new newWindow();
				newWindow.area.setText("개발 환경");
				break;
			case "개발 기간":
				new newWindow();
				newWindow.area.setText("개발 기간");
				break;
			case "개발자 정보":
				new newWindow();
				newWindow.area.setText("개발자 정보");
				break;
			
			case "COVID-19정보":
				//corona_info();
				new newWindow();
				newWindow.area.setText("COVID-19정보");
				break;
			case "바이러스 분류표":
				new newWindow();
				newWindow.area.setText("바이러스 분류표");
				break;
			case "국내 동향":
				new newWindow();
				newWindow.area.setText("국내 동향");
				break;
			case "국내 백신":
				new newWindow();
				newWindow.area.setText("국내 백신");
				break;
				
			case "해외 코로나 정보":
				new newWindow();
				newWindow.area.setText("해외 코로나 정보");
				break;
			case "해외 코로나 사이트":
				new newWindow();
				newWindow.area.setText("해외 코로나 사이트");
				break;
			case "해외 바이러스 문건":
				new newWindow();
				newWindow.area.setText("해외 바이러스 문건");
				break;
			case "해외 백신 정보":
				new newWindow();
				newWindow.area.setText("해외 백신 정보");
				break;		
				
			case "텍스트 데이터 열기":
				//해당 경로에 있는 파일을 오픈합니다. 
				Desktop.getDesktop().edit(new File("C:\\Users\\user\\Desktop\\java\\corona\\src\\original_csv_file\\test_text_old.csv"));
				break;
			case "파일 저장":
				new newWindow();
				newWindow.area.setText("파일 저장");
				break;
			case "종료":
				System.exit(0);//종료 누르면 프로그램 종료합니다. 
				break;	
		}
		}catch (IOException e1) { //desktop을 통해  메모장을 실행할 경우에 발생할 수 있는 예외를 처리합니다. 
			e1.printStackTrace();
			System.out.printf("IOException 예외가 발생했습니다:%s",e1);
		}
	}
	
	
	
	
	
	
	
}
