
//import java.awt.Color;
//
//import javax.swing.JPanel;
//import javax.swing.JTextArea;

//package main_act;
//
//public class test_things {
//
//}


//
//		JPanel panel_east = new JPanel();
//		
//		JTextArea area = new JTextArea(50,10);
//		
//		area.setText("1. 흐르는 물에 비누로 손을 꼼꼼하게 씻기. \n"
//					+ "2. 기침이나 재채기 할 때 옷소매로 입과 코를 가리기.\n"
//					+ "3. 씻지 않은 손으로 눈,코,입 만지지 않기.\n"
//					+ "4. 사람 많은 곳에 방문을 자제하고 의료기관 방문 시 마스크 착용. \n"
//					+ "5. 발열 호흡기 증상이 있는 사람과 접촉 피하기. \n"
//					+ "\n"
//					+ "콜센터: 1339 \n"
//					+ "지역번호+129 \n"
//					+ "보건소 문의, 선별진료소 우선 방문 진료 \n");
//		area.setEditable(false);
//		area.setForeground(Color.BLUE);
//
//		JTextArea area2 = new JTextArea(50,10);
//		area.setText("123");
//		area2.setEditable(false);
//		area2.setForeground(Color.BLUE);
//		
//		
//		panel_east.add(area);	
//		panel_east.add(area2);
//		add(panel_east,BorderLayout.EAST);




