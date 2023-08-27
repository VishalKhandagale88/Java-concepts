package arrays.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // In linear search basically we are given a number and we have to find it in an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter value : ");
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        int searchedNumber = LinearSearch.linearSearch(array, target);
        System.out.println(searchedNumber);
    }

    public  static int linearSearch(int[]array,int target){
        int n = array.length;
        for (int i=0;i<n;i++){
            if (array[i]==target){
                return array[i];
            }
        }
        return -1;
    }



}
