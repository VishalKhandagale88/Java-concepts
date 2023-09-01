package arrays.subarray;

public class SubArray {
    public static void main(String[] args) {
        int[] array1 = {1,23,3,445,3,4,5,34};
        int[] subArray = SubArray.formSubArray(array1, 2, 5);
        for(int i : subArray){
            System.out.print(i+" ");
        }
    }

    public static int[] formSubArray(int[] array , int startingIndex , int endingIndex){
        int n = array.length;
        int[]  subArray = new int[(endingIndex-startingIndex)];
        System.out.println(subArray.length);
        int subArrayIndex = 0;
        for (int i=startingIndex;i<endingIndex;i++){
            subArray[subArrayIndex] = array[i];
            subArrayIndex++;
        }
        return subArray;

    }

}