//
//package main_act;
////메인프레임과 함께 gui이벤트를 정의한 클래스입니다. 
//
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//
//@SuppressWarnings("serial")
//public class guiAct2 extends JFrame implements ActionListener{
//	
////	Graphics screenGraphics;
////	Image screenImage;
////	Image introBackground; 
////	JPanel pn1;
////	JButton btn;
////	
//	
//	
//	//생성자
//	guiAct2(){                                           //guiAct 클래스의 생정자. 
//		setTitle("corona information program");
//		setLayout(new BorderLayout(10,10));    
//		
//		makeMenu();//makeMenu()메서드 실행 
//		showEast();//프레임 왼쪽에 붙는 예방수칙 텍스트 영역을 만들어내는 showEast메서드 실행 
//		show_image_center(); //서울시 이미지를 프레임의 중앙에 표시하는 메서드  
//
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x를 누르면 바로 종료함. 
//		setSize(1080,720);                              //화면 크기 1080X720 설정  
//		setVisible(true);                               //gui창 보이게 함. 
//	}
//	
//	
//	// 프레임의 정중앙에 서울시 이미지를 출력하는 메서드 입니다. 
//	void show_image_center() {
//		class MyPanel extends JPanel{
//			BufferedImage img;
//			public MyPanel() {
//				try {
//					
//					img = ImageIO.read(new File("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\map.png"));
//				}catch(IOException e) {}
//			}
//			public void paintComponent(Graphics g) {
//				super.paintComponent(g);
//				g.drawImage(img,0,0,getWidth(),getHeight(),null);
//			}
//		}
//		add(new MyPanel());	
//	}
////중앙에 서울시 이미지 박는데, 이미지랑 오른쪽 EAST 텍스트 영역이랑 겹침. 둘중 하나 사이즈 조정해놓으셈 ㅇㅋ? 
//	
//	
//	
//	//예방 수칙 패널에 담아 출력 하기 
//	void showEast() {
//		
//		JPanel panel_east_main = new JPanel();   //프레임에 부착할 메인 패널을 생성한다. 
//		JPanel panel_east_top = new JPanel();    //메인 패널에 부착할 우측 상단의 패널을 생성함,. 
//		JPanel panel_east_bottom = new JPanel(); //메인 패널의 우측 하단에 부착할 패널을 생성함. 
//		
//		JTextArea area1 = new JTextArea(30,30);  //텍스트 영역을 생성한다, 
//		JTextArea area2 = new JTextArea(30,40);  //텍스트 영역을 생성한다,. 
//		
//		panel_east_main.setLayout(new GridLayout(0,1));  //메인 패널의 정렬을 gridlayout으로 한다. 1열을 생성한다. 
//		
//		area1.setText("1. 흐르는 물에 비누로 손을 꼼꼼하게 씻기. \n"         
//					+ "2. 기침이나 재채기 할 때 옷소매로 입과 코를 가리기.\n"
//					+ "3. 씻지 않은 손으로 눈,코,입 만지지 않기.\n"
//					+ "4. 사람 많은 곳에 방문을 자제하고 의료기관 방문 시 마스크 착용. \n"
//					+ "5. 발열 호흡기 증상이 있는 사람과 접촉 피하기. \n"
//					+ "\n"
//					+ "콜센터: 1339 \n"
//					+ "지역번호+129 \n"
//					+ "보건소 문의, 선별진료소 우선 방문 진료 \n");
//		area1.setEditable(false);        
//		area1.setForeground(Color.BLUE);
//
//		area2.setText("1234567891523456789");
//		area2.setEditable(false);
//		area2.setForeground(Color.BLUE);
//		
//		panel_east_top.add(area1);                 //우측상단 패널에 area1 텍스트영역을 부착한다. 
//		panel_east_bottom.add(area2);              //우측하단 패널에 area2텍스트영역을 부착한다. 
//		
//		panel_east_main.add(panel_east_top);       //메인 패널에 우측상단 패널을 부착한다. 
//		panel_east_main.add(panel_east_bottom);    //메인 패널에 우측상단 패널을 부착한다. 
//		
//		add(panel_east_main,BorderLayout.EAST);    //메인 프레임에 패널을 부착한다. 
////		panel_east.add(area);	
////		panel_east.add(area2);
////		add(panel_east,BorderLayout.EAST);
//
//	}
//	
//	void corona_info() {  //메뉴바에 있는 코로나 정보 의 항목 중 covid-19 정보 에 관한 내용입니다. 
//		new newWindow();
//	}
//
//	
//	void makeMenu() {    //메뉴바를 생성하고 세부 사항을 생성하는 메서드입니다. 
//		JMenuItem item;
//		JMenuBar mb = new JMenuBar();
//		JMenu m1 = new JMenu("설정");
//		JMenu m2 = new JMenu("보기");
//		JMenu m3 = new JMenu("코로나 정보");
////--------------------------메뉴바에 설정 관련된 메뉴항목들 추가--------------------------
//		item = new JMenuItem("데이터");
//		item.addActionListener(this);
//		m1.add(item);
//		
//		item = new JMenuItem("파일 열기");
//		item.addActionListener(this);
//		m1.add(item);
//		
//		item = new JMenuItem("파일 저장");
//		item.addActionListener(this);
//		m1.add(item);
//		
//		item = new JMenuItem("종료");
//		item.addActionListener(this);
//		m1.add(item);
////--------------------------설정 관련된 메뉴항목들 --------------------------	
////--------------------------메뉴바에 보기 관련된 메뉴항목들 추가---------------------------
//		item = new JMenuItem("year_number출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("confirm_date출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("patient_number출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("nation출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("patient_info출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("location출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("travel출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("contact출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("action출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("state출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("move_trace출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("regist_date출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("modify_date출력");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("execute출력");
//		item.addActionListener(this);
//		m2.add(item);
//		//--------------------------보기 관련된 메뉴항목들---------------------------	
//		
//		item = new JMenuItem("COVID-19정보");
//		item.addActionListener(this);
//		m3.add(item);
//		
//		
//		mb.add(m1);
//		mb.add(m2);
//		setJMenuBar(mb);
//	}
//	
//	
//	
////---------------------새로운 창을 만들어서 메뉴의 내용을 출력해준다. database를 확인하기 위한 목적임 ------------------------	
////메뉴바에 있는 보기 메뉴를 클릭했을 때 각 메뉴에 따른 내용을 출력해줄 수 있는 내용. switch에서 호출할 클래스임. 
////새로운 창을 만들고, 텍스트 영역에 해당하는 데이터값을 표시해준다. 
//	class newWindow extends JFrame{
//		
//		newWindow(){
//			setTitle("해당 내용 출력");
//			setLayout(new BorderLayout(10,10));
//			
//			JPanel panel = new JPanel();
//			JTextArea area = new JTextArea(30,20);
//			area.setText("");
//			area.setEditable(false);
//			area.setForeground(Color.BLUE);			
//			panel.add(area);
//			add(panel,BorderLayout.CENTER);		
//
//			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //종료할때 이 창만 종료시키고, 자원을 모두 반납한다. 
//			setSize(300,500);
//			setVisible(true);
//		}
//	}
////---------------------새로운 창을 만들어서 메뉴의 내용을 출력해준다. database를 확인하기 위한 목적임 ------------------------		
//	
//
//	public static Connection action() {  //Database_create 클래스의 makeConnection()함수에서 생성한 con객체를 전달받는다. (Connection 타입으로)
//		Connection con = Database_create.makeConnection();
//		System.out.println("1");
//		return con;                      //con을 반환한다. 반환해서 show_data로 전달한다. 
//	}
//	
////------------------------------------------------------------------------------------------------------------	
//	@SuppressWarnings("resource")
//	public void actionPerformed(ActionEvent e) {  //메뉴에 있는 항목 중 하나를 클릭했을 때// 발생하는 동작을 정의함. 
//		JMenuItem mi = (JMenuItem) (e.getSource());
//		Connection con = action();        //action()메서드에서 con객체를 전달받아 Connection타입으로 사용한다. 
//		System.out.println("2");
//		
//		try { //SQLException 으로 예외처리문을 만든다. 해당 
//			String sql = "SELECT year_number FROM test_table3;";  //SQL 전달문을 NULL로 만들면 SQLException 이 발생한다. sql전달문은 null이 될 수 없다. 
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			System.out.println("3");
//			
//			
//		
//			
//			
//		switch(mi.getText()) {
//		case "year_number출력":	
//			sql = "SELECT year_number FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();	
//			new newWindow();
//			while(rs.next())
//				//s1.push(rs.getString("year_number")); //Stack에 getString을 통해 얻은 데이터를 문자열 형식으로 저장한다. 하나씩 저장한다. 
//				System.out.println("year_number:"+rs.getString("year_number"));
//			break;
//			
//		case "confirm_date출력":	
//			sql = "SELECT confirm_date FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("confirm_date:"+rs.getString("confirm_date"));
//			break;
//			
//		case "patient_number출력":
//			sql = "SELECT patient_number FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("patient_number:"+rs.getString("patient_number"));
//			break;
//			
//		case "nation출력":
//			sql = "SELECT nation FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("nation:"+rs.getString("nation"));
//			break;
//			
//		case "patient_info출력":
//			sql = "SELECT patient_info FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("patient_info:"+rs.getString("patient_info"));
//			break;
//			
//		case "location출력":
//			sql = "SELECT location FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("location:"+rs.getString("location"));
//			break;
//			
//		case "travel출력":
//			sql = "SELECT travel FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("travel:"+rs.getString("travel"));
//			break;
//			
//		case "contact출력":
//			sql = "SELECT contact FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("contact:"+rs.getString("contact"));
//			break;
//			
//		case "action출력":
//			sql = "SELECT action FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("action:"+rs.getString("action"));
//			break;
//			
//		case "state출력":
//			sql = "SELECT state FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("state:"+rs.getString("state"));
//			break;
//			
//		case "move_trace출력":
//			sql = "SELECT move_trace FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("move_trace:"+rs.getString("move_trace"));
//			break;
//			
//		case "regist_date출력":
//			sql = "SELECT regist_date FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("regist_date:"+rs.getString("regist_date"));
//			break;
//			
//		case "modify_date출력":
//			sql = "SELECT modify_date FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("modify_date:"+rs.getString("modify_date"));
//			break;
//			
//		case "exposure출력":
//			sql = "SELECT exposure FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("exposure:"+rs.getString("exposure"));
//		}
//		}catch(SQLException e_of_switch) {
//			System.out.printf("SQLException 예외가 발생했습니다:%s",e_of_switch);
//		}	
//	}
//}





