public class largestnumber {
    
    public static void main(String[] args) {
        int[] arr = {100, 20, 3, 4, 5,6};
        largest(arr);


    }
    public static void largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                }
                }
                System.out.println("Largest number in array is " + max);
            
    }
    
}
