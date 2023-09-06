package arrays.sorting;

public class MergeSort {
    public static void mergeSort(int[] arr, int startingIndex, int endingIndex) {
        if (startingIndex<endingIndex){
            int middleIndex = (startingIndex+endingIndex)/2;
            mergeSort(arr,startingIndex,middleIndex);
            mergeSort(arr,middleIndex+1,endingIndex);

        }
    }

    public  static  void  merge(int[] arr, int startingIndex, int middleIndex, int endingIndex){
        int lengthOfLeftArray = middleIndex - startingIndex +1;
        int lengthOfRightArray = endingIndex - middleIndex;

        int[] leftArray = new int[lengthOfLeftArray];
        int[] rightArray = new int[lengthOfRightArray];

        for (int i=0;i<lengthOfLeftArray;i++){
            leftArray[i] =  arr[startingIndex + i];
        }
        for (int i=0;i<lengthOfRightArray;i++){
            rightArray[i] =  arr[middleIndex + i +i];
        }
        int i=0,j=0,k=startingIndex;
        while (i<lengthOfLeftArray && j<lengthOfRightArray){
            if (leftArray[i]<=rightArray[i]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
    }

    public static void main(String[] args) {

    }

}
