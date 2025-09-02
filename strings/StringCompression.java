public class StringCompression {
    public static void main(String[] args) {
        String str="aaabbccdee";
        String output=compress(str);
        System.out.println(output);
        String output1=compressStringBuilder(str);
        System.out.println(output1);
    }

    /**
     * O(n)
     * 1st approach
     */
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

    //2nd approach
    public static String compressStringBuilder(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
}
