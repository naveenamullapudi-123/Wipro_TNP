import java.util.Scanner;

public class PalindromePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] freq = new int[10];

        for (char ch : str.toCharArray()) {
            freq[ch - '0']++;
        }

        int odd = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0)
                odd++;
        }

        if (odd <= 1)
            System.out.println("Palindrome Possible");
        else
            System.out.println("Palindrome Not Possible");

        sc.close();
    }
}