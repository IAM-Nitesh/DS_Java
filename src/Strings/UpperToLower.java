package Strings;
import java.util.*;
public class UpperToLower {
    public static void main(String[] args) {

        String s = "HiThere";
        convert(s);
    }

    static void convert(String s){
        char[] ans = new char[s.length()];
        for (int i=0;i<s.length();i++){
            ans[i] = s.charAt(i);
        }

        for (int i=0;i<ans.length;i++){
            if (ans[i]>='A' && ans[i]<='Z'){
                ans[i] = (char)(ans[i] -'A'+'a');
            }
        }

        String a = new String(ans);
        System.out.println(a);
    }
}


