package Hashing;

import java.util.HashMap;

class Quadruple {


    class pair{
        int i,j;
        public pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }

    public static int fourSum(int arr[], int sum){

        HashMap<Integer,pair> map=new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++){
                
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,0,6};
        int sum=12;
        int res=fourSum(arr);
        System.out.println(res);
    }
}
