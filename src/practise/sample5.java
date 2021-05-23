package practise;

import demo1.demo1;

public class sample5 
{
public static void main(String[] args) {
	System.out.println("started");
	sample6 s6 = new sample6();
	s6.m6();
	s6.m7();
	
	demo1 d1 = new demo1();
	d1.test();
	System.out.println("ended");
	
	}	
public void m6() {System.out.println("non static method from diff class");
	
	System.out.println("ended");
}

}
