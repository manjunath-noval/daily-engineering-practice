
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
