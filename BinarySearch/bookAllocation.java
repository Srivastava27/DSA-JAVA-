package BinarySearch;

class bookAllocated{
    public static void main(String[] args) {
       int arr[]={10,20,30,40,50,60};
       int start=0;
       int end=210; /// total no of pages=10+20+30+40+50+60
       int mid=0;
       int student1=0;
       int student2=0;
       int rest=0;
       books(arr, start, end, mid, student1, student2, rest);
    }

    public static void books(int arr[], int start, int end, int mid, int student1, int student2, int rest){
        while(start<=end){
            mid=(start+end)/2;

            for(int i=0;i<arr.length;i++){
            if(mid>arr[i]+arr[i+1]){
                student1=arr[i];
                System.out.println(student1);
            }else if(mid<arr[i]+arr[i+1]){
                student2=arr[i];
                System.out.println(student2);
            }else{
                rest=arr[i];
                System.out.println(rest);
            }

            }
        }
    }
}