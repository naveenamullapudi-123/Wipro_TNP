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
