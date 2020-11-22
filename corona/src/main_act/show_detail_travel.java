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
//로그인창 만들어주기 
@SuppressWarnings("serial")
public class show_detail_travel extends JFrame{
	ImageIcon icon;   //background 생성해줄 이미지아이콘 생성하기. 
	static JTextArea area;
	static JScrollPane scroll;
	
	show_detail_travel(String data_set,String[] array_data){ //일반 문자열/ 배열형 문자열 받아옴. 
		setTitle("SHOW DETAIL ACTION");
		//프레임바 자바 이모티콘 말고, 원하는 이미지로 지정함. 
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
				search_result.setText(count+"명입니다.");
			}
		};
		search.addActionListener(l);
		
		result_p.add(search_result);
		
		function.add(word_text);
		function.add(search);
		
		
		background.add(function);
		background.add(result_p);
		
		scroll_attach.add(scroll);
		background.add(scroll_attach); //스크롤 붙여주기. 
		
		//hashset으로 만들어준다. hashset으로 중복안되게 하나의 set을 만들어준다. 그리고 이를통해 iterator로 하나씩 접근해서 search_keyword에
		//할당해준다. 결과적으로 데이터셋중에서 중복되지 않는 검색키둬드를  TextArea에 제동해준다. 
		String search_keyword = "";
		HashSet<String> hashSet = new HashSet<>();
		for(String item:array_data) {
			hashSet.add(item);
		}//[] 리스트 형식으로 값 존재. 
		@SuppressWarnings("rawtypes")
		Iterator iter = hashSet.iterator();  //값 탐색하기 위해 이터레이터 사용함. 
		for(int i = 0;i<array_data.length;i++) {
			while(iter.hasNext())
				search_keyword +=(iter.next() +"\n");
		}
		//hashset으로 만들어준다.
		
		area.setText("검색 키워드는 아래와 같습니다. \n"+search_keyword);
		area.setLocation(30,50);
		area.setEditable(false);
		area.setForeground(Color.BLUE);
		
		add(background);                 //최종적으로 background를 JFrame에 붙인다. 		
		setSize(500,300);
		setVisible(true);
	}
}