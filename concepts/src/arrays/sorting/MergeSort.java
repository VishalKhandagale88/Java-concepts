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

    }

    public static void main(String[] args) {

    }

}
