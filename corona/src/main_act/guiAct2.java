package main_act;
//���������Ӱ� �Բ� gui�̺�Ʈ�� ������ Ŭ�����Դϴ�. 



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class guiAct2 extends JFrame implements ActionListener{
	ImageIcon icon; //����̹��� ������ �޴��� BACKGROUND�� �̹��� ��������. 
	static String path = null;  //�̹����� ��� 
	
	//������
	guiAct2(){                                           //guiAct Ŭ������ ������. 
		setTitle("corona information program");
		setLayout(new BorderLayout(10,10));    
		//getContentPane().setBackground(Color.BLUE);
		makeMenu();//makeMenu()�޼��� ���� 
		showEast();//������ ���ʿ� �ٴ� �����Ģ �ؽ�Ʈ ������ ������ showEast�޼��� ���� 
		show_image_center(); //����� �̹����� �������� �߾ӿ� ǥ���ϴ� �޼���  

		dispose(); // ������ ���� �� â�� �����. 
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x�� ������ �ٷ� ������. 
		setSize(1080,600);                              //ȭ�� ũ�� 1080X720 ����  
		setVisible(true);                               //guiâ ���̰� ��. 
	}

	// �������� ���߾ӿ� ����� �̹����� ����ϴ� �޼��� �Դϴ�. 
	void show_image_center() {
		add(new make_seoul_image("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\map.png"));
	}
	
	//���� ��Ģ �гο� ��� ��� �ϱ� 
	void showEast() {
		
		JPanel panel_east_main = new JPanel();   //�����ӿ� ������ ���� �г��� �����Ѵ�. 
		
		JPanel panel_east_top = new JPanel();//���� �гο� ������ ���� ����� �г��� ������,. 
		JPanel panel_east_center = new JPanel();//���� �гο� ������ ���� �߾��� �г��� �����Ѵ�. 
		JPanel panel_east_bottom = new JPanel(); //���� �г��� ���� �ϴܿ� ������ �г��� ������. 
		
		
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg");
		JPanel background_menu = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);;
			}
		};

//		panel_east_center.setBackground(new Color(70, 161, 235));
//		panel_east_top.setBackground(new Color(70, 161, 235));
//		panel_east_bottom.setBackground(new Color(70, 161, 235));
		
		JTextArea area1 = new JTextArea(30,40);  //�ؽ�Ʈ ������ �����Ѵ�, 
		//JTextArea area2 = new JTextArea(30,40);  //�ؽ�Ʈ ������ �����Ѵ�,. 
		
		JCheckBox cb1 = new JCheckBox("�߿�"); //üũ�ڽ��� �����Ѵ�. �ڷγ� ���� �˻縦 �����ϰ� �ǽ����ִ� üũ�ڽ��̴�. 
		cb1.setBounds(100,100,150,20);
		panel_east_center.add(cb1);
//		background_menu.add(cb1);
//		panel_east_main.add(background_menu);
		JButton btn1 = new JButton("����"); //1~14���� �ش��ϴ� ��ư�� �����Ѵ�. 
		JButton btn2 = new JButton("Ȯ����");
		JButton btn3 = new JButton("ȯ�ڹ�ȣ");
		JButton btn4 = new JButton("����");
		JButton btn5 = new JButton("ȯ������");
		JButton btn6 = new JButton("����");
		JButton btn7 = new JButton("�����");
		JButton btn8 = new JButton("���ͷ�");
		JButton btn9 = new JButton("��ġ����");
		JButton btn10 = new JButton("����");
		JButton btn11 = new JButton("�̵����");
		JButton btn12= new JButton("�����");
		JButton btn13 = new JButton("������");
		JButton btn14 = new JButton("���⿩��");
		
		panel_east_bottom.setLayout(new GridLayout(0,2)); //���� �ϴ��� �г��� ���ĸ��� 2���� �����Ѵ�. 
		panel_east_main.setLayout(new GridLayout(0,1));  //���� �г��� ������ gridlayout���� �Ѵ�. 1���� �����Ѵ�. 
		
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
//		JButton btn1 = (JButton) (e.getSource());    // ��ư�� Ŭ������ �� ������ �����Ѵ�. 
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



		panel_east_top.add(area1);                 //������� �гο� area1 �ؽ�Ʈ������ �����Ѵ�. 
		panel_east_main.add(panel_east_top);       //���� �гο� ������� �г��� �����Ѵ�. 
		panel_east_main.add(panel_east_center);    //���� �гο� �����߾ӿ� �����Ѵ�. 
		panel_east_main.add(panel_east_bottom);    //���� �гο� �����ϴ� �г��� �����Ѵ�. 
		
		add(panel_east_main,BorderLayout.EAST);    //���� �����ӿ� �г��� �����Ѵ�. 
	}
	
	void makeMenu() {    //�޴��ٸ� �����ϰ� ���� ������ �����ϴ� �޼����Դϴ�. 
		JMenuItem item;
		JMenuBar mb = new JMenuBar();
		JMenu m0 = new JMenu("���α׷� ����");
		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("�����ͺ��̽�");
		JMenu m3 = new JMenu("�ڷγ� ����");
		JMenu m4 = new JMenu("�� ���� ����");
		
//-----------------------�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�-------------------------	
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
//-----------------------�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�-------------------------
		item = new JMenuItem("�ؽ�Ʈ ������ ����");
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("���� ����");
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("����");
		item.addActionListener(this);
		m1.add(item);
//-------------------------�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�-------------------------	
//--------------------------�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�---------------------------
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
//-------------------------�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�--------------------------			
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

//------------------------------------------------------------------------------------------------------------	
	//@SuppressWarnings("resource")
/*
 * 
 * makeMenu ��ܿ� �޴��� ������ �� �۵��ϴ� �׼Ǹ����� ���ǵ� �κ��� .
 * 
 * 
 * 
 */
	public void actionPerformed(ActionEvent e) {  //�޴��� �ִ� �׸� �� �ϳ��� Ŭ������ ��// �߻��ϴ� ������ ������. 
		JMenuItem mi = (JMenuItem) (e.getSource()); //�޴� �������� Ŭ��������. 	
		//Connection con = Database_create.makeConnection();        //databaseŬ������ action()�޼��忡�� con��ü�� ���޹޾� ConnectionŸ������ ����Ѵ�. 
		System.out.println("2");
		try { //SQLException ���� ����ó������ �����. �ش� 
			
			System.out.println("3");		
	//�� �̺�Ʈ�� ���� ���๮�� case�� ����. 	
			switch(mi.getText()) {
			case "���α׷� ����":
				//corona_info();
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
				//corona_info();
				new newWindow();
				newWindow.area.setText("COVID-19����");
				break;
			case "���� �ֽ� ����":
				//corona_info();
				new view_card_news();
				break;
			case "���̷��� �з�ǥ":
				new newWindow();
				newWindow.area.setText("���̷��� �з�ǥ");
				break;
			case "���� ����":
				new view_card_news();
//				newWindow.area.setText("���� ����");
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
				newWindow.area.setText("���� ����");
				break;
			case "����":
				System.exit(0);//���� ������ ���α׷� �����մϴ�. 
				break;	
		}
		}catch (IOException e1) { //desktop�� ����  �޸����� ������ ��쿡 �߻��� �� �ִ� ���ܸ� ó���մϴ�. 
			e1.printStackTrace();
			System.out.printf("IOException ���ܰ� �߻��߽��ϴ�:%s",e1);
		}
	}
}
