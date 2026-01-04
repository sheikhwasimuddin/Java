public class countsetbit {
    public static int countset(int n){
        int count=0;
        while(n>0){
            if((n&1)==1)
                count++;{
        }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=13; //1101
        System.out.println(countset(n));
    }
}
