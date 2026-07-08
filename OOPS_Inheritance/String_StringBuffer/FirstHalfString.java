import java.util.Scanner;

public class FirstHalfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Check if the length is even
        if (str.length() % 2 == 0) {

            // Print first half of the string
            System.out.println(str.substring(0, str.length() / 2));

        } else {

            // Print null for odd length
            System.out.println("null");
        }

    }
}