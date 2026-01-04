public class clearrangebits {
    public static int clearrange(int n ,int i,int j){
        int a=(~0)<<j;
        int b=(1<<i)-1;
        int mask=a|b;
        return n & mask;
    }
    public static void main(String[] args) {
        int n=31; //11111
        int i=1;
        int j=3;
        System.out.println(clearrange(n, i, j));
    }
}
