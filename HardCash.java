
import java.math.BigInteger;
import java.util.*;
class HardCash{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int T= scan.nextInt();
        while(T--!=0){
            int N= scan.nextInt();
            int K= scan.nextInt();
            int[] array = new int[N];
            for(int i=0;i<N;i++)
                array[i]= scan.nextInt();
            BigInteger b=BigInteger.valueOf(0);
            for(int i=0;i<N;i++){
                b=b.add(BigInteger.valueOf(array[i]).mod(BigInteger.valueOf(K)));
                
                
            } 
            for(int i=N-1;i>=0 && (b.compareTo(BigInteger.valueOf(K))==1||b.compareTo(BigInteger.valueOf(K))==0);i--){
                b=b.subtract(BigInteger.valueOf(K));
                  
                }
            
            System.out.println(b);

            
        }
    }
}