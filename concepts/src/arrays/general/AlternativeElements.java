package arrays.general;

import java.util.ArrayList;

public class AlternativeElements {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ArrayList<Integer> alternates = getAlternates(arr);
        for (Integer alternate : alternates) {
            System.out.println(alternate+" ");
        }
    }

    static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        getAlternatesRec(arr, 0, res);
        return res;
    }

    private static void getAlternatesRec(int[] arr, int i, ArrayList<Integer> res) {
        if (i < arr.length) {
            res.add(arr[i]);
            getAlternatesRec(arr, i + 2, res);
        }
    }
}
