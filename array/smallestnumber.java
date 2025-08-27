public class smallestnumber {
    
    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 4, 5,6};
        small(arr);


    }
    public static void small(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= min) {
                min = arr[i];
                }
                }
                System.out.println("smallest number in array is " + min);
            
    }
    
}
