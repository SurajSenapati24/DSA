class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find the majority element candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // Set the new candidate
            }

            // Adjust the count
            if (num == candidate) {
                count++;  // Increment if the current element matches the candidate
            } else {
                count--;  // Decrement if it does not match
            }
        }

        // Step 2: Return the candidate as the majority element
        return candidate;
    }
}
