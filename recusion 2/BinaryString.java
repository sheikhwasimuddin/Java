public class BinaryString {
    public static void binary(int n,int last,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        binary(n-1, 0, ans+"0");
        if(last==0){
            binary(n-1, 1, ans+"1");
    }}
    public static void main(String[]args){
        int n=3;
        binary(n,0,"");
    }
}