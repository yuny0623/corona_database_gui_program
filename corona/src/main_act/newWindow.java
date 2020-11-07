package main_act;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//로그인창 만들어주기 
public class newWindow extends JFrame{
	ImageIcon icon;   //background 생성해줄 이미지아이콘 생성하기. 
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
		
		add(background);                 //최종적으로 background를 JFrame에 붙인다. 		
		setSize(500,300);
		setVisible(true);
	}
}

/*
 * JTextArea
 - 여러 줄의 문자열을 입력받을 수 있는 창
   = 스크롤바를 지원하지 않는다.
   = JScrollPane 객체를 삽입하여 스크롤바 지원
 */

