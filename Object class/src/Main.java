import hw1.Book;
import hw1.Writer;
import hw2.Fraction;

public class Main {
    public static void main(String[] args) {
        Writer w1 = new Writer("un", "known1");
        Writer w2 = new Writer("un", "known2");
        Book[] books = {
                new Book("book1", 120, "historical", w1),
                new Book("book2", 250, "romantic", w2)
        };

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }


        Fraction[] fractions = {
                new Fraction(1, 2),
                new Fraction(2, 4),
                new Fraction(3, 5),
        };

        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i].toString());
        }

        int count = 0;
        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++) {
                if (fractions[i].equals(fractions[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
