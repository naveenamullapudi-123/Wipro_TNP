class PrimePrime {
    public static void main(String args[]) {

        for (int n = 10; n <= 99; n++) {

            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n);
            }
        }
    }
}

/*Question 13:
Write a program to print prime numbers between 10 and 99.
*/

/*Output:
java PrintPrime
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
*/