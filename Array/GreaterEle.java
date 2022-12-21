package Array;

// find the number greater than the average of the numbers of a given array

class GreaterEle{
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
