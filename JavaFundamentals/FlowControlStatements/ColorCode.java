import java.util.Scanner;
class ColorCode {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Color Code: ");
        char ch = sc.next().charAt(0);

        switch (Character.toUpperCase(ch)) {

            case 'R':
                System.out.println("Red");
                break;

            case 'B':
                System.out.println("Blue");
                break;

            case 'G':
                System.out.println("Green");
                break;

            case 'O':
                System.out.println("Orange");
                break;

            case 'Y':
                System.out.println("Yellow");
                break;

            case 'W':
                System.out.println("White");
                break;

            default:
                System.out.println("Invalid Code");
        }
    }
}

/*Question 8:
Write a program to receive a color code from the user (an Alphabhet).
The program should then print the color name, based on the color code given.The following are the color codes and their corresponding color names.
R-)Red, B->B1ue, G->Green, O->0range, Y->Yellow, W->White.
If color code provided by the user is not valid then print "Invalid Code".
*/

/*Output:
java ColorCode
Enter Color Code: r
Red
*/