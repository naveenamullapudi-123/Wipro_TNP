import java.util.Scanner;

class ChangeCase {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " -> " + Character.toLowerCase(ch));
        } 
    }
}

/*Question 7:
Initialize a character variable wtch an alphabhet in a program.
If the character value is in 1owercase, the output should be displayed in uppercase in the following format.
Example1)
i/p:a
0/p:a->A
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Example2)
i/p:A
0/p:A->a
*/

/*Output:
java ChangeCase
Enter an alphabet: a
a -> A
*/