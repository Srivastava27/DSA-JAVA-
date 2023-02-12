package Stack;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Stack;

class MaxAreaOfHistogram {
    public static void main(String[] args) {
        int arr[]={4,3,9,2,5,1,8,3};

        int max=0;
        for(int i=0;i<arr.length;i++){
            int left=i;
            int right=i;

            while(left>=0 && arr[left]>=arr[i])left--;
            while(right<arr.length && arr[right]>=arr[i])right++;

            int width=right-left-1;

            int areaOfHistogram=width*arr[i];

            max=Math.max(max, areaOfHistogram);
        //     if(areaOfHistogram>max)max=areaOfHistogram;
         }
        System.out.println(max);
    } 
}

/////////////////////////////////////////////////////////////////////////////
class Area{

    public static int[] nextSmaller(int arr[]){
        int ns[]=new int[arr.length];
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            int e=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=e){
                stack.pop();
            }
            if(stack.isEmpty()){
                ns[i]=arr.length;
            }else{
                ns[i]=stack.peek();
            }
            stack.push(i);
        }
        // for (Integer a : ns) {
        //     System.out.println(a);
        // }
        return ns;
    }


    public static int[] previousSmallest(int arr[]){
        int ps[]=new int[arr.length];
        // Stack<Integer> stack=new Stack<>();
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            int e=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=e){
                stack.pop();
            }
            if(stack.isEmpty()){
                ps[i]=arr.length;
            }else{
                ps[i]=stack.peek();

            }
            stack.push(i);
        }

        // for (Integer x : ps) {
        //     System.out.println(x);
        // }
        return ps;
       
    }

    public static int maximunArea(int arr[]){
        int p[]=previousSmallest(arr);
        int n[]=nextSmaller(arr);

        int max=0;
        for(int i=0;i<arr.length;i++){
            int width=n[i]-p[i]-1;
            int curArea=width*arr[i];
            max=Math.max(max, curArea);
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[]={4,3,9,2,5,1,8,3};
        // previousSmallest(arr); 
        // System.out.println(" ");
        // nextSmaller(arr);
        System.out.println( maximunArea(arr));
    }
}
