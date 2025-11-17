package Milestone;

public interface Lendable{
    boolean leand(User user);
    void returnBook(User user);
    boolean isAvailable();

}
