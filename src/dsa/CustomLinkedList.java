package dsa;

public class CustomLinkedList {

    static Node head = null;

    static class Node {

        public Node(int d){
            data = d;
            next = null;
        }

        int data;
        Node next;
    }

    public static void insertAtBack(int data){

        Node new_node = new Node(data);
        new_node.next = null;

        if(head == null){
            // This element is the first element
            head = new_node;
        }else{

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = new_node;
        }
    }

    public static void printList(){

        Node temp = head;

        if(head == null){
            System.out.println("Linked list is empty");

        } else if(temp.next == null){

            System.out.println(temp.data);

        }else {
            while(temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {

        insertAtBack(10);
        insertAtBack(20);
        insertAtBack(30);
        insertAtBack(40);
        insertAtBack(50);

        printList();

    }
}
