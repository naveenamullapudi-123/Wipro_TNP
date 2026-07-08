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

