package LinkedList;

public class Add {

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next= n2;
        n2.next= n3;
        Node head = n1;

        printLinkList(head);
        printLinkList(addFirst(head,60));
        printLinkList(addLast(head,70));
        printLinkList(addAt(head, 100, 2));

    }

    public static class Node {
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
    }

    public static Node addFirst(Node head,int val){
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
        System.out.println( " ");
        return head;
    }

    public static Node addLast(Node head, int val){
        Node iter = head;
        while (iter.next != null){
            iter = iter.next;
        }
        Node newNode = new Node(val);
        iter.next = newNode;
        System.out.println( " ");
        return head;
    }


    public static Node addAt(Node head, int val , int index){
        Node newNode = new Node(val);
        Node iter = head;
        int i = 1;

        if (index == 1){
            addFirst(head,val);
        }
        if (index == getLength(head)){
            addLast(head, val);
        }

        while (i<index-1){  // 1<3 , 2<3
            iter = iter.next;  //-- iter = head.next.next
            i+=1; // 2
        }
        Node temp = iter.next;
        iter.next = newNode;
        newNode.next = temp;
        return head;
    }

    public static void printLinkList(Node head){
        while (head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }

    public static int getLength(Node head){
        int len = 0;
        while (head != null){
            len+=1;
        }
        return len;
    }
}

