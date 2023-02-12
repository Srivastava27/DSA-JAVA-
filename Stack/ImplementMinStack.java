package Stack;

public class ImplementMinStack {
    int top;
    int capacity;
    int arr[];

    public ImplementMinStack(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }

    boolean push(int element)throws Exception{
        if(top==capacity-1)throw new Exception("stack is full");
        top++;
        arr[top]=element;
        return true;
    }

    int peek(){
        if(top==-1)return -1;

        int seek=arr[top];
        return seek;

    }

    boolean isEmpty(){
        if(top==-1)return true;
        return false;
    }


    int pop()throws Exception{
        if(top==-1)throw new Exception("Stack is empty");
            
            int ans=arr[top];
            top--;
            return ans;
        
    }

    
}

class Stack2{
    int top=-1;
    int capacity;
    int arr[];

    public Stack2(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
    }

    boolean push2(int element)throws Exception{
        if(top==capacity-1)throw new Exception("stack is full");
        top++;
        arr[top]=element;
        return true;
    }

    int peek2(){
        if(top==-1)return -1;

        int seek=arr[top];
        return seek;

    }

    boolean isEmpty2(){
        if(top==-1)return true;
        return false;
    }


    int pop2()throws Exception{
        if(top==-1)throw new Exception("Stack is empty");
            
            int ans=arr[top];
            top--;
            return ans;
        
    }

    int minstack2(Stack2.isEmpty2){

    }
}
