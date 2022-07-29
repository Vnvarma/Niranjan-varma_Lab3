package Sumpair.driver;
import Sumpair.service.*;

public class Main {

	public static void main(String[] args) {
		
		Bst tree=new Bst();
		tree.insertNode(40);
		tree.insertNode(20);
		tree.insertNode(60);
		tree.insertNode(10);
		tree.insertNode(30);
		tree.insertNode(50);
		tree.insertNode(70);
		int sum=130; 
		tree.sumPair(sum);
	}

}
