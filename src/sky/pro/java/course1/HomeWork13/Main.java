package sky.pro.java.course1.HomeWork13;

public class Main {
    public static void main(String[] args) {
        Author sapkovsky = new Author("Анджей ", "Сапковский");
        Book bookSapkovsky = new Book("Ведьмак", sapkovsky, 1986);

        Author Cisyn = new Author("Лю ", "Цысинь");
        Book bookCisyn = new Book("Задача трех тел", Cisyn,  2008);

        System.out.println(bookSapkovsky);
        System.out.println(bookCisyn);
    }
}


