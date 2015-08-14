package pol.isaac.carcCalc;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

import pol.isaac.carcCalc.data.Card;

public class CardPanel extends JPanel {

	private final Card _cardData;
	public CardPanel(Card data) {
		super();
		_cardData = data;
		setSize(150, 200);
		setVisible(true);
		setBackground(Color.darkGray);
		initPanel();
	}
	
	private void initPanel(){
		initPic();
		initTexts();
		
	}
	
	private void initTexts()
	{
		JTextField textUp = new JTextField();
		JTextField textRight = new JTextField();
		JTextField textDown = new JTextField();
		JTextField textLeft = new JTextField();
		
		textUp.setText(String.valueOf(_cardData.getUp()));
		textDown.setText(String.valueOf(_cardData.getDown()));
		textRight.setText(String.valueOf(_cardData.getRight()));
		textLeft.setText(String.valueOf(_cardData.getLeft()));
		
		add(textUp, this);
		add(textRight, this);
		add(textDown, this);
		add(textLeft, this);
		
		int boarderOffset = 20;
		int textSize = 20;
		
//		textUp.setLocation((getWidth()-textUp.getWidth())/2, 0);
		
		textUp.setBounds((getWidth()-textSize)/2, 0, textSize, textSize);
		textDown.setBounds((getWidth()-textSize)/2, getHeight()-textSize, textSize, textSize);
		textLeft.setBounds(0, (getHeight()-textSize)/2, textSize, textSize);
		textRight.setBounds(getWidth()-boarderOffset, (getHeight()-textSize)/2, textSize, textSize);
		
		textUp.setEditable(false);
		textLeft.setEditable(false);
		textRight.setEditable(false);
		textDown.setEditable(false);
		
		
		JTextField textTitle = new JTextField();
		textTitle.setText(_cardData.getName());
		add(textTitle,this);
		textTitle.setBounds(textSize, getHeight()/2, getWidth()-textSize*2, 20);
		textTitle.setEditable(false);
		textTitle.setAlignmentX(CENTER_ALIGNMENT);
	}
	
	private void initPic()
	{
		
	}
}
