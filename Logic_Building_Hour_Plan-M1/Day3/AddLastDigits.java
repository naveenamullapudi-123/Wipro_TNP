public class AddLastDigits {

    public static int addLastDigits(int input1, int input2) {
        int last1 = Math.abs(input1 % 10);
        int last2 = Math.abs(input2 % 10);

        return last1 + last2;
    }

    public static void main(String[] args) {
        int input1 = 267;
        int input2 = -154;

        System.out.println(addLastDigits(input1, input2));
    }
}