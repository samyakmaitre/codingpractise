import java.util.HashSet;

public class Mainn {
    public static void main(int[] nums, int k) {
        // Create a HashSet to store elements of the array
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        // Add all elements of the array to the HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through the array and check for pairs with difference k
        for (int num : nums) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 5, 3, 4, 2};
        int k = 3;

        // Count distinct pairs with difference k
        int result = countPairs(nums, k);
        System.out.println("Output: " + result);
    }
}
