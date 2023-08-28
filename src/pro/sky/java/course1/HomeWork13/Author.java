package pro.sky.java.course1.HomeWork13;

import java.util.Objects;

public class Author {
    private String lastName;
    private String firstName;

    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public  String getLastName() {

        return this.lastName;
    }

    public  String getFirstName() {

        return this.firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String toString() {
        return "Книга: " + lastName + " " + firstName + "\n";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Author author = (Author) obj;
        return (firstName == author.firstName) || (firstName != null && firstName.equals(author.getFirstName()))
                && (lastName == author.lastName) || (lastName != null && firstName.equals(author.getLastName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

