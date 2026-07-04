class RemoveTen {

    public static void main(String args[]) {

        int a[] = {1, 10, 10, 2};

        int j = 0;

        // Move non-10 elements to the front
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 10) {
                a[j] = a[i];
                j++;
            }
        }

        // Fill remaining positions with 0
        while (j < a.length) {
            a[j] = 0;
            j++;
        }

        // Print the array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
/*Question 9:
Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be θ. So 11, 10, 10, 2)yields (1, 2, 0, 0). You may modify and display the given array or make a new array.
withoutTen([1, 10, 10,2])->[1, 2, 0，0]
withoutTen([10, 2, 10])->[2, 0, 0]
withoutTen([1, 99,10])->[1, 99, 0]
*/

/*Output:
java RemoveTen
Output: 1 2 0 0
*/
