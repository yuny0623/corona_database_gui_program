package main_act;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//로그인창 만들어주기 
public class login_menu extends JFrame{
	ImageIcon icon;   //background 생성해줄 이미지아이콘 생성하기. 
	
	login_menu(){
		setTitle("CORONA PROGRAM");
		//setLayout(new BorderLayout(10,10));
		setLocation(450,200);                  //초기 위치 설정해주기 .
		
		//백그라운드 이미지 생성해주기. 
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\coronavirus-4833754_640.jpg");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		
		
		
		JPanel info_panel = new JPanel(new GridLayout(2,0));
		JPanel id_panel = new JPanel();
		JPanel pass_panel = new JPanel();
		
		JLabel id_label = new JLabel("MSID");
		JLabel pass_label = new JLabel("PASS");
		
		JTextField id_text = new JTextField(10);
		JTextField pass_text = new JTextField(10);
		
		id_panel.add(id_label);
		id_panel.add(id_text);
		pass_panel.add(pass_label);
		pass_panel.add(pass_text);
		
		info_panel.add(id_panel);
		info_panel.add(pass_panel);
		background.add(info_panel,BorderLayout.NORTH); //JFrame에 붙이는게 아니라 최종적으로 background 에 붙인다. 
		
		JButton login_button = new JButton("login");
		JPanel login_panel = new JPanel();
		login_panel.add(login_button);
		background.add(login_panel,BorderLayout.CENTER);
		
		JPanel bottom_panel = new JPanel();
		JTextField bottom_text = new JTextField(30);
		bottom_panel.add(bottom_text);
		background.add(bottom_panel,BorderLayout.SOUTH);
		
		bottom_text.setText("Check Command Line in here"); //바닥 텍스트 초기화시켜주기
		
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("login 버튼이 눌렸습니다.");
				String id = id_text.getText();
				String pass = pass_text.getText();
				System.out.println(id+" and "+pass);

				if((id.equals("root")) && (pass.equals("password"))) {
					bottom_text.setText("프로그램을 실행합니다.");
					
					try {
					Thread.sleep(1000);} //잠시 일시정지함. 이거 사용하려면 예외처리구문 필요함. 
					catch(InterruptedException e_sleep){}
					
					dispose();     //지금 이 창만 사라진다. 
					new guiAct2(); //gui창을 생성하는 클래스의 생성자입니다. 
				}
				if(id_text.getText().isEmpty() || pass_text.getText().isEmpty()) { //비어있으면. 
					bottom_text.setText("ID와 PASSWORD를 입력하세요");
				}
				if(!id.equals("root") || !pass.equals("password")) { //아이디랑 비번 틀리면ㄱㄱ 
					bottom_text.setText("ID와 PASSWORD가 틀렸습니다.");
				}
			}
		};
		login_button.addActionListener(l);
		add(background);                 //최종적으로 background를 JFrame에 붙인다. 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,250);
		setVisible(true);
	}
}



