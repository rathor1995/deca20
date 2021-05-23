package practise;

public class sample9 {
	public static void main(String[] args)
	{
	guest();
	System.out.println("-----------");
	admin("abc3","xyz");
		
	}
public static void guest()
{
System.out.println("login to pc using guest account");
String un ="abc";
String pwd ="xyz";
System.out.println(un);
System.out.println(pwd);
}
public static void admin (String UN, String PWD) 
{
System.out.println("LOG IN TO PC USING ADFMIN ACCOUNT");
System.out.println(UN);
System.out.println(PWD);

}
}
