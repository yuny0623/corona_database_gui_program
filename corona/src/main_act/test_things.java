
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
//		area.setText("1. �帣�� ���� �񴩷� ���� �Ĳ��ϰ� �ı�. \n"
//					+ "2. ��ħ�̳� ��ä�� �� �� �ʼҸŷ� �԰� �ڸ� ������.\n"
//					+ "3. ���� ���� ������ ��,��,�� ������ �ʱ�.\n"
//					+ "4. ��� ���� ���� �湮�� �����ϰ� �Ƿ��� �湮 �� ����ũ ����. \n"
//					+ "5. �߿� ȣ��� ������ �ִ� ����� ���� ���ϱ�. \n"
//					+ "\n"
//					+ "�ݼ���: 1339 \n"
//					+ "������ȣ+129 \n"
//					+ "���Ǽ� ����, ��������� �켱 �湮 ���� \n");
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
////���������Ӱ� �Բ� gui�̺�Ʈ�� ������ Ŭ�����Դϴ�. 
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
//	//������
//	guiAct2(){                                           //guiAct Ŭ������ ������. 
//		setTitle("corona information program");
//		setLayout(new BorderLayout(10,10));    
//		
//		makeMenu();//makeMenu()�޼��� ���� 
//		showEast();//������ ���ʿ� �ٴ� �����Ģ �ؽ�Ʈ ������ ������ showEast�޼��� ���� 
//		show_image_center(); //����� �̹����� �������� �߾ӿ� ǥ���ϴ� �޼���  
//
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x�� ������ �ٷ� ������. 
//		setSize(1080,720);                              //ȭ�� ũ�� 1080X720 ����  
//		setVisible(true);                               //guiâ ���̰� ��. 
//	}
//	
//	
//	// �������� ���߾ӿ� ����� �̹����� ����ϴ� �޼��� �Դϴ�. 
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
////�߾ӿ� ����� �̹��� �ڴµ�, �̹����� ������ EAST �ؽ�Ʈ �����̶� ��ħ. ���� �ϳ� ������ �����س����� ����? 
//	
//	
//	
//	//���� ��Ģ �гο� ��� ��� �ϱ� 
//	void showEast() {
//		
//		JPanel panel_east_main = new JPanel();   //�����ӿ� ������ ���� �г��� �����Ѵ�. 
//		JPanel panel_east_top = new JPanel();    //���� �гο� ������ ���� ����� �г��� ������,. 
//		JPanel panel_east_bottom = new JPanel(); //���� �г��� ���� �ϴܿ� ������ �г��� ������. 
//		
//		JTextArea area1 = new JTextArea(30,30);  //�ؽ�Ʈ ������ �����Ѵ�, 
//		JTextArea area2 = new JTextArea(30,40);  //�ؽ�Ʈ ������ �����Ѵ�,. 
//		
//		panel_east_main.setLayout(new GridLayout(0,1));  //���� �г��� ������ gridlayout���� �Ѵ�. 1���� �����Ѵ�. 
//		
//		area1.setText("1. �帣�� ���� �񴩷� ���� �Ĳ��ϰ� �ı�. \n"         
//					+ "2. ��ħ�̳� ��ä�� �� �� �ʼҸŷ� �԰� �ڸ� ������.\n"
//					+ "3. ���� ���� ������ ��,��,�� ������ �ʱ�.\n"
//					+ "4. ��� ���� ���� �湮�� �����ϰ� �Ƿ��� �湮 �� ����ũ ����. \n"
//					+ "5. �߿� ȣ��� ������ �ִ� ����� ���� ���ϱ�. \n"
//					+ "\n"
//					+ "�ݼ���: 1339 \n"
//					+ "������ȣ+129 \n"
//					+ "���Ǽ� ����, ��������� �켱 �湮 ���� \n");
//		area1.setEditable(false);        
//		area1.setForeground(Color.BLUE);
//
//		area2.setText("1234567891523456789");
//		area2.setEditable(false);
//		area2.setForeground(Color.BLUE);
//		
//		panel_east_top.add(area1);                 //������� �гο� area1 �ؽ�Ʈ������ �����Ѵ�. 
//		panel_east_bottom.add(area2);              //�����ϴ� �гο� area2�ؽ�Ʈ������ �����Ѵ�. 
//		
//		panel_east_main.add(panel_east_top);       //���� �гο� ������� �г��� �����Ѵ�. 
//		panel_east_main.add(panel_east_bottom);    //���� �гο� ������� �г��� �����Ѵ�. 
//		
//		add(panel_east_main,BorderLayout.EAST);    //���� �����ӿ� �г��� �����Ѵ�. 
////		panel_east.add(area);	
////		panel_east.add(area2);
////		add(panel_east,BorderLayout.EAST);
//
//	}
//	
//	void corona_info() {  //�޴��ٿ� �ִ� �ڷγ� ���� �� �׸� �� covid-19 ���� �� ���� �����Դϴ�. 
//		new newWindow();
//	}
//
//	
//	void makeMenu() {    //�޴��ٸ� �����ϰ� ���� ������ �����ϴ� �޼����Դϴ�. 
//		JMenuItem item;
//		JMenuBar mb = new JMenuBar();
//		JMenu m1 = new JMenu("����");
//		JMenu m2 = new JMenu("����");
//		JMenu m3 = new JMenu("�ڷγ� ����");
////--------------------------�޴��ٿ� ���� ���õ� �޴��׸�� �߰�--------------------------
//		item = new JMenuItem("������");
//		item.addActionListener(this);
//		m1.add(item);
//		
//		item = new JMenuItem("���� ����");
//		item.addActionListener(this);
//		m1.add(item);
//		
//		item = new JMenuItem("���� ����");
//		item.addActionListener(this);
//		m1.add(item);
//		
//		item = new JMenuItem("����");
//		item.addActionListener(this);
//		m1.add(item);
////--------------------------���� ���õ� �޴��׸�� --------------------------	
////--------------------------�޴��ٿ� ���� ���õ� �޴��׸�� �߰�---------------------------
//		item = new JMenuItem("year_number���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("confirm_date���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("patient_number���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("nation���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("patient_info���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("location���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("travel���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("contact���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("action���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("state���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("move_trace���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("regist_date���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("modify_date���");
//		item.addActionListener(this);
//		m2.add(item);
//		item = new JMenuItem("execute���");
//		item.addActionListener(this);
//		m2.add(item);
//		//--------------------------���� ���õ� �޴��׸��---------------------------	
//		
//		item = new JMenuItem("COVID-19����");
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
////---------------------���ο� â�� ���� �޴��� ������ ������ش�. database�� Ȯ���ϱ� ���� ������ ------------------------	
////�޴��ٿ� �ִ� ���� �޴��� Ŭ������ �� �� �޴��� ���� ������ ������� �� �ִ� ����. switch���� ȣ���� Ŭ������. 
////���ο� â�� �����, �ؽ�Ʈ ������ �ش��ϴ� �����Ͱ��� ǥ�����ش�. 
//	class newWindow extends JFrame{
//		
//		newWindow(){
//			setTitle("�ش� ���� ���");
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
//			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //�����Ҷ� �� â�� �����Ű��, �ڿ��� ��� �ݳ��Ѵ�. 
//			setSize(300,500);
//			setVisible(true);
//		}
//	}
////---------------------���ο� â�� ���� �޴��� ������ ������ش�. database�� Ȯ���ϱ� ���� ������ ------------------------		
//	
//
//	public static Connection action() {  //Database_create Ŭ������ makeConnection()�Լ����� ������ con��ü�� ���޹޴´�. (Connection Ÿ������)
//		Connection con = Database_create.makeConnection();
//		System.out.println("1");
//		return con;                      //con�� ��ȯ�Ѵ�. ��ȯ�ؼ� show_data�� �����Ѵ�. 
//	}
//	
////------------------------------------------------------------------------------------------------------------	
//	@SuppressWarnings("resource")
//	public void actionPerformed(ActionEvent e) {  //�޴��� �ִ� �׸� �� �ϳ��� Ŭ������ ��// �߻��ϴ� ������ ������. 
//		JMenuItem mi = (JMenuItem) (e.getSource());
//		Connection con = action();        //action()�޼��忡�� con��ü�� ���޹޾� ConnectionŸ������ ����Ѵ�. 
//		System.out.println("2");
//		
//		try { //SQLException ���� ����ó������ �����. �ش� 
//			String sql = "SELECT year_number FROM test_table3;";  //SQL ���޹��� NULL�� ����� SQLException �� �߻��Ѵ�. sql���޹��� null�� �� �� ����. 
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			System.out.println("3");
//			
//			
//		
//			
//			
//		switch(mi.getText()) {
//		case "year_number���":	
//			sql = "SELECT year_number FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();	
//			new newWindow();
//			while(rs.next())
//				//s1.push(rs.getString("year_number")); //Stack�� getString�� ���� ���� �����͸� ���ڿ� �������� �����Ѵ�. �ϳ��� �����Ѵ�. 
//				System.out.println("year_number:"+rs.getString("year_number"));
//			break;
//			
//		case "confirm_date���":	
//			sql = "SELECT confirm_date FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("confirm_date:"+rs.getString("confirm_date"));
//			break;
//			
//		case "patient_number���":
//			sql = "SELECT patient_number FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("patient_number:"+rs.getString("patient_number"));
//			break;
//			
//		case "nation���":
//			sql = "SELECT nation FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("nation:"+rs.getString("nation"));
//			break;
//			
//		case "patient_info���":
//			sql = "SELECT patient_info FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("patient_info:"+rs.getString("patient_info"));
//			break;
//			
//		case "location���":
//			sql = "SELECT location FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("location:"+rs.getString("location"));
//			break;
//			
//		case "travel���":
//			sql = "SELECT travel FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("travel:"+rs.getString("travel"));
//			break;
//			
//		case "contact���":
//			sql = "SELECT contact FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("contact:"+rs.getString("contact"));
//			break;
//			
//		case "action���":
//			sql = "SELECT action FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("action:"+rs.getString("action"));
//			break;
//			
//		case "state���":
//			sql = "SELECT state FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("state:"+rs.getString("state"));
//			break;
//			
//		case "move_trace���":
//			sql = "SELECT move_trace FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("move_trace:"+rs.getString("move_trace"));
//			break;
//			
//		case "regist_date���":
//			sql = "SELECT regist_date FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("regist_date:"+rs.getString("regist_date"));
//			break;
//			
//		case "modify_date���":
//			sql = "SELECT modify_date FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("modify_date:"+rs.getString("modify_date"));
//			break;
//			
//		case "exposure���":
//			sql = "SELECT exposure FROM test_table3;";
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			new newWindow();
//			while(rs.next())
//				System.out.println("exposure:"+rs.getString("exposure"));
//		}
//		}catch(SQLException e_of_switch) {
//			System.out.printf("SQLException ���ܰ� �߻��߽��ϴ�:%s",e_of_switch);
//		}	
//	}
//}





