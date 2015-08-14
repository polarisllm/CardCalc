package pol.isaac.carcCalc;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import org.json.JSONObject;

import pol.isaac.carcCalc.data.Card;

public class Boarder extends JPanel {

	private ArrayList<CardPanel> _leftList = new ArrayList<CardPanel>();
	private ArrayList<CardPanel> _rightList = new ArrayList<CardPanel>();
	
	public Boarder() {
		// TODO Auto-generated constructor stub
		
		setSize(500, 400);
		setBackground(Color.white);
	}
	
	public void addCard(Card card,boolean sideLeft)
	{
		CardPanel panel = new CardPanel(card);
		addCard(panel,sideLeft);
	}
	
	public void addCard(CardPanel cardPanel,boolean sideLeft)
	{
		ArrayList<CardPanel> panList = sideLeft?_leftList:_rightList;
		panList.add(cardPanel);
		add(cardPanel, this);
		cardPanel.setLocation(20, 20);
	}
	
}
