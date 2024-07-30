class LL {
    Node head;
    private int size;
    LL() {
        this.size = 0;
    }
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add - first, last
    public void addFirst(int data){
        Node newNode = new Node(data);
        if( head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    //add=last
    public void addLast(int data){
        Node newNode = new Node(data);
        if( head == null) {
            head = newNode;
            return;
        }
        size--;
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //print
    public void printList(){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    //delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;

        } 
        secondlast.next = null;
    }
    public int getSize(){
        return size;
    }
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }


        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
public static void main(String[] args) {
    LL list = new LL();
    list.addLast(1);
    // list.addLast(2);
    // list.addLast(3);
    // list.addLast(4);
    list.printList();
    list.head = list.reverseRecursive(list.head);
    list.printList();
    // list.reverseIterate();
    // list.printList();
    // list.addFirst("a");
    // list.addFirst("is");
    // list.addFirst("this");
    // list.addLast("list");
    // list.printList();
    // list.deleteFirst();
    // list.printList();
    // list.deleteLast();
    // list.printList();
    // System.out.println(list.getSize());
    // list.addFirst("this");
    // System.out.println(list.getSize());
        
    }
}