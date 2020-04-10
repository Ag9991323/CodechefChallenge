import java.math.BigInteger;
import java.util.*;;

class Theatre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Test= scan.nextInt();
        BigInteger sum=BigInteger.valueOf(0);
        while(Test--!=0){
            int N=scan.nextInt();
            int[] arr = new int[N];
            char[] movies=new char[N];
            for(int i=0;i<N;i++){
                movies[i]= scan.next().charAt(0);
                arr[i]= scan.nextInt();
            }
            int[][] finalmovie= new int[4][4];
           
            for(int i=0;i<N;i++){
                int num= movies[i]-65;
                int time=(arr[i]/3)-1;
            
                finalmovie[num][time]=finalmovie[num][time]+1;
            } 
            int[][] maximum = new int[24][4];
            
          int[][][]loc ={{{0,0},{1,1},{2,2},{3,3}},{{0,0},{1,1},{2,3},{3,2}},{{0,0},{1,2},{2,1},{3,3}},{{0,0},{1,2},{2,3},{3,1}},{{0,0},{1,3},{2,1},{3,2}},{{0,0},{1,3},{2,2},{3,1}},
                        {{0,1},{1,0},{2,2},{3,3}},{{0,1},{1,0},{2,3},{3,2}},{{0,1},{1,2},{2,0},{3,3}},{{0,1},{1,2},{2,3},{3,0}},{{0,1},{1,3},{2,2},{3,0}},{{0,1},{1,3},{2,0},{3,2}},
                        {{0,2},{1,0},{2,1},{3,3}},{{0,2},{1,0},{2,3},{3,1}},{{0,2},{1,1},{2,0},{3,3}},{{0,2},{1,1},{2,3},{3,0}},{{0,2},{1,3},{2,0},{3,1}},{{0,2},{1,3},{2,1},{3,0}},
                        {{0,3},{1,0},{2,1},{3,2}},{{0,3},{1,0},{2,2},{3,1}},{{0,3},{1,1},{2,0},{3,2}},{{0,3},{1,1},{2,2},{3,0}},{{0,3},{1,2},{2,0},{3,1}},{{0,3},{1,2},{2,1},{3,0}}};
          for(int k=0;k<24;k++){
              for(int m=0;m<4;m++){
                  maximum[k][m]=finalmovie[loc[k][m][0]][loc[k][m][1]];
              }
          }
       
          
            BigInteger maxes[]= new BigInteger[24];
           
        for(int j=0;j<24;j++){
                int Max[]=maximum[j];
                Arrays.sort(Max);
                BigInteger som=BigInteger.valueOf(0);
                for(int i=3;i>-1;i--){
                    if(Max[i]!=0){
                     som=som.add(BigInteger.valueOf(Max[i]*((i+1)*25)));
                       }
                    else {
                        som=som.subtract(BigInteger.valueOf(100));
                    }
                }
                maxes[j]=som;
            }
            Arrays.sort(maxes);
            System.out.println(maxes[23]);
           
            sum=sum.add(maxes[23]);
        }
        System.out.println(sum);


    }
}