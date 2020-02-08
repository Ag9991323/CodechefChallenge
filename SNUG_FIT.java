import java.math.BigInteger;
import java.util.*;
class SNUG_FIT{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        while(T--!=0){
            int N= scan.nextInt();
            int arr1[]=new int[N];
            int arr2[]= new int[N];
            for (int i=0;i<N;i++)
                arr1[i]= scan.nextInt();

            for (int i=0;i<N;i++)
                arr2[i]= scan.nextInt();

           Arrays.sort(arr1);
           Arrays.sort(arr2);
          BigInteger sum=BigInteger.valueOf(0);
           for(int i=0;i<N;i++){
            sum=sum.add(BigInteger.valueOf(Math.min(arr1[i],arr2[i])));
           }  
           
           System.out.println(sum);   

        
        
        
        
        
        }
    }
}