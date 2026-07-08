import java.util.Scanner;

class Search {
    public static void main(String args[]) {

        int a[] = {11, 4, 34, 56, 7};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int n = sc.nextInt();

        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}

