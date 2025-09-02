public class bitoddeven{
    public static void main(String[] args) {
        checkOddEven(5);
        checkOddEven(10);
    }
    public static void checkOddEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        }
     }
