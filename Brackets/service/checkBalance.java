package Brackets.service;
import java.util.*;


public class checkBalance {
	static Stack<Character> stack=new Stack<>();
	static char pair(char bracket)
	{
		switch(bracket)
		{
		case ')':return('(');
		case '}':return('{');
		case ']':return('[');
		}
		return(' ');
	}
	static boolean check(char bracket)
	{
		char pair=pair(bracket);
		if(stack.isEmpty())
			return(false);
		else if(stack.peek()==pair)
		{
			stack.pop();
			return(true);
		}
		else
			return(false);
	}

	public static boolean isBalanced(String input)
	{	
		for(char bracket:input.toCharArray())
		{
			if(bracket=='(' || bracket=='{' || bracket=='[')
				stack.push(bracket);
			else if(bracket==')' || bracket=='}' || bracket==']')
			{
				if(!check(bracket))
					return(false);


			}
		}
		if(stack.isEmpty())
			return(true);
		return(false);
	}


}
