package arrays.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,3,4,2,10,7,1};
        int[] selectionSortArray = SelectionSort.selectionSort(arr);
        SelectionSort.printArray(selectionSortArray);

    }

    public  static   int[] selectionSort(int[] arr){
        int n =  arr.length;
        for (int i =0;i<n-1;i++){
            int minIndex = i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            int temp  = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] =  temp;


        }
        return arr;
    }

    public  static  void printArray(int[] arr){

        for (int i :arr){
            System.out.print(i+" ");
        }
    }

}
