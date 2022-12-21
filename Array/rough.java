package Array;

// find the number greater than the average of the numbers of a given array

class GreaterNumber{
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int temp=0;
        int j=0;

        for(int i=0;i<arr.length;i++){
            temp=arr[i]+temp;
            j=temp/arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(j<arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}


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
        System.out.println(max);
        System.out.println(min);
    }
}

