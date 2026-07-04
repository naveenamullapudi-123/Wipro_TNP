class Reverse {
    public static void main(String args[]) {

        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int a[][] = new int[2][2];

        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The reverse of the array is:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*Question 13:
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
Example1)
C:1>java Sample 123
0/P: Please enter 4 integer numbers
Example2)
C:\>java Sample 12340/P:
The given array is:
12
34
The reverse of the array is :
43
21
*/

/*Output:
java Reverse 1 2 3 4
The given array is:
1 2
3 4
The reverse of the array is:
4 3
1 2
*/