package Strings;
import java.util.*;
public class ReverseVowels {

    public static void main(String[] args) {
        String st = "youcandoit";
        reversevowels(st);
    }
    static void reversevowels(String s){
        // 1. Declared an array of size equals to the string
        char[] ch = new char[s.length()];

        // 2. Updated the char array with the values from string
        for (int i=0;i<s.length();i++){
            ch[i] = s.charAt(i);
        }

        int i = 0;
        int j = ch.length-1;
        while(i<=j){
            if (ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u'){
                i++;
            } else if (ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u') {
                j--;
            }
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
            i++;
            j--;


        }
        for (int k=0;k<ch.length;k++){
            System.out.print(ch[k]);
        }
    }
}
