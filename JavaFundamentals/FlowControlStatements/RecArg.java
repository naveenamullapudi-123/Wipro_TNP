class RecArg {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("No Values");
        } else {

            for (int i = 0; i < args.length; i++) {

                if (i == args.length - 1)
                    System.out.print(args[i]);
                else
                    System.out.print(args[i] + ", ");
            }
        }
    }
}

/*Question 3:
Write a program to check if the program has received conmand line arguments or not.
3
S
If the program has not received arguments then print "No Values", else print
all the values in a single line separated by , (comma)
Example1) java Example
0/P:No values
Example2) java Example Mumbai Bangalore
0/P:Mumbai, Bangalore
[Hint: You can use length property of an array to check its length]
*/

/*Output:
java RecArg 10 20 30
10, 20, 30
*/
