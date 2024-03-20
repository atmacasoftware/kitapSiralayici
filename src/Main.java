import java.util.TreeSet;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(Book::compareTo);

        books.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 1998));
        books.add(new Book("Hayvan Çiftliği", 152, "George Orwell", 2010));
        books.add(new Book("Martin Eden", 520, "Jack London", 2014));
        books.add(new Book("Suç ve Ceza", 687, " Fyodor Mihayloviç Dostoyevski", 2006));
        books.add(new Book("Hayvan Mezarlığı - Gecenin Pençesi", 399, "Stephen King", 2003));

        System.out.println("###### A-Z İsme Göre Sıralama ######");
        for (Book book : books){
            System.out.println(book);
        }

        System.out.println("----------------------------------------------");

        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()- o2.getPageNumber();
            }
        });

        books1.addAll(books);
        System.out.println("###### Sayfa Sayısına Göre Sıralama ######");
        for (Book book: books1){
            System.out.println(book);
        }
    }
}