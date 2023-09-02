package arrays.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        List<Integer> lis = findLIS(nums);

        System.out.println("Longest Increasing Subsequence: " + lis);
    }
        public static List<Integer> findLIS(int[] nums) {
//        This method solution is done by dynamic programming
            int n = nums.length;
            int[] lis = new int[n];
            Arrays.fill(lis, 1); // Initialize LIS values to 1

            // Initialize an array to store the index of the previous element in the LIS
            int[] prevIndex = new int[n];
            Arrays.fill(prevIndex, -1); // Initialize with -1 as no previous element initially

            int maxLength = 0;
            int endIndex = 0;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j] && lis[i] <= lis[j] + 1) {
                        lis[i] = lis[j] + 1;
                        prevIndex[i] = j; // Update the previous element's index
                    }
                }
                // Track the index of the element that ends the longest subsequence
                if (lis[i] > maxLength) {
                    maxLength = lis[i];
                    endIndex = i;
                }
            }

            // Build the LIS by backtracking from the endIndex
            List<Integer> longestIncreasingSubsequence = new ArrayList<>();
            while (endIndex >= 0) {
                longestIncreasingSubsequence.add(nums[endIndex]);
                endIndex = prevIndex[endIndex];
            }

            // Reverse the list to get the correct order
            Collections.reverse(longestIncreasingSubsequence);

            return longestIncreasingSubsequence;
        }




}
