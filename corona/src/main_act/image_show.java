package main_act;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class image_show extends JFrame implements ActionListener{
	BufferedImage img = null;
	public image_show() {
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(480,640);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(new File("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\hand.png"));
		}catch(IOException e1) {}
		
		myPanel panel = new myPanel();
		panel.setSize(480,640);
		
		setLayout(null);
		
		add(layeredPane);
		
		setBounds(720,220,480,640);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class myPanel extends JPanel{
		public void paint(Graphics g) {
			g.drawImage(img,0,0,null);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
