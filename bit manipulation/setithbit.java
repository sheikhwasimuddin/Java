public class setithbit {
    public static void main(String[] args) {
        int n=10;
        int i=2;
        System.out.println(setithbit(n,i));
    }
    public static int setithbit(int n, int i)
    {
        int bitmask=1<<i;
        return n|bitmask;
    }
}
