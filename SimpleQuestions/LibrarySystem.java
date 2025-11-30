class Book {
    String title, author;
    int price;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    Fiction(String t, String a, int p) {
        super(t, a, p);
    }

    void display() {
        System.out.println("Fiction Book Details:");
        super.display();
    }
}

class NonFiction extends Book {
    NonFiction(String t, String a, int p) {
        super(t, a, p);
    }

    void display() {
        System.out.println("Non-Fiction Book Details:");
        super.display();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Fiction f = new Fiction("Harry Potter", "Ram", 500);
        NonFiction nf = new NonFiction("Sapiens", "Sham", 700);

        f.display();
        System.out.println();
        nf.display();
    }
}
