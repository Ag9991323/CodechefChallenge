import java.math.BigInteger;
import java.util.*;;

class Theatre {
    
   
  
        
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T= scan.nextInt();
        BigInteger finalsum=BigInteger.valueOf(0);
        while(T--!=0){
            int N=scan.nextInt();
            int[] arr = new int[N];
            char[] movie=new char[N];
            for(int i=0;i<N;i++){
                movie[i]= scan.next().charAt(0);
                arr[i]= scan.nextInt();
            }
            int[][] finalmovie= new int[4][4];
           
            for(int i=0;i<N;i++){
                int num= movie[i]-65;
                int time=(arr[i]/3)-1;
            
                finalmovie[num][time]=finalmovie[num][time]+1;
            } 
            int[][] maximum = new int[24][4];
            
          int[][][]loc ={{{0,0},{1,1},{2,2},{3,3}},{{0,0},{1,1},{2,3},{3,2}},{{0,0},{1,2},{2,1},{3,3}},{{0,0},{1,2},{2,3},{3,1}},{{0,0},{1,3},{2,1},{3,2}},{{0,0},{1,3},{2,2},{3,1}},
                        {{0,1},{1,0},{2,2},{3,3}},{{0,1},{1,0},{2,3},{3,2}},{{0,1},{1,2},{2,0},{3,3}},{{0,1},{1,2},{2,3},{3,0}},{{0,1},{1,3},{2,2},{3,0}},{{0,1},{1,3},{2,0},{3,2}},
                        {{0,2},{1,0},{2,1},{3,3}},{{0,2},{1,0},{2,3},{3,1}},{{0,2},{1,1},{2,0},{3,3}},{{0,2},{1,1},{2,3},{3,0}},{{0,2},{1,3},{2,0},{3,1}},{{0,2},{1,3},{2,1},{3,0}},
                        {{0,3},{1,0},{2,1},{3,2}},{{0,3},{1,0},{2,2},{3,1}},{{0,3},{1,1},{2,0},{3,2}},{{0,3},{1,1},{2,2},{3,0}},{{0,3},{1,2},{2,0},{3,1}},{{0,3},{1,2},{2,1},{3,0}}};
          for(int i=0;i<24;i++){
              for(int j=0;j<4;j++){
                  maximum[i][j]=finalmovie[loc[i][j][0]][loc[i][j][1]];
              }
          }
        //   for(int i=0;i<24;i++)
        //   System.out.println(Arrays.toString(maximum[i]));
          
            BigInteger max[]= new BigInteger[24];
           
            
                 
               
                   
           
          
           
            
          

            for(int j=0;j<24;j++){
                int Max[]=maximum[j];
                Arrays.sort(Max);
                BigInteger sum=BigInteger.valueOf(0);
                for(int i=3;i>-1;i--){
                    if(Max[i]!=0){
                     sum=sum.add(BigInteger.valueOf(Max[i]*((i+1)*25)));
                       }
                    else {
                        sum=sum.subtract(BigInteger.valueOf(100));
                    }
                }
                max[j]=sum;
            }
            Arrays.sort(max);
            System.out.println(max[23]);
           
            finalsum=finalsum.add(max[23]);
        }
        System.out.println(finalsum);


    }
}