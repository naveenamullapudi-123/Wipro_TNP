public class LastDigit {

    public static int lastDigit(int num) {
        return Math.abs(num % 10);
    }

    public static void main(String[] args) {
        int num = -197;
        System.out.println(lastDigit(num));
    }
}