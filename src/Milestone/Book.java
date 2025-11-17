package Milestone;

public abstract class Book implements Lendable{

private   String isbn;
    private String title;
    private String author;
    private boolean  isAvailable;

    @Override
    public boolean leand(User user) {

        if(isAvailable && user.canBorrowBooks()){
            System.out.println("Book is Unavailable");
        }
        return true;
    }

    @Override
    public void returnBook(User user) {
        System.out.println("available");
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
  abstract   void displayBookDetails();

}
