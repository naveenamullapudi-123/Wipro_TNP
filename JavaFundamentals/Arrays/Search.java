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

/*Question 3:
Write a program to initialize anLinteger array with values and check if a given number is present in the array or not.
If the number is not found, it wil1 print -1 else it will print the index value of the given number in the array.
Example 1) If the Array elements are 11, 4, 34, 56, 7) and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are 11, 4, 34, 56, 7) and the search element is 56, then the output expected is 3.
*/

/*Output:
java Search
Enter the number to search: 56
3
*/