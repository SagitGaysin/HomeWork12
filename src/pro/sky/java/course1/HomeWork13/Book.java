package pro.sky.java.course1.HomeWork13;

import java.util.Objects;

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

    public String toString() {
        return ("\nНазвание книги: " + this.publisher + "\nАвтор: " + this.authorName + "Год издания: " + this.publicationYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        return publicationYear == book.publicationYear
                && (publisher == book.publisher || (publisher != null && publisher.equals(book.getPublisher())))
                && (authorName.equals(book.authorName));
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher, authorName, publicationYear);
    }
}
