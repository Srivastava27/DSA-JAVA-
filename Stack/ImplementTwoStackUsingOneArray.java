package Stack;

import java.io.EOFException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class ImplementTwoStackUsingOneArray {

    int top1;
    int top2;
    int capacity;
    int arr[];
    int count1;
    int count2;


    public ImplementTwoStackUsingOneArray(int capacity){
        this.capacity=capacity;
        top1=-1;
        top2=capacity;
        arr=new int[capacity];
        count1=0;
        count2=0;
    }
    
    public boolean push1(int data)throws Exception{
        if(top1+1==top2 && top2==capacity)throw new Exception("stack bhar gya ab mt daalo");
        top1++;count1++;
        arr[top1]=data;
        return true;
    }

    public boolean push2(int data)throws Exception{
        if(top1+1==top2)throw new Exception("stack bhar gya ab mt daalo");
        top2--;count2++;
        arr[top2]=data;
        return true;
    }

    public int pop1()throws Exception{
        if(top1==-1)throw new Exception("stack khtm");
        int res=arr[top1];
        top1--;count1--;
        return res;
    }

    public int pop2()throws Exception{
        if(top2==capacity)throw new Exception("stack khtm");
        int res2=arr[top2];
        top2--;count2--;
        return res2;
    }


    public int peek1(){
        return arr[top1];
    }

    public int peek2(){
        return arr[top2];
    }
    public boolean isEmpty1(){
        if(top1==-1)return true;
        return false;
    }

    public boolean isEmpty2(){
        if(top2==capacity)return true;
        return false;
    }
    public int size1(){
        return count1;
    }
    public int size2(){
        return count2;
    }

}
