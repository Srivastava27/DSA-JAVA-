package Array;

// arranging zeroes and ones in particular order

class Zeroes{
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1,0,0};

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}