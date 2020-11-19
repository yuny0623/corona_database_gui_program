package main_act;
//메인프레임과 함께 gui이벤트를 정의한 클래스입니다. 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class guiAct2 extends JFrame implements ActionListener{
	static ImageIcon background_icon,seoul_icon,east_icon,wash_icon; //배경이미지 오른쪽 메뉴들 BACKGROUND에 이미지 삽입해줌.  static으로 해야됨. 그래야 함수에서 사용가능. 
	static JPanel main_background;
	
	guiAct2(){                                          
		setTitle("CORONA DESKTOP VIEWER");
		setLayout(new BorderLayout(10,10));    
		
		//프레임바 자바 이모티콘 말고, 원하는 이미지로 지정함. 
		ImageIcon img = new ImageIcon("images2/covid.jpg");
		setIconImage(img.getImage());
		
		
		background_icon = new ImageIcon("images2/coronavirus-4833754_1280.jpg");
		main_background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(background_icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);;
			}
		}; 
		main_background.setLayout(null);  //절대 위치로 지정하기 위해 layout을 null로 줬다. 
		 
		show_image_center();
		showEast();
		makeMenu();
		wash_image();
		
		add(main_background);
		dispose();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1180,620);                             
		setVisible(true);                              
	}
	
	static void show_image_center() {
		seoul_icon = new ImageIcon("images2/map2.png");
		JPanel seoul_background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(seoul_icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);;
			}
		};

		seoul_background.setPreferredSize(new Dimension(400,400));      //panel 사이즈를 임의로 지정함. 
		seoul_background.setBounds(30,30,500,500);                      //패널의 절대위치와 사이즈를 지정함. 
		main_background.add(seoul_background);
	}
	
	void wash_image() {
		wash_icon = new ImageIcon("images2/how2.jpg");
		JPanel wash_background = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(wash_icon.getImage(),0,0,null);
				setOpaque(false);
				super.paintComponent(g);;
			}
		};
