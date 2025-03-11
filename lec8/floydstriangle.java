public class floydstriangle {
    public static void triangle(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        triangle(5);
    }
    
}
