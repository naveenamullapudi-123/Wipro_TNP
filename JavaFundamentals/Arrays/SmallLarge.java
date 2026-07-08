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

