import java.util.*;
public class largestnumber{
    public static int largest(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int result=largest(nums);
        System.out.println("The largest number in the array is: " + result);
    }
}