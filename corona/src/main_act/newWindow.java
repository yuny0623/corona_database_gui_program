package main_act;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//�α���â ������ֱ� 
public class newWindow extends JFrame{
	ImageIcon icon;   //background �������� �̹��������� �����ϱ�. 
	static JTextArea area;
	static JScrollPane scroll;
	newWindow(){
		setTitle("MENUBAR ACTION");
		area = new JTextArea(10,30);
		scroll = new JScrollPane(area);
		JPanel scroll_attach = new JPanel();
		//"C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg"
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\coronavirus-4833754_640.jpg");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		scroll_attach.add(scroll);
		background.add(scroll_attach); //��ũ�� �ٿ��ֱ�. 
		
		area.setLocation(30,50);
		area.setText("");
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		
		add(background);                 //���������� background�� JFrame�� ���δ�. 		
		setSize(500,300);
		setVisible(true);
	}
}


