package pol.isaac.carcCalc;

import java.util.ArrayList;


public class TreeBuilder {

	public class TreeNode {
//	      String val;
		ArrayList<Integer> list;
		ArrayList<TreeNode> children;
		TreeNode(ArrayList<Integer> val) { list = val; }
		TreeNode(){list = new ArrayList<Integer>();};
		
		ArrayList<Integer> getLeftNum(int[] arr){
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if(!list.contains(arr[i]))result.add(arr[i]);
			}
			return result;
		}
		
		void addChild(TreeNode child)
		{
			if(children==null)children = new ArrayList<TreeBuilder.TreeNode>();
			children.add(child);
		}
	  }
	
	private int[] leftList = {0,1,2,3,4};
	private int[] rightList = {5,6,7,8,9};
	
	private ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
	
	public void calc(boolean left)
	{
		if(readFromFile())return;
		
		TreeNode root = new TreeNode();
		
		int leftCount = leftList.length;
		int rightCount = rightList.length;
		boolean side = left;
		addNode(root,side);
		
		System.out.println(answer);
		System.out.println(answer.size());
	}
	
	private void addNode(TreeNode node,boolean side)
	{
		int[] arr = side?leftList:rightList;
		ArrayList<Integer> list = node.getLeftNum(arr);
		for (int i = 0; i < list.size(); i++) {
			ArrayList<Integer> nList = (ArrayList<Integer>) node.list.clone();
			nList.add(list.get(i));
			TreeNode nNode = new TreeNode(nList);
			node.addChild(nNode);
		}
		
		if(node.children==null)
		{
			answer.add(node.list);
			return;
		}
		
		for (int i = 0; i < node.children.size(); i++) {
			addNode(node.children.get(i),!side);
		}
	}
	
	private boolean readFromFile()
	{
		
		return false;
	}
}
