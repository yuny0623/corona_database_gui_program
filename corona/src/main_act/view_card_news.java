package main_act;

import java.awt.Graphics;
import java.awt.Scrollbar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
//�α���â ������ֱ� 
public class view_card_news extends JFrame{
	ImageIcon icon;   //background �������� �̹��������� �����ϱ�. 
	Scrollbar bar1;   //��ũ�ѹ� ���� 
	
	
	view_card_news(){
		setTitle("CARD NEWS");
		//setLayout(new BorderLayout(10,10));
		setLocation(450,200);                  //�ʱ� ��ġ �������ֱ� .
		bar1 = new Scrollbar(Scrollbar.VERTICAL,0,150,0,250); //��ũ�ѹ� ���� 
		//��׶��� �̹��� �������ֱ�. 
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\_upload_mwEditor_202011_1604308365278_20201102181245.png");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		add(background);                 //���������� background�� JFrame�� ���δ�. 
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); �� â�� ������ �������α׷� â�� ���ܵ־� �Ѵ�. �׷��� �ּ�ó����.
		setSize(400,250);
		setVisible(true);
	}
}
