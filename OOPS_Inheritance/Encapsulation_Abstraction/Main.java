public class Main {

    public static void main(String[] args) {

        // Create Author object
        Author author = new Author("James Gosling", "james@gmail.com", 'M');

        // Create Book object
        Book book = new Book("Java Programming", author, 599.50, 20);

        // Print Book Details
        System.out.println("Book Details");
        System.out.println("---------------------------");
        System.out.println("Book Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity : " + book.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("---------------------------");
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Email : " + book.getAuthor().getEmail());
        System.out.println("Gender : " + book.getAuthor().getGender());
    }
}