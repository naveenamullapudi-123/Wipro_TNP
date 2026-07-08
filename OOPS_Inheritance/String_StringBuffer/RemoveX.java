import java.util.Scanner;

public class RemoveX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Remove 'x' from the beginning
        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        // Remove 'x' from the end
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println("Output: " + str);

        sc.close();
    }
}