
import java.util.Scanner;

public class stringlinear {
    public static void main(String[] args) {
        String menu[]={"dosa","chole bhature","apple","mango","rice","roti"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dish");
        String key=sc.nextLine();
        int index=linearSearch(menu,key);
        if(index==-1)
        System.out.println("Dish not found");
        else
        System.out.println("Dish found at index "+index);
    }
    public static int linearSearch(String[] menu, String key) {
        for (int i = 0; i < menu.length; i++) {
            if(menu[i].equals(key)){
                return i;
            }
            }
            return -1;
            }
    
}
