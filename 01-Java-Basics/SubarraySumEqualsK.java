
import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {

            prefixSum += num;

            int required = prefixSum - k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(
                prefixSum,
                map.getOrDefault(prefixSum, 0) + 1
            );
        }

        System.out.println("Number of subarrays: " + count);
    }
}

