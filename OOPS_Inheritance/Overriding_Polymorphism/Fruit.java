class Fruit {

    // Data members
    String name;
    String taste;
    String size;

    // Parameterized Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
    }
}
