package inheritance;

public class multilevel 
{
public static void main(String[] args) {
	System.out.println("properties of son 1");
	son1 s1 = new son1();
	s1.bike();
	s1.mobile();
	s1.money();
	s1.home();
	s1.car();
	
	
	
	
	System.out.println("properties of son 1");
	son2 s2 = new son2();
	s2.bike1();
	s2.mobile1();
	s2.money();
	s2.home();
	s2.car();
	
}
}
