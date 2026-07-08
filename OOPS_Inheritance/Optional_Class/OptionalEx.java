import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {

        String[] names = new String[5];

        // Create Optional object
        Optional<String> name = Optional.ofNullable(names[0]);

        // Check if value is present
        if (name.isPresent()) {
            System.out.println(name.get().length());
        } else {
            System.out.println("Value is null");
        }
    }
}