package DoublyLinkedList;

class InsertAfterGivenNode {
    class Node7{
        int data;
        Node7 next;
        Node7 prev;
    
        
    
        public Node7(int data){
            this.data=data;
        }
    }

    Node7 head=null;
    Node7 tail=null;
    

    public void addNodes(int data){
        // Node7 p=head;
        Node7 newNode=new Node7(data);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail.next=null;
        }
        System.out.println(newNode.data);
    }



    public void print(Node7 head){
        Node7 curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println();

    }


    public static void main(String[] args) {
        // DoublyLinkedList dList = new DoublyLinkedList();
        InsertAfterGivenNode dList = new InsertAfterGivenNode();  
        //Add nodes to the list  
        dList.addNodes(1);  
        dList.addNodes(2);  
        dList.addNodes(3);  
        dList.addNodes(4);  
        dList.addNodes(5);

        // print(addNodes(5, n1, n2));
        dList.print(null);
        dList.addNodes(7);
        
        
    }
}


