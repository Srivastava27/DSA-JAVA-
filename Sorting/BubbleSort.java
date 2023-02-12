package Sorting;

class BubbleSort {

    public static void print_sorted_array(int arr[]){
        int i=0;
        for(;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                System.out.println(arr[i]);
            }
        }
        
    }

    public static void main(String[] args) {
        int arr[]={9,7,6,4,3,2};

       print_sorted_array(arr);
    }
}
