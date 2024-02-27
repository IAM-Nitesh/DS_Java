package Arrays;

import java.util.Arrays;

public class dummy {

    public static void main(String[] args) {

        test t = new test(new Integer[]{1,2},new int[]{1,2,3},
                new Subject[]
                        {new Subject(1),new Subject(2)});
        test t_cpy = t.clone();

        //Integer i_clone = i.clone(); // auto unboxing


        System.out.println("before clone t: "+ t);
        // t.val = [2,2,3] , [1,2,3]
        // t_cpy.val = [2,2,3]  , [2,2,3]
        t_cpy.val[0] = 2;
        // t.arr = [100,2]     -> 100,2
        // t_cpy.arr = [100,2] ->100,2
        t_cpy.arr[0] = 100;
        // t.s = [1,2] -> [100,2]
        // t_cpy.s = [1,2] -> [100,2]
//        Subject obj = t_cpy.s[0];
//        obj.id = 100; //

        //t_cpy.s[0] = new Subject(100);
//        Subject i = t_cpy.s[0]; // i = @r
//        i = new Subject(1000); // i = @r1

        //  test -> array -> Subject[] -> int id  : clone at class level,
        t_cpy.s[0].id = 1000;  // @r1
        // {1000,2} , {1000,2}

        System.out.println("after clone copy object: "+ t_cpy);
        System.out.println("after clone original object: "+ t);

    }


    public static class test implements Cloneable{
        Integer[] arr ;
        int[] val;
        Subject[] s; //

        test(Integer[] arr, int[] val, Subject[] s){
            this.arr = arr;
            this.val = val;
            this.s = s;
        }

        @Override
        public String toString() {
            return "test{" +
                    "arr=" + Arrays.toString(arr) +
                    ", val=" + Arrays.toString(val) +
                    ", s=" + Arrays.toString(s)+
                    '}';
        }

        public test clone(){
            try{
                test clone = (test)super.clone(); // cloned at class level - "test"
                clone.s = s.clone();  // cloned at array level - "s"
                for ( int i=0;i<s.length;i++){
                    clone.s[i] = s[i].clone(); // cloned for every "subject's object" in array s.
                }
                return clone;
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return null;
            }
        }
    }



