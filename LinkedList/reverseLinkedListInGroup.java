package LinkedList;

class reverseLinkedListInGroup {

    public static reverseK(Node4 head){
        Node4 curr=head;
        Node4 prev=null;
        Node4 prevFirst=null;

        Node4 newHead=null;
        int k=3;

        int count=0;
        Node4 temp=null;
        while(curr!=null && count<k){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;

        }

        if(newHead==null){
        newHead=prev;
        }else{
            prevFirst.next=prev;
        }
        prevFirst=first;
    }
    return newHead;
}
    



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