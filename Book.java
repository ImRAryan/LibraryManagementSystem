class Book{
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId(){
        return id;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void issueBook(){
        if(isAvailable()){
            isAvailable = false;
        }
    }

    public void returnBook(){
        isAvailable = true;
    }

    public void display(){
        System.out.println("Book ID: " + id);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Available " + (isAvailable ? "Yes" : "No"));
    }
}