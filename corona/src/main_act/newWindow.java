package main_act;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//로그인창 만들어주기 
public class newWindow extends JFrame{
	ImageIcon icon;   //background 생성해줄 이미지아이콘 생성하기. 
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
		background.add(scroll_attach); //스크롤 붙여주기. 
		
		area.setLocation(30,50);
		area.setText("");
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		
		add(background);                 //최종적으로 background를 JFrame에 붙인다. 		
		setSize(500,300);
		setVisible(true);
	}
}


