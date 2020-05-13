package May;

import java.util.*;
class  TripleSort{

    static void   func(int[] arr,HashMap<Integer,Integer>hmap,int loca,int locb,int locc,int vala,int valb,int valc){
     
       
         
        //  if(vala>valb){
        //   int temp =vala;
        //   vala=valb;
        //   valb =temp;
        // }
         arr[loca]=valc;
         arr[locc]=valb;
         arr[locb] =vala;
        
  
         hmap.put(vala,locb);
         hmap.put(valb,locc);
         hmap.put(valc,loca);
        

    }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int k = scan.nextInt();
          int arr[] =  new int[N+1];
          HashMap <Integer,Integer> hmap = new HashMap<>();
        
          for(int i=1;i<=N;i++){
            arr[i]= scan.nextInt();
            hmap.put(arr[i], i);
          }
          StringBuilder str = new StringBuilder();
          int count=0;
          boolean sort = true;
          for(int i=1;i<=N;i++){
            if(arr[i]==i) continue;
             
              count++;
              if(count>k){
                sort=false;
                break;
              }  
              int previousa = arr[i];
              int loca =i;
              int previousc =i;
              int locc=hmap.get(i);
              int previousb=0;
              int locb=0;
              if(previousa!=locc){
                previousb =Math.max(locc,loca);
                locb=hmap.get(previousb);

               
              }
              else{
                      for(int j=i+1;j<=N;j++){
                      if(j==locc) continue;
                      if(arr[j]!=j){
                        
                          locb=j;
                          previousb=arr[j];

                          break;
                      }
                  }

              }


               
              
           
            

              // if(locb==locc){
              //     for(int j=i+1;j<=N;j++){
              //         if(j==locc) continue;
              //         if(arr[j]!=j){
                        
              //             locb=j;
              //             previousb=arr[j];

              //             break;
              //         }
              //     }
              // }

          if(locc==loca||locb==loca||locb==locc){
              sort=false;
              break;
          }
       
              
             str.append(loca+" "+locb+" "+locc+" \n");
             func(arr, hmap, loca, locb, locc, previousa, previousb, previousc);
             
      System.out.println(Arrays.toString(arr));
          }
      
          if(sort){
            System.out.println(count);
            System.out.print(str);
         
          }
          else System.out.println(-1);
           
          
          }
   }
}