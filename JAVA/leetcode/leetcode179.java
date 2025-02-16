
public class leetcode179 {

    public String largestNumber(int[] nums) {
        
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {
        Leetcode179 solution = new Leetcode179();

        int[][] testCases = {
            {10, 2},
            {3, 30, 34, 5, 9},
            {1, 20, 23, 4, 8},
            {0, 0},
            {999, 99, 9},
            {824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247}
        };

        for (int[] testCase : testCases) {
            System.out.println("Input: " + Arrays.toString(testCase));
            System.out.println("Largest Number: " + solution.largestNumber(testCase));
            System.out.println();
        }
    }
}
