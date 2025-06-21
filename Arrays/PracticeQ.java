package Arrays;

public class PracticeQ {
    public static boolean isduplicate(int[] nums) {
        int[] frequncyArray = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            frequncyArray[nums[i]]++;
        }
        for (int i = 0; i <= nums.length; i++) {
            if (frequncyArray[i] > 1) {
                return true;
            }
        }
        return false;

    }

    public static int rotatedArray(int numbers[],int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
        //    Determine which side is sorted
       else if (numbers[start] <= numbers[mid]) {
            //check the element is present in that side.
            if (numbers[start] <= target && target < numbers[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
             }
        }
        else {
            if (numbers[mid] < target && target <= numbers[end]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
              }
                
            }

        }
        
        return -1;

     }

    

    public static void main(String[] args) {
        // Q1. Given an integer nums, return true if any value appears
        // at least twice in the array, and return false if every element is distinct.
        int[] numbers = { 1, 2, 3, 4 };
        int[]array = {4,5,6,7,0,1,2};
        boolean duplicateNumber = isduplicate(numbers);
        int result = rotatedArray(array, 2);
        System.out.println(duplicateNumber);
        System.out.println(result);
    }
}
