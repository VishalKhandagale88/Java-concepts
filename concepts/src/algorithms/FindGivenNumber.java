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
}
