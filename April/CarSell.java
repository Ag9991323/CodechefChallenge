package April;
import java.io.*;
import java.util.Arrays;
import java.util.*;


class CarSell{
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
            long sum=0;
             int count=0;
            int q=1000000007;
             Arrays.sort(arr);
             for(int i=N-1;i>=0;i--){
                 int temp=arr[i]-count++;
                 if(temp<=0){
                     break;
                 }
                 sum+=(temp)%q;
                 sum=sum%q;
                 if(sum<0){
                     sum+=q;
                 }
             }
             System.out.println(sum);

        }
    }
}