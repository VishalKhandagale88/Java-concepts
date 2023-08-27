package arrays.sorting;

public class InsertionSort {
    public static void main(String[] args) {

    }
    public int[] insertionSort(int[] array){
        int n = array.length;
        for (int i=1;i<n;i++){
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j]>key){
                array[i+1] = key;
                j--;
            }
            array[j+1] = key;
        }
        return null;
    }
}
