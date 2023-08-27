package arrays.sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arrayInput(size);
    }

    public static void arrayInput(int size){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];

        int n = array.length;
        for (int i=0;i<n;i++){
            System.out.print("Enter the values ");
            array[i] = sc.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        int[] insertionSortArray = insertionSort.insertionSort(array);
        printArray(insertionSortArray);

    }
    public int[] insertionSort(int[] array){
        int n = array.length;
        for (int i=1;i<n;i++){
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int k : array){
            System.out.print(k+" ");
        }
    }
}
/*
* The time complexity of the Insertion Sort algorithm is O(n^2) in the average and worst cases and O(n) in the best case.

Here's a breakdown of the time complexities based on different cases:

1. **Best Case (Sorted Input):**
   - When the array is already sorted, the inner while loop doesn't execute as often.
   - The inner loop only iterates over elements that are greater than the current element being considered.
   - This results in a time complexity of O(n), where n is the number of elements.

2. **Average and Worst Cases (Unsorted Input):**
   - In these cases, the inner while loop may execute more often as elements need to be shifted.
   - On average, each element might need to be shifted about half of the sorted portion, leading to a quadratic time complexity.
   - The average and worst case time complexity is O(n^2), where n is the number of elements.

Insertion Sort can be efficient for small input sizes or nearly sorted data, but its quadratic time complexity makes it less suitable for
large datasets. There are sorting algorithms like Merge Sort and Quick Sort that offer better average and worst-case time complexities,
making them more efficient for larger datasets.
*
* */
