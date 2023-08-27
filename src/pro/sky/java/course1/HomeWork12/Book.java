package pro.sky.java.course1.HomeWork12;

public class Book {
    private String publisher;
    private Author authorName;
    private int publicationYear;

    public Book(String publisher, Author authorName, int publicationYear) {
        this.publisher = publisher;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author getAuthorName() {
        return  this.authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}
