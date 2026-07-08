class Bird extends Animal {

    // Overriding eat() method
    @Override
    public void eat() {
        System.out.println("Bird is eating seeds.");
    }

    // Overriding sleep() method
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping in the nest.");
    }

    // New method in Bird class
    public void fly() {
        System.out.println("Bird is flying.");
    }
}