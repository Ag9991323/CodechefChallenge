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
            long arr[] = new long[N];
            //StringTokenizer token = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i]=4;
            }
          long sum= (N*(N+1))/2;
          long previousnum=0;
         
         
            for(int i=0;i<N;i++){
              BigInteger temp=BigInteger.valueOf(arr[i]);
              boolean ischange =false;
              long currentnum=0;
              if(i>0&&(arr[i-1]&1)==1){
                
                  sum-=previousnum;
                  continue;
              }
              else{
                  previousnum=0;
              }
              
              int j=i+1;
           
                while(temp.mod(BigInteger.valueOf(4))!=BigInteger.valueOf(0)){
                     

                    if(temp.mod(BigInteger.valueOf(4)).equals(BigInteger.valueOf(2))){
                        sum--;
                       ischange=true;
                    }
                    if(ischange){
                        currentnum++;
                    }
                    if(j<N){
                        temp= temp.multiply(BigInteger.valueOf(arr[j++]));
                        temp=temp.mod(BigInteger.valueOf(4));
                        if(temp.compareTo(BigInteger.valueOf(0))==-1){
                            temp=temp.add(BigInteger.valueOf(4));
                        }
                    }
                    else{
                        break;
                    }
                 }

                 if(ischange){
                     previousnum=currentnum;
                }

            }
            System.out.println(sum);

        }
    }

}