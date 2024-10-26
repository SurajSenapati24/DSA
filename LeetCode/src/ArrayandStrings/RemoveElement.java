package ArrayandStrings;
import java.util.*;

import static java.util.Arrays.sort;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        int expectedNums[] = {2, 2};
        int k = removeElement(nums, val);

        // Assert that k matches the length of expectedNums
        assert k == expectedNums.length : "The lengths do not match!";

        // Sort the first k elements of nums
        sort(nums, 0, k);

        // Assert that the first k elements of nums match expectedNums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "Values do not match at index " + i;
        }

        // Print the first k elements of nums
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int nums[], int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
