import java.util.Scanner;

public class ConcatStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        String result;

        // Check if last character of first string
        // is same as first character of second string
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }

        // Convert to lowercase
        System.out.println("Result: " + result.toLowerCase());

    }
}