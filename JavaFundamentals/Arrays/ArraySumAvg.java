class ArraySumAvg {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};

        int sum = 0;
        double average;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

/*Question 1:
Write a program to initialize an integer array and print the sum and average
of the array.
*/

/*Output:
java ArraySumAvg
Sum = 150
Average = 30.0
*/