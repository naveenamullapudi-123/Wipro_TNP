public class MathOperation {

    public static void main(String[] args) throws Exception {

        try {
            if (args.length != 5) {
                throw new Exception("Please enter exactly 5 integers.");
            }

            int[] arr = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            int average = sum / arr.length;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}