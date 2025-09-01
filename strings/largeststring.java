public class largeststring {
    public static void main(String[] args) {
        String str[]={"sheikh","wasimuddin","hello","world"};
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println("Largest String: " + largest);
    }
}
