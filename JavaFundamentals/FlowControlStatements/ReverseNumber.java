import java.util.Scanner;

class ReverseNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);
    }
}

/*Question 16:
Write a program to reverse a given number.
*/

/*Output:
java ReverseNumber
Enter a number: 1234
Reverse = 4321
*/