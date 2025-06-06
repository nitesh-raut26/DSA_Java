package Arrays;

public class SubArrays {

    public static void subArrays(int numbers[]) {

        // total Subarrays  = n*(n+1)/2;
        int totalsubarrays = 0;
        int subArrayMax = Integer.MIN_VALUE;
        int subArrayMin = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];

                }
                subArrayMax = Math.max(subArrayMax, sum);
                subArrayMin = Math.min(subArrayMin, sum);
                totalsubarrays++;
                System.out.println();

            }
            // System.out.println();
        }
        System.out.println(totalsubarrays + " totalsubbara");
        System.out.println("subArrayMax is " + subArrayMax);
        System.out.println("subArrayMin is "+ subArrayMin);
    }
    public static void main(String[] args) {
        // a continuous part of array
        // [2,4,6,8,10]
        // [2] [2,4] [2,4,6] [2,4,6,8] [2,4,6,8,10]
        // [4] [4,6] [4,6,8] [4,6,8,10]
        // [6] [6,8] [6,8,10]
        // [8] [8,10]
        // [10]
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArrays(numbers);


    }
}
