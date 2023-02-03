package Stack;

import java.io.EOFException;

class Implementation{
    
        int top;
        int capacity;
        int arr[];

        public Implementation(int capacity){
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

        int size(){
            if(top==-1)return 0;
            return top+1;
        }

        int pop()throws Exception{
            if(top==-1)throw new Exception("Stack is empty");
                
                int ans=arr[top];
                top--;
                return ans;
            
        }
    
}

