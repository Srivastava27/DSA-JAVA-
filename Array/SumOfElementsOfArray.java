package Array;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int temp=0;
        
        for(int i=0;i<arr.length;i++){
           temp = arr[i] + temp;
         
        }
        System.out.println("Sum of all elements of array is : "+temp);
    }
}
