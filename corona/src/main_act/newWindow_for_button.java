package main_act;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/*
 * ���α׷� ������ �ϴܿ� ���� ��ư���� �ܶ� �ִµ�, �� ��ư ������ �۵��ϴ� Ŭ������. 
 */
public class newWindow_for_button extends JFrame{ //���� �޼��� // �̸� �ε���ѳ��´�. 
	JPanel panel;   //�ٸ� �޼��忡�� ����� �� �ֵ��� static���� �����ߴ�.  
	JTextArea area; //�ٸ� �޼��忡�� ����� �� �ֵ��� static���� �����ߴ�. 
	JScrollPane scrollPane;
	newWindow_for_button(int i){  //��ư�� ������ �� ����� �޼����� ������ �����̴�. 

		setTitle("Data");
		setLayout(new BorderLayout(10,10));
		
		panel = new JPanel();
		area = new JTextArea(30,20);
		
		//String log = Database_sort_by_number.sb_value().toString()	
		new Database_sort_by_number(i);// int i�� ���� 1~14���� �ش��ϴ� ��ȣ�� �ǹ��Ѵ�. Database_sort_by_number�� �μ��� �����ϰ� �ش�Ŭ���� ���ο���
		//������ ������ �����Ѵ�. 
		area.setText(Database_sort_by_number.sb_value().toString()); //��ȣ�� ���� ������ toString���� �����´�. 
		area.setEditable(false);
		area.setForeground(Color.BLUE);		
		scrollPane = new JScrollPane(area);
		//panel.add(scrollPane);
		panel.add(area);
		add(panel,BorderLayout.CENTER);		

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //�����Ҷ� �� â�� �����Ű��, �ڿ��� ��� �ݳ��Ѵ�. 
		setSize(300,500);
		setVisible(true);
	}

}