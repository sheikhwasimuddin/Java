public class getithbit {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        System.out.println(getith(n,i));
    }
    public static int getith(int n,int i){
        int bitmask=i<<1;
        if((n&bitmask)==0){
            return 0;
        } else {
            return 1;
        }
    }
}
