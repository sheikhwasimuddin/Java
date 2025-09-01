public class creationinputoutput{
    public static void main(String[] args) {

        String str = "Hello, World!";
        System.out.println("The string is: " + str);

        //2ND 
        String str2 = new String("Hello, sheikh!");
        System.out.println("The second string is: " + str2);

        //input output
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        scanner.close();

    }
}