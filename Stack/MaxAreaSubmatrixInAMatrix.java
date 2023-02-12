package Stack;

import java.util.ArrayDeque;

public class MaxAreaSubmatrixInAMatrix {

    public static void previousSmallest(int arr[]){
        int prev_Smallest[]=new int[arr.length];
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        int k=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=curr){
                stack.pop();
            }
            if(stack.isEmpty()){
                prev_Smallest[k++]=-1;
            }else{
                prev_Smallest[k++]=stack.peek();
            }
            stack.push(i);
        }
        for (Integer y : prev_Smallest) {
            System.out.println(y);
        }
    }



    public static void main(String[] args) {
    //     int arr[][]={{1,1,0,1},
    //              {1,1,1,1},
    //              {1,1,1,1},
    //              {1,1,1,1}
    // };
    int arr[]={2,3,4,5,6};
    previousSmallest(arr);
    }
    
}
