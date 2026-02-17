package list.LinkedList;

public class CircuLinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
        Node(){
            this.data = 0;
            this.next = null;
        }
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            insertFirst(val);
        }

    }
}
