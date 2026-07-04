class Sorting {
    public static void main(String args[]) {

        int a[] = {30, 10, 50, 20, 40};

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

        System.out.println("Sorted Array:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

/*Question 6:
Write a program to initialize an array and print them in a sorted order.
*/

/*Output:
java Sorting
Sorted Array:
10 20 30 40 50
*/