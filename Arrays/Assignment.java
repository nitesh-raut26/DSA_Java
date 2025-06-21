package Arrays;

public class Assignment {

    public static boolean duplicateNumber(int numbers[]) {
        int frequncyArray[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            frequncyArray[i] = numbers[i];
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (frequncyArray[i] > 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 1 };
        boolean result = duplicateNumber(numbers);
        System.out.println(result);
    }
}
