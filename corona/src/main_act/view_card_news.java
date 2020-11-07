package main_act;

import java.awt.Graphics;
import java.awt.Scrollbar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
//로그인창 만들어주기 
public class view_card_news extends JFrame{
	ImageIcon icon;   //background 생성해줄 이미지아이콘 생성하기. 
	Scrollbar bar1;   //스크롤바 생성 
	
	
	view_card_news(){
		setTitle("CARD NEWS");
		//setLayout(new BorderLayout(10,10));
		setLocation(450,200);                  //초기 위치 설정해주기 .
		bar1 = new Scrollbar(Scrollbar.VERTICAL,0,150,0,250); //스크롤바 생성 
		//백그라운드 이미지 생성해주기. 
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\_upload_mwEditor_202011_1604308365278_20201102181245.png");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		add(background);                 //최종적으로 background를 JFrame에 붙인다. 
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 이 창을 껐을때 메인프로그램 창은 남겨둬야 한다. 그래서 주석처리함.
		setSize(400,250);
		setVisible(true);
	}
}
