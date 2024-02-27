package Arrays;

public class ArrayofObjects {

    public static class Student{
        int rollno;
        String name;

        Student(int r,String n){
            this.rollno = r;
            this.name = n;
        }
    }
    public static void main(String[] args) {

        // 1. first way
        Student[] st = new Student[3];
        st[0] = new Student(1,"a");
        st[1] = new Student(2,"b");
        st[2] = new Student(3,"c");
        for (Student s: st){
            System.out.println(s.name+s.rollno);
        }

        Student[] st1 = new Student[]{new Student(1,"a"),new Student(2,"b")};
        for (Student s: st1){
            System.out.println(s.name+s.rollno);
        }
    }

}
