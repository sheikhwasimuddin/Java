public class firstoccurance {
    public static int first(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return first(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,5};
        int key=1;
        int r=first(arr,key,0);
        System.out.println(r);
    }
}
