import java.util.Scanner;

public class HillWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int weight = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                weight += i;
            }
        }

        System.out.println("Weight = " + weight);

        sc.close();
    }
}