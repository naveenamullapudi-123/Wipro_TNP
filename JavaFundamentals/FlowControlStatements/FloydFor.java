class FloydFor {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*Question 15A:
Print * in Floyd's Format (Using for Loop)
*/

/*Output:
java FloydFor 5
*
* *
* * *
* * * *
* * * * *
*/
