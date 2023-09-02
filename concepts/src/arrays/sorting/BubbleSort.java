package arrays.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,61,34,6,7};
        int[] bubbleSort = BubbleSort.bubbleSort(arr);

    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            boolean swapped = false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!swapped){
                break;
            }
        }
        return  arr;
    }
}
