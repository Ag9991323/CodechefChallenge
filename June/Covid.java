/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static int MatrixMaker(int [] []arr,int r1,int c1,int r2,int c2,int count,BufferedReader br) throws Exception{
        if(count==0){
          
            for(int i=r1-1;i<r2;i++) for(int j=c1-1;j<c2;j++) {
              arr[i][j]=0;
              
            }
            return 0;
        }
        else if(r1==r2&&c2-c1== count-1){
            for(int i=c1-1;i<c2;i++) arr[r1-1][i]=1;
            return count;
        }
         
        else if(r2>r1){
            int dif = (r1+r2)/2;
            if(dif-r1>(r2-(dif+1))){
            System.out.println(1+" "+r1+" "+c1+" "+dif +" "+c2);
            int under = Integer.parseInt(br.readLine());
             if(count==-1) return -1 ;
            int num = MatrixMaker(arr,r1,c1,dif,c2,under,br);
            if(count==-1||num==-1) return -1;
            MatrixMaker(arr,dif+1,c1,r2,c2,count-under,br);
            }
            else{
               System.out.println(1+" "+(dif+1)+" "+c1+" "+r2 +" "+c2);
            int under = Integer.parseInt(br.readLine());
             if(count==-1) return -1 ;
             int num =   MatrixMaker(arr,dif+1,c1,r2,c2,under,br);
            if(count==-1||num==-1) return -1;
            MatrixMaker(arr,r1,c1,dif,c2,count-under,br);
           

            }
      
            
            return count ;
        }
        else{
          int dif = (c1+c2)/2;
            if(dif-c1>(c2-(dif+1))){
            System.out.println(1+" "+r1+" "+c1+" "+r2 +" "+dif);
            int under = Integer.parseInt(br.readLine());
             if(count==-1) return -1 ;
            int num = MatrixMaker(arr,r1,c1,r2,dif,under,br);
            if(count==-1||num==-1) return -1;
            MatrixMaker(arr,r1,dif+1,r2,c2,count-under,br);
            }
            else{
               System.out.println(1+" "+r1+" "+(dif+1)+" "+r2 +" "+c2);
            int under = Integer.parseInt(br.readLine());
             if(count==-1) return -1 ;
             int num =   MatrixMaker(arr,r1,dif+1,r2,c2,under,br);
            if(count==-1||num==-1) return -1;
            MatrixMaker(arr,r1,c1,r2,dif,count-under,br);
           

            }
            return count;
        }
        
    }
	public static void main (String[] args) throws Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- >0){
      StringTokenizer st = new StringTokenizer(br.readLine());
		    	int N= Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int arr[][]= new int[N][N];
        System.out.println(1+" "+1+" "+1+" "+N +" "+N);
        int X = Integer.parseInt(br.readLine());
        if(X==-1) break ;
        MatrixMaker(arr,1,1,N,N,X,br);
        // int num =0;
        // for(int i=0;i<N;i++) for(int j=0;j<N;j++) if(arr[i][j]==-1) num++;
        // if(num>0) break;
        StringBuilder str = new StringBuilder();
        str.append("2"+"\n");
        
        for(int i=0;i<N;i++) {
                for(int j=0;j<N;j++) 
                str.append(arr[i][j]+" ");
              str.append("\n");  
            }
        System.out.print(str);
          X= Integer.parseInt(br.readLine());
        if(X==1) continue;
        else if(X==-1) break;   
            
		}
		
	
	
		       
		
	}
}
