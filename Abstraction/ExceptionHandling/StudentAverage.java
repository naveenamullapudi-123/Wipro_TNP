import java.util.Scanner;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

public class StudentAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter name of student " + i + ":");
                String name = sc.nextLine();

                int sum = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {
                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeMarksException("Marks cannot be negative");
                    }

                    if (mark > 100) {
                        throw new MarksOutOfRangeException("Marks should be between 0 and 100");
                    }

                    sum += mark;
                }

                double average = sum / 3.0;
                System.out.println("Student: " + name);
                System.out.println("Average Marks = " + average);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integer values.");
        }
        catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        }
        catch (MarksOutOfRangeException e) {
            System.out.println(e.getMessage());
        }

    }
}