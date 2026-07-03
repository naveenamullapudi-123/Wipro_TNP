class CharCheck {
    public static void main(String args[]) {

        char ch = '@';

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        else {
            System.out.println("Special Character");
        }
    }
}

/*Question 5:
Initialize a character variable in a program and
print 'Alphabhet' if the initialized value is an alphabhet, 
print 'Digit' if the initialized value is a number, and
print'Special Character', if the initialized value is anything else.
*/

/*Output:
java CharCheck
Special Character
*/
