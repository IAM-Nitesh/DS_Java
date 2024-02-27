package DynamicProgramming;
import java.util.*;
public class ClimbStairs {
    public static void main(String[] args) {
        int N =5;
        int[] a = new int[N+1];
        System.out.println(bottomup(N));
        System.out.println(topdown(N,a));
    }

    static int topdown(int N, int[] a){
        if (N==1||N==2){
            return N;
        }
        if (N==3){
            return 4;
        }
        if ( a[N]!=0){
            return a[N];
        }

        int one = topdown(N-1,a);  // 3 2 1
        int two = topdown(N-2,a);
        int three = topdown(N-3,a);
        a[N] = one + three+ two; // a[4] -> 4 + 2 + 1
        return a[N];
    }

    static int bottomup(int N){
        int[] a = new int[N+1]; // a[0-4]

        a[1] = 1;
        a[2] = 2;
        a[3] = 4;

        for(int i=4;i<=N;i++){
           a[i] = a[i-1]+a[i-2]+a[i-3];
        }
        return a[N];
    }
}
