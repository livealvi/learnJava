public class Book {
    public String bookName;
    public String authorName;
    public int noOfCopy;

    public Book(String bookName, String  authorName, int noOfCopy){
        this.bookName = bookName;
        this.authorName = authorName;
        this.noOfCopy = noOfCopy;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNoOfCopy() {
        return noOfCopy;
    }

    public void setNoOfCopy(int noOfCopy) {
        this.noOfCopy = noOfCopy;
    }
}
