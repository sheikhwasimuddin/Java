public class printletter{
    public static void main(String[] args) {
        String str="sheikh wasimuddin";
        printletter(str);
    }
    public static void printletter(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}