class Orange extends Fruit {

    // Constructor
    public Orange() {
        super("Orange", "Sour", "Medium");
    }

    // Overriding eat() method
    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
        System.out.println("Orange is sour.");
    }
}