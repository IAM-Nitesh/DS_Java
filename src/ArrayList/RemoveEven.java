package ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(4);
        arr.add(15);
        arr.add(8);
        arr.add(21);
        arr.add(3);
        arr.add(2);
        solve(arr);
    }


    public static void solve(ArrayList<Integer> arr){

        for (int i= arr.size()-1;i>=0;i--){
            if ( arr.get(i)%2==0){
                continue;
            }
            else{
                System.out.println(arr.get(i));
            }
        }
    }
}
