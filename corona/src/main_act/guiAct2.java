package main_act;
//메인프레임과 함께 gui이벤트를 정의한 클래스입니다. 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class guiAct2 extends JFrame implements ActionListener{
	static ImageIcon background_icon,seoul_icon,east_icon,wash_icon; //배경이미지 오른쪽 메뉴들 BACKGROUND에 이미지 삽입해줌.  static으로 해야됨. 그래야 함수에서 사용가능. 
	static JPanel main_background;
	
	guiAct2(){                                          
		setTitle("CORONA DESKTOP VIEWER");
		setLayout(new BorderLayout(10,10));    
		
		//프레임바 자바 이모티콘 말고, 원하는 이미지로 지정함. 
		ImageIcon img = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\covid.jpg");
		setIconImage(img.getImage());
		
		
		background_icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\coronavirus-4833754_1280.jpg");
		main_background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(background_icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);;
			}
		}; 
		main_background.setLayout(null);  //절대 위치로 지정하기 위해 layout을 null로 줬다. 
		 
		show_image_center();
		showEast();
		makeMenu();
		wash_image();
		
		add(main_background);
		dispose();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1180,620);                             
		setVisible(true);                              
	}
	
	static void show_image_center() {
		seoul_icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\map2.png");
		JPanel seoul_background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(seoul_icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);;
			}
		};

		seoul_background.setPreferredSize(new Dimension(400,400));      //panel 사이즈를 임의로 지정함. 
		seoul_background.setBounds(30,30,500,500);                      //패널의 절대위치와 사이즈를 지정함. 
		main_background.add(seoul_background);
	}
	
	void wash_image() {
		wash_icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\how2.jpg");
		JPanel wash_background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(wash_icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);;
			}
		};
//		wash_background.setPreferredSize(new Dimension(50,50));      
		wash_background.setBounds(890,30,250,500); //990 30 / 326 800                    
		main_background.add(wash_background);
	}
	
	void showEast() {
		JButton btn1 = new JButton("연번");
		JButton btn2 = new JButton("확진일");
		JButton btn3 = new JButton("환자번호");
		JButton btn4 = new JButton("국적");
		JButton btn5 = new JButton("환자정보");
		JButton btn6 = new JButton("지역");
		JButton btn7 = new JButton("여행력");
		JButton btn8 = new JButton("접촉력");
		JButton btn9 = new JButton("조치사항");
		JButton btn10 = new JButton("상태");
		JButton btn11 = new JButton("이동경로");
		JButton btn12= new JButton("등록일");
		JButton btn13 = new JButton("수정일");
		JButton btn14 = new JButton("노출여부");
		
		JTextArea area1 = new JTextArea(30,40);
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
		area1.setBounds(560,30,300,175);
		
		btn1.setBounds(560,235,100,30);
		btn2.setBounds(670,235,100,30);
		btn3.setBounds(560,275,100,30);
		btn4.setBounds(670,275,100,30);
		btn5.setBounds(560,315,100,30);
		btn6.setBounds(670,315,100,30);
		btn7.setBounds(560,355,100,30);
		btn8.setBounds(670,355,100,30);
		btn9.setBounds(560,395,100,30);
		btn10.setBounds(670,395,100,30);
		btn11.setBounds(560,435,100,30);
		btn12.setBounds(670,435,100,30);
		btn13.setBounds(560,475,100,30);
		btn14.setBounds(670,475,100,30);
		
		main_background.add(btn1);
		main_background.add(btn2);
		main_background.add(btn3);
		main_background.add(btn4);
		main_background.add(btn5);
		main_background.add(btn6);
		main_background.add(btn7);
		main_background.add(btn8);
		main_background.add(btn9);
		main_background.add(btn10);
		main_background.add(btn11);
		main_background.add(btn12);
		main_background.add(btn13);
		main_background.add(btn14);
		
		main_background.add(area1);
		
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
		}
	
	
	
	
	void makeMenu() {    //메뉴바를 생성하고 세부 사항을 생성하는 메서드입니다. 
		JMenuItem item;
		JMenuBar mb = new JMenuBar();
		JMenu m0 = new JMenu("프로그램 정보");
		JMenu m1 = new JMenu("설정");
		JMenu m2 = new JMenu("데이터베이스");
		JMenu m3 = new JMenu("코로나 정보");
		JMenu m4 = new JMenu("더 많은 정보");
		
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

		item = new JMenuItem("텍스트 데이터 열기");
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("파일 저장");
		item.addActionListener(this);
		m1.add(item);
		//item = new JMenuItem("종료",KeyEvent.VK_F);
		item.addActionListener(this);
		m1.add(item);

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
	
		item = new JMenuItem("COVID-19정보");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("정부 최신 뉴스");
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
	
	
	public void actionPerformed(ActionEvent e) { 
		JMenuItem mi = (JMenuItem) (e.getSource()); 
		System.out.println("2");
		try { 
			
			System.out.println("메뉴바 리스너 정상적으로 작동됩니다.");		
			switch(mi.getText()) {
			case "프로그램 설명":
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
				new newWindow();
				newWindow.area.setText("COVID-19정보");
				break;
			case "정부 최신 뉴스":
				new newWindow();
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
				newWindow.area.setText("아직 구현되지 않았습니다.");
				break;
			case "종료":
				System.exit(0);
				break;	
		}
		}catch (IOException e1) { //desktop을 통해  메모장을 실행할 경우에 발생할 수 있는 예외를 처리합니다. 
			e1.printStackTrace();
			System.out.printf("IOException 예외가 발생했습니다:%s",e1);
		}
	}
}
