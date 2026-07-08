import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerEx {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add names
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Create StringJoiner
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        // Add elements using forEach
        names.forEach(name -> sj.add(name));

        // Display result
        System.out.println(sj);
    }
}