public class fastexpo {
    public static int expo(int n,int a){
        int ans=1;while(n>0){
            if((n&1)!=0){
                ans*=a;
            }
            a*=a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=3;
        int a=5;
        System.out.println(expo(n,a));
    }
}
