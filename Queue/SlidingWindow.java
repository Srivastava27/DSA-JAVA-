package Queue;

public class SlidingWindow {



    public static void main(String[] args) {
        int arr[]={2,5,4,7,1,2,8};
        int k=3;
        int window=k-1;
        int ans[]=new int[arr.length];

        for(int i=0;i<arr.length-window;i++){
            int max=arr[i];
            for(int j=0;j<i+k;j++){
                if(arr[j]>=max){
                    max=arr[j];
                    // arr[i]=max;
                }
                // ans[i]=max;
            }
            // k+=1;
            ans[i]=max;
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
