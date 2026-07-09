import java.util.Scanner;

class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {

    void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserRegistration user = new UserRegistration();

        try {
            System.out.println("Enter Username:");
            String username = sc.nextLine();

            System.out.println("Enter Country:");
            String country = sc.nextLine();

            user.registerUser(username, country);

        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}