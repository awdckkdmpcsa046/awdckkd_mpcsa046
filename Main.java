import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
if((n&1)==0)
System.out.print("EVEN");
else
System.out.print("ODD");
}
}