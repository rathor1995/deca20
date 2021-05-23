package constructor;

public class class3 
{
int a;
int b;
int c;

class3()
{
	a=10;
	b=20;
}
class3(int p, int q)
{
	a=p;
	b=q;
}
class3( int p, int q, int r)
{
	a=p;
	b=q;
	c=r;
}

public void use ()
{
	System.out.println("addition");	
	System.out.println(a+b);
System.out.println("addition");	
System.out.println(a+b+c);	
System.out.println("multipliation");
System.out.println(a*b*c);
}
}
