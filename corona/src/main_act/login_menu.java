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
//�α���â ������ֱ� 
public class login_menu extends JFrame{
	ImageIcon icon;   //background �������� �̹��������� �����ϱ�. 
	
	login_menu(){
		setTitle("CORONA PROGRAM");
		setLocation(450,200);                  //�ʱ� ��ġ �������ֱ� .
		
		//��׶��� �̹��� �������ֱ�. 
		icon = new ImageIcon("C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg");
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
		background.add(info_panel,BorderLayout.NORTH); //JFrame�� ���̴°� �ƴ϶� ���������� background �� ���δ�. 
		
		JButton login_button = new JButton("login");
		JButton master = new JButton("master"); //�ӽ÷� �������ҽ��ϴ�. �ٷ� ���α׷� ����ϱ� ���ؼ� 
		//master.setVisible(false);               //�ϴ� ó������ �Ⱥ��̰� ����. �ƹ��� �� ���� �ȵǴϱ�. 
		
		JPanel login_panel = new JPanel();
		login_panel.add(login_button);
		login_panel.add(master);                //�ӽ÷� �������ҽ��ϴ�. �ٷ� ���α׷� ����ϱ� ���ؼ� 
		background.add(login_panel,BorderLayout.CENTER);
		
		JPanel bottom_panel = new JPanel();
		JTextField bottom_text = new JTextField(30);
		bottom_panel.add(bottom_text);
		background.add(bottom_panel,BorderLayout.SOUTH);
		
		bottom_text.setText("Check Command Line in here"); //�ٴ� �ؽ�Ʈ �ʱ�ȭ�����ֱ�
		
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("login ��ư�� ���Ƚ��ϴ�.");
				String id = id_text.getText();
				String pass = pass_text.getText();
				System.out.println(id+" and "+pass);
				if(e.getSource() == master) {
					new guiAct2();
				}
				if((id.equals("root")) && (pass.equals("password"))) {
					bottom_text.setText("���α׷��� �����մϴ�.");
					
					try {
					Thread.sleep(1000);} //��� �Ͻ�������. �̰� ����Ϸ��� ����ó������ �ʿ���. 
					catch(InterruptedException e_sleep){}
					
					//dispose();     //���� �� â�� �������. 
					new guiAct2(); //guiâ�� �����ϴ� Ŭ������ �������Դϴ�. 
				}
				if(id_text.getText().isEmpty() || pass_text.getText().isEmpty()) { //���������. 
					bottom_text.setText("ID�� PASSWORD�� �Է��ϼ���");
				}
				if(!id.equals("root") || !pass.equals("password")) { //���̵�� ��� Ʋ���餡�� 
					bottom_text.setText("ID�� PASSWORD�� Ʋ�Ƚ��ϴ�.");
				}
				if(id.equals("master")) {
					master.setVisible(true); //���࿡ ����ڰ� ���̵�â�� master��� �Է��ϸ� �����ڸ��� �� �� �ִ� ��ư�� ��������. 
				}
			}
		};
		login_button.addActionListener(l); 
		master.addActionListener(l);     //�ӽ÷� ��������ϴ�. ����� �����. ������Ű
		add(background);                 //���������� background�� JFrame�� ���δ�. 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,250);
		setVisible(true);
	}
}
