class SmallLarge {
    public static void main(String args[]) {

        int a[] = {10, 50, 30, 20, 40};

        // Sort the array
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Smallest Number = " + a[0]);
        System.out.println("Second Smallest Number = " + a[1]);

        System.out.println("Largest Number = " + a[a.length - 1]);
        System.out.println("Second Largest Number = " + a[a.length - 2]);
    }
}

/*Question 5:
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/

/*Output:
java SmallLarge
Smallest Number = 10
Second Smallest Number = 20
Largest Number = 50
Second Largest Number = 40
*/