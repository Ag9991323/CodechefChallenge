import java.util.*;
 class  MostUnstable{
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int t = scan.nextInt();
         int max=10000;
         int [] arr1 =new int[max+1];
         for (int i=0;i<=max;i++) arr1[i]=1;
         arr1[0]=0;
         arr1[1]=0;
         ArrayList<Integer> lst = new ArrayList<Integer> ();
         for(int i=2;i<max;i++){
             if(arr1[i]==1){
                 for(int j=i*i;j<=max;j+=i) arr1[j]=0;
             }
         }
         for(int i=0;i<=max;i++)  if(arr1[i]==1) lst.add(i); 

         while(t-- >0){
         int N= scan.nextInt();
         if(N==1) System.out.println(0);
         else{
            long corner=1;
            long middle=1;
           long steps=0;
            while(N!=3){
                steps+=4*(corner+2*middle);
                steps +=4*(N-4)*middle;
                corner=corner+2*middle+1;
                middle++;
                N-=2;
          }
         
          steps+=4*corner+ 4*middle;
          System.out.println(steps);
         }
         
        
       }
  }
}