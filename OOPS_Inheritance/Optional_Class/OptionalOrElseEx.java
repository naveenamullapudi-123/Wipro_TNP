import java.util.Optional;

public class OptionalOrElseEx {

    public static void main(String[] args) {

        String address = null;

        // Create Optional object
        Optional<String> add = Optional.ofNullable(address);

        // Print address or default value
        System.out.println(add.orElse("India"));
    }
}