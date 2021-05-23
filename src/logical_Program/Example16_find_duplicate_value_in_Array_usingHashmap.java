package logical_Program;

import java.util.HashMap;
import java.util.HashSet;

public class Example16_find_duplicate_value_in_Array_usingHashmap
{
public static void main(String[] args) {
	
	String[] ar = {"aditya","kunal","teju","aditya","kunal","teju","aditya","kunal","teju"};
	
	HashSet<String> set = new HashSet<String>();
	
	System.out.println("print duplicate value");
	
	for(String str :ar)
	{
		if(!set.add(str))
		{System.out.println(str);}
	}
}
}
