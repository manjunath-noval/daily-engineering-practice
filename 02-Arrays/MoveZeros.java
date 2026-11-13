
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {0, 5, 0, 3, 8, 0, 2};

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Updated array: " + Arrays.toString(arr));
    }
}
