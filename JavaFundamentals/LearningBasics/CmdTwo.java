class CmdTwo {
    public static void main(String args[]) {

        if (args.length != 1) {
            System.out.println("It is mandatory to pass one argument.");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}

/*Question 2:
Write a Program to accept a String as a command line 'yargument and print a Welcome message as given below.
Example1)
C:1> java Sample John
O/P Expected :Welcome John
*/

/*Output:
java CmdTwo John
Welcome John*/
