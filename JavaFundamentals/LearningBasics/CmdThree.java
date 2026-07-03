class CmdThree {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("It is mandatory to pass two arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

/*Question 3:
Write a Program to accept two integers as command line arguments and print the
sum of the two numbers
M
Example1)
C:\>java Sample 1020
0/P Expected: The sum of 10 and 20 is 30
*/

/*Output:
java CmdThree 10 20
The sum of 10 and 20 is 30
*/