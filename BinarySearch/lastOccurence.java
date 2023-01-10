//index of last occurence of an element in a sorted array


package BinarySearch;

class last_Occurence{

    public static int lastOccurence(int arr[],int key, int start,int end){
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
        int arr[]={2,6,7,7,7,8,10,11,13,13,13,15,17,17};
        int key=7;
        int start=0;
        int end=arr.length;
        int res=lastOccurence(arr, key, start, end);
        System.out.println(res);
    }
}