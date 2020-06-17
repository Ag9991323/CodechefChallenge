
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan = new Scanner(System.in);
	   int t = scan.nextInt();
	   while(t-- >0){
	       long T= scan.nextLong();
	       
	       while(T>0&&T%2==0){
	               T/=2;
	           }
	     long j = T/2;
	     System.out.println(j);
	       
	   }
	}
}