package April;

import java.io.*;
import java.util.Arrays;
import java.util.*;


class Covid{
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-- >0){
            int N=Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            StringTokenizer token = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i]= Integer.parseInt(token.nextToken());
            }
              String ans="YES";
            int dist=6;
           
            for(int i=0, j=-1;i<N;i++){
                if(arr[i]==0&&j!=-1){
                    dist--;
                }
                else if(arr[i]==1&&(dist!=6&&dist>0)){
                    ans="NO";
                  
                    break;
                }
                else if(arr[i]==1){
                    dist=5;
                    j=i;
                }

             

            }
            System.out.println(ans);

        }
    }
}