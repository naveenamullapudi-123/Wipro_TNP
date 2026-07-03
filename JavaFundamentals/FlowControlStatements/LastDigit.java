import java.util.Scanner;
class LastDigit {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        if ((n1 % 10) == (n2 % 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*Question:
1B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
lastDigit(7, 17) っ true lastDigit(6, 17) →false lastDigit(3, 113) → true
*/

/*Output:
java LastDigit
Enter first number: 23
Enter second number: 43
true
*/