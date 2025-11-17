package Milestone;

public class dummyTest implements Lendable{
    @Override
    public boolean leand(User user) {
        return false;
    }

    @Override
    public void returnBook(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
