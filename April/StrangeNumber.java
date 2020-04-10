package April;

import java.math.BigInteger;
import java.util.*;


class StrangeNumber {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();

       // HashSet<Integer> h = new HashSet<>();
       ArrayList <Integer> lst = new ArrayList<>();
       //h.add(2);
       lst.add(2);
       for(int i=3;i<=Math.sqrt(1000000000);i+=2){
           boolean prime= true;
           for(int j=0;j<lst.size();j++){
               if(i%lst.get(j)==0){
                   prime=false;
                   break;
               }
              

           }
           if(prime){
            lst.add(i);
           
        }
        }
        
          // System.out.println(lst);
           
        
        while(t-->0){
           int x= scan.nextInt();
           int k = scan.nextInt();
        
         int originalx=x;
         int max=0;
       
        
      
           x: for(int i=2;i<=originalx/2;i++){
               
           
                if(x%i==0){
                 
                  while(x%i==0){
                      x/=i;
                      max++;
                      //1System.out.println(i);
                  }
                }
              
                if(x<=i){
                    break x;
                }
                boolean prime=true;
                for(int m=0;m<lst.size();m++){
                   
                  if(lst.get(m)>=x){
                     break;
                }
                  if(x%lst.get(m)==0){
                      prime=false;
                      break;
                  }
               
                 }
                 
                 if(prime){
                     max++;
                     break x;  
                 }
                
  
            }
           
         
         
         
          if(k==1&&originalx>1){
              System.out.println(1);
          }
       else if(k>max){
              System.out.println(0);
          }
          else{
              System.out.println(1);
          }
          
            
           }
           
                
                 
       
           }
      

           }
        
           
       
   

