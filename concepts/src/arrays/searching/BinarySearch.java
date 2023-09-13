package arrays.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    public  static  int binarySearch(int[] arr ,int target){
        int startingIndex =0;
        int endingIndex = arr.length -1;
        while (startingIndex<=endingIndex){
            int middleIndex = (endingIndex + startingIndex)/2;
            if (arr[middleIndex] == target){
                return middleIndex;
            }else if (arr[middleIndex]<target){
                endingIndex = middleIndex+1;
            }else {
                startingIndex = middleIndex -1;
            }

        }
        return  -1;
    }
}
