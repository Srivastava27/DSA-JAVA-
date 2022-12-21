package Array;

// min and max value of an array

class MinMax{
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5,6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum value is : "+max);
        System.out.println("minimum value is : "+min);
    }
}

