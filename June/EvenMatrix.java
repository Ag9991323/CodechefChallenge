/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static  void Normal(int N,int arr[][]){
        int count=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=count++;
            }
        }
    }
    static void AbNormal(int N,int arr[][]){
        int count=1;
        for(int i=0;i<N;i++){
              if(i%2==0){
                  for(int j=0;j<N;j++){
                     arr[i][j]=count++;
                 }
              }
              else{
                  for(int j=N-1;j>=0;j--) arr[i][j]= count++;
              }
            
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    int N= scan.nextInt();
		    int arr[][] = new int[N][N];
		    if(N%2==1) Normal(N,arr);
		    else AbNormal(N,arr);
		    StringBuilder str = new StringBuilder();
		    for(int i=0;i<N;i++){
		        for(int j=0;j<N;j++) str.append(arr[i][j]+" ");
		        str.append("\n");
		    }
		    System.out.print(str);
		    
		    
		}
	}
}
