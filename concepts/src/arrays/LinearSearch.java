package arrays;

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
        LinearSearch.linearSearch(array,target);
    }

    public  static void linearSearch(int[]array,int target){
        int n = array.length;

    }



}
