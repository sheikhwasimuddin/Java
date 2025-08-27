public class SelectionSort {
    public static void main(String[]args){
        int arr[]={5,4,1,2,3};
        selectionSort(arr);
        printarr(arr);
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){ //i=turns
           int minpos=i;
           for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
           }
           //swap
           int temp=arr[i];
           arr[i]=arr[minpos];
           arr[minpos]=temp;

    }
}

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } }