package pol.isaac.carcCalc.data;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Card {
	private JSONObject _config;
	private JSONArray _numArr;
	public Card(JSONObject data) {
		_config = data;
		_numArr = (JSONArray) _config.get("num");
		
	}
	
	public String getName()
	{
		return _config.getString("name");
	}
	
	public int getUp()
	{
		return _numArr.getInt(0);
	}
	public int getRight()
	{
		return _numArr.getInt(1);
	}
	public int getDown()
	{
		return _numArr.getInt(2);
	}
	public int getLeft()
	{
		return _numArr.getInt(3);
	}


}
