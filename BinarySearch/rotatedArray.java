package BinarySearch;

class SearchInRotatedSortedArray{
    
    public static int ans(int arr[],int key,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)return mid;
            if(arr[start]<arr[mid]){
                if(key<arr[mid] && key>=arr[start]){
                    end=mid-1;
                }else{
                    
                        start=mid+1;
                    }
            }else{
                    if(key>arr[mid] && key<arr[end]){
                        start=mid+1;
                    }else{
                        end=mid-1;    
                    }
                }

        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        int arr[]={20,30,40,50,60,5,10};
        int key=60;
        int start=0;
        int end=arr.length-1;
        int res=ans(arr, key, start, end);
        System.out.println(res);
    }
}