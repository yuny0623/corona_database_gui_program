//package main_act;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//
//public class newWindow_for_button extends JFrame{ //���� �޼��� // �̸� �ε���ѳ��´�. 
//	JPanel panel;   //�ٸ� �޼��忡�� ����� �� �ֵ��� static���� �����ߴ�.  
//	JTextArea area; //�ٸ� �޼��忡�� ����� �� �ֵ��� static���� �����ߴ�. 
//
//	newWindow_for_button(int i){  //��ư�� ������ �� ����� �޼����� ������ �����̴�. 
//
//		setTitle("Data");
//		setLayout(new BorderLayout(10,10));
//		
//		panel = new JPanel();
//		area = new JTextArea(30,20);
//		
//		//String log = Database_sort_by_number.sb_value().toString()	
//		new Database_sort_by_number(i);// int i�� ���� 1~14���� �ش��ϴ� ��ȣ�� �ǹ��Ѵ�. Database_sort_by_number�� �μ��� �����ϰ� �ش�Ŭ���� ���ο���
//		//������ ������ �����Ѵ�. 
//		area.setText(Database_sort_by_number.give_string_data().toString()); //��ȣ�� ���� ������ toString���� �����´�. 
//
//		area.setEditable(false);
//		area.setForeground(Color.BLUE);		
//
//		//panel.add(scrollPane);
//		panel.add(area);
//		add(panel,BorderLayout.CENTER);		
//
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //�����Ҷ� �� â�� �����Ű��, �ڿ��� ��� �ݳ��Ѵ�. 
//		setSize(300,500);
//		setVisible(true);
//	}
//}
//




package main_act;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//�α���â ������ֱ� 
public class newWindow_for_button extends JFrame{
	ImageIcon icon;   //background �������� �̹��������� �����ϱ�. 
	static JTextArea area;
	
	newWindow_for_button(int i){
		setTitle("BUTTON CLICK ACTION");
		area = new JTextArea(10,30);
		
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		new Database_sort_by_number(i);
 
		area.setText(Database_sort_by_number.give_string_data().toString()); 
		
		area.setLocation(30,50);
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		background.add(area);
		
		add(background);                 		
		setSize(500,300);
		setVisible(true);
	}
}

