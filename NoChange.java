import java.util.*;
class Nochange{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t--!=0){
            int N= scan.nextInt();
            int p = scan.nextInt();
            int[] arr = new int[N];
            int sum=-1;
            
            for(int i=0;i<N;i++){
                arr[i]=scan.nextInt();
                int num=p%arr[i];
                if(num!=0){
                    sum=i;
                   
                }
            }
           
            if(sum==-1){
                int m=-1;
                int n=-1;
              
                
               for(int i=N-1;i>0;i--){
                  
                if((arr[i]%arr[i-1])!=0){
                      m=i;
                      n=i-1;
                      break;
                      
                  }
                  
               }
              
               if(m!=-1){
                StringBuilder str = new StringBuilder();
                str.append("YES ");
            
               for(int i=0;i<N;i++){
                if(n==i){
                    int number =p-arr[m];
                    str.append((int)Math.ceil((double)number/arr[n])+" ");
                }
                else if(m==i){
                    str.append("1 ");
                }
                else{
                    str.append("0 ");
                }
            }
            System.out.println(str);

               }
               else{
                   System.out.println("NO");
               }



            }
            else{
                StringBuilder str = new StringBuilder();
                str.append("YES ");
            
            for(int i=0;i<N;i++){
                if(sum==i){
                    str.append((int)Math.ceil((double)p/arr[i])+" ");
                }
                else{
                    str.append("0 ");
                }
            }
            System.out.println(str);
        }
        }

    }
}

// 9 0 0
// 7 1 0
// 4 3 0
// 2 4 0
// 4 1 1
// 2 2 1
// 2 0 2
// 0 0 3