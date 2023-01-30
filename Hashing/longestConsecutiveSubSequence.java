package Hashing;

import java.util.HashSet;

class Longest_Consecutive{

    public static int longest(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        // int max=0;
        int count=0;
        int ans=0;
        for (Integer i : arr) set.add(i);
        for (Integer i : set) {

            int min=i-1;

            if(set.contains(min)){

            }else{
                if(set.contains(i));
                count=1;
                while(set.contains(++i)){
                    count++;
                }
                ans=Math.max(ans, count);
            }
        }
        return ans;
    }

        




    public static void main(String[] args) {
        int arr[]={2,1,9,3,5,4,8,7,2,1,3};
        int res=longest(arr);
        System.out.println(res);
    }
}