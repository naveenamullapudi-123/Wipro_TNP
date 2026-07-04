class RemoveDup {
    public static void main(String args[]) {

        int a[] = {12, 34, 12, 45, 67, 89};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < a.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

/*Question 7:
write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12, 34, 12, 45, 67, 89)
0/P:(12, 34, 45, 67, 89)
*/

/*Output:
java RemoveDup
Array after removing duplicates: 12 34 45 67 89
*/