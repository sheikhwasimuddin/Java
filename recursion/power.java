public class power {
    public static int pow(int n,int x){
        if(x==0){
            return 1;
        }
        return n*pow(n,x-1);
    }
    public static void main(String[] args) {
        int n=2;
        int x=5;
        int r=pow(n,x);
        System.out.println(r);
    }
}
