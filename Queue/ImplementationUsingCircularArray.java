package Queue;

import java.io.EOFException;

class ImplementationUsingCircularArray{
    int arr[];
    int capacity;
    int front,rear;
    // int i=0;
    public ImplementationUsingCircularArray(int capacity){
        this.capacity=capacity;
        front=-1;
        rear=-1;
        arr=new int[capacity];
    }

        void enqueue(int element)throws Exception{
            if(isFull())throw new Exception("overflow");
            if(isempty()){
                front=0;
            }
            rear=(rear+1)%arr.length;
            arr[rear]=element;
            


        }



        int dequeue()throws Exception{
            if(isempty())throw new Exception("Empty");
            int ans=arr[front];
            front=(front+1)%arr.length;
            rear=(rear+1)%arr.length;
            return ans;
        }

        boolean isFull(){
            if((rear+1)%arr.length==front)return true;
            return false;
        }

        boolean isempty(){
            if(rear==-1)return true;
            return false;
        }
}