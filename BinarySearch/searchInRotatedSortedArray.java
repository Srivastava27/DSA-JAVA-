package BinarySearch;

class SearchInRotatedSortedArr{

    public static int Search(int arr[], int key, int start, int end){
        while(start<=end){
            int mid=(start+end)/2;

            if(key==arr[mid]){
                return mid;
            }

            if(arr[start]<=arr[mid]){
                if(key>=arr[start] && key<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else {                                                     
                if(key>arr[mid] && key<=arr[end]) {                      
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }




        return -1;
    }




    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int start=0;
        int end=arr.length-1;
        int key=1;
        int temp=Search(arr, key, start, end);
        System.out.println(temp);
    }
}