package main_act;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/*
 * 서울시 이미지를 프로그램에 나타나게 하는 클래스이다. 
 */

public class make_seoul_image extends JPanel{ // 이미지를 생성하는 클래스 new Mypanel(s) 이때 s 경로에 path 값을 써주면 됩니다. 
	BufferedImage img;
	public make_seoul_image(String s) {
		try {
			img = ImageIO.read(new File(s));
		}catch(IOException e) {}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,0,0,getWidth(),getHeight(),null);
	}
}