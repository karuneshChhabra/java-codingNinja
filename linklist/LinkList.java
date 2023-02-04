import java.util.*;
class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    int findnValue(){
        Node ptr1 = null,
        ptr1 = head;

        int value =Integer.MIN_VALUE;



        while (ptr1 != null) {
            if(value< ptr1.data){
                value = ptr1.data;
            }
            ptr1 = ptr1.next;
        }
      //  System.out.println(value);
        return value;


    }

    /* Function to remove duplicates from an
       unsorted linked list */
    void remove_duplicates(int value)
    {
        HashMap<Integer,Integer> map1 = new HashMap();
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
        value++;

        /* Pick elements one by one */
        while (ptr1 != null ) {

            if(map1.containsKey(ptr1.data)){
                map1.put(ptr1.data,map1.get(ptr1.data)+1);
                System.out.println("prev value"+  ptr1.data);
                    ptr1.data = value;
                    System.out.println("value"+  ptr1.data);
                    value++;
            }else {
                map1.put(ptr1.data, 1);
            }

            ptr1 = ptr1.next;

        }
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);

        list.head.next.next.next.next.next.next
                = new Node(10);
        list.head.next.next.next.next.next.next
                = new Node(19);

        System.out.println(
                "Linked List before removing duplicates : ");
        list.printList(head);

        int value = list.findnValue();
        System.out.println("value:"+value);


        list.remove_duplicates(value);
        System.out.println("\n");
        System.out.println(
                "Linked List after removing duplicates : ");
        list.printList(head);
    }
}