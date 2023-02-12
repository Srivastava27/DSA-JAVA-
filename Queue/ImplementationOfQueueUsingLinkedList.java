package Queue;



class ImplementationOfQueueUsingLinkedList {
    Node front;
    Node rear;

        void enqueue(int data){
            Node newNode=new Node(data);
            if(!isEmpty()){
                rear.next=newNode;
                newNode=rear;
                rear.next=null;
            }else{
                front=rear=newNode;
            }
        }

        

        int dequeue()throws Exception{
            if(isEmpty())throw new Exception("Queue is empty");
            int deleted=front.data;
            front=front.next;
            return deleted;
        }

        boolean isEmpty(){
            if(front==null)return true;
            return false;
        }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}
