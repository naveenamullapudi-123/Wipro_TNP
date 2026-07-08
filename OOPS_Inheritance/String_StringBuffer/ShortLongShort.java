import java.util.Scanner;

public class ShortLongShort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        // Check which string is shorter
        if (a.length() < b.length()) {
            System.out.println("Output: " + a + b + a);
        } else {
            System.out.println("Output: " + b + a + b);
        }

    }
}