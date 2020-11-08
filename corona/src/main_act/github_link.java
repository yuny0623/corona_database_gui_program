package main_act;
import java.io.IOException; 
import java.net.URI; 
import java.net.URISyntaxException; 
import java.awt.Desktop;

//URI에 적힌 링크로 이동할 수 있음. 이 경우에는 깃허브 링크로 이동가능. 
public class github_link {
	github_link(){
		try { 
			Desktop.getDesktop().browse(new URI("https://github.com/yuny0623/corona_database_gui_program")); 
			}catch (IOException e) { e.printStackTrace(); 
			}catch (URISyntaxException e_follow) { 
				e_follow.printStackTrace(); }
	}
}