//		wash_background.setPreferredSize(new Dimension(50,50));      
		wash_background.setBounds(890,30,250,500); //990 30 / 326 800                    
		main_background.add(wash_background);
	}
	
	void showEast() {
		JButton btn1 = new JButton("연번");
		JButton btn2 = new JButton("확진일");
		JButton btn3 = new JButton("환자번호");
		JButton btn4 = new JButton("국적");
		JButton btn5 = new JButton("환자정보");
		JButton btn6 = new JButton("지역");
		JButton btn7 = new JButton("여행력");
		JButton btn8 = new JButton("접촉력");
		JButton btn9 = new JButton("조치사항");
		JButton btn10 = new JButton("상태");
		JButton btn11 = new JButton("이동경로");
		JButton btn12= new JButton("등록일");
		JButton btn13 = new JButton("수정일");
		JButton btn14 = new JButton("노출여부");
		
		JTextArea area1 = new JTextArea(30,40);
		area1.setText("1. 흐르는 물에 비누로 손을 꼼꼼하게 씻기. \n"         
				+ "2. 기침이나 재채기 할 때 옷소매로 입과 코를 가리기.\n"
				+ "3. 씻지 않은 손으로 눈,코,입 만지지 않기.\n"
				+ "4. 사람 많은 곳에 방문을 자제하고 의료기관 방문 시 마스크 착용. \n"
				+ "5. 발열 호흡기 증상이 있는 사람과 접촉 피하기. \n"
				+ "\n"
				+ "콜센터: 1339 \n"
				+ "지역번호+129 \n"
				+ "보건소 문의, 선별진료소 우선 방문 진료 \n");
		area1.setEditable(false);        
		area1.setForeground(Color.BLUE);
		area1.setBounds(560,30,300,175);
		
		btn1.setBounds(560,235,100,30);
		btn2.setBounds(670,235,100,30);
		btn3.setBounds(560,275,100,30);
		btn4.setBounds(670,275,100,30);
		btn5.setBounds(560,315,100,30);
		btn6.setBounds(670,315,100,30);
		btn7.setBounds(560,355,100,30);
		btn8.setBounds(670,355,100,30);
		btn9.setBounds(560,395,100,30);
		btn10.setBounds(670,395,100,30);
		btn11.setBounds(560,435,100,30);
		btn12.setBounds(670,435,100,30);
		btn13.setBounds(560,475,100,30);
		btn14.setBounds(670,475,100,30);
		
		main_background.add(btn1);
		main_background.add(btn2);
		main_background.add(btn3);
		main_background.add(btn4);
		main_background.add(btn5);
		main_background.add(btn6);
		main_background.add(btn7);
		main_background.add(btn8);
		main_background.add(btn9);
		main_background.add(btn10);
		main_background.add(btn11);
		main_background.add(btn12);
		main_background.add(btn13);
		main_background.add(btn14);
		
		main_background.add(area1);
		
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) (e.getSource());
				
				switch(btn.getText()) {
				case "연번":
					new newWindow_for_button(1); //새로운 윈도우 창을 오픈한다. 
					System.out.println("연번이 클릭되었습니다.");
					break;
				case "확진일":
					new newWindow_for_button(2);
					System.out.println("확진일이 클릭되었습니다.");
					break;
				case "환자번호":
					new newWindow_for_button(3);
					System.out.println("환자번호이 클릭되었습니다.");
					break;
				case "국적":
					new newWindow_for_button(4);
					System.out.println("국적이 클릭되었습니다.");
					break;
				case "환자정보":
					new newWindow_for_button(5);
					System.out.println("환자정보이 클릭되었습니다.");
					break;
				case "지역":
					new newWindow_for_button(6);
					System.out.println("지역이 클릭되었습니다.");
					break;
				case "여행력":
					new newWindow_for_button(7);
					System.out.println("여행력이 클릭되었습니다.");
					break;
				case "접촉력":
					new newWindow_for_button(8);
					System.out.println("접촉력이 클릭되었습니다.");
					break;
				case "조치사항":
					new newWindow_for_button(9);
					System.out.println("조치사항이 클릭되었습니다.");
					break;
				case "상태":
					new newWindow_for_button(10);
					System.out.println("상태이 클릭되었습니다.");
					break;
				case "이동경로":
					new newWindow_for_button(11);
					System.out.println("이동경로이 클릭되었습니다.");
					break;
				case "등록일":
					new newWindow_for_button(12);
					System.out.println("등록일이 클릭되었습니다.");
					break;
				case "수정일":
					new newWindow_for_button(13);
					System.out.println("수정일이 클릭되었습니다.");
					break;
				case "노출여부":
					new newWindow_for_button(14);
					System.out.println("노출여부이 클릭되었습니다.");
					break;	
				}
			}
		};
		
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		btn3.addActionListener(l);
		btn4.addActionListener(l);
		btn5.addActionListener(l);
		btn6.addActionListener(l);
		btn7.addActionListener(l);
		btn8.addActionListener(l);
		btn9.addActionListener(l);
		btn10.addActionListener(l);
		btn11.addActionListener(l);
		btn12.addActionListener(l);
		btn13.addActionListener(l);
		btn14.addActionListener(l);
		}
	
	
	
	
	void makeMenu() {    //메뉴바를 생성하고 세부 사항을 생성하는 메서드입니다. 
		JMenuItem item;
		JMenuBar mb = new JMenuBar();
		JMenu m0 = new JMenu("프로그램 정보");
		JMenu m1 = new JMenu("설정");
		JMenu m2 = new JMenu("데이터베이스");
		JMenu m3 = new JMenu("코로나 정보");
		JMenu m4 = new JMenu("더 많은 정보");
		
		item = new JMenuItem("프로그램 설명");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("개발 환경");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("개발 기간");
		item.addActionListener(this);
		m0.add(item);
		item = new JMenuItem("개발자 정보");
		item.addActionListener(this);
		m0.add(item);

		item = new JMenuItem("텍스트 데이터 열기");
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("파일 저장");
		item.addActionListener(this);
		m1.add(item);
		//item = new JMenuItem("종료",KeyEvent.VK_F);
		item.addActionListener(this);
		m1.add(item);

		item = new JMenuItem("year_number출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("confirm_date출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("patient_number출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("nation출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("patient_info출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("location출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("travel출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("contact출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("action출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("state출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("move_trace출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("regist_date출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("modify_date출력");
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("execute출력");
		item.addActionListener(this);
		m2.add(item);
	
		item = new JMenuItem("COVID-19정보");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("정부 최신 뉴스");
		item.addActionListener(this);
		m3.add(item);
//		item = new JMenuItem("바이러스 분류표");
//		item.addActionListener(this);
//		m3.add(item);
		item = new JMenuItem("국내 동향");
		item.addActionListener(this);
		m3.add(item);
		item = new JMenuItem("국내 백신");
		item.addActionListener(this);
		m3.add(item);
			
		item = new JMenuItem("해외 코로나 정보");
		item.addActionListener(this);
		m4.add(item);
		item = new JMenuItem("해외 코로나 사이트");
		item.addActionListener(this);
		m4.add(item);
//		item = new JMenuItem("해외 바이러스 문건");
//		item.addActionListener(this);
//		m4.add(item);
		item = new JMenuItem("해외 백신 정보");
		item.addActionListener(this);
		m4.add(item);
			
		mb.add(m0);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		setJMenuBar(mb);
	}
	
	
	public void actionPerformed(ActionEvent e) { 
		JMenuItem mi = (JMenuItem) (e.getSource()); 
		System.out.println("2");
		try { 
			
			System.out.println("메뉴바 리스너 정상적으로 작동됩니다.");		
			switch(mi.getText()) {
			case "프로그램 설명":
				new newWindow();
				newWindow.area.setText("서울시 코로나19 확진자 현황 관리 프로그램으로 코로나19 확진자 현황을\n"
						+ " 보다 쉽게 파악하고 관리할 수 있게 하는 것에 중점을 둔 프로그램이다.");
				break;
			case "개발 환경":
				new newWindow();
				newWindow.area.setText("Window 10 OS with eclipse");
				break;
			case "개발 기간":
				new newWindow();
				newWindow.area.setText("9/29~11/24\r\n" + 
						"약 9주");
				break;
			case "개발자 정보":
				new newWindow();
				newWindow.area.setText("최병윤, 한상진, 김경남, 이현석, 정문규");
				break;
			
			case "COVID-19정보":
				new newWindow();
				newWindow.area.setText("2019년 12월 중국 우한에서 처음 발생한 이후 중국 전역과 전 세계로 확산된, \n"
						+ "새로운 유형의 코로나바이러스(SARS-CoV-2)에 의한 호흡기 감염질환이다. \n"
						+ "코로나바이러스감염증-19는 감염자의 비말(침방울)이 호흡기나 눈·코·입의 점막으로 침투될 때 전염된다. \n"
						+ "감염되면 약 2~14일(추정)의 잠복기를 거친 뒤 발열(37.5도) 및 기침이나 호흡곤란 등 호흡기 증상, \n"
						+ "폐렴이 주증상으로 나타나지만 무증상 감염 사례 빈도도 높게 나오고 있다.");
				break;
			case "정부 최신 뉴스":
				new newWindow();
				newWindow.area.setText("2020년 11월 11일 기준\r\n" + 
						"- 코로나 재확산에 10월 취업자 6개월 만에 최대 감소(종합)\r\n" + 
						"- [종합] 코로나19 확진자 146명 증가, 서울 39명, 경기 42명\r\n" + 
						"- 정부 \"코로나 확산 지속시 2~3주후 수도권 1.5단계 격상 가능성\"");
				break;
//			case "바이러스 분류표":
//				new newWindow();
//				newWindow.area.setText("바이러스 분류표");
//				break;
			case "국내 동향":
				new newWindow();
				newWindow.area.setText("2020년 11월 11일 기준\r\n" + 
						"11/1 - 97명\r\n" + 
						"11/2 - 75명\r\n" + 
						"11/3 - 118명\r\n" + 
						"11/4 - 125명\r\n" + 
						"11/5 - 145명\r\n" + 
						"11/6 - 89명\r\n" + 
						"11/7 - 143명\r\n" + 
						"11/8 - 126명\r\n" + 
						"11/9 - 100명\r\n" + 
						"11/10 - 146명");
				break;
			case "국내 백신":
				new newWindow();
				newWindow.area.setText("국내 개발되고 있는 코로나19 백신과 치료제의 임상시험 현황을 식품의약품안전처가 27일 보고했다. \n"
						+ "현재 국내에서 승인한 임상시험은 치료제 24건, 백신 2건으로 총 26건이다. \n"
						+ "이 중에 치료제 임상시험 7건이 종료되었고 현재 진행 중인 임상시험은 치료제 17건, 백신 2건으로 총 19건이다. \n"
						+ "종료된 치료제 임상은 렘데시비르 3건, 옥시크로린정·칼레트라정, 할록신정, 바리시티닙, 페로딜 각 1건이다. \n"
						+ "진행 중인 치료제 임상 19건 중 제약업체가 진행하고 있는 16건과 연구자가 진행하고 있는 3건의 임상시험이 있다. \n"
						+ "제약업체가 진행하는 임상시험은 1상 임상 6건으로 항체치료제와 DNA 백신 등이며 2상 임상 8건은 혈장분획치료제 등이고, 3상 임상 2건이 있다. ");
				break;
				
			case "해외 코로나 정보":
				new newWindow();
				newWindow.area.setText("2020년 11월 11일 자\r\n" + 
						"\r\n" + 
						" 󰏚 미국 \r\n" + 
						"\r\n" + 
						"   - 11.9. 미국 제약사 화이자(Pfizer)는 독일 바이오엔테크(BioNTech)사와의 합작으로 개발 중인 자사 코로나 19 백신에 대한 제 1차 공식 외부 독립전문가단의 데이터 평가 결과, 코로나19 감염을 90%이상 예방한다는 임상시험 중간 결과를 발표 \r\n" + 
						"   - 화이자 측은 미 식품의약국(FDA) 지침에 따른 최소 2달 동안의 백신 안전성 입증 데이터의 수집 완료 및 제출 이후 이달 말 FDA에 백신 긴급사용승인을 신청할 계획으로, 연내까지 1500만에서 2000만회분의 백신 생산을 완료할 계획\r\n" + 
						"\r\n" + 
						"   - 뉴욕타임스 통계 자료에 따르면, 11.8. 미국 내 코로나19 일일 신규 확진자 수가 103,600명으로 집계되어 팬데믹 이래 총 누적 확진자 수가 천만명 이상에 달함. 최근 5일 연속 일일 신규 확진자가 10만명 이상 발생하여, 전 세계 코로나19 총 누적 확진자(5천20만여명)의 ⅕ 가량 차지\r\n" + 
						"\r\n" + 
						"   - 11.8. 미 유타주는 코로나19 확진자 급증으로 인한 심각한 입원병상 부족 문제에 직면하여 주 전역에 비상사태를 선포. 이에 따라, 추후 별도 공지가 있을 때까지 마스크 의무착용이 시행되며, 향후 2주간 세대 내 가족 간 모임만 허용되며, 모든 교외활동은 잠정 보류 및 연기됨\r\n" + 
						" \r\n" + 
						"\r\n" + 
						" 󰏚 카자흐스탄\r\n" + 
						"   - 카자흐스탄 정부는 러시아의 코로나19 확산세를 반영하여 국경도시인 페트로파블롭스크(Petropavlovsk)에 11.9.(월) 봉쇄 조치를 내리고, 해당 지역으로 통하는 5개 도로를 폐쇄함. 의료용품 및 생활필수용품 운반차량과 응급차만 도시 출입이 가능함\r\n" + 
						"\r\n" + 
						" 󰏚 필리핀 \r\n" + 
						"   - 필리핀 당국은 11.9.(월)에 코로나19 사망자가 108명 발생하여 지난 10.23.(금) 이후 최다를 기록했다고 발표 \r\n" + 
						"   - 필리핀 정부는 내년에 국민의 25% 이상이 코로나19 백신을 접종할 수 있도록 코로나19 백신 5,000만 도스를 확보할 계획\r\n" + 
						"\r\n" + 
						" 󰏚 러시아\r\n" + 
						"   - 러시아 보건 당국은 11.9(월)(현지시간) 코로나19 백신 스푸트니크의 효능이 90% 이상이며, *또 다른 효과적인 백신의 출현은 모두에게 희소식이라고 밝힘\r\n" + 
						"   \r\n" + 
						" 󰏚 프랑스\r\n" + 
						"   - 프랑스 보건장관은 최근 코로나19 재확산이 심각해짐에 따라 중환자실 입원환자 수가 지난 4월에 기록했던 최고치에 육박하고 있어 ‘지금 결정적인 순간’이라며 이동제한 및 예방 수칙 준수를 재차 강조함   \r\n" + 
						"\r\n" + 
						" 󰏚 중국\r\n" + 
						"   - 중국 위생건강위원회는 11.9.(월) 발생한 신규 확진자 22명 가운데 해외유입이 21명, 지역사회에서 1명(상하이)이 발생했다고 밝힘, 상하이시 위생건강위원회는 11.9.(월) 확인된 지역사회 확진자는 상하이 푸둥 국제공항 수화물 운반 담당 직원(51세 남성)으로 즉각 격리 조치했으며 밀접접촉자 26명도 함께 격리하고 의료관찰을 진행 중이라고 밝힘\r\n" + 
						"    * 전날(8일)에도 톈진의 한 수입 냉동식품 회사 포장업무 담당 직원 1명이 지역사회 확진 판정을 받음\r\n" + 
						" \r\n" + 
						" 󰏚 홍콩\r\n" + 
						"   - 홍콩 정부는 만성 질환을 앓고 있으나 코로나19로 인해 귀국할 수 없는 광동 지역 거주 홍콩 주민에게는 11.10(화)부터 1인당 100위안(한화 약 16,000원)의 의료 보조금을 지급한다고 발표함. 단, 보조금은 홍콩대학 부설 선전병원에 방문하는 사람에게만 지급하기로 병원 측과 합의함\r\n" + 
						"\r\n" + 
						" 󰏚 일본\r\n" + 
						"   - 일본 보건부 장관은 코로나19 백신이 공급될 시 노인에게 가장 우선적으로 접종할 것이며, 그밖에 심장병, 만성폐질환, 뇌혈관질환, 신부전을 포함한 만성질병 환자 등 우선적으로 백신 접종을 받을 사람들에게 무료 백신 쿠폰을 나눠줄 계획이라고 발표\r\n" + 
						"\r\n" + 
						"\r\n" + 
						" 󰏚 말레이시아 \r\n" + 
						"  - 말레이시아 교육부는 코로나19의 확산을 차단하기 위해서 11.9.(월)부터 12.17.(목)까지 말레이시아 내 모든 초·중·고등학교를 폐쇄하고, 등교수업을 원격수업으로 전환한다고 밝힘");
				break;
			case "해외 코로나 사이트":
				new newWindow();
				newWindow.area.setText("해외 코로나 확진자 현황 사이트이다.\r\n" + 
						"https://www.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6");
				break;
//			case "해외 바이러스 문건":
//				new newWindow();
//				newWindow.area.setText("해외 바이러스 문건");
//				break;
			case "해외 백신 정보":
				new newWindow();
				newWindow.area.setText("2020년 11월 11기준\r\n" + 
						"화이자 코로나 백신, 예방효과 90% 넘어…“마침내 빛이 보인다.”\r\n" + 
						"화이자 백신 가격 “국가, 지역별 차등… 시세보다 낮게 책정”\r\n" + 
						"화이자 \"백신 90% 예방 효과\"...\"이달 말 긴급사용 승인 기대\"\r\n" + 
						"파우치 소장 “화이자 백신, 코로나 팬데믹 끝낼 잠재력 있어”");
				break;		
				
			case "텍스트 데이터 열기":
				//해당 경로에 있는 파일을 오픈합니다. 
				Desktop.getDesktop().edit(new File("C:\\Users\\user\\Desktop\\java\\corona\\src\\original_csv_file\\test_text_old.csv"));
				break;
			case "파일 저장":
				new newWindow();
				newWindow.area.setText("아직 구현되지 않았습니다.");
				break;
			case "종료":
				System.exit(0);
				break;	
		}
		}catch (IOException e1) { //desktop을 통해  메모장을 실행할 경우에 발생할 수 있는 예외를 처리합니다. 
			e1.printStackTrace();
			System.out.printf("IOException 예외가 발생했습니다:%s",e1);
		}
	}
}
