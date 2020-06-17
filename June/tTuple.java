package June;

import java.util.Scanner;
import java.util.*;
import java.io.*;

class Main {
    static int fun(int p, int q, int r, int a, int b, int c) {
        int pa = a - p;
        int qb = b - q;
        int rc = c - r;
        double rA = Double.MAX_VALUE;
        double rB = Double.MAX_VALUE;
        double rC = Double.MAX_VALUE;
        if (p != 0 && a >= p)
            rA = (double) a / p;
        if (q != 0 && b >= q)
            rB = (double) b / q;
        if (r != 0 && c >= r)
            rC = (double) c / r;

        if (pa == 0 && qb == 0 && rc == 0)
            return 0;
        else if (pa == 0 && qb == 0)
            return 1;
        else if (qb == 0 && rc == 0)
            return 1;
        else if (pa == 0 && rc == 0)
            return 1;

        else if (pa == qb && qb == rc)
            return 1;
        else if (rA != Double.MAX_VALUE && rA == rB && rC == rB&&((int) Math.floor(rB)==Math.ceil(rB)))
            return 1;

        else if (pa == 0) {
            if (qb == rc || (rB == rC && rB != Double.MAX_VALUE &&((int) Math.floor(rB)==Math.ceil(rB))))
                return 1;
            else
                return 2;
        } else if (qb == 0) {
            if (pa == rc || (rA == rC && rA != Double.MAX_VALUE &&((int) Math.floor(rA)==Math.ceil(rC))))
                return 1;
            else
                return 2;
        } else if (rc == 0) {
            if (pa == qb || (rA == rB && rA != Double.MAX_VALUE&&((int) Math.floor(rB)==Math.ceil(rA))))
                return 1;
            else
                return 2;
        } else if (pa == qb || (rA == rB && rA != Double.MAX_VALUE&&((int) Math.floor(rA)==Math.ceil(rB))))
            return 2;
        else if (qb == rc || (rB == rC && rB != Double.MAX_VALUE&&((int) Math.floor(rB)==Math.ceil(rC))))
            return 2;
        else if (pa == rc || (rA == rC && rA != Double.MAX_VALUE&&((int) Math.floor(rA)==Math.ceil(rC))))
            return 2;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            int r = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int num = fun(p, q, r, a, b, c);
            if (num != -1){
              System.out.println(num);
            }
           
            else {
                int Minimum = 2;
                int[] sortarr = new int[] { Math.abs(p), Math.abs(q), Math.abs(r), Math.abs(a), Math.abs(b),
                        Math.abs(c) };
                int arr[] = new int[14];
                Arrays.sort(sortarr);

                z: for (int j = -sortarr[5]; j <= sortarr[5]; j++) {
                    arr[0] = fun(p + j, q, r, a, b, c);
                    arr[1] = fun(p + j, q + j, r, a, b, c);
                    arr[2] = fun(p + j, q + j, r + j, a, b, c);
                    arr[3] = fun(p + j, q, r + j, a, b, c);
                    arr[4] = fun(p, q + j, r + j, a, b, c);
                    arr[5] = fun(p, q + j, r, a, b, c);
                    arr[6] = fun(p, q, r + j, a, b, c);
                    arr[7] = fun(p * j, q, r, a, b, c);
                    arr[8] = fun(p, q, r * j, a, b, c);
                    arr[9] = fun(p, q * j, r, a, b, c);
                    arr[10] = fun(p * j, q * j, r, a, b, c);
                    arr[11] = fun(p * j, q, r * j, a, b, c);
                    arr[12] = fun(p, q * j, r * j, a, b, c);
                    arr[13] = fun(p * j, q * j, r * j, a, b, c);
                    int fmin = 2;
                    for (int i = 0; i < 14; i++) {
                        if (arr[i] != -1) {
                            fmin = Math.min(fmin, arr[i]);
                            if (fmin == 0) {
                                Minimum = 0;
                                break z;
                            }

                        }
                    }
                    Minimum = Math.min(Minimum, fmin);

                }
               
               System.out.println(1+Minimum);
       
       
          
           
          
        
      
     }
     
    
    

    }

   }
  }
