package LinkedList;

class ReverseLinkedList {

    public static Node Reverse(Node head){
        Node curr=head;
        Node prev=null;

        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            
           
            
        }

        // System.out.println(prev.Data);
        return prev;
        
        
    }

    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.Data+"->");
            curr=curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        Node n6=new Node(60);
 
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        print(head);
        print(Reverse(head));
        // print(head);
    }
}

class Node{
    int Data;
    Node next;
    public Node(int data){
        this.Data=data;
    }
    
}