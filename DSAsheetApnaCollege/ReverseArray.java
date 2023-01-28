package DSAsheetApnaCollege;

class ReverseArray {

    public static void Reverse(int arr[], int res[]){
        int temp=0;
        for(int i=arr.length-1;i>=0;i--){
            res[temp++]=arr[i];
        }
        for (int i : res) {
            System.out.println(i);
        }
        
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int res[]=new int[arr.length];
        Reverse(arr, res);
    }
}



///////////---------------------------------------------------------///////////

class reverse{

    public static void reverseA(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }


        for (int i : arr) {
            System.out.println(i);
            
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        reverseA(arr);
    }
}