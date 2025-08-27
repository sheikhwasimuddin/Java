public class invertedandroratedhalfpyramid {
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 5;
        pyramid(n);
    }
}
