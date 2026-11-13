
public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest &&
                       arr[i] > secondLargest) {

                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {1022, 1225, 502, 401, 1511};

        System.out.println(
            "Second Largest: " + findSecondLargest(arr)
        );
    }
}
