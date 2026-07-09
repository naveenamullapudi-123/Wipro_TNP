public class SecondLastDigit {

    public static int secondLastDigit(int num) {
        num = Math.abs(num);

        if (num < 10)
            return -1;

        return (num / 10) % 10;
    }

    public static void main(String[] args) {
        int num = 197;
        System.out.println(secondLastDigit(num));
    }
}