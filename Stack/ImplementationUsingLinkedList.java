package Stack;

import javax.swing.tree.ExpandVetoException;

public class ImplementationUsingLinkedList {

    Node head;
    int size=0;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    void push(int element){
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
        size++;

    }

    boolean isEmpty(){
        return size==0;
    }

    int pop()throws Exception{
        if(isEmpty())throw new Exception("Stack is empty");
        int ans=head.data;
        head=head.next;
        size--;
        return ans;
    }

    int peek()throws Exception{
        if(isEmpty())throw new Exception("Stack is empty");
        return head.data;
    }


    int size(){
        return size;
    }

}
