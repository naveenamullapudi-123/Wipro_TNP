import java.util.Scanner;

public class RemoveFirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Remove first and last characters
        String result = str.substring(1, str.length() - 1);

        System.out.println("Output: " + result);

    }
}