public class Book {
    String title;
    String genre;
    int numberOfPages;

    // No-argument constructor
    public Book() {
        this.title = "";
        this.genre = "";
        this.numberOfPages = 0;
    }

    // Parameterized constructor
    public Book(String title, String genre, int numberOfPages) {
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    // Method to estimate reading time
    public String estimateReadingTime() {
        double readingSpeed;

        // Determine reading speed based on genre
        if (genre.equals("Fiction")) {
            readingSpeed = 1.5;
        } else if (genre.equals("Non-Fiction")) {
            readingSpeed = 2.0;
        } else if (genre.equals("Comics")) {
            readingSpeed = 0.5;
        } else {
            readingSpeed = 1.8;  // Default for any other genre
        }

        // Calculate estimated time in hours
        double hours = (numberOfPages * readingSpeed) / 60.0;

        // Format with exactly one decimal place (e.g., 10.0, 6.0)
        return "The estimated reading time for " + title + " is " + String.format("%.1f", hours) + " hours.";
    }
}

import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first book
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter number of pages: ");
        int numberOfPages = scanner.nextInt();

        // Create Book object
        Book b1 = new Book(title, genre, numberOfPages);

        // Print estimated reading time
        System.out.println(b1.estimateReadingTime());

        scanner.close();
    }
}
