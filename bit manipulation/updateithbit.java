public class updateithbit {

    public static int updatebit(int n, int i, int newBit) {
        if(newBit == 0){
            return clearithbit(n, i);
        } else {
            return setithbit(n, i);
        }
    }

    public static void main(String[] args) {
        int n = 10; // 1010
        int i = 2;  // position to update
        int newBit = 1;

        System.out.println(updatebit(n, i, newBit));
    }

    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int setithbit(int n, int i) {
        int bitmask = (1 << i);
        return n | bitmask;
    }
}
