package Strings;
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        /*In Java, string is basically an object that represents sequence of char values.
         An array of characters works same as Java string.
         The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
         The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.
         */

        // 1. Initialization
        String s = "java";
        String s1= "java"; //It doesn't create a new instance
        String s2 = new String();

        //converting char array to string
        char[] ch = {'j','a','v','a'};
        String s3 = new String(ch);

        // 2. get the length
        System.out.println(s.length());



        //It returns char value for the particular index
        //String.charAt(int index);
        System.out.println(s.charAt(1));

        //It returns substring for given begin index.
        //String.substring(int beginIndex)
        System.out.println(s.substring(1));
        //It returns substring for given begin index and end index.
        System.out.println(s.substring(0,3));
        //It returns true or false after matching the sequence of char value.
        System.out.println(s.contains("aa"));
        // It returns a joined string.
        String joinString1=String.join("-","welcome","to","javatpoint");
        System.out.println(joinString1);
        //
        String str ="";
        str = str.replace(" ", "");
        System.out.println();

        System.out.println();

        System.out.println();




    }
    
}
