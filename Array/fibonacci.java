package Array;

class fib{


    public static void main(String[] args) {
        int n=9;
        int res=fibonacci(n);
        System.out.println(res);
    }
    
    public static int fibonacci(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int a=0;
        int b=1;
        int res=0;

        for(int i=1;i<n;i++){
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }
}