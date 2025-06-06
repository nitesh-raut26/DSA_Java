package Arrays;


public class LargestNumber {

    public static int largestNumber(int numbers[]) {
        int maxNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            maxNumber = Math.max(maxNumber, numbers[i]);
            smallestNumber = Math.min(numbers[i], smallestNumber);
        }
        System.out.println("largets Number is "+ maxNumber);
        return smallestNumber;

    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 7, 3, 5 };
        int largeNumber = largestNumber(numbers);
        System.out.println(largeNumber);
    }
}
