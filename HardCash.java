
import java.math.BigInteger;
import java.util.*;
class HardCash{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int T= scan.nextInt();
        while(T--!=0){
            int n= scan.nextInt();
            int K= scan.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++)
                array[i]= scan.nextInt();
            BigInteger b=BigInteger.valueOf(0);
            for(int i=0;i<n;i++){
                b=b.add(BigInteger.valueOf(array[i]).mod(BigInteger.valueOf(K)));
                //hello world
                
                
                
                
                //hello world!1
                
            } 
            for(int i=n-1;i>=0 && (b.compareTo(BigInteger.valueOf(K))==1||b.compareTo(BigInteger.valueOf(K))==0);i--){
                b=b.subtract(BigInteger.valueOf(K));
                  
                }
            
            System.out.println(b);

            
        }
    }
}
