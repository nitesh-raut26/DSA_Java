package Arrays;

public class BinarySearch {
    public static int binarySearch(int numbers[],int searchNumber) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = start - ((start - end) / 2);
            // System.out.print(mid+" ");
            if (searchNumber == numbers[mid]) {
                return mid;
            }
            else if (searchNumber < numbers[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int searchNumber = 1;
        int indx = binarySearch(numbers, searchNumber);
        System.out.println(indx);
    }
}
