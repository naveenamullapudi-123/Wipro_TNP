class CmdOne {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("It is mandatory to pass two arguments in command line");
            return;
        }

        System.out.println(args[0] + " Technologies " + args[1]);
    }
}
/*Question 1: Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangaldre.
Example2)
If the command line arguments are ABC and Mumbai then the output generated
should be ABC Technologies Mumbai
[Note: It is mandatory to pass two arguments in command line]
*/

/*Output:
java CmdOne Wipro Bangalore
Wipro Technologies Bangalore

java CmdOne ABC Mumbai
ABC Technologies Mumbai
*/



