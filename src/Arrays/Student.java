package Arrays;
import java.util.*;

public class Student implements Cloneable{
    String name;
    int id;
    int[] marks;
    String[] subject;
    Student(String name, String[] subject, int id, int[] marks){
        this.name = name;
        this.subject = subject;
        this.id = id;
        this.marks = marks;
    }

    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }
}
