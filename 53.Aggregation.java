public class Main {
    public static void main(String[] args) {

        //Aggregation = Represents a "has-a" relationship between objects.
        //              One object contains another object as part of its structure,
        //              but the contained object/s can exist independently

        Book book1 = new Book("The fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("Himu", 416);

        Book[] books = { book1, book2, book3 };

        //System.out.println(book3.displayInfo());

        /*for(Book book : books){
            System.out.println(book.displayInfo());
        }*/


        Library library = new Library("NYC Public Library",1887,books);

        library.displayInfo();
        /*This 1887 NYC Public Library
Books Available:
The fellow of the Ring (423)pages
The Two Towers (352)pages
Himu (416)pages*/

    }

}

public class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title +" (" + this.pages +")pages";
    }
}




public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year,  Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo()
    {
        System.out.println("This "+ this.year + " "+ this.name);
        System.out.println("Books Available: ");
        for(Book book : books)
        {
            System.out.println(book.displayInfo());
        }
    }
}








