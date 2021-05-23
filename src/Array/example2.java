package Array;

public class example2 
{
public static void main(String[] args) 
{
String ar[] = new String [5];
ar[0]="aditya";
ar[1]="teju";
ar[2]="kunal";
ar[3]="rinki";
ar[4]="aaku";

System.out.println(ar[0]);

int size = ar.length;
System.out.println("array size : "+ size);

for (int i=0;i<=4;i++)
{System.out.println(ar[i]);}

//same

for(int i=0;i<=size-1;i++)
{System.out.println(ar[i]);}
}
}
