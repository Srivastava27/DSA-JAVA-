package LinkedList;

class LinkList{

    public static void print(Node head){
        Node newNode=head;
        while(newNode!=null){
            System.out.print(newNode.Data+" -> ");
            newNode=newNode.next;
        }
        System.out.println(newNode);
    }


    public static Node insert(int data,int position,Node head){
        Node newNode1=new Node(data);

        if(position==0){
            newNode1.next=head;
            head=newNode1;
            return head;

        }
        Node curr=head;
        for(int i=0;i<position-1;i++){
            curr=curr.next;
            if(curr==null){
                newNode1.next=curr.next;
            }
        }
        newNode1.next=curr.next;
        curr.next=newNode1;
        // print(head);
        return head;
    }

    public static void main(String[] args){


        //    LinkedList ll=new LinkedList();
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
    
        //    print(head);
           head=insert(100, 0, head);
        
           print(head);
    
        }
    }
    
    class Node{
        int Data;
        Node next;
        public Node(int data){
            this.Data=data;
        }
        
    }