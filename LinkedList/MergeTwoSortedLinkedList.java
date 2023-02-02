package LinkedList;

// import javax.sound.sampled.SourceDataLine;

class MergeTwoSortedLinkedList {

    public static Node5 merge(Node5 head, Node5 head2){
        Node5 dummyNode=new Node5(0);
        Node5 temp=dummyNode;
        // Node5 p=head;
        Node5 c1=head;
        Node5 c2=head2;


        while(true){
            if(c1==null){
                temp.next=c2;
                break;
            
            }

            if(c2==null){
                temp.next=c1;
                break;
            }
        




        // if(head==null && head2==null)return head;

        // while(c1!=null && c2!=null){
            if(c1.data<=c2.data){
                temp.next=c1;
                c1=c1.next;
                // temp=c1;
                // break;
            }else{
                temp.next=c2;
                c2=c2.next;
                // temp=c2;
                // break;
            }
            temp=temp.next;
        }
        return dummyNode;

    }

    public static void printll(Node5 head){
        Node5 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
            
        }
         System.out.println( );
    }



    public static void main(String[] args) {
        Node5 n1=new Node5(1);
        Node5 n2=new Node5(2);
        Node5 n3=new Node5(3);
        Node5 n4=new Node5(5);
        Node5 n5=new Node5(5);
        Node5 n6=new Node5(8);

        Node5 head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;



        Node5 m1=new Node5(6);
        Node5 m2=new Node5(7);
        Node5 m3=new Node5(9);
        Node5 m4=new Node5(10);
        Node5 m5=new Node5(15);
        Node5 m6=new Node5(18);
 
        Node5 head2=m1;
        m1.next=m2;
        m2.next=m3;
        m3.next=m4;
        m4.next=m5;
        m5.next=m6;

        printll(head);
        printll(head2);
        // merge(head, head2);
        printll(merge(head, head2));
        // Node5 dummyNode5=merge(head, head2);

        
    }   
    
}


class Node5{
    int data;
    Node5 next;

    public Node5(int data){
        this.data=data;
    }
}

