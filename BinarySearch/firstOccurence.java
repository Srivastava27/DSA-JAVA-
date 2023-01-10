//index of firest occurence of an element in a sorted array

package BinarySearch;


class third{

    public static int leftOccurence(int arr[],int key, int start,int end){
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
    public static void main(String[] args) {
        int arr[]={2,6,7,7,7,8,8,8,8,8,8,8,11,11,11,11,11,13,15,17,17,17,18};
        int key=11;
        int start=0;
        int end=arr.length;
        int res=leftOccurence(arr, key, start, end);
        System.out.println(res);
    }
}