package main_act;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//---------------------새로운 창을 만들어서 메뉴의 내용을 출력해준다. database를 확인하기 위한 목적임 ------------------------	
//메뉴바에 있는 보기 메뉴를 클릭했을 때 각 메뉴에 따른 내용을 출력해줄 수 있는 내용. switch에서 호출할 클래스임. 
//새로운 창을 만들고, 텍스트 영역에 해당하는 데이터값을 표시해준다. 


/*
 * 
 * makemenu에서 상단위에 메뉴 눌렀을 때 이 클래스 호출함. 
 */

public class newWindow extends JFrame{ //정적 메서드 // 미리 로드시켜놓는다. 
	JPanel panel;   //다른 메서드에서 사용할 수 있도록 static으로 정의했다.  
	static JTextArea area; //다른 메서드에서 사용할 수 있도록 static으로 정의했다. 
	newWindow(){
		setTitle("해당 내용 출력");
		setLayout(new BorderLayout(10,10));
		
		panel = new JPanel();
		area = new JTextArea(30,20);
		area.setText("");
		area.setEditable(false);
		area.setForeground(Color.BLUE);			
		panel.add(area);
		add(panel,BorderLayout.CENTER);		

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //종료할때 이 창만 종료시키고, 자원을 모두 반납한다. 
		setSize(300,500);
		setVisible(true);
	}
}