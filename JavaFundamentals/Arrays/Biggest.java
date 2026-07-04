class Biggest {
    public static void main(String args[]) {

        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int a[][] = new int[3][3];
        int k = 0;

        // Store values in 3x3 array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }

        System.out.println("The given array is:");

        int max = a[0][0];

        // Print array and find biggest number
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");

                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}

/*Question 14:
Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command 1ine arguments.
Example1：
C:\>java Sample 123
0/P: Please enter 9 integer numbers
Example2：
C:\>java Sample 1234555121222567789O/P:
The given array is:
12345
55121222
567789
The biggest number in the given array is 222
*/

/*Output:
java Biggest 1 2 3 4 5 6 7 8 9
The given array is:
1 2 3
4 5 6
7 8 9
The biggest number in the given array is 9
*/