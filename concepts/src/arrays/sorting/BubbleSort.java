package arrays.sorting;
/*
*
* The Bubble Sort algorithm has the following time and space complexities:

**Time Complexity:**
- **Worst-Case:** O(n^2) - This occurs when the array is in reverse order, and the algorithm has to make the maximum
     number of comparisons and swaps.
- **Average-Case:** O(n^2) - On average, Bubble Sort requires O(n^2) comparisons and swaps.
- **Best-Case:** O(n) - The best-case scenario occurs when the array is already sorted, and Bubble
    Sort makes no swaps during a pass. In this case, it still needs to make n comparisons for each of the n elements, resulting in O(n) comparisons.

Bubble Sort is generally not recommended for large datasets because of its quadratic time complexity.
 It's inefficient compared to more advanced sorting algorithms like Merge Sort, Quick Sort, or even Insertion Sort.

**Space Complexity:**
- Bubble Sort is an in-place sorting algorithm, meaning it doesn't require additional memory to sort the array.
Its space complexity is O(1), which indicates that it uses a constant amount of memory regardless of the size of the input array.

While Bubble Sort is easy to understand and implement, it's mainly used for educational purposes or for sorting very small datasets
due to its inefficient time complexity for larger datasets. There are more efficient sorting algorithms available for practical
 use in real-world applications.
*
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,61,34,6,7};
        int[] bubbleSort = BubbleSort.bubbleSort(arr);
        BubbleSort.printArray(bubbleSort);
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
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return  arr;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
