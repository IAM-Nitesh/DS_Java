package Arrays;

public class Driver {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s = new Student("das",new String []{"hi","hello"},1,new int[]{10,20}); // 1, 100,20
        Student s2 = s.clone(); // ->
        System.out.println(s2.toString());
        System.out.println(s.subject==s2.subject); // true
        System.out.println(s.name==s2.name); // true

        s2.subject[0] = "eng";// 2, 100,20
        s2.name ="kumar";

        System.out.println(s);
        System.out.println(s2);

    }
}
