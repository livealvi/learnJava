public class MainBook {

    public static void main(String[] args) {

        Book book = new Book("Bangla", "Alvi", 2);
        Library library = new Library("The Dhaka Library", "5 No Road, A Block, Bashunudhra R/A", book);
        library.show();

    }
}
