package April;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

class subsequence {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            int N =Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            StringTokenizer token = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++)
                arr[i]=(Integer.parseInt(token.nextToken()))%4;
           long sum= (N*(N+1))/2;
           int previousnum=0;
          
         
            for(int i=0;i<N;i++){
               long temp=arr[i]%4;
              boolean ischange =false;
              int currentnum=0;
              if(i>0&&(arr[i-1]&1)==1){
                  sum-=previousnum;
                  continue;
              }
              else  previousnum=0;
              
              
              int j=i+1;
           
                while(temp%4!=0){
               
                     if(temp%4==2){
                        sum--;
                        ischange=true;
                    }
                    if(ischange)
                        currentnum++;
                    
                    
                    if(j<N){
                        temp=temp*arr[j++];
                        temp=temp%4;
                    }
                     
                    else break;
                   
                }

                 if(ischange){
                     previousnum=currentnum;
                   
                }

            }
            System.out.println(sum);

        }
    }

}