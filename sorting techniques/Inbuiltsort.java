import java.util.Arrays;
import java.util.Collections;

public class Inbuiltsort {

    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}