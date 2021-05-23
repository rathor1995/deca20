package practise;

public class sample4
{
public static void main(String[] args) {
	System.out.println("started");
	sample4 s4 = new sample4();
	s4.m4();
	s4.m5();
	
	
	System.out.println("ended");
}

public void m4()
{System.out.println(" nonstatic method from same class : m4");}

public void m5()
{System.out.println(" nonstatic method from same class : m5");}
}
