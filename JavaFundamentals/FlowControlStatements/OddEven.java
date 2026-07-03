import java.util.Scanner;
class OddEven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

/*Question 2:
Write a program to check whether a given number is odd or even.
*/

/*Output:
java OddEven
Enter a number: 10
Even
*/
