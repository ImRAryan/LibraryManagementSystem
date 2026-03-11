import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true){
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Books");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();

                    library.registerUser(new User(userId, name));
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int uId = scanner.nextInt();

                    library.issueBook(bookId, uId);
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int returnId = scanner.nextInt();

                    library.returnBook(returnId);
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
