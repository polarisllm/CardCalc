package pol.isaac.carcCalc;

import java.awt.Container;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.RootPaneContainer;

import org.json.JSONObject;
import org.json.JSONTokener;

public class MainCardCalc{

	public static void main(String[] args) {
		MainCardCalc instance = new MainCardCalc();
		
		
		
	}
	
	private JSONObject _json;
	private Boarder _boarder;
	
	public MainCardCalc() {
		getMyConfig();
		createPanel();
		
	}
	
	private void createPanel()
	{
		JFrame jf = new JFrame("test");
		jf.setSize(500, 400);
		jf.setVisible(true);
		_boarder = new Boarder();
		jf.add(_boarder);
		
	}
	
	private void getMyConfig()
	{
		String str = new String();
		try {
			File file = new File("config/card.json");
			
			FileInputStream cardFile = new FileInputStream(file);
			int tempchar;
			while ((tempchar = cardFile.read()) != -1) {
				str += (char)tempchar;
			}
			cardFile.close();
			System.out.println(str);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(str.length()>0)
		{
			_json = new JSONObject(str);
		}
	}
	
	
}
