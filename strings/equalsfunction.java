public class equalsfunction {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Using equals() method to compare content
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        // Using '==' operator to compare references
        System.out.println("str1 == str2: " + (str1 == str2)); // true, same reference in string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // false, different references
    }
}
