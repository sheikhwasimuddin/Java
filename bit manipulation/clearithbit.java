public class clearithbit {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        System.out.println(clearithbit(n,i));
    }
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
}
