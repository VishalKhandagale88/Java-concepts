package algorithms;

import javax.swing.*;

public class FindGivenNumber {
    int[] Array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    public int printTheRepeatingNumber(int[] num1 , int n){
        int count=0;
        for (int j : num1) {
            if (j % n == 0) {
                count++;
            }
        }
        return count;
    }
}
