public class Library {
    public String name;
    public String address;
    public Book book;

    public Library(String name, String address, Book book){
        this.name = name;
        this.address = address;
        this.book = book;

    }

    public void show(){
        System.out.println("Library Name:" + this.name);
        System.out.println("Library Address:" + this.address);
        System.out.println("=================");
        System.out.println("About Book - " + "\nBook Name: " + book.getBookName() + "\nBook Author Name: " + book.getAuthorName() + "\nBook Copy No: " + book.getNoOfCopy());
    }

}
