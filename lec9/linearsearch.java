import java.util.*;
public class linearsearch {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
                return -1;
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5,6,8,7,9,10,11,12,13,14,15};
        System.out.println("enter the target key:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int index = linearSearch(number, key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index "+index);
        }
        
    }
    
}
