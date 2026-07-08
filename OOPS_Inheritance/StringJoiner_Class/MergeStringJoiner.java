import java.util.StringJoiner;

public class MergeStringJoiner {

    public static void main(String[] args) {

        // Create first StringJoiner
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Chennai");
        s1.add("Bangalore");

        // Create second StringJoiner
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Delhi");
        s2.add("Mumbai");
        s2.add("Pune");

        // i) Merge s2 into s1
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s1);
        merge1.merge(s2);

        System.out.println("s1 merged with s2:");
        System.out.println(merge1);

        // ii) Merge s1 into s2
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s2);
        merge2.merge(s1);

        System.out.println("\ns2 merged with s1:");
        System.out.println(merge2);
    }
}