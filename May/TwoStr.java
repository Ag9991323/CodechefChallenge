package May;

import java.util.*;
class  TwoStr{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
           int n = scan.nextInt();
           int m = scan.nextInt();
           long arr[] = new long[n];
           long arr2[] = new long[m];
           HashMap<Long,Integer> hs = new HashMap<>();
           for(int i=0;i<n;i++)arr[i]= scan.nextInt();
           for(int i=0;i<m;i++){
               arr2[i]= scan.nextInt();
               if(hs.containsKey(arr2[i])) hs.put(arr2[i],hs.get(arr2[i])+1);
               else hs.put(arr2[i],1);

          }
          HashMap<Long,Integer> res = new HashMap<>();
          
          for(int i=0;i<n;i++){
              long temp = arr[i];
              long  number = (long) Math.pow(temp,2);
              if(hs.containsKey(number)){
                  if(res.containsKey(number)) res.put(number,res.get(number)+1);
                  else res.put(number,1);
                    
              }
          }
          int maximumA=0;
          int maximumB=0;
          int maximized=0;
          for(Map.Entry<Long,Integer> map : res.entrySet()){
                long key = map.getKey();
                int value = map.getValue();

                int localmaxA= hs.get(key);
                long temp = (long)Math.pow(localmaxA,2)+ (long)Math.pow(value,2);
                if(maximized<temp){
                    maximumA= localmaxA;
                    maximumB= value;
                }


          }
          System.out.println(hs);
          System.out.println(res);
          System.out.println(maximized);

   }
}
}