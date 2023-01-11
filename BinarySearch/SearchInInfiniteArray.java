package BinarySearch;

class SearchInInfiniteSortedArray{
    
    public static int InfiniteArray(int arr[],int key){
        int start=0;
        int range=1;

        if(arr[start]==key){
            return start;
        }
        while(arr[start]<=key){
            if(arr[range]<key){
                start=range;
                range*=2;
            }else{
                while(arr[start]<=key){
                    int mid=(start+range)/2;
                    if(arr[start]==key)return start;

                    if(arr[mid]<key){
                        start=mid+1;
                    }else{
                        range=mid-1;
                    }
                }
            }
        }
        return -1;
    }
    
    
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,11,13,14,17,17,19,23,25,27,28,29,31,34,35,36};
        int key=28;

        int res=InfiniteArray(arr, key);

        System.out.println(res);

    }
}