package arrays.subarray;

public class BruteForceMaxSubArray {
    public static void main(String[] args) {
        int [] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = bruteforce(num);
        System.out.println(maxSum);
    }

    public static int bruteforce(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            int currentValue =0 ;
            for (int j=i;j<n;j++){
                currentValue+=arr[j];
                maxSum = Math.max(maxSum,currentValue);
            }
        }
        return maxSum;
    }
}
/*
*
* Certainly! Here are all the possible subarrays of the input array `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`:

1. Single-Element Subarrays:
   - [-2]
   - [1]
   - [-3]
   - [4]
   - [-1]
   - [2]
   - [1]
   - [-5]
   - [4]

2. Two-Element Subarrays:
   - [-2, 1]
   - [1, -3]
   - [-3, 4]
   - [4, -1]
   - [-1, 2]
   - [2, 1]
   - [1, -5]
   - [-5, 4]

3. Three-Element Subarrays:
   - [-2, 1, -3]
   - [1, -3, 4]
   - [-3, 4, -1]
   - [4, -1, 2]
   - [-1, 2, 1]
   - [2, 1, -5]
   - [1, -5, 4]

4. Four-Element Subarrays:
   - [-2, 1, -3, 4]
   - [1, -3, 4, -1]
   - [-3, 4, -1, 2]
   - [4, -1, 2, 1]
   - [-1, 2, 1, -5]
   - [2, 1, -5, 4]

5. Five-Element Subarrays:
   - [-2, 1, -3, 4, -1]
   - [1, -3, 4, -1, 2]
   - [-3, 4, -1, 2, 1]
   - [4, -1, 2, 1, -5]
   - [-1, 2, 1, -5, 4]

6. Six-Element Subarrays:
   - [-2, 1, -3, 4, -1, 2]
   - [1, -3, 4, -1, 2, 1]
   - [-3, 4, -1, 2, 1, -5]
   - [4, -1, 2, 1, -5, 4]

7. Seven-Element Subarrays:
   - [-2, 1, -3, 4, -1, 2, 1]
   - [1, -3, 4, -1, 2, 1, -5]
   - [-3, 4, -1, 2, 1, -5, 4]

8. Eight-Element Subarrays:
   - [-2, 1, -3, 4, -1, 2, 1, -5]
   - [1, -3, 4, -1, 2, 1, -5, 4]

9. Nine-Element Subarray:
   - [-2, 1, -3, 4, -1, 2, 1, -5, 4]

These are all the possible subarrays of the given input array, including single-element, two-element, three-element, and so on, up to the full array itself. Subarrays can vary in length and contain different combinations of elements from the original array.
* */