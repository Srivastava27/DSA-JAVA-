package Queue;

class CircularTour {
    
    public static int CirculartourStart(int petrol[], int distance[]){
        int curr_petrol=0;
        int deficit_petrol=0;
        int start=0;

        for(int i=0;i<petrol.length;i++){
            curr_petrol+=petrol[i]-distance[i];
            if(curr_petrol<0){
                deficit_petrol+=curr_petrol;
                curr_petrol=0;
                start=i+1;
            }
        }
        if(curr_petrol+deficit_petrol>=0)return start;
        return -1;
    } 
    
    
    
    
    public static void main(String[] args) {
        int petrol[]={4,6,7,4};
        int distance[]={6,5,3,5};

        System.out.println(CirculartourStart(petrol, distance));
    }    
}
