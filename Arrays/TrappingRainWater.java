package Arrays;

// given n non-negative integers representing an elevation map

// where width of each bar is 1, compute how much water it can trap after raining.

// (waterLevel - hegihtBar)*widthBar
// 1. Min numbers of bars >=2
// 2. Asc/desc no water is trapped.

// WaterLevel = min(maxLeft,maxRight)

public class TrappingRainWater {

    public static int maxRightElement(int numbers[], int start, int end) {
        int maxRightElement = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            maxRightElement = Math.max(maxRightElement, numbers[i]);
        }
        // System.out.println(maxRightElement);
        return maxRightElement;
    }
    
    public static int maxLeftElement(int numbers[],int start,int end) {
         int maxLeftElement = Integer.MIN_VALUE;
         for (int i = start; i <= end; i++) {
             maxLeftElement = Math.max(maxLeftElement, numbers[i]);
         }
        // System.out.println(maxLeftElement);
        return maxLeftElement;
    }
    
    public static int trapWater(int numbers[]) {
        if (numbers.length <= 2) {
            return 0;
        }
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                descending = false;
            } else if (numbers[i] > numbers[i + 1]) {
                ascending = false;
            }
        }
        if (ascending || descending) {
            return 0;
        }
        int trappedWater = 0;
        int totalWater = 0;

        // for (int i = 1; i < numbers.length - 1; i++) {
        //     trappedWater = Math.min(maxLeftElement(numbers, 0, i), maxRightElement(numbers, i + 1, numbers.length - 1))
        //             - numbers[i];
        //     if (trappedWater > 0) {
        //         totalWater += trappedWater;
        //     }
        // }
        int[] leftmaxArray = leftmaxBoundary(numbers);
        int[] rightmaxArray = rightmaxBoundary(numbers);

         for (int i = 0; i < numbers.length ; i++) {
            trappedWater = Math.min(leftmaxArray[i],rightmaxArray[i])
                    - numbers[i];
            if (trappedWater > 0) {
                totalWater += trappedWater;
            }
        }
        return totalWater;
    }
    

    // Another approach is to store the leftMaxBoundary called AuxillaryArray
    // leftmaxBoundary = [4,4,4,6,6,6,6]
    // rightmaxBoundary= [6,6,6,6,5,5,5]

    public static int[] leftmaxBoundary(int numbers[]) {
        int leftmaxArray[] = new int[numbers.length];
        leftmaxArray[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            leftmaxArray[i] = Math.max(leftmaxArray[i - 1], numbers[i]);
        }
        return leftmaxArray;
    }

    public static int[] rightmaxBoundary(int numbers[]) {
        int rightmaxArray[] = new int[numbers.length];
        rightmaxArray[numbers.length-1] = numbers[numbers.length-1];
        for (int i = numbers.length-2; i >=0; i--) {
            rightmaxArray[i] = Math.max(rightmaxArray[i+1], numbers[i]);
        }
        return rightmaxArray;
    }


    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int waterLog = trapWater(height);
        System.out.println(waterLog);

    }
}
