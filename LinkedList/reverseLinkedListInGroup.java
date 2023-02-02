package LinkedList;

class reverseLinkedListInGroup {

    public static 



    public static void main(String[] args) {
        Node4 n1=new Node4(10);
        Node4 n2=new Node4(20);
        Node4 n3=new Node4(30);
        Node4 n4=new Node4(40);
        Node4 n5=new Node4(50);
        Node4 n6=new Node4(60);
 
        Node4 head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
    }
}


class Node4{
    int data;
    Node4 next;

    public Node4(int data){
        this.data=data;
    }
}