package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatingNumberInArray {
    /*
    * Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.
    *  Return the answer in ascending order. If no such element is found, return list containing [-1].

      Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.
    *    a[] = {2,3,1,2,3}
    Output:
    2 3
    Explanation:
    2 and 3 occur more than once in the given array.
    *
    *
    * Input:
    N = 4
    a[] = {0,3,1,2}
    Output:
    -1
    Explanation:
    There is no repeating element in the array. There fore output is -1.
    * */

    // hint 1 : Try to use the given array as a hash table.

    /*
    *
    1- Traverse the given array from i= 0 to n-1 elements
        Go to index arr[i]%n and increment its value by n.
    2- Now traverse the array again and print all those
        elements at indexes i for which arr[i]/n is greater
        than 1.

    This approach works because all elements are in range
    from 0 to n-1 and arr[i]/n would be greater than 1
    only if a value "i" has appeared more than once.
    * */

    public static void main(String[] args) {


        int[] array =  {2,3,1,3,2};
        RepeatingNumberInArray.usingMap(array);

        int n = array.length;
        for (int i=0;i<n;i++){
            int index = array[i]%n;
            array[index]+=n;
        }
        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<n;i++){
            if ((array[i]/n)>1){
                ans.add(i);
                flag=1;
            }
        }
        if (flag==0){
            ans.add(-1);
        }
        System.out.println(ans);
    }

    public  static void usingMap(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i : array){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet() ){
            if (entry.getKey()>1){
                arrayList.add(entry.getKey());
            }
        }
        System.out.println(arrayList);
    }
}
