package Arrays;

public class LinearSearch {

    public static int linearSearch(int numbers[],int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 8, 10, 12, 14, 16 };
        String menu[] = { "dosa", "chole", "samosa", "burger" };
        int key = 16;
        int result = linearSearch(numbers, key);
        System.out.println(result);

    }
}
