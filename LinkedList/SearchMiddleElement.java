package LinkedList;

public class SearchMiddleElement {

    public static void traverse(Node head){
        Node curr=head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;

        }
        System.out.println(length);

        // int position=length/2;
        // Node newNode=head;
        curr=head;
        for(int i=0;i<length/2;i++){
            // newNode=newNode.next;
            curr=curr.next;
        }
        System.out.println(curr.data);

    }


    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(12);
        Node n3=new Node(13);
        Node n4=new Node(14);
        Node n5=new Node(15);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        traverse(head);
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

class FindMiddleNode{

    public static void middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;

            
        }
        System.out.println(slow.data);
    }


    public static void main(String[] args) {
        Node n1=new Node(12);
        Node n2=new Node(14);
        Node n3=new Node(16);
        Node n4=new Node(17);
        Node n5=new Node(18);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        middle(head);

    }
}