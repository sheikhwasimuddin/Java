public class power2 {
    public static boolean ispowertwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(ispowertwo(n));
    }
}
