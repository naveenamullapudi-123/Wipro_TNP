import java.util.Scanner;

public class CreatePIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alpha = sc.nextInt();
        int beta = sc.nextInt();
        int gamma = sc.nextInt();

        int min = Math.min(alpha, Math.min(beta, gamma));
        int max = Math.max(alpha, Math.max(beta, gamma));

        int pin = min + max;

        System.out.println("PIN = " + pin);

        sc.close();
    }
}