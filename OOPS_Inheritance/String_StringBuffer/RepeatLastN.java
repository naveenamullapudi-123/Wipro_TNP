import java.util.Scanner;

public class RepeatLastN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Get the last n characters
        String last = str.substring(str.length() - n);

        // Print last n characters n times
        for (int i = 1; i <= n; i++) {
            System.out.print(last);
        }

        sc.close();
    }
}