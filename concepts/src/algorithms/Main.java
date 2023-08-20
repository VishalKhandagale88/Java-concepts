package algorithms;

public class Main {
    public static void main(String[] args) {
        FindGivenNumber findGivenNumber = new FindGivenNumber();
        int[] Array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int result = findGivenNumber.printTheNumberDivisibleByGivenNumber(Array, 3);
        System.out.println(result);
        int maxNumber = findGivenNumber.maxElement(Array);
        System.out.println(maxNumber);

    }
}
