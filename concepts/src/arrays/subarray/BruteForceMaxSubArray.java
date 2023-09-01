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
        int currentValue =0 ;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                currentValue+=arr[i];
                maxSum = Math.max(currentValue,maxSum);
            }
        }
        return maxSum;
    }
}
