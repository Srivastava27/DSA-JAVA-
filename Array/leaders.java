package Array;

// leaders are those numbers which are bigger than the next number to them in an  array


class leaders{
    public static void main(String[] args) {
        int arr[]={2,7,6,1,4,3};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }

        System.out.println(arr[arr.length-1]);

        // int leaders=Integer.MIN_VALUE;
        // for(int i=arr.length-1;i>=0;i--){
        //     if(arr[i]>leaders){
        //         leaders=arr[i];
        //         System.out.println(leaders);
        //     }
            
        // }
    }
}