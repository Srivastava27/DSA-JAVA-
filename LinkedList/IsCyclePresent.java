package LinkedList;

class IsCyclePresent {

    public static boolean cycle(Node3 head){
        if(head==null && head.next==null)return false;

        Node3 slow=head;
        Node3 fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Node3 n2=new Node3(10);
        Node3 n1=new Node3(20);
        Node3 n3=new Node3(30);
        Node3 n4=new Node3(40);
        Node3 n5=new Node3(50);
        Node3 n6=new Node3(60);
 
        Node3 head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        // n6.next=n4;
        System.out.println(cycle(head)); 
        // cycle(head);

        if(cycle(head)==true){
            System.out.println("Cycle is present");
        }else{
            System.out.println("Cycle is not present");
        }
    }
}


class Node3{
    int data;
    Node3 next;

    public Node3(int data){
        this.data=data;
    }
}
