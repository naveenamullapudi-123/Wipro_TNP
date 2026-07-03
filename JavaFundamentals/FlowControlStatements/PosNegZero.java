import java.util.Scanner;
class PosNegZero {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

/*Question:
1A) Write a program to check if a given integer number is Positive, Negative, or Zero.
M
*/

/*Output:
java PosNegZero
Enter a number: 10
Positive
*/
