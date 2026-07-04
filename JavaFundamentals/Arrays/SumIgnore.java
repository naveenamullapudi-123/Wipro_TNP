class SumIgnore {
    public static void main(String args[]) {

        int a[] = {10, 3, 6, 1, 2, 7, 9};

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum = sum + a[i];
            }

            if (a[i] == 7 && ignore) {
                ignore = false;
            }
        }

        System.out.println("Sum = " + sum);
    }
}

/*Question 8:
Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
Eg1) Array Elements - 10, 3, 6, 1, 2, 7, 9
0/P:22
[i.e 10+3+9]
Eg2) Array Elements - 7, 1, 2, 3, 6
0/P:19
A
Eg3) Array Elements - 1, 6, 4, 7, 9
0/P:10
*/

/*Output:
java SumIgnore
Sum = 22
*/