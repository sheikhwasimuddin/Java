public class pairinginarray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        pair(arr);

    }
    public static void pair(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }System.out.println();
        }
        
    
    }
}