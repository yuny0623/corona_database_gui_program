package main_act;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/*
 * ����� �̹����� ���α׷��� ��Ÿ���� �ϴ� Ŭ�����̴�. 
 */

public class make_seoul_image extends JPanel{ // �̹����� �����ϴ� Ŭ���� new Mypanel(s) �̶� s ��ο� path ���� ���ָ� �˴ϴ�. 
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