package String;

public class StringClassmethod
{
public static void main(String[] args) 
{
String s1 = "ADITYA";
String s2 = "aditya";

System.out.println(s1.replace("A", "R"));

System.out.println(s1.isEmpty());

System.out.println(s1.concat(s2));

System.out.println(s1.substring(3));
System.out.println(s1.substring(2, 5));

System.out.println(s1.endsWith("YA"));
System.out.println(s1.startsWith("R"));

System.out.println(s1.lastIndexOf('A'));
System.out.println(s1.indexOf("A"));

System.out.println(s1.charAt(3));

System.out.println(s1.contains(s2));
System.out.println(s1.equalsIgnoreCase(s2));




System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());

System.out.println(s1.length());
System.out.println(s2.length());

System.out.println(s1);
System.out.println(s2);
}
}
