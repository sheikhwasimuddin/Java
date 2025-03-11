public class functionoverloadingtypes {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20)); // prints 30
        System.out.println(sum(11.4545f,20.565546f));
    }
}
