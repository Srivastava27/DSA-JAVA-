//count no of occurences of an element 

package BinarySearch;

class Count{
//first occurence     
    public static int first(int arr[],int key,int start,int end){
    int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
            if(key > arr[mid]){
                start=mid+1; 
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static int last(int arr[],int key, int start,int end){
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid+1;
            }
            if(key < arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;    
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[]={2,3,3,3,3,3,4,5,6,7,7,7};
        int key=3;
        int start=0;
        int end=arr.length;
        int temp=(last(arr, key, start, end)-first(arr, key, start, end))+1;
        System.out.println(temp);
    }
}