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
            array[i] = sc.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);

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
        return array;
    }
}
