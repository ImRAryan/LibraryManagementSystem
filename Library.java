import java.util.ArrayList;

class Library{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void registerUser(User user){
        users.add(user);
        System.out.println("User added successfully!");
    }

    public Book findBook(int id){
        for(Book b : books){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public User findUser(int userId){
        for(User u : users){
            if(u.getUserId() == userId){
                return u;
            }
        }
        return null;
    }

    public void issueBook(int bookId, int userId){
        Book book = findBook(bookId);
        User user = findUser(userId);

        if(book == null){
            System.out.println("Book not found!");
            return;
        }
        if(user == null){
            System.out.println("User not found!");
            return;
        }

        if(!book.isAvailable()){
            System.out.println("Book already issued!");
            return;
        }

        book.issueBook();
        System.out.println("Book issued successfully!");
    }

    public void returnBook(int bookId){
        Book book = findBook(bookId);

        if(book == null){
            System.out.println("Book not found!");
            return;
        }

        book.returnBook();
        System.out.println("Book returned successfully!");
    }

    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No Books Available!");
            return;
        }

        for(Book b : books){
            b.display();
        }
    }
}