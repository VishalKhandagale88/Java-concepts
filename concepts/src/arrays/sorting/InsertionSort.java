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
                array[j+1] = key;
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
