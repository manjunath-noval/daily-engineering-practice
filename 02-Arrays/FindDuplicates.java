
public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyPrinted = false;

            // Check whether this element appeared earlier
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check for duplicates after current position
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
