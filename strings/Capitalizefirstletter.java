public class Capitalizefirstletter {
    public static void main(String[] args) {
        String input = "hello world";
        String output = Capital(input);
        System.out.println(output);
    }
    public static String Capital(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                char nextChar=Character.toUpperCase(str.charAt(i+1));
                sb.append(" ");
                i++;
                sb.append(nextChar);
                
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
