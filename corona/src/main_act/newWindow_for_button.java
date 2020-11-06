package main_act;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/*
 * 프로그램 오른쪽 하단에 보면 버튼들이 잔뜩 있는데, 그 버튼 누르면 작동하는 클래스임. 
 */
public class newWindow_for_button extends JFrame{ //정적 메서드 // 미리 로드시켜놓는다. 
	JPanel panel;   //다른 메서드에서 사용할 수 있도록 static으로 정의했다.  
	JTextArea area; //다른 메서드에서 사용할 수 있도록 static으로 정의했다. 
	JScrollPane scrollPane;
	newWindow_for_button(int i){  //버튼을 눌렀을 때 사용할 메서드의 생성자 정의이다. 

		setTitle("Data");
		setLayout(new BorderLayout(10,10));
		
		panel = new JPanel();
		area = new JTextArea(30,20);
		
		//String log = Database_sort_by_number.sb_value().toString()	
		new Database_sort_by_number(i);// int i는 각각 1~14번에 해당하는 번호를 의미한다. Database_sort_by_number에 인수로 전달하고 해당클래스 내부에서
		//데이터 정렬을 진행한다. 
		area.setText(Database_sort_by_number.sb_value().toString()); //번호에 따른 정보를 toString으로 가져온다. 
		area.setEditable(false);
		area.setForeground(Color.BLUE);		
		scrollPane = new JScrollPane(area);
		//panel.add(scrollPane);
		panel.add(area);
		add(panel,BorderLayout.CENTER);		

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //종료할때 이 창만 종료시키고, 자원을 모두 반납한다. 
		setSize(300,500);
		setVisible(true);
	}

}