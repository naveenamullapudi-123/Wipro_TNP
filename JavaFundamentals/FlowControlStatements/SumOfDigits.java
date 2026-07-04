import java.util.Scanner;

class SumOfDigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}

/*Question 14:
Write a program to print the sum of all the digits of a given number.
Example1)
I/P:1234
O/P:10
*/

/*Output:
java SumOfDigits
Enter a number: 1234
Sum of digits = 10
*/