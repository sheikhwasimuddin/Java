public class poweroptimized {
 public static int optpow(int n,int x){
        if(x==0){
            return 1;
        }
        int halfpow=optpow(n,x/2);
        halfpow=halfpow*halfpow;
        if(x%2!=0)
            halfpow*=n;
        return halfpow;
    }

    public static void main(String[] args) {
        int n=2;
        int x=5;
        int r=optpow(n,x);
        System.out.println(r);
    }
}