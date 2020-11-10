package main_act;
//���������Ӱ� �Բ� gui�̺�Ʈ�� ������ Ŭ�����Դϴ�. 

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
	static ImageIcon background_icon,seoul_icon,east_icon,wash_icon; //����̹��� ������ �޴��� BACKGROUND�� �̹��� ��������.  static���� �ؾߵ�. �׷��� �Լ����� ��밡��. 
	static JPanel main_background;
	
	guiAct2(){                                          
		setTitle("CORONA DESKTOP VIEWER");
		setLayout(new BorderLayout(10,10));    
		
		//�����ӹ� �ڹ� �̸�Ƽ�� ����, ���ϴ� �̹����� ������. 
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
		main_background.setLayout(null);  //���� ��ġ�� �����ϱ� ���� layout�� null�� ���. 
		 
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

		seoul_background.setPreferredSize(new Dimension(400,400));      //panel ����� ���Ƿ� ������. 
		seoul_background.setBounds(30,30,500,500);                      //�г��� ������ġ�� ����� ������. 
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
		JButton btn1 = new JButton("����");
		JButton btn2 = new JButton("Ȯ����");
		JButton btn3 = new JButton("ȯ�ڹ�ȣ");
		JButton btn4 = new JButton("����");
		JButton btn5 = new JButton("ȯ������");
		JButton btn6 = new JButton("����");
		JButton btn7 = new JButton("�����");
		JButton btn8 = new JButton("���˷�");
		JButton btn9 = new JButton("��ġ����");
		JButton btn10 = new JButton("����");
		JButton btn11 = new JButton("�̵����");
		JButton btn12= new JButton("�����");
		JButton btn13 = new JButton("������");
		JButton btn14 = new JButton("���⿩��");
		
		JTextArea area1 = new JTextArea(30,40);
		area1.setText("1. �帣�� ���� �񴩷� ���� �Ĳ��ϰ� �ı�. \n"         
				+ "2. ��ħ�̳� ��ä�� �� �� �ʼҸŷ� �԰� �ڸ� ������.\n"
				+ "3. ���� ���� ������ ��,��,�� ������ �ʱ�.\n"
				+ "4. ��� ���� ���� �湮�� �����ϰ� �Ƿ��� �湮 �� ����ũ ����. \n"
				+ "5. �߿� ȣ��� ������ �ִ� ����� ���� ���ϱ�. \n"
				+ "\n"
				+ "�ݼ���: 1339 \n"
				+ "������ȣ+129 \n"
				+ "���Ǽ� ����, ��������� �켱 �湮 ���� \n");
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
				case "����":
					new newWindow_for_button(1); //���ο� ������ â�� �����Ѵ�. 
					System.out.println("������ Ŭ���Ǿ����ϴ�.");
					break;
				case "Ȯ����":
					new newWindow_for_button(2);
					System.out.println("Ȯ������ Ŭ���Ǿ����ϴ�.");
					break;
				case "ȯ�ڹ�ȣ":
					new newWindow_for_button(3);
					System.out.println("ȯ�ڹ�ȣ�� Ŭ���Ǿ����ϴ�.");
					break;
				case "����":
					new newWindow_for_button(4);
					System.out.println("������ Ŭ���Ǿ����ϴ�.");
					break;
				case "ȯ������":
					new newWindow_for_button(5);
					System.out.println("ȯ�������� Ŭ���Ǿ����ϴ�.");
					break;
				case "����":
					new newWindow_for_button(6);
					System.out.println("������ Ŭ���Ǿ����ϴ�.");
					break;
				case "�����":
					new newWindow_for_button(7);
					System.out.println("������� Ŭ���Ǿ����ϴ�.");
					break;
				case "���˷�":
					new newWindow_for_button(8);
					System.out.println("���˷��� Ŭ���Ǿ����ϴ�.");
					break;
				case "��ġ����":
					new newWindow_for_button(9);
					System.out.println("��ġ������ Ŭ���Ǿ����ϴ�.");
					break;
				case "����":
					new newWindow_for_button(10);
					System.out.println("������ Ŭ���Ǿ����ϴ�.");
					break;
				case "�̵����":
					new newWindow_for_button(11);
					System.out.println("�̵������ Ŭ���Ǿ����ϴ�.");
					break;
				case "�����":
					new newWindow_for_button(12);
					System.out.println("������� Ŭ���Ǿ����ϴ�.");
					break;
				case "������":
					new newWindow_for_button(13);
					System.out.println("�������� Ŭ���Ǿ����ϴ�.");
					break;
				case "���⿩��":
					new newWindow_for_button(14);
					System.out.println("���⿩���� Ŭ���Ǿ����ϴ�.");
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
	
	
	
	
	void makeMenu() {    //�޴��ٸ� �����ϰ� ���� ������ �����ϴ� �޼����Դϴ�. 
		JMenuItem item;
		JMenuBar mb = new JMenuBar();
		JMenu m0 = new JMenu("���α׷� ����");
		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("�����ͺ��̽�");
		JMenu m3 = new JMenu("�ڷγ� ����");
		JMenu m4 = new JMenu("�� ���� ����");
		
		item = new JMenuItem("���α׷� ����");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("���� ȯ��");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("���� �Ⱓ");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("������ ����");
		item.addActionListener(this);
		m0.add(item);

		item = new JMenuItem("�ؽ�Ʈ ������ ����");
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("���� ����");
		item.addActionListener(this);
		m1.add(item);
		//item = new JMenuItem("����",KeyEvent.VK_F);
		item.addActionListener(this);
		m1.add(item);

		item = new JMenuItem("year_number���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("confirm_date���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("patient_number���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("nation���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("patient_info���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("location���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("travel���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("contact���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("action���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("state���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("move_trace���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("regist_date���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("modify_date���");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("execute���");
		item.addActionListener(this);
		m2.add(item);
	
		item = new JMenuItem("COVID-19����");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("���� �ֽ� ����");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("���̷��� �з�ǥ");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("���� ����");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("���� ���");
		item.addActionListener(this);
		m3.add(item);
			
		item = new JMenuItem("�ؿ� �ڷγ� ����");
		item.addActionListener(this);
		m4.add(item);
		item = new JMenuItem("�ؿ� �ڷγ� ����Ʈ");
		item.addActionListener(this);
		m4.add(item);
		item = new JMenuItem("�ؿ� ���̷��� ����");
		item.addActionListener(this);
		m4.add(item);
		item = new JMenuItem("�ؿ� ��� ����");
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
			
			System.out.println("�޴��� ������ ���������� �۵��˴ϴ�.");		
			switch(mi.getText()) {
			case "���α׷� ����":
				new newWindow();
				newWindow.area.setText("���α׷� ����");
				break;
			case "���� ȯ��":
				new newWindow();
				newWindow.area.setText("���� ȯ��");
				break;
			case "���� �Ⱓ":
				new newWindow();
				newWindow.area.setText("���� �Ⱓ");
				break;
			case "������ ����":
				new newWindow();
				newWindow.area.setText("������ ����");
				break;
			
			case "COVID-19����":
				new newWindow();
				newWindow.area.setText("COVID-19����");
				break;
			case "���� �ֽ� ����":
				new newWindow();
				break;
			case "���̷��� �з�ǥ":
				new newWindow();
				newWindow.area.setText("���̷��� �з�ǥ");
				break;
			case "���� ����":
				new newWindow();
				newWindow.area.setText("���� ����");
				break;
			case "���� ���":
				new newWindow();
				newWindow.area.setText("���� ���");
				break;
				
			case "�ؿ� �ڷγ� ����":
				new newWindow();
				newWindow.area.setText("�ؿ� �ڷγ� ����");
				break;
			case "�ؿ� �ڷγ� ����Ʈ":
				new newWindow();
				newWindow.area.setText("�ؿ� �ڷγ� ����Ʈ");
				break;
			case "�ؿ� ���̷��� ����":
				new newWindow();
				newWindow.area.setText("�ؿ� ���̷��� ����");
				break;
			case "�ؿ� ��� ����":
				new newWindow();
				newWindow.area.setText("�ؿ� ��� ����");
				break;		
				
			case "�ؽ�Ʈ ������ ����":
				//�ش� ��ο� �ִ� ������ �����մϴ�. 
				Desktop.getDesktop().edit(new File("C:\\Users\\user\\Desktop\\java\\corona\\src\\original_csv_file\\test_text_old.csv"));
				break;
			case "���� ����":
				new newWindow();
				newWindow.area.setText("���� �������� �ʾҽ��ϴ�.");
				break;
			case "����":
				System.exit(0);
				break;	
		}
		}catch (IOException e1) { //desktop�� ����  �޸����� ������ ��쿡 �߻��� �� �ִ� ���ܸ� ó���մϴ�. 
			e1.printStackTrace();
			System.out.printf("IOException ���ܰ� �߻��߽��ϴ�:%s",e1);
		}
	}
}
