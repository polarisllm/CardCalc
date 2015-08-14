package pol.isaac.carcCalc.data;

import java.util.ArrayList;

public class OpAnswer {

	private final ArrayList<OpCell> list = new ArrayList<OpCell>();
	private boolean win;
	
	public OpAnswer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public OpCell getOpByIndex(int index)
	{
		return list.get(index);
	}
	
	public void addOp(OpCell op)
	{
		list.add(op);
	}
	
	public void setWin(boolean val)
	{
		win = val;
	}
	
	public int size()
	{
		return list.size();
	}
	
	public boolean isWin()
	{
		return win;
	}
}
