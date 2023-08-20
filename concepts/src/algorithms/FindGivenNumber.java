package algorithms;

import javax.swing.*;

public class FindGivenNumber {


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
