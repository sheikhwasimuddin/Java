public class poweroptimized {
    public static int optpow(int n,int x){
        if(x==0){
            return 1;
        }
        int powhalf=optpow(n,x/2)*optpow(n,x/2);
        if(x%2!=0)
            powhalf*=n;
        return powhalf;
    }

    public static void main(String[] args) {
        int n=2;
        int x=5;
        int r=optpow(n,x);
        System.out.println(r);
    }
}
