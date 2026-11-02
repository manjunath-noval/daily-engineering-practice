import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr){

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {130, 203, 303, 420, 530};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
        
    }
}