package vehicle;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}