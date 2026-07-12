import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");
        int num = sc.nextInt();

        // Check if number is in valid range
        if (num < 1 || num > 255) {
            System.out.println("Invalid Input");
        } else {
            // Convert to binary
            String binary = Integer.toBinaryString(num);

            // Print 8-bit binary with leading zeros
            System.out.println(String.format("%8s", binary).replace(' ', '0'));
        }

        sc.close();
    }
}