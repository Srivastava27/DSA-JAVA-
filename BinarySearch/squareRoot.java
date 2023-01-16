package BinarySearch;

class Square_root{
    public static void main(String[] args) {
        int target=25;
        int start=1;
        
        int end=target;
        int res=Sqrt(target, start, end);
        System.out.println(res);
    }

        public static int Sqrt(int target, int start, int end){

        
            
            if(end<2){
                return end;
            }
            while(start<=end){
                int mid=(start+end)/2;
                if(mid<=target/mid){
                    start=mid+1;
                }else{
                    end=mid-1;
            }
        }
        return end; 
    }
}
