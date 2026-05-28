import java.util.*;
public class smallestnumber{
    public static int smallestnumber(int nums[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(small>nums[i]){
                small=nums[i];
            }
        }
        return small;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=sc.nextInt();
        int nums[]=new int[s];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<s;i++){
            nums[i]=sc.nextInt();
        }
        int small=smallestnumber(nums);
        System.out.println("the smallest number in the array is:"+small);
    }
}