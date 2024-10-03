class Node {
    int data;
    Node next;

    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
class CircularLinkedList {
    Node head;
    void addToEnd(int data) {
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            newNode.next=head;
        } 
        else {
            Node temp=head;
            while (temp.next!=head) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    void breakCircular() {
        if (head==null){
            return;
        } 
        Node temp=head;
        while(temp.next!=head) {
            temp=temp.next;
        }
        System.out.println(temp.data); 
        temp.next=null; 
    }
    void printList(){
        if (head==null){
            return;
        }
        Node temp=head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp!=null && temp!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToEnd(4);
        list.printList();
        list.breakCircular();
        list.printList();
    }
}
