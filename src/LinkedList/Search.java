package LinkedList;

public class Search {

    public static void main(String[] args) {

        Add.Node n1 = new Add.Node(10);
        Add.Node n2 = new Add.Node(60);
        Add.Node n3 = new Add.Node(30);
        Add.Node n4 = new Add.Node(40);
        Add.Node n5 = new Add.Node(20);
        n1.next= n2;
        n2.next= n3;
        Add.Node head = n1;
        System.out.println(searchVal(head,100));
    }

    public static boolean searchVal(Add.Node head,int val){
        Add.Node iter = head;
        while(iter.next!=null){
            if (iter.data == val) {
            return true;
            }
            iter= iter.next;
        }
        return false;
    }
}
