package Hashing;

import java.util.HashMap;

class ZerolargestSum{

    public static int Largest(int arr[], int CummulativeSum[]){
        int x=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for (int i=0;i<arr.length;i++) {
            // int curr=CummulativeSum[i];
            if(map.containsKey(CummulativeSum[i])){
                int prev=map.get(CummulativeSum[i]);
                // map.put(i,x+1);
                ans=Math.max(ans,i-prev);
                
            }else{
                map.put(CummulativeSum[i],i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[]={1,2,-1,2,4,-5,-1,-9,0,7};
        int CummulativeSum[]=new int[arr.length];
        int sum=0;

        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        CummulativeSum[i]=sum;    
        }

        // for (int i : CummulativeSum) {
        //     System.out.println(i);
        // }
        // Largest(arr, CummulativeSum);
        int res=Largest(arr, CummulativeSum);
        System.out.println(res);
    }
}



///////////////////////one more method////////////////////////

class Zero_Largest_Sum{
    public static void main(String[] args) {
        
    }
}