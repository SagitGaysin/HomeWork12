package sky.pro.java.course1.HomeWork12;

public class Main {
    public static void main(String[] args) {
        Author sapkovsky = new Author("Анджей ", "Сапковский");
        Book bookSapkovsky = new Book("Ведьмак", sapkovsky, 1986);
        printSapkovsky(bookSapkovsky, sapkovsky);

        Author Cisyn = new Author("Лю ", "Цысинь");
        Book bookCisyn = new Book("Задача трех тел", Cisyn,  2008);
       printCisyn(bookCisyn, Cisyn);
    }

    private static void printSapkovsky(Book bookSapkovsky, Author sapkovsky) {
        System.out.println("\n Книга: " + bookSapkovsky.getPublisher());
        System.out.println("Автор: " + sapkovsky.getLastName() + sapkovsky.getFirstName());
        System.out.println("год издания: " + bookSapkovsky.getPublicationYear());
    }
    private static void printCisyn(Book bookCisyn, Author Cisyn) {
        System.out.println("\n Книга: " + bookCisyn.getPublisher());
        System.out.println("Автор: " + Cisyn.getLastName() + Cisyn.getFirstName());
        System.out.println("год издания: " + bookCisyn.getPublicationYear());
    }
}


