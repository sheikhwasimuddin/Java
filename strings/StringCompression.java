public class StringCompression {
    public static void main(String[] args) {
        String str="aaabbccdee";
        String output=compress(str);
        System.out.println(output);
    }
    public static String compress(String str){
        String newStr="";
        
        for(int i=0;i<str.length();i++){
            int count=0;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            }
            newStr+=str.charAt(i);
            if(count>0){
                newStr+=count+1;
            }

        }
        return newStr;
    }
}
