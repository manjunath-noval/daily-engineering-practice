
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        int[] result = new int[n];

        int prefix = 1;

        // Calculate prefix products
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        int suffix = 1;

        // Multiply by suffix products
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
