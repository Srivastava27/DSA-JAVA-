//largest element in an array

package Array;

class larElement{
    public static void main(String[] args) {
        int arr[]={1,2,6,8,3,5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){        //i=1 because we have already considered i=0(arr[0]) as max 
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element found :) "+max);
    }
}


class largest{

    public static void main(String[] args) {
     
        int arr[]={0,-9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}