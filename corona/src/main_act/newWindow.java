package main_act;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//---------------------���ο� â�� ���� �޴��� ������ ������ش�. database�� Ȯ���ϱ� ���� ������ ------------------------	
//�޴��ٿ� �ִ� ���� �޴��� Ŭ������ �� �� �޴��� ���� ������ ������� �� �ִ� ����. switch���� ȣ���� Ŭ������. 
//���ο� â�� �����, �ؽ�Ʈ ������ �ش��ϴ� �����Ͱ��� ǥ�����ش�. 


/*
 * 
 * makemenu���� ������� �޴� ������ �� �� Ŭ���� ȣ����. 
 */

public class newWindow extends JFrame{ //���� �޼��� // �̸� �ε���ѳ��´�. 
	JPanel panel;   //�ٸ� �޼��忡�� ����� �� �ֵ��� static���� �����ߴ�.  
	static JTextArea area; //�ٸ� �޼��忡�� ����� �� �ֵ��� static���� �����ߴ�. 
	newWindow(){
		setTitle("�ش� ���� ���");
		setLayout(new BorderLayout(10,10));
		
		panel = new JPanel();
		area = new JTextArea(30,20);
		area.setText("");
		area.setEditable(false);
		area.setForeground(Color.BLUE);			
		panel.add(area);
		add(panel,BorderLayout.CENTER);		

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //�����Ҷ� �� â�� �����Ű��, �ڿ��� ��� �ݳ��Ѵ�. 
		setSize(300,500);
		setVisible(true);
	}
}