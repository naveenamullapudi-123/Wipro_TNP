class Palindrome {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Please enter a number");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (temp == rev)
            System.out.println(temp + " is a palindrome");
        else
            System.out.println(temp + " is not a palindrome");
    }
}