//202010005

//case "year_number���":	
//sql = "SELECT year_number FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();	
//new newWindow();
//while(rs.next())
//	//s1.push(rs.getString("year_number")); //Stack�� getString�� ���� ���� �����͸� ���ڿ� �������� �����Ѵ�. �ϳ��� �����Ѵ�. 
//	System.out.println("year_number:"+rs.getString("year_number"));
//break;
//
//case "confirm_date���":	
//sql = "SELECT confirm_date FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("confirm_date:"+rs.getString("confirm_date"));
//break;
//
//case "patient_number���":
//sql = "SELECT patient_number FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("patient_number:"+rs.getString("patient_number"));
//break;
//
//case "nation���":
//sql = "SELECT nation FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("nation:"+rs.getString("nation"));
//break;
//
//case "patient_info���":
//sql = "SELECT patient_info FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("patient_info:"+rs.getString("patient_info"));
//break;
//
//case "location���":
//sql = "SELECT location FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("location:"+rs.getString("location"));
//break;
//
//case "travel���":
//sql = "SELECT travel FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("travel:"+rs.getString("travel"));
//break;
//
//case "contact���":
//sql = "SELECT contact FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("contact:"+rs.getString("contact"));
//break;
//
//case "action���":
//sql = "SELECT action FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("action:"+rs.getString("action"));
//break;
//
//case "state���":
//sql = "SELECT state FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("state:"+rs.getString("state"));
//break;
//
//case "move_trace���":
//sql = "SELECT move_trace FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("move_trace:"+rs.getString("move_trace"));
//break;
//
//case "regist_date���":
//sql = "SELECT regist_date FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("regist_date:"+rs.getString("regist_date"));
//break;
//
//case "modify_date���":
//sql = "SELECT modify_date FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("modify_date:"+rs.getString("modify_date"));
//break;
//
//case "exposure���":
//sql = "SELECT exposure FROM test_table3;";
//pstmt = con.prepareStatement(sql);
//rs = pstmt.executeQuery();
//new newWindow();
//while(rs.next())
//	System.out.println("exposure:"+rs.getString("exposure"));


	//������ ǥ�õ� ��ư�� �����Ѵ�. 
	

//	void show_image_center() {
//		new MyPanel();
//		add(new MyPanel("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\map.png"));	
//	}
//	****************��������*************************
// �߾ӿ� ����� �̹��� �ڴµ�, �̹����� ������ EAST �ؽ�Ʈ �����̶� ��ħ. ���� �ϳ� ������ �����س����� ����? 
//	void corona_info() {  //�޴��ٿ� �ִ� �ڷγ� ���� �� �׸� �� covid-19 ���� �� ���� �����Դϴ�. 
//		new newWindow();  //newWindow() Ŭ������ �����ڸ� ���� �����Ѵ�. 
//		newWindow.area.setText("dd");  //newWindowŬ������ area�� ������ �����Ѵ�. 
//	}
//	****************��������  �� �޼��� corona_info() �ʿ����. case������ �׳� new newWindow()�� �����ϰ�, setText�� �����ؼ� ���� �ٲٸ� ��, ���� �޼��� �ʿ���� . ----
	
	