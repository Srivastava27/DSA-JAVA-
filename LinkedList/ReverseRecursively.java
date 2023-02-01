package LinkedList;

public class ReverseRecursively {


    public static Node2 reverseRecursively(Node2 head){
        if(head==null || head.next==null)return head;

        Node2 temp=head.next;
        Node2  newNode2=reverseRecursively(head.next);
        temp.next=head;
        head.next=null;
        return newNode2;
    }


    public static void printll(Node2 head){
        Node2 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
            
        }
         System.out.println( );
    }


    public static void main(String[] args) {
        Node2 n1=new Node2(10);
        Node2 n2=new Node2(20);
        Node2 n3=new Node2(30);
        Node2 n4=new Node2(40);
        Node2 n5=new Node2(50);
        Node2 n6=new Node2(60);
 
        Node2 head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        printll(head);
        // printll(reverseRecursively(head));
        Node2 newHead=reverseRecursively(head);
        printll(newHead);
        
    }
}

class Node2{
    int data;
    Node2 next;

    public Node2(int data){
        this.data=data;
    }

}
