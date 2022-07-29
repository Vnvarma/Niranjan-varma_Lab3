package Sumpair.service;
import java.util.*;


public class Bst {
	public Node root=null;
	HashSet<Integer> set=new HashSet<>();
	public class Node
	{
		public int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	public void insertNode(int data)
	{
		root=insert(root,data);
	}
	public Node insert(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return(root);
		}
		else if(data>root.data)
			root.left=insert(root.right, data);
		else if(data<root.data)
			root.right=insert(root.left,data);
		return(root);
	}
	
	
	public boolean pair(Node node,int sum)
	{
		if(node==null)
			return(false);
		if(pair(node.left,sum))
			return(true);
		if(set.contains(sum-node.data))
		{
			System.out.println("Pair is ("+node.data+","+(sum-node.data)+")");
			return(true);
		}
		else
		{	
			set.add(node.data);
		}
		return(pair(node.right,sum));
	}
	public void sumPair(int sum)
	{
		if(!pair(root,sum))
			System.out.println(" nodes are not found.");
	}
}