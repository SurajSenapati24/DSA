package DynamicProgramming;

public class MaxBlockKinderGarten {
    public static int countWays(int[] digits, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1; // Base case: 1 way to make sum 0

        for (int digit : digits) {  // Process each digit
            for (int sum = digit; sum <= target; sum++) {
                dp[sum] += dp[sum - digit]; // Add ways from previous states
            }
        }
        return dp[target]; // Return ways to form 'target'
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 5}; // Example input
        int target = 7; // Example target number

        System.out.println("Number of ways to form " + target + ": " + countWays(digits, target));
    }
}
