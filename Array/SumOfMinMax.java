package Array;

class Min_Max{

    public static void SumOfMinMax(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                System.out.println(min);
            }
            if(arr[i]>max){
                max=arr[i];
                System.out.println(max);
            }
                
            }
        }
    


    public static void main(String[] args) {
        int arr[]={21,10,11,9,8,60,1};
        SumOfMinMax(arr);
    }
}