public class hwsumsubarr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        sumsubarr(arr);
    }
    //sumsubarr
public static void sumsubarr(int arr[]){
    
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];
                System.out.print(arr[k]+" ");
                
            }
            System.out.print("=> sum : "+sum);
        System.out.println();
    }
    System.out.println();
}
}

}
