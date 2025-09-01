public class substring {
    public static void main(String[] args) {
        String str="sheikh wasimuddin";
        str.substring(0,8);
        System.out.println("Substring: " + str.substring(0,8));
        System.out.println("Substring: " + Substring(str,0,9));
    }
    public static String Substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
}
