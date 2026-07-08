class RearrangeEO {
    public static void main(String args[]) {

        int a[] = {1, 0, 1, 0, 0, 1, 1};

        int b[] = new int[a.length];
        int j = 0;

        // Store even numbers first
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }

        // Store odd numbers next
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++;
            }
        }

        // Print the new array
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}


