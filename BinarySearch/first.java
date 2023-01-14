package BinarySearch;

class first{
    public static void main(String[] args) {
        int arr[]={2,6,8,10,11,13,15,17};
        int key=11;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
}


//////////////////////////////////////////////////////////////////////////////////////

class second{
    public static int Program1(int arr[],int key,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key) return mid;
            else if(key > arr[mid]){
                start=mid; 
            }else{
                end=mid;
            }
        }
     return -1;
    }




    public static void main(String[] args) {
        int arr[]={2,6,7,8,10,11,13,15,17};
        int key=15;
        int start=0;
        int end=arr.length;
        int res=Program1(arr, key, start, end);
        System.out.println(res);
    }
}

//////////////////////////////////////////////////////////////////////////////

class th{

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
        int arr[]={2,6,7,7,7,8,10,11,13,13,13,15,17};
        int key=13;
        int start=0;
        int end=arr.length;
        int res=lastOccurence(arr, key, start, end);
        System.out.println(res);
    }
}