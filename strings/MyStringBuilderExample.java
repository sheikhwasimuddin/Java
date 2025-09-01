public class MyStringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}