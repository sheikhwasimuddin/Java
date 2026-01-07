public class lastoccurance {
    public static int last(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int rest=last(arr,key,i+1);
        if(rest!=-1){
            return rest;
        }
        if(arr[i]==key){
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,5};
        int key=2;
        int r=last(arr,key,0);
        System.out.println(r);
    }
}