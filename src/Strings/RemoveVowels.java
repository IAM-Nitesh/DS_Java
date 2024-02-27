package Strings;
import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
        String st = "youcandoit";
        removevows(st);
    }

    static void removevows(String s){
        ArrayList<Character> ch = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            // to get character in a string
            ch.add(s.charAt(i));
        }
        System.out.println(ch);

        for (int i = ch.size()-1; i >= 0; i--) {
            if (ch.get(i) == 'a' || ch.get(i) == 'e' || ch.get(i) == 'i' || ch.get(i) == 'o' || ch.get(i) == 'u') {
                ch.remove(i);
            }
        }
        System.out.println(ch);
    }
}
