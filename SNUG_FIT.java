import java.math.BigInteger;
import java.util.*;
class SNUG_FIT{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        while(T--!=0){
            int n= scan.nextInt();
            int arr1[]=new int[n];
            int arr2[]= new int[n];
            for (int i=0;i<n;i++)
                arr1[i]= scan.nextInt();

            for (int i=0;i<n;i++)
                arr2[i]= scan.nextInt();

           Arrays.sort(arr1);
           Arrays.sort(arr2);
          BigInteger sum=BigInteger.valueOf(0);
           for(int i=0;i<n;i++){
            sum=sum.add(BigInteger.valueOf(Math.min(arr1[i],arr2[i])));
           }  
           
           System.out.println(sum);   

        
        
        
        
        
        }
    }
}
