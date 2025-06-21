package Arrays;


// This is the brute approach it takes O(n^3) we have to make an Prefix sum Array to optimized the code

public class MaxSubArray {
    public static int maxSubArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    //    Prefix Array me ith element ka sum
    // if we go the sum from the index 1 to 3 then we have to go to the
    // start = 1 to end = 3 then loop we do the for(start to end) 
    // when we do the prefix array sum then the prefix[end]-prefix[start-1];
    public static int maxSubArrayPrefixSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
            //   maxSum = Math.max(maxSum,prefix[i]);
        }
        //   for (int i = 0; i < numbers.length; i++) {
        //       System.out.print(prefix[i] + " ");
        //   }
        //   System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                // int currSum = 0;
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
    

    // kadane alogorihtm saya when the currsum is negative then we have to put the
    // zero the element.

    // For the every element is coming is negative then the smallest number is maxArraySum
    // So we do chekc that contraint also that it chekc the subArray for all the element is negative 


    // O(n) optimized code
    public static int maxSubArraykadaneSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        // if all the element is negative then we do this
        if (maxSum == 0) {
            maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                maxSum = Math.max(maxSum, numbers[i]);
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        // int numbers[] = { 1, -2, 6, -1, 3 };
        int numbers[] = { -6, -2, -3, -1, -5 ,1};
        int sum = maxSubArraySum(numbers);
        System.out.println(sum);
        int maxSum = maxSubArrayPrefixSum(numbers);
        System.out.println(maxSum);
        int maxSubarraySum = maxSubArraykadaneSum(numbers);
        System.out.println(maxSubarraySum);

    }
}


// Prefix Sum



