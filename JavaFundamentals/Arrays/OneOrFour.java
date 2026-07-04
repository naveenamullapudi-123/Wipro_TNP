class OneOrFour {
    public static void main(String args[]) {

        int a[] = {1, 4, 1, 4};

        boolean flag = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 1 && a[i] != 4) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}

/*Question 11:
Given an array of type int, print true if every element is 1 or 4.
on1y14([1,4,1，4])->true 
on1y14([1, 4, 2,4])->false 
only14([1, 1])->true
*/

/*Output:
java OneOrFour
true
*/