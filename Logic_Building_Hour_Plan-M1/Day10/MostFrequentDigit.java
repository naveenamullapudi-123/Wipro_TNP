import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();
        int[] freq = new int[10];

        for (int i = 0; i < number.length(); i++) {
            freq[number.charAt(i) - '0']++;
        }

        int max = freq[0];
        int digit = 0;

        for (int i = 1; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }

        System.out.println("Most Frequent Digit = " + digit);

        sc.close();
    }
}