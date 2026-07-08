import java.util.Scanner;

public class CopyFirstTwoChars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Get the first two characters
        String firstTwo = str.substring(0, 2);

        // Repeat the first two characters
        for (int i = 0; i < str.length(); i++) {
            System.out.print(firstTwo);
        }

    }
}