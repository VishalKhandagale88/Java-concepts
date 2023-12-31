package arrays.sorting;

public class MergeSort {
    public static void mergeSort(int[] arr, int startingIndex, int endingIndex) {
        if (startingIndex<endingIndex){
            int middleIndex = (startingIndex+endingIndex)/2;
            mergeSort(arr,startingIndex,middleIndex);
            mergeSort(arr,middleIndex+1,endingIndex);
            merge(arr,startingIndex,middleIndex,endingIndex);
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
            rightArray[i] =  arr[middleIndex + 1+i ];
        }
        int i=0,j=0,k=startingIndex;
        while (i<lengthOfLeftArray && j<lengthOfRightArray){
            if (leftArray[i]<=rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i<lengthOfLeftArray){
            arr[k] =  leftArray[i];
            i++;
            k++;
        }
        while (j<lengthOfRightArray){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,34,5,24,4,8,9,0};
        MergeSort.mergeSort(arr,0,arr.length-1);
        MergeSort.printArray(arr);

    }

    public static  void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
    }


}
