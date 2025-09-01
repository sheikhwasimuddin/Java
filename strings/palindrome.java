public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str)); 
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}