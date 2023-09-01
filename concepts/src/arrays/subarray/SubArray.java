package arrays.subarray;

public class SubArray {
    public static void main(String[] args) {

    }

    public static int[] formSubArray(int[] array , int startingIndex , int endingIndex){
        int n = array.length;
        int[]  subArray = new int[endingIndex-startingIndex];
        for (int i=startingIndex;i<endingIndex;i++){
            subArray[i] = array[i];
        }
        return subArray;

    }

}
