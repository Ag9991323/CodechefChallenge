package May;

import java.util.*;
class  Coronavirus{
     
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          int best=1;
          int worst=1;
          int localbest=1;
          int localworst=1;
          int loc =arr[0];
          boolean untouch =true;
          for(int i=1;i<N;i++){
              if(arr[i]-loc<=2){
                localbest++;
                localworst++;
                
            }
            else{
               if(untouch) best =Math.max(best,localbest);
               
                best=Math.min(best,localbest);
                worst=Math.max(worst,localworst);
                localbest=1;
                localworst=1;
                untouch=false;
            }
            loc=arr[i];
          }
          if(untouch) best =Math.max(best,localbest);
                best=Math.min(best,localbest);
                worst=Math.max(worst,localworst);
          System.out.println(best+" "+worst);      
          }
   }
}