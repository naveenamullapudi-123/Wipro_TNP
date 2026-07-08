class Apple extends Fruit {

    // Constructor
    public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    // Overriding eat() method
    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
        System.out.println("Apple is sweet.");
    }
}