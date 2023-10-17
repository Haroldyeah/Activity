import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();

        System.out.println("Enter the number of pages:");
        int numberOfPages = scanner.nextInt();

        System.out.println("Is the book fictional? (true/false):");
        boolean isFictional = scanner.nextBoolean();

     
        Book book = new Book(title, numberOfPages, isFictional);


        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Number of Pages: " + book.getNumberOfPages());
        System.out.println("Is Fictional: " + book.isFictional());
    }
}