//202010005

//case "year_number출력":	
//sql = "SELECT year_number FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();	
//new newWindow();
//while(rs.next())
//	//s1.push(rs.getString("year_number")); //Stack에 getString을 통해 얻은 데이터를 문자열 형식으로 저장한다. 하나씩 저장한다. 
//	System.out.println("year_number:"+rs.getString("year_number"));
//break;
//
//case "confirm_date출력":	
//sql = "SELECT confirm_date FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("confirm_date:"+rs.getString("confirm_date"));
//break;
//
//case "patient_number출력":
//sql = "SELECT patient_number FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("patient_number:"+rs.getString("patient_number"));
//break;
//
//case "nation출력":
//sql = "SELECT nation FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("nation:"+rs.getString("nation"));
//break;
//
//case "patient_info출력":
//sql = "SELECT patient_info FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("patient_info:"+rs.getString("patient_info"));
//break;
//
//case "location출력":
//sql = "SELECT location FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("location:"+rs.getString("location"));
//break;
//
//case "travel출력":
//sql = "SELECT travel FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("travel:"+rs.getString("travel"));
//break;
//
//case "contact출력":
//sql = "SELECT contact FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("contact:"+rs.getString("contact"));
//break;
//
//case "action출력":
//sql = "SELECT action FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("action:"+rs.getString("action"));
//break;
//
//case "state출력":
//sql = "SELECT state FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("state:"+rs.getString("state"));
//break;
//
//case "move_trace출력":
//sql = "SELECT move_trace FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("move_trace:"+rs.getString("move_trace"));
//break;
//
//case "regist_date출력":
//sql = "SELECT regist_date FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("regist_date:"+rs.getString("regist_date"));
//break;
//
//case "modify_date출력":
//sql = "SELECT modify_date FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("modify_date:"+rs.getString("modify_date"));
//break;
//
//case "exposure출력":
//sql = "SELECT exposure FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("exposure:"+rs.getString("exposure"));


	//지도에 표시될 버튼을 정의한다. 
	

//	void show_image_center() {
//		new MyPanel();
//		add(new MyPanel("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\map.png"));	
//	}
//	****************수정사항*************************
// 중앙에 서울시 이미지 박는데, 이미지랑 오른쪽 EAST 텍스트 영역이랑 겹침. 둘중 하나 사이즈 조정해놓으셈 ㅇㅋ? 
//	void corona_info() {  //메뉴바에 있는 코로나 정보 의 항목 중 covid-19 정보 에 관한 내용입니다. 
//		new newWindow();  //newWindow() 클래스를 생성자를 통해 생성한다. 
//		newWindow.area.setText("dd");  //newWindow클래스의 area의 내용을 정의한다. 
//	}
//	****************수정사항  위 메서드 corona_info() 필요없음. case문에서 그냥 new newWindow()로 생성하고, setText에 접근해서 직접 바꾸면 됨, 굳이 메서드 필요없음 . ----
	
	