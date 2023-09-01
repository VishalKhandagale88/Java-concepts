package arrays.subarray;

public class KadaneAlgorithm {
    public static void main(String[] args) {

        int [] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArray = KadaneAlgorithm.maxSubArraySum(num);
        System.out.println(maxSubArray);
    }
    public static int maxSubArraySum(int[] num) {
        int maxEndingHere = num[0];
        int maxSoFar = num[0];

        for (int i = 1; i < num.length; i++) {
            maxEndingHere = Math.max(num[i], maxEndingHere + num[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }



}
