package LinkedList;

// class deletell{

//     public static void printll(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.Data+" -> ");
//             curr=curr.next;
//         }
//         System.out.println(curr);
//         }
    


//     public static void main(String[] args) {
        
//         Node Str1=new Node("Hey");
//         Node Str2=new Node("I");
//         Node Str3=new Node("am");
//         Node Str4=new Node("your");
//         Node Str5=new Node("vanshika");
//         Node Str6=new Node("srivastava");

//         Node head=Str1;
//         Str1.next=Str2;
//         Str2.next=Str3;
//         Str3.next=Str4;
//         Str4.next=Str5;
//         Str5.next=Str6;

//         printll(head);
//     }
// }

// class Node{
//     String Data;
//     Node next;

//     public Node(String data){
//         this.Data=data;

//     }

// }





class deletell{

    public static void printll(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.Data+" -> ");
            curr=curr.next;
        }
        System.out.println(curr);
        }


        public static void deletell(int position, Node head){
            Node curr=head;
            for(int i=0;i<position-1;i++){
                curr=curr.next;

            }
            curr.next=curr.next.next;
            // System.out.println(curr.Data);
        }
    


    public static void main(String[] args) {
        
        Node Str1=new Node(20);
        Node Str2=new Node(30);
        Node Str3=new Node(40);
        Node Str4=new Node(50);
        Node Str5=new Node(80);
        Node Str6=new Node(90);

        Node head=Str1;
        Str1.next=Str2;
        Str2.next=Str3;
        Str3.next=Str4;
        Str4.next=Str5;
        Str5.next=Str6;

        printll(head);
        deletell(5, head);
        printll(head);
    }
}

class Node{
    int Data;
    Node next;

    public Node(int data){
        this.Data=data;

    }

}