
import java.util.Scanner;

public class functionbionomial {
    public static  int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static  int biocoefficent(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_n_r=fact(n-r);
        int b=fact_n/(fact_r*fact_n_r);
        return b;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number");
            int n = sc.nextInt();
            System.out.println("enter the r");
            int r = sc.nextInt();
            int bc = biocoefficent(n,r);
            System.out.println("the binomial coefficient is "+bc);
        }
    }
}
