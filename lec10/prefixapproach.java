public class prefixapproach {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        prefixsum(arr);
    }
    public static void prefixsum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=0;
        for (int i = 1; i < arr.length; i++) {
           prefix[i]=prefix[i-1]+arr[i]; 
        }
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                if(start==0){
                    currsum=prefix[end];
                }
                else{
                    currsum=prefix[end]-prefix[start-1];
                }
                System.out.println(currsum);

                if(maxsum<currsum){
                    maxsum=currsum;

                }

            }
        }
        System.out.println("max is"+maxsum);

    }
    
}
