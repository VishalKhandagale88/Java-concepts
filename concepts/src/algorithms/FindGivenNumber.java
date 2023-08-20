package algorithms;

public class FindGivenNumber {
    public int printTheNumberDivisibleByGivenNumber(int[] num1 , int n){
        int count=0;
        for (int j : num1) {
            if (j % n == 0) {
                count++;
            }
        }
        return count;
    }
    public int maxElement(int[] array ){
        int maxNumber =0 ;
        for (int j : array) {
            maxNumber = j;
        }
        return maxNumber;
    }
}
