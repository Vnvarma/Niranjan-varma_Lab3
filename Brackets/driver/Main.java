package Brackets.driver;
import java.util.Scanner;

import Brackets.service.*;

 
 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");

		String input = sc.next();

		if(checkBalance.isBalanced(input))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}
	

}
