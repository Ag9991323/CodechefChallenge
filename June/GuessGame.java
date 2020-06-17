
package June;
import java.util.*;
import java.io.*;

 class GuessGame {
     static HashSet<Integer> hs;
    static int partition(int start,int end,BufferedReader br) throws Exception{
       
   
        if(start>end) {
            return    -1;}
           
        int oneNumber=start + ( end-start)/3;
        
        while(hs.contains(oneNumber)) oneNumber++;
        if(oneNumber>end&&oneNumber<start) return -1;
        System.out.println(oneNumber);
        hs.add(oneNumber);
        String one = br.readLine();
        if(one.equals("E")) return 1;
         
        int secondNumber =start+ (end-start)/2;
        while(hs.contains(secondNumber)) secondNumber++;
        if(secondNumber>end&&secondNumber<start) return -1;
        System.out.println(secondNumber);
        hs.add(secondNumber);
        int num=0;
        String second = br.readLine();
        if(second.equals("E")) return 1;
   
        else if(one.equals(second)){
            
            if(one.equals("G")) {
                num= partition(oneNumber+1, end, br);
               return num;

            }
            else{
                num = partition(start, secondNumber-1, br);
                return num;
            }   

        }
        else{
            if(one.equals("L")){
               num= partition(start, oneNumber-1, br);
                if(num==1) return 1;
                    num= partition(secondNumber+1, end, br);
                return num;
            } 
            else{
                int thirdNumber = secondNumber + (end-start)/4;
                while(hs.contains(thirdNumber)) thirdNumber++;
                if(thirdNumber>end&&thirdNumber<start) return -1;
                System.out.println(thirdNumber);
                hs.add(thirdNumber);
                String third = br.readLine();
                if(third.equals("E")) return 1;
                else if(second.equals(third)) return partition(start, thirdNumber-1, br);
                else {
                    num = partition(start,secondNumber-1, br);
                    if(num==1) return 1;
                    num = partition(thirdNumber+1, end, br);
                    return num;
                }
                 
                

            }

        }
}
    public static void main(String[] args)throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int start=1;
        int end = N;
        hs = new HashSet<>();
        partition(start, end, br) ; 
        
        
    }
    
}