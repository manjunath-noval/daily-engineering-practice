
public class ArrayIntersection {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {20, 40, 60, 80};

        System.out.println("Common elements:");

        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            // Avoid printing duplicates
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
