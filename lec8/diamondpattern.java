public class diamondpattern {
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                
                    System.out.print("*");
                
        

        }
        System.out.println();
    }
    //inverse
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
                }
                System.out.println();
                }
    
}
    public static void main(String[] args) {
        diamond(15);
    }
}