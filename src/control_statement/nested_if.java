package control_statement;

public class nested_if {
public static void main(String[] args) {

	
	String username = "abc";
	String passward = "123";
	
	if (username == "abc")
	{System.out.println("correct username");
	
	if (passward=="123")
	{System.out.println("correct passward");}
	
	else
	{System.out.println("incorrect passward");
	System.out.println("login failed");}
	
	
	}
	else
	{System.out.println("incorrect passward");
	System.out.println("login failed");}
	
}
}