package main_act;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.HashSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//�α���â ������ֱ� 
@SuppressWarnings("serial")
public class newWindow_for_button extends JFrame{
	ImageIcon icon;   //background �������� �̹��������� �����ϱ�. 
	static JTextArea area;
	static JScrollPane scroll;
	newWindow_for_button(int i){
		setTitle("BUTTON CLICK ACTION");
		//�����ӹ� �ڹ� �̸�Ƽ�� ����, ���ϴ� �̹����� ������. 
		ImageIcon img = new ImageIcon("images2/covid.jpg");
		setIconImage(img.getImage());
		
		area = new JTextArea(10,30);
		scroll = new JScrollPane(area);
		JPanel panel_for_scroll = new JPanel();
		
		//"C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg"
		icon = new ImageIcon("images2/coronavirus-4924022_1280.jpg");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		new Database_sort_by_number(i);
		String data_set = Database_sort_by_number.give_string_data().toString();
		//�������� data_set�� DB���� �޾ƿ� �������� ���ڿ����� �Ҵ��ؼ� data_set���� ����� ���̴�. 
		
		if(i == 1) {//����
			JTextField total_corona_person_text = new JTextField(20);
			total_corona_person_text.setText(String.valueOf(data_set.length()) +"���� �����Ǿ����ϴ�."); //int -> string ����ȯ
			background.add(total_corona_person_text);
			area.setText(data_set);
		}
		if(i == 2) {//Ȯ���� 
			JTextField confirm_date_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}	
			confirm_date_text.setText("Ȯ������ �Ʒ��� �����ϴ�.");
			background.add(confirm_date_text);
			area.setText(data_set);
		}
		if(i == 3) {//ȯ�� ��ȣ
			JTextField patient_number_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			patient_number_text.setText("ȯ�� ��ȣ�� �Ʒ��� �����ϴ�.");
			background.add(patient_number_text);
			area.setText(data_set);
		}
		if(i == 4) {//����
			JTextField nation_text = new JTextField(20);
			//String[] data_set_arr = data_set.split("\n");
			area.setText("�ش�Ǵ� ���� ������ �������� �ʽ��ϴ�. \n"
				    + "�����ͺ��̽��� ������ �ٽ� �����Ͻʽÿ�. ");
			nation_text.setText("���� ������ �Ʒ��� �����ϴ�.");
			background.add(nation_text);
		}
		if(i == 5) { //ȯ������ (ȯ�������� �����ͺ��̽��� �����Ͱ� �������� �ʴ´�. )
			JTextField patient_info_text = new JTextField(20);
			//String[] data_set_arr = data_set.split("\n");
			area.setText("�ش�Ǵ� ȯ�� ������ �������� �ʽ��ϴ�. \n"
					    + "�����ͺ��̽��� ������ �ٽ� �����Ͻʽÿ�. ");
			patient_info_text.setText("ȯ�� ������ �Ʒ��� �����ϴ�.");
			background.add(patient_info_text);
		}
		if(i == 6) {//����
			System.out.println("ok1");
			JTextField location_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			System.out.println(data_set_arr.length);
			String[] location_data = new String[2500];       //2157���� �迭 �˳��ϰ� 2500���� ���� 
			
			System.out.println("ok2");
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					location_data[index] = data_set_arr[j];
					index+=1; 
				}
			}
			
			System.out.println(index);
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("ok4");
					new show_detail_location(data_set,location_data);            //show_detail_travel()Ŭ���� ȣ���ϱ�. ���ÿ� ���ڿ��� ������ ���� ���ڿ� 
				}
			};
			show_detail.addActionListener(l); //��ư ������ �� ���� 
			location_text.setText("���� ������ �Ʒ��� �����ϴ�.");
			background.add(location_text);
			background.add(show_detail);
			area.setText(data_set);
		}
		if(i == 7) {//�����/ ��ĭ�����ϰ� 395�� 
			JTextField travel_trace_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			String[] travel_data = new String[395];       //����¸��� �Ҵ��� ���ڿ��迭
				
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					travel_data[index] = data_set_arr[j];
					index+=1; //395�� 
				}
			}
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new show_detail_travel(data_set,travel_data);            //show_detail_travel()Ŭ���� ȣ���ϱ�. ���ÿ� ���ڿ��� ������ ���� ���ڿ� 
				}
			};
			show_detail.addActionListener(l); //��ư ������ �� ���� 
			
			travel_trace_text.setText("������� �Ʒ��� �����ϴ�.");
			background.add(travel_trace_text);
			background.add(show_detail);
			area.setText(data_set);
		}
		if(i == 8) { //���˷�
			JTextField contact_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			String[] contact_data = new String[5000];       //����¸��� �Ҵ��� ���ڿ��迭
				
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					contact_data[index] = data_set_arr[j];
					index+=1; 
				}
			}
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new show_detail_contact(data_set,contact_data);            //show_detail_travel()Ŭ���� ȣ���ϱ�. ���ÿ� ���ڿ��� ������ ���� ���ڿ� 
				}
			};
			show_detail.addActionListener(l); //��ư ������ �� ���� 
			
			contact_text.setText("���˷��� �Ʒ��� �����ϴ�.");
			background.add(contact_text);
			background.add(show_detail);
			area.setText(data_set);
		}
		if(i == 9) {//��ġ���� 
			JTextField action_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			action_text.setText("��ġ������ ������ �����ϴ�.");
			background.add(action_text);
			area.setText(data_set);
		}
		if(i == 10) { //����
			int death = 0;//����� ��� 
			int discharge = 0; //����� ��� 
			String[] data_set_arr = data_set.split("\n"); //data_set�� ���ڿ� �迭�� �����ߴ�. �ε����� ���� �ϳ��� ������ �� �ִ�. 
			for(int j = 0;j<data_set_arr.length;j++) {
				if(data_set_arr[j].equals("���"))
					death +=1;
				if(data_set_arr[j].equals("���"))
					discharge +=1;
			}
			System.out.println("������� ����� ȯ��: "+death);
			System.out.println("������� ����� ȯ��: "+discharge);
			
			JTextField death_text = new JTextField(10);
			JTextField discharge_text = new JTextField(10);
			death_text.setText(String.valueOf(death) + "�� ���");
			discharge_text.setText(String.valueOf(discharge) +"�� ���");
			background.add(death_text);
			background.add(discharge_text);
			area.setText(data_set);
		}
		if(i == 11) {//�̵����
//			JTextField move_trace_text = new JTextField(20);
//			String[] data_set_arr = data_set.split("\n");
//			for(int j = 0;j<data_set_arr.length;j++) {
//				System.out.println(data_set_arr[j]);
//			}
//			move_trace_text.setText("�̵���δ� �Ʒ��� �����ϴ�.");
//			background.add(move_trace_text);
//			area.setText(data_set);
			JTextField move_trace_text = new JTextField(20);
			JButton show_detail = new JButton("Show detail");
			int index = 0;
			String[] data_set_arr = data_set.split("\n");	
			String[] move_data = new String[5000];       //����¸��� �Ҵ��� ���ڿ��迭
				
			for(int j = 0;j<data_set_arr.length;j++) {
				if(!data_set_arr[j].equals("")) {
					move_data[index] = data_set_arr[j];
					index+=1; 
				}
			}
			ActionListener l = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new show_detail_move(data_set,move_data);            //show_detail_travel()Ŭ���� ȣ���ϱ�. ���ÿ� ���ڿ��� ������ ���� ���ڿ� 
				}
			};
			show_detail.addActionListener(l); //��ư ������ �� ���� 
			
			move_trace_text.setText("�̵���δ� �Ʒ��� �����ϴ�.");
			background.add(move_trace_text);
			background.add(show_detail);
			area.setText(data_set);
			
		}
		if(i == 12) {//����� 
			JTextField regist_date_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			regist_date_text.setText("��ϵ� ��¥�� �Ʒ��� �����ϴ�.");
			background.add(regist_date_text);
			area.setText(data_set);
		}
		if(i == 13) {//������ 
			JTextField date_text = new JTextField(20);
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				System.out.println(data_set_arr[j]);
			}
			date_text.setText("������ ��¥�� �Ʒ��� �����ϴ�.");
			background.add(date_text);
			area.setText(data_set);
		}	
		if(i == 14) { //���⿩�� 
			int exposure_number = 0;
			String[] data_set_arr = data_set.split("\n");
			for(int j = 0;j<data_set_arr.length;j++) {
				exposure_number+=1;
			}
			JTextField exposure_number_text = new JTextField(20);
			
			exposure_number_text.setText(String.valueOf(exposure_number) + "���� ���� Ȯ�� �Ǿ����ϴ�.");
			background.add(exposure_number_text);
			area.setText(data_set);
		}
		
		area.setLocation(30,50);
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		
		panel_for_scroll.add(scroll);
		background.add(panel_for_scroll);

		add(background);                 		
		setSize(500,300);
		setVisible(true);
	}
}

//�̵���� 