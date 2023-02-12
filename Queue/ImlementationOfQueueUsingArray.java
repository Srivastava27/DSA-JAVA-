package Queue;

class ImlementationOfQueueUsingArray {
    int arr[];
    int capacity;
    int front,rear;
    int i=0;
    public ImlementationOfQueueUsingArray(int capacity){
        this.capacity=capacity;
        front=-1;
        rear=-1;
        arr=new int[capacity];
    }
    
    void enqueue(int element) throws Exception{
        if(rear>=capacity)throw new Exception("overflow");
        if(!isEmpty()){
            rear++;front++;
            arr[rear]=element;
        }else{
            rear++;
            arr[rear]=element;
        }
    }

        int dequeue()throws Exception{
            if(isEmpty())throw new Exception("Queue underflow");
            int ans=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return ans;
        }
    

    boolean isEmpty(){
        if(front==-1 && rear==-1)return true;
        return false;
    }
}
