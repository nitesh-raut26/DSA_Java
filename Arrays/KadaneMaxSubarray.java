package Arrays;

public class KadaneMaxSubarray {

    // kadane alogorihtm saya when the currsum is negative then we have to put the
    // zero the element.

    public static int maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        int maxSum = maxSubArraySum(numbers);
        System.out.println(maxSum);

    }
}
