package DynamicProgramming;

public class fibonarci {

    // top-down approach
    public static void main(String[] args) {
        int element = 10;
        int[] ans = new int[element+1];
        System.out.println(topdown(element,ans));
        System.out.println(bottomup(10));
    }

    static int topdown(int el, int[] a){

        if (el==0 ||el==1){
            return el;
        }
        if ( a[el]!=0){
            return a[el];
        }
        int n1 = topdown(el-1,a);
        int n2 = topdown(el-2,a);
        // memomization
        a[el] = n1+ n2;
        return n1+n2;
    }
    static int bottomup(int el) {
        int[] a = new int[el+1];
        for (int i = 0; i < 2; i++) {
            a[i] = i;
        }

        for (int i = 2; i <= el; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[el];
    }

}
