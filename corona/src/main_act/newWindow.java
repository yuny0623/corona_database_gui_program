package main_act;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//�α���â ������ֱ� 
public class newWindow extends JFrame{
	ImageIcon icon;   //background �������� �̹��������� �����ϱ�. 
	static JTextArea area;
	
	newWindow(){
		setTitle("MENUBAR ACTION");
		area = new JTextArea(10,30);
		
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		area.setLocation(30,50);
		area.setText("");
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		background.add(area);
		
		add(background);                 //���������� background�� JFrame�� ���δ�. 		
		setSize(500,300);
		setVisible(true);
	}
}

/*
 * JTextArea
 - ���� ���� ���ڿ��� �Է¹��� �� �ִ� â
   = ��ũ�ѹٸ� �������� �ʴ´�.
   = JScrollPane ��ü�� �����Ͽ� ��ũ�ѹ� ����
 */

