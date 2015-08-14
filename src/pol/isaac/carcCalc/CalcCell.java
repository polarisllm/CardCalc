package pol.isaac.carcCalc;

import java.util.ArrayList;

import pol.isaac.carcCalc.data.Card;
import pol.isaac.carcCalc.data.OpAnswer;

public class CalcCell {

	private ArrayList<Card> _leftList;
	private ArrayList<Card> _rightList;
	
	private ArrayList<OpAnswer> _answerList = new ArrayList<OpAnswer>();
	
	public CalcCell(ArrayList<Card> leftList,ArrayList<Card> rightList) {
		// TODO Auto-generated constructor stub
		_leftList = leftList;
		_rightList = rightList;
		
	}
	
	private void calc(boolean firstLeft)
	{
		
	}
	
	private ArrayList<OpAnswer> buildList(boolean firstLeft)
	{
		
		
		return null;
	}
	
	private ArrayList<ArrayList<Card>> getHalfList(ArrayList<Card> list)
	{
		ArrayList<ArrayList<Card>> answerList = new ArrayList<ArrayList<Card>>();
		
		
		
		return answerList;
	}
	
	private ArrayList<ArrayList<Card>> getNextSize(ArrayList<ArrayList<Card>> originalAnswer,ArrayList<Card> list)
	{
		ArrayList<ArrayList<Card>> answerList = new ArrayList<ArrayList<Card>>();
		for (int i = 0; i < originalAnswer.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				ArrayList<Card> tmp = (ArrayList<Card>)answerList.get(i).clone();
				tmp.add(list.get(j));
				answerList.add(tmp);
			}
		}
		return answerList;
	}
	
	private ArrayList<OpAnswer> setCard(OpAnswer answer,boolean sideLeft )
	{
		ArrayList<Card> leftList = (ArrayList<Card>) _leftList.clone();
		ArrayList<Card> rightList = (ArrayList<Card>) _rightList.clone();
		
		for (int i = 0; i < answer.size(); i++) {
		}
		return null;
	}
	
}
