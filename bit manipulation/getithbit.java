public class getithbit {
    public static void main(String[] args) {
        
    }
    public static int getith(int n,int i){
        int bitmask=i<<i;
        if((n&bitmask)==0){
            return 0;
        } else {
            return 1;
        }
    }
}
