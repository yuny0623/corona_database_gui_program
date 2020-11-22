package main_act;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//�α���â ������ֱ� 
@SuppressWarnings("serial")
public class show_detail_travel extends JFrame{
	ImageIcon icon;   //background �������� �̹��������� �����ϱ�. 
	static JTextArea area;
	static JScrollPane scroll;
	
	show_detail_travel(String data_set,String[] array_data){ //�Ϲ� ���ڿ�/ �迭�� ���ڿ� �޾ƿ�. 
		setTitle("SHOW DETAIL ACTION");
		//�����ӹ� �ڹ� �̸�Ƽ�� ����, ���ϴ� �̹����� ������. 
		ImageIcon img = new ImageIcon("images2/covid.jpg");
		setIconImage(img.getImage());
		area = new JTextArea(10,30);
		scroll = new JScrollPane(area);
		JPanel scroll_attach = new JPanel();
		JPanel function = new JPanel();
		JPanel result_p = new JPanel();
		
		JTextField word_text = new JTextField(10);
		JTextField search_result = new JTextField(20);
		
		JButton search = new JButton("Search");
		//"C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\corona-5174671_1920.jpg"
		//"C:\\Users\\user\\Desktop\\java\\corona\\src\\images2\\virus-4835301_640.jpg"
		icon = new ImageIcon("images2/corona-5174671_1920.jpg");
		JPanel background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String origin = data_set;
				String word = word_text.getText();
				String[] arr = origin.split("\n");
				int len = arr.length;
				int count = 0;
				for(int i = 0;i<len;i++) {
					if(word.equals(arr[i]))
						count++;
				}
				search_result.setText(count+"���Դϴ�.");
			}
		};
		search.addActionListener(l);
		
		result_p.add(search_result);
		
		function.add(word_text);
		function.add(search);
		
		
		background.add(function);
		background.add(result_p);
		
		scroll_attach.add(scroll);
		background.add(scroll_attach); //��ũ�� �ٿ��ֱ�. 
		
		//hashset���� ������ش�. hashset���� �ߺ��ȵǰ� �ϳ��� set�� ������ش�. �׸��� �̸����� iterator�� �ϳ��� �����ؼ� search_keyword��
		//�Ҵ����ش�. ��������� �����ͼ��߿��� �ߺ����� �ʴ� �˻�Ű�ֵ带  TextArea�� �������ش�. 
		String search_keyword = "";
		HashSet<String> hashSet = new HashSet<>();
		for(String item:array_data) {
			hashSet.add(item);
		}//[] ����Ʈ �������� �� ����. 
		@SuppressWarnings("rawtypes")
		Iterator iter = hashSet.iterator();  //�� Ž���ϱ� ���� ���ͷ����� �����. 
		for(int i = 0;i<array_data.length;i++) {
			while(iter.hasNext())
				search_keyword +=(iter.next() +"\n");
		}
		//hashset���� ������ش�.
		
		area.setText("�˻� Ű����� �Ʒ��� �����ϴ�. \n"+search_keyword);
		area.setLocation(30,50);
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		
		add(background);                 //���������� background�� JFrame�� ���δ�. 		
		setSize(500,300);
		setVisible(true);
	}
}